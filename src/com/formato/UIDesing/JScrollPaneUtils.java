package com.formato.UIDesing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Benji
 */

public class JScrollPaneUtils {

    public static void removeWhiteBorder(JScrollPane scrollPane) {
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

}
