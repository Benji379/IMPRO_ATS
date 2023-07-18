package com.ventanas.administrador.trabajadores;

import com.dao.ConexionBd.ConexionSQL;
import com.dao.InnerJoin.DatosTabla;
import com.formato.procesos.Proceso;
import com.formato.procesos.filtrarDatos;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author Benji
 */
public class panelListaTrab extends javax.swing.JPanel {

    ConexionSQL con1 = new ConexionSQL();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public panelListaTrab() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        TransparentarTxt();
//        AutocompletadoTxt();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setHorizontalScrollBar(sp);
        consultar();
        Filtrar();
        filtrarDatos.setupTableSorting(JTEmpleados);
    }

    private void AutocompletadoTxt() {
        AutoCompleteDecorator.decorate(txtDni, DatosTabla.cargarDatosList("trabajadores", "dni"), false);
        AutoCompleteDecorator.decorate(txtNombre, DatosTabla.cargarDatosList("trabajadores", "nombres"), false);
    }

    private void Filtrar() {
        List<String> filteredColumns = Arrays.asList("id", "dni", "contraseña", "nombres", "apellidos", "edad", "genero", "correo", "codigo", "sede");
        filtrarDatos.filterAndPopulateTable("trabajadores", JTEmpleados, obtenerColumnFilters(), filteredColumns);
    }

    private Map<String, String> obtenerColumnFilters() {
        Map<String, String> columnFilters = new HashMap<>();
        columnFilters.put("dni", txtDni.getText());
        columnFilters.put("nombres", txtNombre.getText());
        columnFilters.put("genero", txtGenero.getText());
        columnFilters.put("sede", txtSede.getText());
        return columnFilters;
    }

    private void consultar() {
        String sql = "select * from trabajadores";
        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[11];
            modelo = (DefaultTableModel) JTEmpleados.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("id");
                cliente[1] = rs.getString("dni");
                cliente[2] = rs.getString("contraseña");
                cliente[3] = rs.getString("nombres");
                cliente[4] = rs.getString("apellidos");
                cliente[5] = rs.getString("edad");
                cliente[6] = rs.getString("genero");
                cliente[7] = rs.getString("correo");
                cliente[8] = rs.getString("cargo");
                cliente[9] = rs.getString("Codigo");
                cliente[10] = rs.getString("sede");
                modelo.addRow(cliente);
            }
            JTEmpleados.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void TransparentarTxt() {
        Proceso.transparentarTxtField(txtDni, txtNombre, txtSede, txtGenero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtSede = new javax.swing.JTextField();
        separador3 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btnFitlrar = new javax.swing.JButton();
        separador2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        separador = new javax.swing.JLabel();
        separador1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTEmpleados = new com.formato.UIDesing.TableDark();
        FONDO = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 170, 30));

        txtSede.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSede.setForeground(new java.awt.Color(255, 255, 255));
        txtSede.setBorder(null);
        txtSede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSedeKeyTyped(evt);
            }
        });
        add(txtSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 170, 30));

        separador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 170, 5));

        txtGenero.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtGenero.setBorder(null);
        txtGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGeneroKeyTyped(evt);
            }
        });
        add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 170, 30));

        btnFitlrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnFiltrar.png"))); // NOI18N
        btnFitlrar.setBorder(null);
        btnFitlrar.setBorderPainted(false);
        btnFitlrar.setContentAreaFilled(false);
        btnFitlrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFitlrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnFiltrar_press.png"))); // NOI18N
        btnFitlrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFitlrarActionPerformed(evt);
            }
        });
        add(btnFitlrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 70, -1));

        separador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 170, 5));

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, 30));

        separador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, 5));

        separador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 170, 5));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nombre: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Dni:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("GENERO");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Sede");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Trabajadores");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        JTEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "dni", "Contraseña", "Nombres", "Apellidos", "Edad", "Genero", "Correo", "Codigo", "Sede"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTEmpleados);
        if (JTEmpleados.getColumnModel().getColumnCount() > 0) {
            JTEmpleados.getColumnModel().getColumn(0).setMinWidth(50);
            JTEmpleados.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTEmpleados.getColumnModel().getColumn(1).setMinWidth(90);
            JTEmpleados.getColumnModel().getColumn(1).setPreferredWidth(90);
            JTEmpleados.getColumnModel().getColumn(2).setMinWidth(70);
            JTEmpleados.getColumnModel().getColumn(2).setPreferredWidth(70);
            JTEmpleados.getColumnModel().getColumn(3).setMinWidth(100);
            JTEmpleados.getColumnModel().getColumn(3).setPreferredWidth(100);
            JTEmpleados.getColumnModel().getColumn(4).setMinWidth(100);
            JTEmpleados.getColumnModel().getColumn(4).setPreferredWidth(100);
            JTEmpleados.getColumnModel().getColumn(5).setMinWidth(50);
            JTEmpleados.getColumnModel().getColumn(5).setPreferredWidth(50);
            JTEmpleados.getColumnModel().getColumn(6).setMinWidth(50);
            JTEmpleados.getColumnModel().getColumn(6).setPreferredWidth(50);
            JTEmpleados.getColumnModel().getColumn(7).setMinWidth(110);
            JTEmpleados.getColumnModel().getColumn(7).setPreferredWidth(110);
            JTEmpleados.getColumnModel().getColumn(8).setMinWidth(90);
            JTEmpleados.getColumnModel().getColumn(8).setPreferredWidth(90);
            JTEmpleados.getColumnModel().getColumn(9).setMinWidth(50);
            JTEmpleados.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 900, 330));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/FONDO.png"))); // NOI18N
        FONDO.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSedeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSedeKeyTyped
        Proceso.limitacionNumeros(txtSede, evt, 2);
    }//GEN-LAST:event_txtSedeKeyTyped

    private void btnFitlrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFitlrarActionPerformed
        Filtrar();
    }//GEN-LAST:event_btnFitlrarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        Proceso.limitacionNumeros(txtDni, evt, 8);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Proceso.limitacionCaracteres(txtNombre, evt, 15, true);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneroKeyTyped
        Proceso.limitacionCaracteres(txtGenero, evt, 1, true);
    }//GEN-LAST:event_txtGeneroKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private com.formato.UIDesing.TableDark JTEmpleados;
    private javax.swing.JButton btnFitlrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSede;
    // End of variables declaration//GEN-END:variables
}
