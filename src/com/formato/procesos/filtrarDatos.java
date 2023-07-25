package com.formato.procesos;

import com.dao.ConexionBd.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

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

    public static void filterAndPopulateTable(String tableName, JTable jTable, Map<String, String> columnFilters, List<String> filteredColumns) {
        // Limpiar la JTable antes de actualizar los datos
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
        tableModel.setRowCount(0);

        // Crear una instancia de la clase de conexión
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();

        if (connection != null) {
            try {
                // Crear la consulta SQL dinámicamente
                StringBuilder sqlBuilder = new StringBuilder("SELECT ");
                filteredColumns.forEach((columnName) -> {
                    sqlBuilder.append(columnName).append(", ");
                });
                sqlBuilder.delete(sqlBuilder.length() - 2, sqlBuilder.length()); // Eliminar la última coma y espacio
                sqlBuilder.append(" FROM ").append(tableName).append(" WHERE 1=1");

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
                    Object[] rowData = new Object[filteredColumns.size()];
                    for (int i = 0; i < filteredColumns.size(); i++) {
                        rowData[i] = resultSet.getObject(filteredColumns.get(i));
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

        // Creamos un comparador personalizado para manejar diferentes tipos de datos
        Comparator<Object> customComparator = (Object obj1, Object obj2) -> {
            if (obj1 instanceof Integer && obj2 instanceof Integer) {
                Integer int1 = (Integer) obj1;
                Integer int2 = (Integer) obj2;
                return int1.compareTo(int2);
            } else {
                String str1 = obj1.toString();
                String str2 = obj2.toString();
                return str1.compareToIgnoreCase(str2);
            }
        };

        // Asignamos el comparador personalizado para todas las columnas
        for (int i = 0; i < model.getColumnCount(); i++) {
            sorter.setComparator(i, customComparator);
        }

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
                        sorter.setComparator(column, customComparator);
                        ascending = true;
                    }
                    sorter.sort();
                }
            }
        });
    }

    
}
