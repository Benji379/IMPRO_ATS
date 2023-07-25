package com.formato.procesos;

import com.dao.ConexionBd.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class FilterData {

    // Método para filtrar y actualizar los datos en la JTable
    public static DefaultTableModel filterAndPopulateTable(String tableName, JTable jTable, Map<String, Integer> columnMapping,
            String startDateStr, String endDateStr, String dateColumnName) {
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
                if (startDateStr != null && endDateStr != null && !startDateStr.isEmpty() && !endDateStr.isEmpty()) {
                    sqlBuilder.append(" AND ").append(dateColumnName).append(" BETWEEN ? AND ?");
                }

                PreparedStatement statement = connection.prepareStatement(sqlBuilder.toString());

                // Establecer los valores de los campos de filtrado de fechas
                if (startDateStr != null && endDateStr != null && !startDateStr.isEmpty() && !endDateStr.isEmpty()) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date startDate = dateFormat.parse(startDateStr);
                    Date endDate = dateFormat.parse(endDateStr);
                    statement.setDate(1, new java.sql.Date(startDate.getTime()));
                    statement.setDate(2, new java.sql.Date(endDate.getTime()));
                }

                ResultSet resultSet = statement.executeQuery();

                // Recorrer los resultados y agregarlos al modelo
                while (resultSet.next()) {
                    Object[] rowData = new Object[columnMapping.size()];
                    for (Map.Entry<String, Integer> entry : columnMapping.entrySet()) {
                        String columnName = entry.getKey();
                        int columnIndex = entry.getValue();
                        rowData[columnIndex] = resultSet.getObject(columnName);
                    }
                    tableModel.addRow(rowData);

                    // Imprimir la fila que coincide con el rango de fechas
                    System.out.println(Arrays.toString(rowData));
                }
            } catch (SQLException | ParseException e) {
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

        return tableModel;
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

    public static void main(String[] args) {
        // Ejemplo de uso
        JTable JTEmpleados = new JTable();
        String startDateStr = "2023-07-21";
        String endDateStr = "2023-07-23";
        Map<String, Integer> columnMapping = asignarColumnasTabla();
        String dateColumnName = "fecha"; // Reemplaza "fecha" con el nombre real de la columna de fechas en tu tabla
        DefaultTableModel filteredModel = filterAndPopulateTable("ventas", JTEmpleados, columnMapping, startDateStr, endDateStr, dateColumnName);
        JTEmpleados.setModel(filteredModel);
        setupTableSorting(JTEmpleados);
    }

    private static Map<String, Integer> asignarColumnasTabla() {
        Map<String, Integer> columnas = new HashMap<>();
        columnas.put("id", 0);
        columnas.put("sede", 1);
        columnas.put("dniTrabajador", 2);
        columnas.put("dniCliente", 3);
        columnas.put("total", 4);
        columnas.put("fecha", 5);
        columnas.put("hora", 6);
        return columnas;
    }
}
