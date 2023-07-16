package com.dao.InnerJoin;

import com.dao.ConexionBd.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Benji
 */
public class ConsultasSQL {

    public static int obtenerUltimoValor(String nombreTabla, String nombreColumna) {
        int ultimoValor = 0;

        ConexionSQL conexionSQL = new ConexionSQL();
        Connection conexion = conexionSQL.conexion();

        try {
            String consulta = "SELECT " + nombreColumna + " FROM " + nombreTabla + " ORDER BY " + nombreColumna + " DESC LIMIT 1";
            try (Statement statement = conexion.createStatement();
                    ResultSet resultSet = statement.executeQuery(consulta)) {
                if (resultSet.next()) {
                    ultimoValor = resultSet.getInt(1);
                }
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

        return ultimoValor;
    }

    public static void insertarDatos(String tabla, String dni, String contraseña, String nombres, String apellidos, String edad,
            String genero, String correo, String cargo, String codigo, String sede, String puerto) {
        // Crear objeto de conexión
        ConexionSQL conexionDB = new ConexionSQL();
        Connection connection = conexionDB.conexion();

        try {
            // Consulta SQL para insertar los datos
            String query = "INSERT INTO " + tabla + " (dni, contraseña, nombres, apellidos, edad, genero, correo, cargo, Codigo, sede, puerto) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Crear el objeto PreparedStatement para ejecutar la consulta
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Establecer los valores de los parámetros en la consulta
            preparedStatement.setString(1, dni);
            preparedStatement.setString(2, contraseña);
            preparedStatement.setString(3, nombres);
            preparedStatement.setString(4, apellidos);
            preparedStatement.setString(5, edad);
            preparedStatement.setString(6, genero);
            preparedStatement.setString(7, correo);
            preparedStatement.setString(8, cargo);
            preparedStatement.setString(9, codigo);
            preparedStatement.setString(10, sede);
            preparedStatement.setString(11, puerto);

            // Ejecutar la consulta
            preparedStatement.executeUpdate();

            System.out.println("Los datos se han insertado correctamente en la tabla " + tabla);

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

    public static boolean encontrarValor(String tabla, String columna, String valorBusqueda) {
        // Crear objeto de conexión
        ConexionSQL conexionDB = new ConexionSQL();
        Connection connection = conexionDB.conexion();

        try {
            // Consulta SQL para buscar el valor en la tabla
            String query = "SELECT * FROM " + tabla + " WHERE " + columna + " = ?";
            // Crear el objeto PreparedStatement para ejecutar la consulta
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Establecer el valor del parámetro en la consulta
            preparedStatement.setString(1, valorBusqueda);
            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            // Verificar si se encontró algún resultado
            boolean seEncontro = resultSet.next();
            
            return seEncontro;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        // Si ocurre algún error, retornar false
        return false;
    }

}
