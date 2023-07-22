package com.dao.InnerJoin;

import com.dao.ConexionBd.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benji
 */
public class Crud {

    // Insercion de datos
    // modificacion de datos
    // consulta de datos (lectura de datos)
    // eliminacion de datos
    public static void main(String[] args) {
        String columnaInsertar[] = {"nombre", "duracion", "precio", "genero"};
        String datosInsertar[] = {"chavo", "1000", "40", "terror"};
        insertarDatos("peliculas", columnaInsertar, datosInsertar);
    }

    public static void insertarDatos(String nombreTabla, String[] encabezados, String[] datosInsertar) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();
        if (connection == null) {
            System.out.println("Error de conexión");
            return;
        }

        try {
            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO ").append(nombreTabla).append(" (");

            // Agregar los encabezados a la consulta
            for (int i = 0; i < encabezados.length; i++) {
                query.append(encabezados[i]);
                if (i < encabezados.length - 1) {
                    query.append(", ");
                }
            }

            query.append(") VALUES (");

            // Agregar los placeholders '?' para los datos a insertar
            for (int i = 0; i < datosInsertar.length; i++) {
                query.append("?");
                if (i < datosInsertar.length - 1) {
                    query.append(", ");
                }
            }

            query.append(")");

            PreparedStatement preparedStatement = connection.prepareStatement(query.toString());

            // Establecer los valores para los datos a insertar
            for (int i = 0; i < datosInsertar.length; i++) {
                preparedStatement.setString(i + 1, datosInsertar[i]);
            }

            preparedStatement.executeUpdate();
            System.out.println("Datos insertados correctamente en la tabla " + nombreTabla);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void modificarDatos(String nombreTabla, String[] encabezadosModificar, String[] nuevosDatos, int numeroColumnaModificar) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();
        if (connection == null) {
            System.out.println("Error de conexión");
            return;
        }

        try {
            StringBuilder query = new StringBuilder();
            query.append("UPDATE ").append(nombreTabla).append(" SET ");

            // Agregar los encabezados a modificar en la consulta
            for (int i = 0; i < encabezadosModificar.length; i++) {
                query.append(encabezadosModificar[i]).append(" = ?");
                if (i < encabezadosModificar.length - 1) {
                    query.append(", ");
                }
            }

            query.append(" WHERE id = ?"); // Suponiendo que "id" es el nombre de la columna autoincrementable

            PreparedStatement preparedStatement = connection.prepareStatement(query.toString());

            // Establecer los nuevos datos para los encabezados a modificar
            for (int i = 0; i < nuevosDatos.length; i++) {
                preparedStatement.setString(i + 1, nuevosDatos[i]);
            }

            // Establecer el valor del id para filtrar la fila a modificar
            preparedStatement.setInt(encabezadosModificar.length + 1, numeroColumnaModificar);

            preparedStatement.executeUpdate();
            System.out.println("Datos modificados correctamente en la tabla " + nombreTabla);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void consulta(String nombreTabla, String[] encabezados) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();
        if (connection == null) {
            System.out.println("Error de conexión");
            return;
        }

        try {
            StringBuilder query = new StringBuilder();
            query.append("SELECT ");

            // Agregar los encabezados a la consulta
            for (int i = 0; i < encabezados.length; i++) {
                query.append(encabezados[i]);
                if (i < encabezados.length - 1) {
                    query.append(", ");
                }
            }

            query.append(" FROM ").append(nombreTabla);

            PreparedStatement preparedStatement = connection.prepareStatement(query.toString());

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // Mostrar los valores de cada columna en forma tabulada
                for (int i = 1; i <= encabezados.length; i++) {
                    System.out.print(resultSet.getString(i));
                    if (i < encabezados.length) {
                        System.out.print("\t"); // Tabulación horizontal
                    }
                }
                System.out.println(); // Nueva línea para la siguiente fila
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void eliminarDatos(String nombreTabla, int numeroFila) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();
        if (connection == null) {
            System.out.println("Error de conexión");
            return;
        }

        try {
            StringBuilder query = new StringBuilder();
            query.append("DELETE FROM ").append(nombreTabla).append(" WHERE id = ?");

            PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
            preparedStatement.setInt(1, numeroFila);

            int filasEliminadas = preparedStatement.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Se eliminó correctamente la fila con el número " + numeroFila + " de la tabla " + nombreTabla);
            } else {
                System.out.println("No se encontró la fila con el número " + numeroFila + " en la tabla " + nombreTabla);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getConsulta(String nombreTabla, String nombreColumna, int numeroFila) {
        String valorColumna = null;
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();
        if (connection == null) {
            System.out.println("Error de conexión");
            return valorColumna;
        }

        try {
            StringBuilder query = new StringBuilder();
            query.append("SELECT ").append(nombreColumna).append(" FROM ").append(nombreTabla).append(" WHERE id = ?");

            PreparedStatement preparedStatement = connection.prepareStatement(query.toString());
            preparedStatement.setInt(1, numeroFila);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                valorColumna = resultSet.getString(1);
            } else {
                System.out.println("No se encontró la fila con el número " + numeroFila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return valorColumna;
    }

    public static void crearTabla(String nombreTabla, String[] encabezados) {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection connection = conexionSQL.conexion();
        if (connection == null) {
            System.out.println("No se pudo establecer conexión con la base de datos.");
            return;
        }

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("CREATE TABLE ").append(nombreTabla).append(" (");
        queryBuilder.append(encabezados[0]).append(" INT AUTO_INCREMENT PRIMARY KEY,");
        for (int i = 1; i < encabezados.length; i++) {
            queryBuilder.append(encabezados[i]).append(" TEXT,");
        }
        queryBuilder.setLength(queryBuilder.length() - 1); // Eliminar la última coma
        queryBuilder.append(")");

        try (PreparedStatement statement = connection.prepareStatement(queryBuilder.toString())) {
            statement.executeUpdate();
            System.out.println("Tabla creada exitosamente.");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al crear la tabla: " + ex.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
