package com.formato.jnafilechooser.win32;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class Ole32 {

    static {
        Native.register("ole32");
    }

    public static native Pointer OleInitialize(Pointer pvReserved);

    public static native void CoTaskMemFree(Pointer pv);
}
