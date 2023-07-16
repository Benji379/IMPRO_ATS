package com.formato.procesos;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class DiseñoTablas {

    public void AspectoEncabezados(JTable tabla) {
        tabla.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 16));
        ((DefaultTableCellRenderer) tabla.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getTableHeader().setBackground(Color.decode("#2E2E2E"));
        //TablaTrabajadores.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setForeground(new Color(46, 46, 46));
    }

    public void AspectoContenido(JTable tabla) {
        //TablaTrabajadores.setRowHeight(25);
        tabla.setForeground(new Color(173, 173, 173));
        tabla.setBackground(new Color(46, 46, 46));
        tabla.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        tabla.setRowHeight(25);
        tabla.setGridColor(new java.awt.Color(255, 0, 0));
    }

    public void AlinearColumna(int columna, JTable tabla) {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(columna).setCellRenderer(cellRender);
    }
}
