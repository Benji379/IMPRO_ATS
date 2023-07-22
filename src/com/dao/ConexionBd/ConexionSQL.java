package com.dao.ConexionBd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * *
 * @correo atochelopezb@gmail.com
 * @author Benji
 */
public class ConexionSQL {

    Connection conectar = null;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/impro_ats", "root", "");
//            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://databases-auth.000webhost.com/id20941037_impro", "id20941037_benji379", "{83CW%v53vB!1ii9");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conectar;
    }
}
