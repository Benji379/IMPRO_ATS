package com.app.sockets.dao;

public interface ConversacionDAO {
    public void IngresarConversacion(String usuario, String fecha_hora, String mensaje, String puertoActual,String puertoDirigido);
}
