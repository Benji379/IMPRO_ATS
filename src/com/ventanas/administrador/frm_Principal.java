package com.ventanas.administrador;

import com.formato.procesos.Clima;
import com.formato.procesos.Data;
import com.dao.InnerJoin.daoLogin;
import com.ventanas.administrador.trabajadores.menuTrabajadores;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import com.ventanas.generales.panel_Bienvenida;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Benji
 */
public final class frm_Principal extends javax.swing.JFrame {

    String rango = daoLogin.CARGO;
    String genero = daoLogin.GENERO;
    String nombre = daoLogin.NOMBRE;
    String apellidos = daoLogin.APELLIDOS;
    String correo = daoLogin.CORREO;
    String codigo = daoLogin.CODIGO;
    String NSede = daoLogin.NSEDE;

    public frm_Principal() {
        initComponents();
        DiseñoInicial();
        AbrirPanelBienvenida();
        cerrar();
    }

    public void AbrirPanelBienvenida() {
        panelInicio();
        mostrarDatosUsuario();
        Clima.Clima();
        fotoDePerfil();
        contenedor.setOpaque(false);
    }

    public void mostrarDatosUsuario() {
        panel_Bienvenida.txtNombreCompleto.setText(nombre + " " + apellidos);
        panel_Bienvenida.txtCorreo.setText(correo);
        panel_Bienvenida.txtCodigo.setText(codigo);
        panel_Bienvenida.txtSede.setText("Sede " + NSede);
    }

    private void DiseñoInicial() {
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        GENERAL.setOpaque(false);
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/icon.png")));
        MenuBar.setOpaque(false);
    }

    private void panelInicio() {
        panel_Bienvenida p = new panel_Bienvenida();
        p.setSize(960, 590);
        p.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        setTitle("IMRPO_ATS [Home]");
    }

