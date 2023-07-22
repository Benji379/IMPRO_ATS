package com.ventanas.generales;

import com.formato.procesos.EscrituraAnimada;
import com.ventanas.administrador.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import com.formato.procesos.Proceso;
import com.dao.InnerJoin.daoLogin;
import com.formato.procesos.Data;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Benji
 */
public final class frm_Login extends javax.swing.JFrame {

    public frm_Login() {
        initComponents();
        DiseñoInicial();
        MisDefault();
        cerrar();
        EscrituraAnimada k = new EscrituraAnimada();
        k.mostrarTextoAnimado(txtTitulo, "Login", 120);
    }

    private void MisDefault() {
        transparentarTxTFields();
        txtTitulo.requestFocus();
        ojoAbierto.setVisible(false);
    }

    private void DiseñoInicial() {
        this.setLocationRelativeTo(null);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel1.setOpaque(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/icon.png")));
    }

    private void transparentarTxTFields() {
        Proceso.transparentarTxtField(txtUsuario, txtContraseña);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BarraTitulo = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        ojoCerrado = new javax.swing.JButton();
        ojoAbierto = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        ICONO = new javax.swing.JLabel();
        iconoContraseña = new javax.swing.JLabel();
        iconoUsuario = new javax.swing.JLabel();
        panelContraseña1 = new javax.swing.JLabel();
        panelUsuario1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraTituloMouseDragged(evt);
            }
        });
        BarraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraTituloMousePressed(evt);
            }
        });
        jPanel1.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        btnMinimizar.setFont(new java.awt.Font("DialogInput", 0, 22)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setText("-");
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 30));

        btnCerrar.setFont(new java.awt.Font("DialogInput", 0, 22)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, 30));

        ojoCerrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/ojoCerrado.png"))); // NOI18N
        ojoCerrado.setBorder(null);
        ojoCerrado.setBorderPainted(false);
        ojoCerrado.setContentAreaFilled(false);
        ojoCerrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojoCerrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojoCerradoActionPerformed(evt);
            }
        });
        jPanel1.add(ojoCerrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 30, 40));

        ojoAbierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/OjoAbierto.png"))); // NOI18N
        ojoAbierto.setBorder(null);
        ojoAbierto.setBorderPainted(false);
        ojoAbierto.setContentAreaFilled(false);
        ojoAbierto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojoAbierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojoAbiertoActionPerformed(evt);
            }
        });
        jPanel1.add(ojoAbierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 30, 40));

        txtContraseña.setFont(new java.awt.Font("DialogInput", 0, 19)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 325, 130, 30));

        txtUsuario.setFont(new java.awt.Font("DialogInput", 0, 19)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, 160, 30));

        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/BOTONSelect.png"))); // NOI18N
        btnEnter.setBorder(null);
        btnEnter.setBorderPainted(false);
        btnEnter.setContentAreaFilled(false);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/BTN ENTRAR.png"))); // NOI18N
        btnEnter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/BOTON.png"))); // NOI18N
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 220, 70));

        ICONO.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
        ICONO.setForeground(new java.awt.Color(41, 41, 79));
        ICONO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ICONO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/ICONO.png"))); // NOI18N
        jPanel1.add(ICONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 50));

        iconoContraseña.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
        iconoContraseña.setForeground(new java.awt.Color(41, 41, 79));
        iconoContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/ICONO CONTRASEÑA.png"))); // NOI18N
        jPanel1.add(iconoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, 40));

        iconoUsuario.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
        iconoUsuario.setForeground(new java.awt.Color(41, 41, 79));
        iconoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/ICONO USUARIO.png"))); // NOI18N
        jPanel1.add(iconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, 40));

        panelContraseña1.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
        panelContraseña1.setForeground(new java.awt.Color(41, 41, 79));
        panelContraseña1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelContraseña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/PANEL INPUTCONTRASEÑA.png"))); // NOI18N
        jPanel1.add(panelContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 250, 70));

        panelUsuario1.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
        panelUsuario1.setForeground(new java.awt.Color(41, 41, 79));
        panelUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/PANEL INPUTUSUARIO.png"))); // NOI18N
        jPanel1.add(panelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 250, 70));

        txtTitulo.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, 50));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Login/FONDO.png"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int LayoutX;
    int LayoutY;

    private void BarraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }//GEN-LAST:event_BarraTituloMousePressed

    private void BarraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMouseDragged
        this.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }//GEN-LAST:event_BarraTituloMouseDragged

    Proceso proceso = new Proceso();
    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        proceso.cambiarIconoJlabel(panelUsuario1, "/com/img/Login/PANEL INPUT_Select.png");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost

        if (txtUsuario.getText().equals("")) {
            proceso.cambiarIconoJlabel(panelUsuario1, "/com/img/Login/PANEL INPUTUSUARIO.png");
        } else {
            proceso.cambiarIconoJlabel(panelUsuario1, "/com/img/Login/PANEL INPUT.png");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusGained
        proceso.cambiarIconoJlabel(panelContraseña1, "/com/img/Login/PANEL INPUT_Select.png");
    }//GEN-LAST:event_txtContraseñaFocusGained

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        if (txtContraseña.getText().equals("")) {
            proceso.cambiarIconoJlabel(panelContraseña1, "/com/img/Login/PANEL INPUTCONTRASEÑA.png");
        } else {
            proceso.cambiarIconoJlabel(panelContraseña1, "/com/img/Login/PANEL INPUT.png");
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void ojoCerradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojoCerradoActionPerformed
        txtUsuario.transferFocus();
        ojoAbierto.setVisible(true);
        ojoCerrado.setVisible(false);
        txtContraseña.setEchoChar((char) 0);
        txtContraseña.transferFocus();
    }//GEN-LAST:event_ojoCerradoActionPerformed

    private void ojoAbiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojoAbiertoActionPerformed
        txtUsuario.transferFocus();
        ojoCerrado.setVisible(true);
        ojoAbierto.setVisible(false);
        txtContraseña.setEchoChar('*');
        txtContraseña.transferFocus();
    }//GEN-LAST:event_ojoAbiertoActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        Proceso.limitacionNumeros(txtUsuario, evt, 8);
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        Proceso.limitacionCaracteres(txtContraseña, evt, 11, false);
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        try {
            enter();
        } catch (SQLException ex) {
            Logger.getLogger(frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                enter();
            } catch (SQLException ex) {
                Logger.getLogger(frm_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                enter();
            } catch (SQLException ex) {
                Logger.getLogger(frm_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(frm_Login.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
        }
    }

    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "Desea Salir?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

    private void enter() throws SQLException {
        EntrarSistema();
    }

    private boolean autenticarUsuarioSede() {
        boolean valido = false;
        String sede = daoLogin.consultarRango("trabajadores", "dni", txtUsuario.getText(), "sede");
        String cargo = daoLogin.consultarRango("trabajadores", "dni", txtUsuario.getText(), "cargo");

        if (sede.equals(Data.getSede()) || cargo.equalsIgnoreCase("Administrador")) {
            valido = true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no pertenece a la sede", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return valido;
    }

    private void EntrarSistema() throws SQLException {
        daoLogin usuario = new daoLogin();
        boolean entrar = usuario.autenticarUsuario("trabajadores", "dni", "contraseña", txtUsuario.getText(), txtContraseña.getText());
        if (entrar) {
            if (autenticarUsuarioSede()) {
                daoLogin.guardarDatos();
                frm_Principal abrir = new frm_Principal();
                abrir.setVisible(true);
                this.hide();
            }
        }
    }

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
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraTitulo;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel ICONO;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JLabel iconoContraseña;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ojoAbierto;
    private javax.swing.JButton ojoCerrado;
    private javax.swing.JLabel panelContraseña1;
    private javax.swing.JLabel panelUsuario1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JLabel txtTitulo;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
