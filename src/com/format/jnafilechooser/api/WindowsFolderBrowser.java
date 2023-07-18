package com.format.jnafilechooser.api;

import java.awt.Window;
import java.io.File;

import com.format.jnafilechooser.win32.Ole32;
import com.format.jnafilechooser.win32.Shell32;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class WindowsFolderBrowser {

    private String title;

    /**
     * creates a new folder browser
     */
    public WindowsFolderBrowser() {
        title = null;
    }

    public WindowsFolderBrowser(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File showDialog(Window parent) {
        Ole32.OleInitialize(null);
        final Shell32.BrowseInfo params = new Shell32.BrowseInfo();
        params.hwndOwner = Native.getWindowPointer(parent);
        params.ulFlags = Shell32.BIF_RETURNONLYFSDIRS | Shell32.BIF_USENEWUI;
        if (title != null) {
            params.lpszTitle = title;
        }
        final Pointer pidl = Shell32.SHBrowseForFolder(params);
        if (pidl != null) {
            // MAX_PATH is 260 on Windows XP x32 so 4kB should
            // be more than big enough
            final Pointer path = new Memory(1024 * 4);
            Shell32.SHGetPathFromIDListW(pidl, path);
            final String filePath = path.getWideString(0);
            final File file = new File(filePath);
            Ole32.CoTaskMemFree(pidl);
            return file;
        }
        return null;
    }
}
