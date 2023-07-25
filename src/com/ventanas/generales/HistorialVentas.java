package com.ventanas.generales;

import com.dao.InnerJoin.CrudJTable;
import com.dao.InnerJoin.RellenarComboBox;
import com.formato.UIDesing.JScrollPaneUtils;
import com.formato.procesos.FilterData;
import com.formato.procesos.Proceso;
import com.formato.procesos.filtrarDatos;
import com.raven.datechooser.DateChooser;
import com.raven.datechooser.SelectedAction;
import com.raven.datechooser.SelectedDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import scrollbar.ScrollBarCustom;

public final class HistorialVentas extends javax.swing.JPanel {

    public HistorialVentas() {
        initComponents();
        CalendarInicio(dateChooser, txtFechaInicio);
        CalendarFinal(dateChooser1, txtFechaFinal);
        Proceso.transparentarTxtField(txtFechaFinal, txtFechaInicio, txtDniCliente, txtDniTrabajador);
        Consultar();
        JTableScrollBarCustom(jScrollPane1);
        filtrarDatos.setupTableSorting(JTVentas);
        RellenarComboBox.rellenarComboBox(comboSede, "sedes", "sede");
//        FilterData.filterAndPopulateTable("ventas", JTVentas, hola(), fechaInicio, fechaFinal, "fecha");
        txtFechaInicio.setText("");
        txtFechaFinal.setText("");
    }

    private void Filtrar() {
        List<String> filteredColumns = Arrays.asList("id", "sede", "dniTrabajador", "dniCliente", "total", "fecha", "hora");
        filtrarDatos.filterAndPopulateTable("ventas", JTVentas, obtenerColumnFilters(), filteredColumns);
    }

    private Map<String, String> obtenerColumnFilters() {
        Map<String, String> columnFilters = new HashMap<>();
        columnFilters.put("dniTrabajador", txtDniTrabajador.getText());
        columnFilters.put("dniCliente", txtDniCliente.getText());
        if (comboSede.getSelectedIndex() == 0) {
            columnFilters.put("sede", (String) "");
        } else {
            columnFilters.put("sede", (String) comboSede.getSelectedItem());
        }

        return columnFilters;
    }

    private Map<String, Integer> hola() {
        Map<String, Integer> columnasAMostrar = new HashMap<>();
        columnasAMostrar.put("id", 0);
        columnasAMostrar.put("sede", 1);
        columnasAMostrar.put("dniTrabajador", 2);
        columnasAMostrar.put("dniCliente", 3);
        columnasAMostrar.put("total", 4);
        columnasAMostrar.put("fecha", 5);
        columnasAMostrar.put("hora", 6);
        return columnasAMostrar;
    }

    private void JTableScrollBarCustom(JScrollPane scrollPane) {
        JScrollPaneUtils.removeWhiteBorder(scrollPane);
        scrollPane.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scrollPane.setHorizontalScrollBar(sp);
    }

    private String fechaInicio = Proceso.FechaActual();
    private String fechaFinal = Proceso.FechaActual();

    public void CalendarInicio(DateChooser data, JTextField txtField) {
        data.addEventDateChooser((SelectedAction action, SelectedDate date) -> {
            String dia = String.format("%02d", date.getDay());
            String mes = String.format("%02d", date.getMonth());
            String año = String.format("%02d", date.getYear());
            fechaInicio = año + "-" + mes + "-" + dia;
            txtField.setText(fechaInicio);
            System.out.println("Inicio: " + fechaInicio);
            System.out.println("Final: " + fechaFinal);
            txtDniCliente.setText("");
            txtDniTrabajador.setText("");
            comboSede.setSelectedIndex(0);
            FilterData.filterAndPopulateTable("ventas", JTVentas, hola(), fechaInicio, fechaFinal, "fecha");
            if (action.getAction() == SelectedAction.DAY_SELECTED) {
//                data.hidePopup();
            }
        });
    }

    public void CalendarFinal(DateChooser data, JTextField txtField) {
        data.addEventDateChooser((SelectedAction action, SelectedDate date) -> {
            String dia = String.format("%02d", date.getDay());
            String mes = String.format("%02d", date.getMonth());
            String año = String.format("%02d", date.getYear());
            fechaFinal = año + "-" + mes + "-" + dia;
            txtField.setText(fechaFinal);
            System.out.println("Inicio: " + fechaInicio);
            System.out.println("Final: " + fechaFinal);
            txtDniCliente.setText("");
            txtDniTrabajador.setText("");
            comboSede.setSelectedIndex(0);
            FilterData.filterAndPopulateTable("ventas", JTVentas, hola(), fechaInicio, fechaFinal, "fecha");
            if (action.getAction() == SelectedAction.DAY_SELECTED) {
//                data.hidePopup();
            }
        });
    }