    public void fotoDePerfil() {
        String direccion = "/com/img/paneles/";
        if (rango.equalsIgnoreCase("Administrador")) {
            panel_Bienvenida.perfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "PerfilUsuarioAdmin.png")));
            panel_Bienvenida.rangoUsuario.setText("Admin");
        } else {
            if (rango.equalsIgnoreCase("trabajador")) {
                panel_Bienvenida.rangoUsuario.setText("Trabajador");
                if (genero.equalsIgnoreCase("m")) {
                    panel_Bienvenida.perfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "PerfilUsuarioM.png")));
                } else {
                    if (genero.equalsIgnoreCase("f")) {
                        panel_Bienvenida.perfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "PerfilUsuarioF.png")));
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JPanel();
        btnBlockNotas = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnCalculadora = new javax.swing.JButton();
        btnCorreo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        GENERAL = new javax.swing.JPanel();
        BarraTitulo = new javax.swing.JLabel();
        btnLogo = new javax.swing.JButton();
        btnTrabajadores = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        FondoModulos = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel [Administrador]");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuBar.setBackground(new java.awt.Color(30, 30, 30));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBlockNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuNotas.png"))); // NOI18N
        btnBlockNotas.setBorder(null);
        btnBlockNotas.setBorderPainted(false);
        btnBlockNotas.setContentAreaFilled(false);
        btnBlockNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlockNotas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBlockNotas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuNotasPress.png"))); // NOI18N
        btnBlockNotas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuNotasSelect.png"))); // NOI18N
        btnBlockNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlockNotasMouseClicked(evt);
            }
        });
        MenuBar.add(btnBlockNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 70));

        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuExcel.png"))); // NOI18N
        btnExcel.setBorder(null);
        btnExcel.setBorderPainted(false);
        btnExcel.setContentAreaFilled(false);
        btnExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuExcelPress.png"))); // NOI18N
        btnExcel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuExcelSelect.png"))); // NOI18N
        MenuBar.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 120, 70));

        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuCalculadora.png"))); // NOI18N
        btnCalculadora.setBorder(null);
        btnCalculadora.setBorderPainted(false);
        btnCalculadora.setContentAreaFilled(false);
        btnCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalculadora.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuCalculadoraPress.png"))); // NOI18N
        btnCalculadora.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuCalculadoraSelect.png"))); // NOI18N
        MenuBar.add(btnCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 120, 70));

        btnCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/menuCorreo.png"))); // NOI18N
        btnCorreo.setBorder(null);
        btnCorreo.setBorderPainted(false);
        btnCorreo.setContentAreaFilled(false);
        btnCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCorreo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/menuCorreoPress.png"))); // NOI18N
        btnCorreo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/menuCorreoSelect.png"))); // NOI18N
        btnCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreoActionPerformed(evt);
            }
        });
        MenuBar.add(btnCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 120, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/menuConfiguracion.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/menuConfiguracionPress.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/menuConfiguracionSelect.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        MenuBar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 120, 70));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnMinimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnMinimizarPress.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        MenuBar.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 60, 50));

        getContentPane().add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 80));

        GENERAL.setBackground(new java.awt.Color(0, 255, 51));
        GENERAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        GENERAL.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/ICONO.png"))); // NOI18N
        btnLogo.setBorder(null);
        btnLogo.setBorderPainted(false);
        btnLogo.setContentAreaFilled(false);
        btnLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/ICONO_press.png"))); // NOI18N
        btnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoActionPerformed(evt);
            }
        });
        GENERAL.add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, 180));

        btnTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnTrabajadores.png"))); // NOI18N
        btnTrabajadores.setBorder(null);
        btnTrabajadores.setBorderPainted(false);
        btnTrabajadores.setContentAreaFilled(false);
        btnTrabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrabajadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrabajadores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnTrabajadoresPress.png"))); // NOI18N
        btnTrabajadores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnTrabajadoresSelect.png"))); // NOI18N
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });
        GENERAL.add(btnTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 250, 220, 80));

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnClientes.png"))); // NOI18N
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnClientesPress.png"))); // NOI18N
        btnClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnClientesSelect.png"))); // NOI18N
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        GENERAL.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 340, 220, 80));

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnVentas.png"))); // NOI18N
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnVentasPress.png"))); // NOI18N
        btnVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnVentasSelect.png"))); // NOI18N
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        GENERAL.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 430, 220, 80));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnProductos.png"))); // NOI18N
        btnProductos.setBorder(null);
        btnProductos.setBorderPainted(false);
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnProductosPress.png"))); // NOI18N
        btnProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnProductosSelect.png"))); // NOI18N
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        GENERAL.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 520, 220, 80));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnSalir.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/btnSalirPress.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        GENERAL.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 80, 60));

        FondoModulos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FondoModulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/SOMBRA MODULOS.png"))); // NOI18N
        FondoModulos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GENERAL.add(FondoModulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 670));

        contenedor.setBackground(new java.awt.Color(30, 30, 30));
        contenedor.setLayout(new java.awt.CardLayout());
        GENERAL.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 960, 590));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/FONDO GENERAL.png"))); // NOI18N
        GENERAL.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        getContentPane().add(GENERAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int LayoutX;
    int LayoutY;

    private void BarraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMouseDragged
        this.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }//GEN-LAST:event_BarraTituloMouseDragged

    private void BarraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }//GEN-LAST:event_BarraTituloMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(frm_Principal.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        config abrir = new config();
        abrir.setSize(960, 590);
        abrir.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(abrir, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        setTitle("IMPRO_ATS [Configuracion]");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreoActionPerformed
        abrirCorreo();
        this.setTitle("IMRPO_ATS [Chat]");
    }//GEN-LAST:event_btnCorreoActionPerformed

    private void btnBlockNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlockNotasMouseClicked
        //
    }//GEN-LAST:event_btnBlockNotasMouseClicked

    private void btnLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoActionPerformed
        AbrirPanelBienvenida();
    }//GEN-LAST:event_btnLogoActionPerformed

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        menuTrabajadores abrir = new menuTrabajadores();
        abrir.setSize(960, 590);
        abrir.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(abrir, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        setTitle("IMPRO_ATS [Trabajadores]");
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    public static void abrirCorreo() {
        chat abrir;
        try {
            abrir = new chat();
            abrir.setSize(960, 590);
            abrir.setLocation(0, 0);
            contenedor.removeAll();
            contenedor.add(abrir, BorderLayout.CENTER);
            contenedor.revalidate();
            contenedor.repaint();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraTitulo;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel FondoModulos;
    private javax.swing.JPanel GENERAL;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton btnBlockNotas;
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCorreo;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnLogo;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTrabajadores;
    private javax.swing.JButton btnVentas;
    public static javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
