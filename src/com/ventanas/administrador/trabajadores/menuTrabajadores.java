package com.ventanas.administrador.trabajadores;

import static com.ventanas.administrador.frm_Principal.contenedor;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author Benji
 */
public class menuTrabajadores extends javax.swing.JPanel {

    public menuTrabajadores() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTitulo = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        btnRegistrarTrabajadores = new javax.swing.JButton();
        btnListaTrabajadores = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("TRABAJADORES");
        add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/IMGTRABAJADORES.png"))); // NOI18N
        add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 320, 390));

        btnRegistrarTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnRegistrar.png"))); // NOI18N
        btnRegistrarTrabajadores.setBorder(null);
        btnRegistrarTrabajadores.setBorderPainted(false);
        btnRegistrarTrabajadores.setContentAreaFilled(false);
        btnRegistrarTrabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarTrabajadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarTrabajadores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnRegistrar_press.png"))); // NOI18N
        btnRegistrarTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTrabajadoresActionPerformed(evt);
            }
        });
        add(btnRegistrarTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 330, 110));

        btnListaTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnLista.png"))); // NOI18N
        btnListaTrabajadores.setBorder(null);
        btnListaTrabajadores.setBorderPainted(false);
        btnListaTrabajadores.setContentAreaFilled(false);
        btnListaTrabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaTrabajadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListaTrabajadores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnLista_press.png"))); // NOI18N
        btnListaTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaTrabajadoresActionPerformed(evt);
            }
        });
        add(btnListaTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 330, 110));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/FONDO.png"))); // NOI18N
        add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaTrabajadoresActionPerformed
        panelListaTrab abrir = new panelListaTrab();
        abrir.setSize(960, 590);
        abrir.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(abrir, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnListaTrabajadoresActionPerformed

    private void btnRegistrarTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTrabajadoresActionPerformed
        panelRegistrarTrab abrir = new panelRegistrarTrab();
        abrir.setSize(960, 590);
        abrir.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(abrir, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnRegistrarTrabajadoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnListaTrabajadores;
    private javax.swing.JButton btnRegistrarTrabajadores;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jlbTitulo;
    // End of variables declaration//GEN-END:variables
}
