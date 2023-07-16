package com.formato.UIDesing;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultListCellRenderer;
import javax.swing.border.EmptyBorder;

public class JComboBoxUtils {

    public static void personalizarJComboBox(JComboBox<?> comboBox, Color colorFondo, Color colorBorde) {
        // Eliminar el borde por defecto
        comboBox.setBorder(new EmptyBorder(0, 0, 0, 0));

        // Cambiar el color de fondo de cada ítem
        DefaultListCellRenderer renderer = new DefaultListCellRenderer() {
            @Override
            public void setBackground(Color bg) {
                super.setBackground(colorFondo);
            }
        };
        comboBox.setRenderer(renderer);
    }
}
