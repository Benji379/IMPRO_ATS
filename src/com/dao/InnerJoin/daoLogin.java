package com.dao.InnerJoin;

import com.dao.ConexionBd.ConexionSQL;
import com.formato.procesos.Data;
import com.ventanas.generales.frm_Login;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Benji
 */
public class daoLogin {

    private final Connection conexion;

    public daoLogin() {
        ConexionSQL conexionSQL = new ConexionSQL();
        conexion = conexionSQL.conexion();
    }

    public boolean autenticarUsuario(String tabla, String columnaEmpleado, String columnaContrasena, String usuario, String contrasena) {

        boolean ingresoValido = false;
        String query = "SELECT * FROM " + tabla + " WHERE " + columnaEmpleado + " = ?";

        try {
            try (PreparedStatement statement = conexion.prepareStatement(query)) {
                statement.setString(1, usuario);
                ResultSet resultSet = statement.executeQuery();

                if (!resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String contrasenaDB = resultSet.getString(columnaContrasena);
                    if (contrasena.equals(contrasenaDB)) {
                        ingresoValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return ingresoValido;
    }

    public static String consultarRango(String nameTablaSQL, String nameColumna, String datoComparar, String columnaDatoRetornar) {

        ConexionSQL con1 = new ConexionSQL();
        Connection conet;
        Statement st;
        ResultSet rs;
        String datoRetornar = null;
        String aux, aux2;
        String sql = "select * from " + nameTablaSQL;
        int existe = 0;

        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                aux = rs.getString(nameColumna);
                aux2 = rs.getString(columnaDatoRetornar);
                if (aux.equals(datoComparar)) {
                    existe = 1;
                    datoRetornar = aux2;
                }
            }
            if (existe == 0) {
//                System.out.println("TRABAJADOR NO EXISTE");
                return "0.0";
            }

        } catch (HeadlessException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return datoRetornar;
    }

    public static String NOMBRE, APELLIDOS, CORREO, CARGO, GENERO, CODIGO, NSEDE, DOCUMENT, NOMBRE_TABLA_SEDE;

    public static void guardarDatos() {
        String document = frm_Login.txtUsuario.getText();
        String nombre = daoLogin.consultarRango("trabajadores", "dni", document, "nombres");
        String apellidos = daoLogin.consultarRango("trabajadores", "dni", document, "apellidos");
        String correo = daoLogin.consultarRango("trabajadores", "dni", document, "correo");
        String cargo = daoLogin.consultarRango("trabajadores", "dni", document, "cargo");
        String genero = daoLogin.consultarRango("trabajadores", "dni", document, "genero");
        String codigo = daoLogin.consultarRango("trabajadores", "dni", document, "codigo");
        String NSede = daoLogin.consultarRango("trabajadores", "dni", document, "sede");
        String nombreTablaSede = "inventario_sede_" + Data.getSede();
        DOCUMENT = document;
        NOMBRE = nombre;
        APELLIDOS = apellidos;
        CORREO = correo;
        CARGO = cargo;
        GENERO = genero;
        CODIGO = codigo;
        NSEDE = NSede;
        NOMBRE_TABLA_SEDE = nombreTablaSede;
    }

}
