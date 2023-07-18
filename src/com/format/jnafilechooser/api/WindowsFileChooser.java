package com.format.jnafilechooser.api;

import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import com.format.jnafilechooser.win32.Comdlg32;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.WString;

public class WindowsFileChooser {

    protected File selectedFile;
    protected File currentDirectory;
    protected ArrayList<String[]> filters;

    protected String defaultFilename = "";
    protected String dialogTitle = "";

    /**
     * creates a new file chooser
     */
    public WindowsFileChooser() {
        filters = new ArrayList<>();
    }

    /**
     * creates a new file chooser with the specified initial directory
     *
     * If the given file is not a directory the parent file will be used
     * instead.
     *
     * @param currentDirectory the initial directory
     */
    public WindowsFileChooser(File currentDirectory) {
        filters = new ArrayList<>();
        if (currentDirectory != null) {
            this.currentDirectory = currentDirectory.isDirectory()
                    ? currentDirectory : currentDirectory.getParentFile();
        }
    }

    /**
     * creates a new file chooser with the specified initial directory path
     *
     * @param currentDirectoryPath the initial directory path; may be null
     */
    public WindowsFileChooser(String currentDirectoryPath) {
        this(currentDirectoryPath != null
                ? new File(currentDirectoryPath) : null);
    }

    // this is a package private method used by the JnaFileChooser
    // facade to directly set the filter list
    void setFilters(ArrayList<String[]> filters) {
        this.filters = filters;
    }

    /**
     * add a filter to the user-selectable list of file filters
     *
     * @param name name of the filter
     * @param filter you must pass at least 1 argument, the arguments are the
     * file extensions.
     */
    public void addFilter(String name, String... filter) {
        if (filter.length < 1) {
            throw new IllegalArgumentException();
        }
        ArrayList<String> parts = new ArrayList<String>();
        parts.add(name);
        Collections.addAll(parts, filter);
        filters.add(parts.toArray(new String[parts.size()]));
    }

    /**
     * set a title name
     *
     * @param Title of dialog
     *
     */
    public void setTitle(String tname) {
        this.dialogTitle = tname;
    }

    /**
     * show the dialog for opening a file
     *
     * @param parent the parent window of the dialog
     *
     * @return true if the user clicked ok, false otherwise
     */
    public boolean showOpenDialog(Window parent) {
        return showDialog(parent, true);
    }

    /**
     * show the dialog for saving a file
     *
     * @param parent the parent window of the dialog
     *
     * @return true if the user clicked ok, false otherwise
     */
    public boolean showSaveDialog(Window parent) {
        return showDialog(parent, false);
    }

    /*
	 * shows the dialog
	 *
	 * @param parent the parent window
	 * @param open whether to show the open dialog, if false save dialog is shown
	 *
	 * @return true if the user clicked ok, false otherwise
     */
    boolean showDialog(Window parent, boolean open) {
        final Comdlg32.OpenFileName params = new Comdlg32.OpenFileName();
        params.Flags
                = // use explorer-style interface
                Comdlg32.OFN_EXPLORER
                // the dialog changes the current directory when browsing,
                // this flag causes the original value to be restored after the
                // dialog returns
                | Comdlg32.OFN_NOCHANGEDIR
                // disable "open as read-only" feature
                | Comdlg32.OFN_HIDEREADONLY
                // enable resizing of the dialog
                | Comdlg32.OFN_ENABLESIZING;

        params.hwndOwner = parent == null ? null : Native.getWindowPointer(parent);

        // lpstrFile contains the selection path after the dialog
        // returns. It must be big enough for the path to fit or
        // GetOpenFileName returns an error (FNERR_BUFFERTOOSMALL).
        // MAX_PATH is 260 so 4*260+1 bytes should be big enough (I hope...)
        // http://msdn.microsoft.com/en-us/library/aa365247.aspx#maxpath
        final int bufferLength = 260;
        // 4 bytes per char + 1 null byte
        final int bufferSize = 4 * bufferLength + 1;
        params.lpstrFile = new Memory(bufferSize);
        if (open & !defaultFilename.isEmpty()) {
            params.lpstrFile.setWideString(0, defaultFilename);
        } else {
            params.lpstrFile.clear(bufferSize);
        }
        if (!dialogTitle.isEmpty()) {
            params.lpstrTitle = new WString(dialogTitle);
        }

        // nMaxFile
        // http://msdn.microsoft.com/en-us/library/ms646839.aspx:
        // "The size, in characters, of the buffer pointed to by
        // lpstrFile. The buffer must be large enough to store the
        // path and file name string or strings, including the
        // terminating NULL character."
        // Therefore because we're using the unicode version of the
        // API the nMaxFile value must be 1/4 of the lpstrFile
        // buffer size plus one for the terminating null byte.
        params.nMaxFile = bufferLength;

        if (currentDirectory != null) {
            params.lpstrInitialDir = new WString(currentDirectory.getAbsolutePath());
        }

        // build filter string if filters were specified
        if (filters.size() > 0) {
            params.lpstrFilter = new WString(buildFilterString());
            params.nFilterIndex = 1; // TODO don't hardcode here
        }

        final boolean approved = open
                ? Comdlg32.GetOpenFileNameW(params)
                : Comdlg32.GetSaveFileNameW(params);

        if (approved) {
            final String filePath = params.lpstrFile.getWideString(0);
            selectedFile = new File(filePath);
            final File dir = selectedFile.getParentFile();
            currentDirectory = dir;
        } else {
            final int errCode = Comdlg32.CommDlgExtendedError();
            // if the code is 0 the user clicked cancel
            if (errCode != 0) {
                throw new RuntimeException(
                        "GetOpenFileName failed with error " + errCode);
            }
        }
        return approved;
    }

    /*
	 * builds a filter string
	 *
	 * from MSDN:
	 * A buffer containing pairs of null-terminated filter strings. The last
	 * string in the buffer must be terminated by two NULL characters.
	 *
	 * The first string in each pair is a display string that describes the
	 * filter (for example, "Text Files"), and the second string specifies the
	 * filter pattern (for example, "*.TXT"). To specify multiple filter
	 * patterns for a single display string, use a semicolon to separate the
	 * patterns (for example, "*.TXT;*.DOC;*.BAK").
	 *
	 * http://msdn.microsoft.com/en-us/library/ms646839.aspx
     */
    private String buildFilterString() {
        final StringBuilder filterStr = new StringBuilder();
        for (final String[] spec : filters) {
            final String label = spec[0];
            // add label and terminate with null byte
            filterStr.append(label);
            filterStr.append('\0');
            // build file extension patterns seperated by a
            // semicolon and terminated by a null byte
            for (int i = 1; i < spec.length; ++i) {
                filterStr.append("*.");
                filterStr.append(spec[i]);
                filterStr.append(';');
            }
            // remove last superfluous ";" and add terminator
            filterStr.deleteCharAt(filterStr.length() - 1);
            filterStr.append('\0');
        }
        // final terminator
        filterStr.append('\0');
        return filterStr.toString();
    }

    /**
     * returns the file selected by the user
     *
     * @return the selected file; null if the dialog was canceled or never shown
     */
    public File getSelectedFile() {
        return selectedFile;
    }

    /**
     * returns the current directory
     *
     * This is always the parent directory of the chosen file, even if you enter
     * an absolute path to a file that doesn't exist in the current directory.
     *
     * @return the current directory
     */
    public File getCurrentDirectory() {
        return currentDirectory;
    }

    public void setDefaultFilename(String defaultFilename) {
        this.defaultFilename = defaultFilename;
    }
}
