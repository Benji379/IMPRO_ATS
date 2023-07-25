/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formato.procesos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Benji
 */
public class JTableRellenar {

    public static void fillRowWithData(JTable table, String[] rowData) {
        // Verificar que el número de columnas del JTable coincida con el tamaño del array
        int numColumns = table.getColumnCount();
        if (rowData.length != numColumns) {
            throw new IllegalArgumentException("El número de elementos en el Array de String no coincide con el número de columnas del JTable.");
        }

        // Agregar la fila al JTable
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.addRow(rowData);
    }

    public static double sumColumnValues(JTable table, int column) {
        int rowCount = table.getRowCount();
        double sum = 0.0;

        for (int row = 0; row < rowCount; row++) {
            Object value = table.getValueAt(row, column);

            if (value != null) {
                try {
                    // Intentamos convertir el valor a tipo double
                    double numValue = Double.parseDouble(value.toString());
                    sum += numValue;
                } catch (NumberFormatException e) {
                    // Si el valor no puede ser convertido a double, lo ignoramos
                    // o puedes manejar la excepción de acuerdo a tus necesidades
                }
            }
        }

        return sum;
    }

}
