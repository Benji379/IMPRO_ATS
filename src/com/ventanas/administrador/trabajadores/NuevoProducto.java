package com.ventanas.administrador.trabajadores;

import com.formato.procesos.Proceso;
import com.ventanas.administrador.frmInventario;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class NuevoProducto extends javax.swing.JFrame {

    public NuevoProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        frmInventario.ventanaNuevoProducto = true;
        frmInventario.btnAtras.setEnabled(false);
        frmInventario.btnAgregarNuevo.setEnabled(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/inventario.png")));
        TransparentarTxt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jlbCodigo2 = new javax.swing.JLabel();
        jlbNombre2 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        separador5 = new javax.swing.JLabel();
        jlbCodigo1 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        separador2 = new javax.swing.JLabel();
        jlbNombre1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        separador3 = new javax.swing.JLabel();
        jlbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        separador = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        separador1 = new javax.swing.JLabel();
        marcoImagen = new javax.swing.JLabel();
        IMAGEN = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnCerrar.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnCerrar_press.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 60, 60));

        txtId.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 36)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setText("88");
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jlbTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 50)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setText("Nuevo Registro");
        jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jlbCodigo2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo2.setText("Categoría");
        jPanel1.add(jlbCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        jlbNombre2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre2.setText("Marca");
        jPanel1.add(jlbNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        txtNombre2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 180, 30));

        separador5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador5.setForeground(new java.awt.Color(255, 255, 255));
        separador5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 190, 10));

        jlbCodigo1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo1.setText("Stock");
        jPanel1.add(jlbCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        txtCodigo1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 180, 30));

        separador2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador2.setForeground(new java.awt.Color(255, 255, 255));
        separador2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 190, 10));

        jlbNombre1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre1.setText("Precio");
        jPanel1.add(jlbNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        txtNombre1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 180, 30));

        separador3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador3.setForeground(new java.awt.Color(255, 255, 255));
        separador3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 190, 10));

        jlbCodigo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo.setText("Codigo");
        jPanel1.add(jlbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 180, 30));

        separador.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 190, 10));

        jlbNombre.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre.setText("Nombre");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        txtNombre.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 180, 30));

        separador1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador1.setForeground(new java.awt.Color(255, 255, 255));
        separador1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 190, 10));

        marcoImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marcoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/MarcoImagenGrande.png"))); // NOI18N
        marcoImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(marcoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 240, 240));

        IMAGEN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMAGEN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(IMAGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 200));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/fondoRegisterNuevo.png"))); // NOI18N
        FONDO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransparentarTxt(){
        Proceso.transparentarTxtField(txtCodigo);
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salirRegistro();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        toFront();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        toFront();
    }//GEN-LAST:event_formWindowLostFocus

    private void salirRegistro() {
        int valor = JOptionPane.showConfirmDialog(this, "Cancelar registro?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_NO_OPTION) {
            frmInventario.ventanaNuevoProducto = false;
            frmInventario.btnAtras.setEnabled(true);
            frmInventario.btnAgregarNuevo.setEnabled(true);
            setVisible(false);
        }
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salirRegistro();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1ActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NuevoProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel IMAGEN;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbCodigo1;
    private javax.swing.JLabel jlbCodigo2;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbNombre1;
    private javax.swing.JLabel jlbNombre2;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel marcoImagen;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}
