package com.dao.InnerJoin;

import com.dao.ConexionBd.ConexionSQL;
import java.sql.*;
import javax.swing.JComboBox;

public class RellenarComboBox {

    public static void rellenarComboBox(JComboBox comboBox, String tabla, String columna) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection conexion = conexionSQL.conexion();

        String consulta = "SELECT " + columna + " FROM " + tabla;

        try (Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta)) {

            while (resultSet.next()) {
                String item = resultSet.getString(columna);
                comboBox.addItem(item);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: "+e.getMessage());
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("ERROR: "+e.getMessage());
            }
        }
    }
}
