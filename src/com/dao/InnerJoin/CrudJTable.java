package com.dao.InnerJoin;

import com.dao.ConexionBd.ConexionSQL;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class CrudJTable {

    private Connection getConnection() {
        ConexionSQL conexionSQL = new ConexionSQL();
        return conexionSQL.conexion();
    }

    public void consultarTabla(String nombreTabla, Map<String, Integer> columnasJTable, JTable jTable) {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTable.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla antes de llenarla nuevamente

        String query = "SELECT * FROM " + nombreTabla;

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Object[] fila = new Object[columnasJTable.size()];

                for (Map.Entry<String, Integer> entry : columnasJTable.entrySet()) {
                    String nombreColumna = entry.getKey();
                    int numeroColumna = entry.getValue();
                    fila[numeroColumna] = resultSet.getObject(nombreColumna);
                }

                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void modificar(String nombreTabla, String nombreID, int numeroFila, Map<String, String> columnasValores) {
        String query = "UPDATE " + nombreTabla + " SET ";
        int contador = 0;

        for (Map.Entry<String, String> entry : columnasValores.entrySet()) {
            String nombreColumna = entry.getKey();
            String valor = entry.getValue();
            query += nombreColumna + " = ?";
            contador++;

            if (contador < columnasValores.size()) {
                query += ", ";
            }
        }

        query += " WHERE " + nombreID + " = ?";

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            int index = 1;
            for (Map.Entry<String, String> entry : columnasValores.entrySet()) {
                String valor = entry.getValue();
                preparedStatement.setString(index++, valor);
            }

            preparedStatement.setInt(index, numeroFila);

            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Se modificó correctamente la fila con el número " + numeroFila + " de la tabla " + nombreTabla);
            } else {
                System.out.println("No se encontró la fila con el número " + numeroFila + " en la tabla " + nombreTabla);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void insertar(String nombreTabla, Map<String, String> columnasValores) {
        String query = "INSERT INTO " + nombreTabla + " (";
        String valores = "";
        int contador = 0;

        for (Map.Entry<String, String> entry : columnasValores.entrySet()) {
            String nombreColumna = entry.getKey();
            String valor = entry.getValue();
            query += nombreColumna;
            valores += "?";
            contador++;

            if (contador < columnasValores.size()) {
                query += ", ";
                valores += ", ";
            }
        }

        query += ") VALUES (" + valores + ")";

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            int index = 1;
            for (Map.Entry<String, String> entry : columnasValores.entrySet()) {
                String valor = entry.getValue();
                preparedStatement.setString(index++, valor);
            }

            int filasInsertadas = preparedStatement.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Se insertaron correctamente los datos en la tabla " + nombreTabla);
            } else {
                System.out.println("No se pudo insertar en la tabla " + nombreTabla);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void eliminar(String nombreTabla, String nameFilaID, int numeroFila) {
        String query = "DELETE FROM " + nombreTabla + " WHERE " + nameFilaID + " = ?";

        try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, numeroFila);

            int filasEliminadas = preparedStatement.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Se eliminó correctamente la fila con el número " + numeroFila + " de la tabla " + nombreTabla);
            } else {
                System.out.println("No se encontró la fila con el número " + numeroFila + " en la tabla " + nombreTabla);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
