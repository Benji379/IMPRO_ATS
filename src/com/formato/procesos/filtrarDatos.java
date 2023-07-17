package com.formato.procesos;

import com.dao.ConexionBd.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.Comparator;

/**
 *
 * @author Benji
 */
public class filtrarDatos {
    // Método para filtrar y actualizar los datos en la JTable

    public static void filterAndPopulateTable(String tableName, JTable jTable, Map<String, String> columnFilters) {
        // Limpiar la JTable antes de actualizar los datos
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
        tableModel.setRowCount(0);

        // Crear una instancia de la clase de conexión
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();

        if (connection != null) {
            try {
                // Crear la consulta SQL dinámicamente
                StringBuilder sqlBuilder = new StringBuilder("SELECT * FROM ").append(tableName).append(" WHERE 1=1");
                columnFilters.keySet().forEach((columnName) -> {
                    String fieldValue = columnFilters.get(columnName);
                    if (fieldValue != null && !fieldValue.isEmpty()) {
                        sqlBuilder.append(" AND ").append(columnName).append(" LIKE ?");
                    }
                });

                PreparedStatement statement = connection.prepareStatement(sqlBuilder.toString());

                // Establecer los valores de los campos de filtrado
                int parameterIndex = 1;
                for (String columnName : columnFilters.keySet()) {
                    String fieldValue = columnFilters.get(columnName);
                    if (fieldValue != null && !fieldValue.isEmpty()) {
                        statement.setString(parameterIndex, fieldValue + "%");
                        parameterIndex++;
                    }
                }

                ResultSet resultSet = statement.executeQuery();

                // Recorrer los resultados y agregarlos a la JTable
                while (resultSet.next()) {
                    Object[] rowData = new Object[jTable.getColumnCount()];
                    for (int i = 1; i <= jTable.getColumnCount(); i++) {
                        rowData[i - 1] = resultSet.getObject(i);
                    }
                    tableModel.addRow(rowData);
                }
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            } finally {
                try {
                    // Cerrar la conexión
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }

    private static boolean ascending = true;

    public static void setupTableSorting(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        // Asignamos el comparador personalizado para ordenar alfabéticamente
        Comparator<String> stringComparator = String::compareToIgnoreCase;
        sorter.setComparator(0, stringComparator); // Ordenar por la primera columna

        // Asignamos el listener para detectar clics en los encabezados
        table.getTableHeader().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int column = table.getTableHeader().columnAtPoint(evt.getPoint());
                if (column != -1) {
                    if (ascending) {
                        sorter.setComparator(column, Comparator.reverseOrder());
                        ascending = false;
                    } else {
                        sorter.setComparator(column, stringComparator);
                        ascending = true;
                    }
                    sorter.sort();
                }
            }
        });
    }

}
