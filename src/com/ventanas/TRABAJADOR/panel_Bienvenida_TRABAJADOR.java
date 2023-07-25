package com.ventanas.TRABAJADOR;

import com.formato.procesos.Clima_TRABAJADOR;
import com.formato.procesos.EscrituraAnimada;
import com.formato.procesos.HoraActual_TRABAJADOR;
import com.formato.procesos.Proceso;
import static com.ventanas.TRABAJADOR.frm_Principal_TRABAJADOR.contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Timer;

/**
 *
 * @author Benji
 */
public final class panel_Bienvenida_TRABAJADOR extends javax.swing.JPanel {

    public panel_Bienvenida_TRABAJADOR() {
        initComponents();
        Tiempo();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        datos.setOpaque(false);
        clima.setOpaque(false);
        AnimarJLabel();
    }

    public void AnimarJLabel() {
        EscrituraAnimada f = new EscrituraAnimada();
        f.mostrarTextoAnimado(txtBienvenido, "Bienvenido", 100);
    }

    private void Tiempo() {
        ActualizarHora();
        Proceso.FechaActual(txtFecha);
        Proceso.DiaSemana(txtDia);
    }

    public void ActualizarHora() {
        Timer tiempo = new Timer(100, new HoraActual_TRABAJADOR());
        Timer tiempoPeque = new Timer(100, new Clima_TRABAJADOR());
        tiempo.start();
        tiempoPeque.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHora = new javax.swing.JLabel();
        perfilUsuario = new javax.swing.JLabel();
        rangoUsuario = new javax.swing.JLabel();
        txtBienvenido = new javax.swing.JLabel();
        txtDia = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        datos = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JLabel();
        txtSede = new javax.swing.JLabel();
        clima = new javax.swing.JPanel();
        txtCiudad = new javax.swing.JLabel();
        txtDiaHora = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        txtViento = new javax.swing.JLabel();
        txtHumedad = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JLabel();
        imgClima = new javax.swing.JLabel();
        RELIEVETRANS = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setMinimumSize(new java.awt.Dimension(719, 590));
        setPreferredSize(new java.awt.Dimension(719, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHora.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 150, 30));

        perfilUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perfilUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perfilUsuarioMouseClicked(evt);
            }
        });
        add(perfilUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 140, 150));

        rangoUsuario.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        rangoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        rangoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rangoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(rangoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 180, 40));

        txtBienvenido.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        txtBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        txtBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 350, 40));

        txtDia.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        txtDia.setForeground(new java.awt.Color(255, 255, 255));
        txtDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 270, 60));

        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 200, 40));

        datos.setBackground(new java.awt.Color(51, 51, 51));
        datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datos.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 20));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datos.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 20));

        txtNombreCompleto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCompleto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datos.add(txtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 20));

        txtSede.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        txtSede.setForeground(new java.awt.Color(255, 255, 255));
        txtSede.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        datos.add(txtSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 60));

        add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 260, 200));

        clima.setBackground(new java.awt.Color(51, 51, 51));
        clima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCiudad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(255, 255, 255));
        clima.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, 20));

        txtDiaHora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDiaHora.setForeground(new java.awt.Color(255, 255, 255));
        txtDiaHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        clima.add(txtDiaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, 20));

        txtEstado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        clima.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, 20));

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Clima");
        clima.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        txtViento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtViento.setForeground(new java.awt.Color(255, 255, 255));
        clima.add(txtViento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, 20));

        txtHumedad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtHumedad.setForeground(new java.awt.Color(255, 255, 255));
        clima.add(txtHumedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 130, 20));

        C.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("°C");
        clima.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        txtTemperatura.setFont(new java.awt.Font("Century Gothic", 0, 60)); // NOI18N
        txtTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        clima.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 70, 80));

        imgClima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clima.add(imgClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 70));

        add(clima, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 290, 290));

        RELIEVETRANS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RELIEVETRANS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/paneles/FONDO CONTENEDOR.png"))); // NOI18N
        add(RELIEVETRANS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/paneles/FONDO.png"))); // NOI18N
        add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void perfilUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilUsuarioMouseClicked
        if (evt.getClickCount() == 2) {
            panelCarnet_TRABAJADOR abrir = new panelCarnet_TRABAJADOR();
            abrir.setSize(960, 590);
            abrir.setLocation(0, 0);
            contenedor.removeAll();
            contenedor.add(abrir, BorderLayout.CENTER);
            contenedor.revalidate();
            contenedor.repaint();
        }
    }//GEN-LAST:event_perfilUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel C;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel RELIEVETRANS;
    private javax.swing.JPanel clima;
    private javax.swing.JPanel datos;
    public static javax.swing.JLabel imgClima;
    public static javax.swing.JLabel perfilUsuario;
    public static javax.swing.JLabel rangoUsuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtBienvenido;
    public static javax.swing.JLabel txtCiudad;
    public static javax.swing.JLabel txtCodigo;
    public static javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtDia;
    public static javax.swing.JLabel txtDiaHora;
    public static javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtFecha;
    public static javax.swing.JLabel txtHora;
    public static javax.swing.JLabel txtHumedad;
    public static javax.swing.JLabel txtNombreCompleto;
    public static javax.swing.JLabel txtSede;
    public static javax.swing.JLabel txtTemperatura;
    public static javax.swing.JLabel txtViento;
    // End of variables declaration//GEN-END:variables
}
