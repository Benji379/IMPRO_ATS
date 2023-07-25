package com.ventanas.TRABAJADOR;

import com.formato.procesos.Clima_TRABAJADOR;
import com.dao.InnerJoin.daoLogin;
import com.formato.procesos.Data;
import com.formato.procesos.Proceso;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Benji
 */
public final class frm_Principal_TRABAJADOR extends javax.swing.JFrame {

    String rango = daoLogin.CARGO;
    String genero = daoLogin.GENERO;
    String nombre = daoLogin.NOMBRE;
    String apellidos = daoLogin.APELLIDOS;
    String correo = daoLogin.CORREO;
    String codigo = daoLogin.CODIGO;
    String NSede = Data.getSede();

    public frm_Principal_TRABAJADOR() {
        initComponents();
        DiseñoInicial();
        AbrirPanelBienvenida();
        cerrar();
    }

    public void AbrirPanelBienvenida() {
        panelInicio();
        mostrarDatosUsuario();
        Clima_TRABAJADOR.Clima();
        fotoDePerfil();
        contenedor.setOpaque(false);
    }

    public void mostrarDatosUsuario() {
        panel_Bienvenida_TRABAJADOR.txtNombreCompleto.setText(nombre + " " + apellidos);
        panel_Bienvenida_TRABAJADOR.txtCorreo.setText(correo);
        panel_Bienvenida_TRABAJADOR.txtCodigo.setText(codigo);
        panel_Bienvenida_TRABAJADOR.txtSede.setText("Sede " + NSede);
    }

    private void DiseñoInicial() {
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        GENERAL.setOpaque(false);
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/icon.png")));
        MenuBar.setOpaque(false);
    }

    private void panelInicio() {
        panel_Bienvenida_TRABAJADOR p = new panel_Bienvenida_TRABAJADOR();
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
            panel_Bienvenida_TRABAJADOR.perfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "PerfilUsuarioAdmin.png")));
            panel_Bienvenida_TRABAJADOR.rangoUsuario.setText("Admin");
        } else {
            if (rango.equalsIgnoreCase("trabajador")) {
                panel_Bienvenida_TRABAJADOR.rangoUsuario.setText("Trabajador");
                if (genero.equalsIgnoreCase("m")) {
                    panel_Bienvenida_TRABAJADOR.perfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "PerfilUsuarioM.png")));
                } else {
                    if (genero.equalsIgnoreCase("f")) {
                        panel_Bienvenida_TRABAJADOR.perfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "PerfilUsuarioF.png")));
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        GENERAL = new javax.swing.JPanel();
        btnCalculadora = new javax.swing.JButton();
        btnCorreo = new javax.swing.JButton();
        btnBlockNotas = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        BarraTitulo = new javax.swing.JLabel();
        btnLogo = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
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

        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuCalculadora.png"))); // NOI18N
        btnCalculadora.setBorder(null);
        btnCalculadora.setBorderPainted(false);
        btnCalculadora.setContentAreaFilled(false);
        btnCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalculadora.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuCalculadoraPress.png"))); // NOI18N
        btnCalculadora.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuCalculadoraSelect.png"))); // NOI18N
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });
        GENERAL.add(btnCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 120, 70));

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
        GENERAL.add(btnCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 120, 70));

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
        btnBlockNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlockNotasActionPerformed(evt);
            }
        });
        GENERAL.add(btnBlockNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 120, 70));

        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuExcel.png"))); // NOI18N
        btnExcel.setBorder(null);
        btnExcel.setBorderPainted(false);
        btnExcel.setContentAreaFilled(false);
        btnExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuExcelPress.png"))); // NOI18N
        btnExcel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/imgPrincipal/MenuExcelSelect.png"))); // NOI18N
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        GENERAL.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 120, 70));

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
        GENERAL.add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 180));

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
        GENERAL.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, 80));

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
        this.setState(frm_Principal_TRABAJADOR.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

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

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        menuVentasTrabajador abrir = new menuVentasTrabajador();
        abrir.setSize(960, 590);
        abrir.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(abrir, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        setTitle("IMPRO_ATS [Ventas]");
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnBlockNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlockNotasActionPerformed
        Proceso.AccederEnlace("notepad");
    }//GEN-LAST:event_btnBlockNotasActionPerformed

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        Proceso.AccederEnlace("calc");
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        Proceso.AccederEnlace("excel");
    }//GEN-LAST:event_btnExcelActionPerformed

    public static void abrirCorreo() {
        chat_TRABAJADOR abrir;
        try {
            abrir = new chat_TRABAJADOR();
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
            java.util.logging.Logger.getLogger(frm_Principal_TRABAJADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_Principal_TRABAJADOR().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BarraTitulo;
    public static javax.swing.JLabel FONDO;
    public static javax.swing.JLabel FondoModulos;
    public static javax.swing.JPanel GENERAL;
    public static javax.swing.JPanel MenuBar;
    public static javax.swing.JButton btnBlockNotas;
    public static javax.swing.JButton btnCalculadora;
    public static javax.swing.JButton btnCorreo;
    public static javax.swing.JButton btnExcel;
    public static javax.swing.JButton btnLogo;
    public static javax.swing.JButton btnMinimizar;
    public static javax.swing.JButton btnSalir;
    public static javax.swing.JButton btnVentas;
    public static javax.swing.JPanel contenedor;
    // End of variables declaration//GEN-END:variables
}
