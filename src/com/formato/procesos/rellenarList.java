package com.formato.procesos;

import com.dao.ConexionBd.ConexionSQL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benji
 */
public class rellenarList {

    // Método para leer el archivo de texto y obtener las palabras
    public static List<String> leerArchivoDeTexto(String rutaArchivo) {
        List<String> palabras = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Agregar cada palabra a la lista
                palabras.add(linea);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return palabras;
    }

    public static void llenarArrayListDesdeTabla(String nombreTabla, ArrayList<ArrayList<String>> matriz) throws SQLException {
        ConexionSQL con1 = new ConexionSQL();
        Connection conet = con1.conexion();
        Statement st = null;
        ResultSet rs = null;
        try {
            // Consulta SQL para recuperar todos los datos de la tabla
            String query = "SELECT * FROM " + nombreTabla;
            st = conet.createStatement();
            rs = st.executeQuery(query);

            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();

            while (rs.next()) {
                ArrayList<String> fila = new ArrayList<>();
                for (int i = 1; i <= numColumnas; i++) {
                    fila.add(rs.getString(i));
                }
                matriz.add(fila);
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

}
