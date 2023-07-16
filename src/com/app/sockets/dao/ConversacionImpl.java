package com.app.sockets.dao;

import com.dao.ConexionBd.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConversacionImpl implements ConversacionDAO {

    ConexionSQL instanciaMySQL = new ConexionSQL();

    @Override
    public void IngresarConversacion(String puertoActual, String usuario, String fecha_hora, String mensaje, String puertoDirigido) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conexion();
            consulta = conexion.prepareStatement("insert into conversacion(puerto,usuario,fecha_hora,mensaje,puertoDirigido) values(?,?,?,?,?)");
            consulta.setString(1, puertoActual);
            consulta.setString(2, usuario);
            consulta.setString(3, fecha_hora);
            consulta.setString(4, mensaje);
            consulta.setString(5, puertoDirigido);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

}
