package com.ventanas.administrador;

import com.chat.component.ChatBox;
import com.chat.model.ModelMessage;
import com.formato.UIDesing.JScrollPaneUtils;
import com.formato.UIDesing.TableDark;
import com.dao.InnerJoin.DatabaseUtils;
import com.formato.procesos.JListCustom;
import com.dao.InnerJoin.daoLogin;
import com.formato.procesos.rellenarList;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.event.ListSelectionEvent;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author Benji
 */
public final class chat extends javax.swing.JPanel {

    static public final String DOCUMENTO = daoLogin.DOCUMENT;
    static public String puerto = daoLogin.consultarRango("trabajadores", "dni", DOCUMENTO, "puerto");
    static public int puertoMandar;
    static public String selectedName;
    static public String nombre;
    
    public chat() throws SQLException {
        initComponents();
        limpiar();
        panelMensajes.chatArea.setTitle("Chat IMPRO_ATS");
        JListCustom.customizeJList(myList1, 40, 3, 9);
        DatabaseUtils.llenarJListDesdeTabla("trabajadores", "nombres", "apellidos", myList1);
        JListInit();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setHorizontalScrollBar(sp);
    }

    public void JListInit() {
        myList1.addListSelectionListener((ListSelectionEvent e) -> {
            limpiar();
            if (!e.getValueIsAdjusting()) {
                JList<String> source = (JList<String>) e.getSource();
                selectedName = source.getSelectedValue();
                int index = myList1.getSelectedIndex();
                nombre = selectedName;
                puertoMandar = Integer.parseInt(daoLogin.consultarRango("trabajadores", "id", String.valueOf((index + 1)), "puerto"));
                panelMensajes.chatArea.setTitle(nombre);
                rellenar(puerto, String.valueOf(puertoMandar));
            }
        });
        TableDark p = new TableDark();
        p.fixTable(jScrollPane1);
        JScrollPaneUtils.removeWhiteBorder(jScrollPane1);
    }
    
    public void limpiar() {
        panelMensajes p = new panelMensajes();
        p.setSize(520, 590);
        p.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public void rellenar(String miPuerto, String puertoMandar) {
        
        ArrayList<ArrayList<String>> matriz = new ArrayList<>();
        
        try {
            rellenarList.llenarArrayListDesdeTabla("conversacion", matriz);
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        
        Icon icon = new ImageIcon(getClass().getResource("/com/img/iconos/icon.png"));
        String portMio;
        String portSuyo;
        String name;
        String dato;
        String msg;
        for (ArrayList<String> fila : matriz) {
            portMio = fila.get(1);
            name = fila.get(2);
            dato = fila.get(4);
            msg = fila.get(3);
            portSuyo = fila.get(5);
            if ((portMio.equals(miPuerto)) && (portSuyo.equals(puertoMandar))) {
                panelMensajes.chatArea.addChatBox(new ModelMessage(icon, "Tú", dato, msg), ChatBox.BoxType.RIGHT);
            } else {
                if ((portMio.equals(puertoMandar)) && (portSuyo.equals(miPuerto))) {
                    panelMensajes.chatArea.addChatBox(new ModelMessage(icon, name, dato, msg), ChatBox.BoxType.LEFT);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAsistente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myList1 = new javax.swing.JList<>();
        contenedor = new javax.swing.JPanel();
        tittleChat = new javax.swing.JLabel();
        fondoContactos = new javax.swing.JLabel();
        scrollBarCustom1 = new scrollbar.ScrollBarCustom();

        setBackground(new java.awt.Color(24, 24, 24));
        setPreferredSize(new java.awt.Dimension(960, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAsistente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/chat/BTN ASISTENTE.png"))); // NOI18N
        btnAsistente.setBorder(null);
        btnAsistente.setBorderPainted(false);
        btnAsistente.setContentAreaFilled(false);
        btnAsistente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsistente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAsistente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/chat/BTN ASISTENTE_press.png"))); // NOI18N
        btnAsistente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenteActionPerformed(evt);
            }
        });
        add(btnAsistente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, 80));

        myList1.setBackground(new java.awt.Color(17, 17, 17));
        jScrollPane1.setViewportView(myList1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 250, 230, 260));

        contenedor.setBackground(new java.awt.Color(24, 24, 24));
        contenedor.setLayout(new java.awt.CardLayout());
        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 520, 590));

        tittleChat.setFont(new java.awt.Font("Kristen ITC", 0, 30)); // NOI18N
        tittleChat.setForeground(new java.awt.Color(255, 255, 255));
        tittleChat.setText("Chats");
        add(tittleChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        fondoContactos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoContactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/chat/fondoContactos.png"))); // NOI18N
        fondoContactos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(fondoContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 321, 423));
        add(scrollBarCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsistenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenteActionPerformed
        limpiar();
        panelMensajes.chatArea.setTitle("Asistente");

    }//GEN-LAST:event_btnAsistenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistente;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel fondoContactos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> myList1;
    private scrollbar.ScrollBarCustom scrollBarCustom1;
    private javax.swing.JLabel tittleChat;
    // End of variables declaration//GEN-END:variables

}
