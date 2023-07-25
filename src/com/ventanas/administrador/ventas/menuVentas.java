package com.ventanas.administrador.ventas;

import static com.ventanas.administrador.frm_Principal.contenedor;
import com.ventanas.generales.HistorialVentas;
import com.ventanas.generales.frmVenta;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Benji
 */
public class menuVentas extends javax.swing.JPanel {


    public menuVentas() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTitulo = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("VENTAS");
        add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/imgReferencial.png"))); // NOI18N
        add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 320, 390));

        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/btnHistorial.png"))); // NOI18N
        btnHistorial.setBorder(null);
        btnHistorial.setBorderPainted(false);
        btnHistorial.setContentAreaFilled(false);
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/btnHistorial_Select.png"))); // NOI18N
        btnHistorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/btnHistorial_Press.png"))); // NOI18N
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 330, 110));

        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/btnNuevaVenta.png"))); // NOI18N
        btnNuevaVenta.setBorder(null);
        btnNuevaVenta.setBorderPainted(false);
        btnNuevaVenta.setContentAreaFilled(false);
        btnNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaVenta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/btnNuevaVenta_Press.png"))); // NOI18N
        btnNuevaVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/btnNuevaVenta_Select.png"))); // NOI18N
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 330, 110));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/FONDO.png"))); // NOI18N
        add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
//        frm_Principal cerrar = new frm_Principal();
//        cerrar.setVisible(false);
        frmVenta abrir = new frmVenta();
        abrir.setVisible(true);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(menuVentas.this);
        if (frame != null) {
            frame.setVisible(false);
        }
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        HistorialVentas abrir = new HistorialVentas();
        abrir.setSize(960, 590);
        abrir.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(abrir, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnHistorialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jlbTitulo;
    // End of variables declaration//GEN-END:variables
}
