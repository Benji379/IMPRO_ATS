package com.ventanas.TRABAJADOR;

import com.app.sockets.chat.Cliente;
import com.app.sockets.chat.Servidor;
import com.app.sockets.dao.ConversacionImpl;
import com.chat.component.ChatBot;
import com.chat.component.ChatBox;
import com.chat.model.ModelMessage;
import com.chat.swing.ChatEvent;
import com.formato.procesos.ChatGpt;
import com.dao.InnerJoin.DatabaseUtils;
import com.dao.InnerJoin.daoLogin;
import com.formato.procesos.Proceso;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Benji
 */
public final class panelMensajes_TRABAJADOR extends javax.swing.JPanel implements Observer {

    String MSG;
    String documento = daoLogin.DOCUMENT;
    String puerto = daoLogin.consultarRango("trabajadores", "dni", documento, "puerto");
    String fecha_hora;
    String mensage;
    String MENSAGE;

    public panelMensajes_TRABAJADOR() {
        initComponents();
        int puert = Integer.parseInt(puerto);
        Servidor servidor = new Servidor(puert);
        servidor.addObserver(this);
        Thread hilo = new Thread(servidor);
        hilo.start();
        ChatAreaInit();
    }

    public void ChatAreaInit() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy, hh:mmaa");
        panelMensajes_TRABAJADOR.chatArea.addChatEvent(new ChatEvent() {
            @Override
            public void mousePressedSendButton(ActionEvent evt) {
                Icon icon = new ImageIcon(getClass().getResource("/com/img/iconos/icon.png"));
                String name = (Proceso.obtenerPalabra(daoLogin.consultarRango("trabajadores", "dni", documento, "nombres"), 1))
                        + " " + (Proceso.obtenerPalabra(daoLogin.consultarRango("trabajadores", "dni", documento, "apellidos"), 1));
                String date = df.format(new Date());
                fecha_hora = date;
                mensage = panelMensajes_TRABAJADOR.chatArea.getText();
                MENSAGE = panelMensajes_TRABAJADOR.chatArea.getText().trim();
                panelMensajes_TRABAJADOR.chatArea.addChatBox(new ModelMessage(icon, "Tú", date, MENSAGE), ChatBox.BoxType.RIGHT);
                panelMensajes_TRABAJADOR.chatArea.clearTextAndGrabFocus();
                if ((panelMensajes_TRABAJADOR.chatArea.getTitle().equalsIgnoreCase("Asistente")) || (panelMensajes_TRABAJADOR.chatArea.getTitle().equalsIgnoreCase("chat impro_ats"))) {
                    String respuesta = ChatGpt.chatGPT(MENSAGE);
                    String fec_hora = date;
                    panelMensajes_TRABAJADOR.chatArea.addChatBot(new ModelMessage(icon, "Sofía", fec_hora, respuesta), ChatBot.BoxType.LEFT);
                } else {
                    MSG = name + ", " + date + ", " + MENSAGE;
                    String mensaje = name + " : " + MSG;
                    ConversacionImpl d = new ConversacionImpl();
                    d.IngresarConversacion(puerto, name, date, mensage, String.valueOf(chat_TRABAJADOR.puertoMandar));
                    Cliente cliente = new Cliente(chat_TRABAJADOR.puertoMandar, mensaje);
                    Thread hilo = new Thread(cliente);
                    hilo.start();
                }
            }

            @Override
            public void mousePressedFileButton(ActionEvent evt) {

            }

            @Override
            public void keyTyped(KeyEvent evt) {

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundChat = new com.chat.swing.Background();
        chatArea = new com.chat.component.ChatArea();
        FONDOCHAT = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 24, 24));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundChat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backgroundChat.add(chatArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        add(backgroundChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 400, 490));

        FONDOCHAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDOCHAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/chat/fondoChat.png"))); // NOI18N
        FONDOCHAT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(FONDOCHAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 590));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDOCHAT;
    private com.chat.swing.Background backgroundChat;
    public static com.chat.component.ChatArea chatArea;
    // End of variables declaration//GEN-END:variables
   @Override
    public void update(Observable o, Object arg) {
        Icon icon = new ImageIcon(getClass().getResource("/com/img/iconos/icon.png"));
        String fec_hora = DatabaseUtils.obtenerUltimoValor("conversacion", "fecha_hora");
        String msg = DatabaseUtils.obtenerUltimoValor("conversacion", "mensaje", String.valueOf(chat_TRABAJADOR.puertoMandar));
        panelMensajes_TRABAJADOR.chatArea.addChatBox(new ModelMessage(icon, chat_TRABAJADOR.nombre, fec_hora, msg), ChatBox.BoxType.LEFT);

    }

}
