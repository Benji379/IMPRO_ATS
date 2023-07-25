package com.ventanas.TRABAJADOR;

import com.formato.procesos.GeneradorQR;
import com.formato.procesos.PrintPanel;
import com.formato.procesos.Proceso;
import com.dao.InnerJoin.daoLogin;
import com.formato.jnafilechooser.api.JnaFileChooser;
import java.awt.Color;

/**
 *
 * @author Benji
 */
public class panelCarnet_TRABAJADOR extends javax.swing.JPanel {

    String nombres = daoLogin.NOMBRE;
    String apellidos = daoLogin.APELLIDOS;
    String rango = daoLogin.CARGO;
    String dni = daoLogin.DOCUMENT;
    String codigo = daoLogin.CODIGO;
    String sede = daoLogin.NSEDE;
    String correo = daoLogin.CORREO;
    String sexo = daoLogin.GENERO;

    public panelCarnet_TRABAJADOR() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        carnet.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        FONDO.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        mostrarDatos();
        detectarFoto();
        GeneradorQR.generateQRCode(codigo, QR, 6);
    }

    private void mostrarDatos() {
        txtNombres.setText(nombres);
        //Separar apellido paterno del apellido completo
        //para eso uso el metodo statico "obtenerPalabra" de la clase Proceso.
        txtApellidoP.setText(Proceso.obtenerPalabra(apellidos, 1));
        txtApellidoM.setText(Proceso.obtenerPalabra(apellidos, 2));
        txtCargo.setText(rango);
        txtDni.setText(dni);
        txtSede.setText(String.format("%02d", Integer.parseInt(sede)));
        txtCorreo.setText(correo);
        txtCodigo.setText(codigo);
        txtSexo.setText(sexo);
    }

    private void detectarFoto() {
        String direccion = "/com/img/Carnet/";
        if (rango.equalsIgnoreCase("administrador")) {
            fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "fotoAdministrador.png")));
        } else {
            if (rango.equalsIgnoreCase("trabajador")) {
                if (sexo.equalsIgnoreCase("m")) {
                    fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "fotoTrabajador.png")));
                } else {
                    if (sexo.equalsIgnoreCase("f")) {
                        fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource(direccion + "fotoTrabajadoraMujer.png")));
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carnet = new javax.swing.JPanel();
        QR = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        jlbSexo = new javax.swing.JLabel();
        txtSede = new javax.swing.JLabel();
        Sede = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        jlbCodigo = new javax.swing.JLabel();
        jlbDatos = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtNombres = new javax.swing.JLabel();
        jlbNombres = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JLabel();
        jlbApellidoP = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JLabel();
        jlbApellidoM = new javax.swing.JLabel();
        fotoUsuario = new javax.swing.JLabel();
        fonoCodigo = new javax.swing.JLabel();
        fondoDatos = new javax.swing.JLabel();
        logo_eslogan = new javax.swing.JLabel();
        FONDOCARNET = new javax.swing.JLabel();
        FONDO = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carnet.setBackground(new java.awt.Color(24, 24, 24));
        carnet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(QR, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 330, 160, 160));

        txtSexo.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(255, 255, 255));
        txtSexo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSexo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 70, 30));

        jlbSexo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jlbSexo.setForeground(new java.awt.Color(255, 255, 255));
        jlbSexo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbSexo.setText("Sexo:");
        jlbSexo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(jlbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 70, 30));

        txtSede.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 25)); // NOI18N
        txtSede.setForeground(new java.awt.Color(255, 255, 255));
        txtSede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSede.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 90, 80));

        Sede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Carnet/marco sede.png"))); // NOI18N
        Sede.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(Sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 90, 80));

        txtCodigo.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 190, 30));

        jlbCodigo.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 22)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCodigo.setText("CODIGO");
        jlbCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(jlbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 130, 30));

        jlbDatos.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jlbDatos.setForeground(new java.awt.Color(255, 255, 255));
        jlbDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbDatos.setText("Datos");
        jlbDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(jlbDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 150, 40));

        txtCorreo.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 240, 30));

        txtCargo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 22)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(255, 255, 255));
        txtCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCargo.setText("Administrador");
        txtCargo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 190, 30));

        txtDni.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 22)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDni.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 130, 30));

        txtNombres.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNombres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 250, 30));

        jlbNombres.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 25)); // NOI18N
        jlbNombres.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNombres.setText("Nombres:");
        jlbNombres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(jlbNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 150, 30));

        txtApellidoP.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtApellidoP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 240, 30));

        jlbApellidoP.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 25)); // NOI18N
        jlbApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        jlbApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbApellidoP.setText("Apellido P.");
        jlbApellidoP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(jlbApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 190, 30));

        txtApellidoM.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtApellidoM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 240, 30));

        jlbApellidoM.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 25)); // NOI18N
        jlbApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        jlbApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbApellidoM.setText("Apellido M.");
        jlbApellidoM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(jlbApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 190, 30));

        fotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(fotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 150, 150));

        fonoCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fonoCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Carnet/MarcoCodigoQR.png"))); // NOI18N
        fonoCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(fonoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 230, 360));

        fondoDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Carnet/MarcoDatos.png"))); // NOI18N
        fondoDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(fondoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 630, 360));

        logo_eslogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_eslogan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Carnet/LOGO ESLOGAN.png"))); // NOI18N
        logo_eslogan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo_eslogan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logo_esloganMouseClicked(evt);
            }
        });
        carnet.add(logo_eslogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        FONDOCARNET.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDOCARNET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Carnet/fondoCarnetConMarco.png"))); // NOI18N
        FONDOCARNET.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        carnet.add(FONDOCARNET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 580));

        add(carnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 940, 580));

        FONDO.setBackground(new java.awt.Color(102, 102, 102));
        FONDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/FONDO.png"))); // NOI18N
        fondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FONDO.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));

        add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));
    }// </editor-fold>//GEN-END:initComponents

    private final String defaultFileName = "Carnet " + daoLogin.CODIGO; // Nombre por defecto

    private void logo_esloganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo_esloganMouseClicked
        if (evt.getClickCount() == 2) {
            // Obtener el Window padre del JPanel
            javax.swing.SwingUtilities.invokeLater(() -> {
                java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(carnet);
                if (parentWindow != null) {
                    JnaFileChooser jnaCh = new JnaFileChooser();
                    jnaCh.setDefaultFileName(defaultFileName); // Establecer el nombre por defecto en el campo de texto
                    boolean save = jnaCh.showOpenDialog(parentWindow);
                    if (save) {
                        String fileName = jnaCh.getSelectedFile().getName();
                        if (fileName.isEmpty() || fileName.equals(defaultFileName)) {
                            fileName = defaultFileName;
                        }
                        PrintPanel.capturePanel(carnet, jnaCh.getSelectedFile().getParentFile(), fileName);
                    }
                }
            });
        }
    }//GEN-LAST:event_logo_esloganMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FONDO;
    private javax.swing.JLabel FONDOCARNET;
    private javax.swing.JLabel QR;
    private javax.swing.JLabel Sede;
    private javax.swing.JPanel carnet;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoDatos;
    private javax.swing.JLabel fonoCodigo;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JLabel jlbApellidoM;
    private javax.swing.JLabel jlbApellidoP;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbDatos;
    private javax.swing.JLabel jlbNombres;
    private javax.swing.JLabel jlbSexo;
    private javax.swing.JLabel logo_eslogan;
    private javax.swing.JLabel txtApellidoM;
    private javax.swing.JLabel txtApellidoP;
    private javax.swing.JLabel txtCargo;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtDni;
    private javax.swing.JLabel txtNombres;
    private javax.swing.JLabel txtSede;
    private javax.swing.JLabel txtSexo;
    // End of variables declaration//GEN-END:variables
}
