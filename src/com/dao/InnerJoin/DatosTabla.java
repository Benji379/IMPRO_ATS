package com.dao.InnerJoin;
import com.dao.ConexionBd.ConexionSQL;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatosTabla {

    public static JList<String> cargarDatos(String nombreTabla, String nombreColumna) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection conexion = conexionSQL.conexion();

        if (conexion == null) {
            // Si la conexión no se pudo establecer, retornamos un JList vacío.
            return new JList<>();
        }

        List<String> datos = new ArrayList<>();

        try {
            try (Statement stmt = conexion.createStatement()) {
                String consulta = "SELECT " + nombreColumna + " FROM " + nombreTabla;
                ResultSet rs = stmt.executeQuery(consulta);
                
                while (rs.next()) {
                    String dato = rs.getString(nombreColumna);
                    datos.add(dato);
                }
            }
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosTabla.class.getName()).log(Level.SEVERE, null, ex);
        }

        JList<String> jList = new JList<>(datos.toArray(new String[0]));
        return jList;
    }
     public static List<String> cargarDatosList(String nombreTabla, String nombreColumna) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection conexion = conexionSQL.conexion();

        if (conexion == null) {
            // Si la conexión no se pudo establecer, retornamos una lista vacía.
            return new ArrayList<>();
        }

        List<String> datos = new ArrayList<>();

        try {
            try (Statement stmt = conexion.createStatement()) {
                String consulta = "SELECT " + nombreColumna + " FROM " + nombreTabla;
                ResultSet rs = stmt.executeQuery(consulta);

                while (rs.next()) {
                    String dato = rs.getString(nombreColumna);
                    datos.add(dato);
                }
            }
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosTabla.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datos;
    }
}
