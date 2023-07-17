package com.app.sockets.chat;

import java.io.*;
import java.net.Socket;

public class Cliente implements Runnable{
    
    //Creamos los atriburtos de puerto y mensaje
    private final int puerto;
    private final String mensaje;
    
    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        
        //Puerto del servidor
        DataOutputStream salida;
        
        try{
            Socket socket = new Socket(HOST, puerto);
            salida = new DataOutputStream(socket.getOutputStream());
            
            //enviamos el mensaje
            salida.writeUTF(mensaje);
        }catch(IOException error){
            System.out.println(error);
        }
    }
}
