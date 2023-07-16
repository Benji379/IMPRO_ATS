package com.dao.InnerJoin;

/**
 *
 * @author Benji
 */
import com.dao.ConexionBd.ConexionSQL;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class DatabaseUtils {
    
    public static void llenarJListDesdeTabla(String nombreTabla, String nombreEncabezado, JList<String> jList) throws SQLException {
        ConexionSQL con1 = new ConexionSQL();
        Connection conet = con1.conexion();
        Statement st = null;
        ResultSet rs = null;
        
        try {
            // Consulta SQL para recuperar los datos del encabezado especificado
            String query = "SELECT " + nombreEncabezado + " FROM " + nombreTabla;
            st = conet.createStatement();
            rs = st.executeQuery(query);

            DefaultListModel<String> listModel = new DefaultListModel<>();
            while (rs.next()) {
                String dato = rs.getString(nombreEncabezado);
                listModel.addElement(dato);
            }

            if (jList != null) {
                jList.setModel(listModel); // Establece el modelo del JList con los datos recuperados
            }

        } finally {
            // Cierre seguro de recursos
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conet != null) {
                conet.close();
            }
        }
    }

    public static void llenarJListDesdeTabla(String nombreTabla, String nombreEncabezado, String segundoString, JList<String> jList) throws SQLException {
        ConexionSQL con1 = new ConexionSQL();
        Connection conet = con1.conexion();
        Statement st = null;
        ResultSet rs = null;

        try {
            // Consulta SQL para recuperar los datos del encabezado especificado
            String query = "SELECT " + nombreEncabezado + ", " + segundoString + " FROM " + nombreTabla;
            st = conet.createStatement();
            rs = st.executeQuery(query);

            DefaultListModel<String> listModel = new DefaultListModel<>();
            while (rs.next()) {
                String dato = rs.getString(nombreEncabezado) + " " + rs.getString(segundoString);
                listModel.addElement(dato);
            }

            if (jList != null) {
                jList.setModel(listModel); // Establece el modelo del JList con los datos recuperados
            }

        } finally {
            // Cierre seguro de recursos
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conet != null) {
                conet.close();
            }
        }
    }

    public static String obtenerUltimoValor(String nombreTabla, String encabezado) {
        ConexionSQL con = new ConexionSQL();
        Connection conexion;
        Statement consulta;
        ResultSet resultado;
        String ultimoValor = null;
        String sql = "SELECT " + encabezado + " FROM " + nombreTabla + " ORDER BY id DESC LIMIT 1";

        try {
            conexion = con.conexion();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery(sql);

            if (resultado.next()) {
                ultimoValor = resultado.getString(encabezado);
            }

            resultado.close();
            consulta.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return ultimoValor;
    }

    public static String obtenerUltimoValor(String nombreTabla, String encabezado, String puerto) {
        ConexionSQL con = new ConexionSQL();
        Connection conexion;
        Statement consulta;
        ResultSet resultado;
        String ultimoValor = null;
        String sql = "SELECT " + encabezado + " FROM " + nombreTabla + " WHERE puerto = '" + puerto + "' ORDER BY id DESC LIMIT 1";

        try {
            conexion = con.conexion();
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery(sql);

            if (resultado.next()) {
                ultimoValor = resultado.getString(encabezado);
            }

            resultado.close();
            consulta.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return ultimoValor;
    }

}