    CrudJTable crud = new CrudJTable();

    private void Consultar() {
        crud.consultarTabla("ventas", asignarColumnasTabla(), JTVentas);
    }

    private Map<String, Integer> asignarColumnasTabla() {
        Map<String, Integer> columnas = new HashMap<>();

        columnas.put("id", 0);
        columnas.put("sede", 1);
        columnas.put("dniTrabajador", 2);
        columnas.put("dniCliente", 3);
        columnas.put("total", 4);
        columnas.put("fecha", 5);
        columnas.put("hora", 6);

        return columnas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        comboSede = new combobox.Combobox();
        txtDniCliente = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDniTrabajador = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTVentas = new com.formato.UIDesing.TableDark();
        jLabel1 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnFinal = new javax.swing.JButton();
        BtnInicio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtFechaFinal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        dateChooser.setTextRefernce(txtFechaInicio);

        dateChooser1.setTextRefernce(txtFechaFinal);

        setBackground(new java.awt.Color(24, 24, 24));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboSede.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        comboSede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboSede.setLabeText("");
        comboSede.setLineColor(new java.awt.Color(0, 0, 0));
        comboSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSedeActionPerformed(evt);
            }
        });
        add(comboSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 130, 40));

        txtDniCliente.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtDniCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtDniCliente.setBorder(null);
        txtDniCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDniCliente.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtDniCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniClienteKeyReleased(evt);
            }
        });
        add(txtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 150, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 150, 10));

        txtDniTrabajador.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtDniTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        txtDniTrabajador.setBorder(null);
        txtDniTrabajador.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDniTrabajador.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtDniTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniTrabajadorKeyReleased(evt);
            }
        });
        add(txtDniTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 150, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 150, 10));

        JTVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "sede", "dniTrabajador", "dniCliente", "total", "fecha", "hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTVentas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 840, 340));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("hasta");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 60, 30));

        txtFechaInicio.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaInicio.setBorder(null);
        txtFechaInicio.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFechaInicio.setSelectionColor(new java.awt.Color(255, 255, 255));
        add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 120, 30));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI Cliente   :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 170, 30));

        btnFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/emergentes/calendario.png"))); // NOI18N
        btnFinal.setBorder(null);
        btnFinal.setBorderPainted(false);
        btnFinal.setContentAreaFilled(false);
        btnFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });
        add(btnFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 40, 40));

        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/emergentes/calendario.png"))); // NOI18N
        BtnInicio.setBorder(null);
        BtnInicio.setBorderPainted(false);
        BtnInicio.setContentAreaFilled(false);
        BtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });
        add(BtnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 40, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 10));

        txtFechaFinal.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtFechaFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaFinal.setBorder(null);
        txtFechaFinal.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFechaFinal.setSelectionColor(new java.awt.Color(255, 255, 255));
        add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 10));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desde");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, 30));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SEDE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 60, 30));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DNI Trabajador:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 170, 30));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FECHA");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 80, 30));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOCUMENTO");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 120, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/moduloVentas/btnLimpiar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 35, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        dateChooser.showPopup();
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_btnFinalActionPerformed

    private void comboSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSedeActionPerformed
        Filtrar();
    }//GEN-LAST:event_comboSedeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fechaInicio = "2000-01-01";
        fechaFinal = Proceso.FechaActual();
        txtFechaFinal.setText("");
        txtFechaInicio.setText("");
        txtDniCliente.setText("");
        txtDniTrabajador.setText("");
        comboSede.setSelectedIndex(0);
        FilterData.filterAndPopulateTable("ventas", JTVentas, hola(), fechaInicio, fechaFinal, "fecha");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDniTrabajadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniTrabajadorKeyReleased
        Filtrar();
    }//GEN-LAST:event_txtDniTrabajadorKeyReleased

    private void txtDniClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniClienteKeyReleased
        Filtrar();
    }//GEN-LAST:event_txtDniClienteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private com.formato.UIDesing.TableDark JTVentas;
    private javax.swing.JButton btnFinal;
    private combobox.Combobox comboSede;
    private com.raven.datechooser.DateChooser dateChooser;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtDniTrabajador;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
