package com.ventanas.administrador;

import com.dao.InnerJoin.Crud;
import com.dao.InnerJoin.CrudJTable;
import com.dao.InnerJoin.DatabaseUtils;
import com.dao.InnerJoin.RellenarComboBox;
import com.formato.procesos.Data;
import com.formato.procesos.Proceso;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Benji
 */
public class config extends javax.swing.JPanel {

    CrudJTable crud = new CrudJTable();
    private int sedeNueva;
    private String nombreNuevaSede;
    private int idc;

    public config() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jlbTitulo.setText("<html><div style='text-align: center;'>" + "CONFIGURACION DEL SISTEMA");
        NuevoRegistro();
        comboSedes.setSelectedItem(Data.getSede());
        TransparentarTextField();
        Consultar();
    }

    private void NuevoRegistro() {
        comboSedes.removeAllItems();
        RellenarComboBox.rellenarComboBox(comboSedes, "sedes", "sede");
        sedeNueva = DatabaseUtils.obtenerUltimoValorID("sedes", "sede") + 1;
        nombreNuevaSede = "Inventario_Sede_" + sedeNueva;
        txtNuevaSede.setText(String.valueOf(sedeNueva));
        txtFechaApertura.setText(Proceso.obtenerFechaHoraActual());
        comboEstado.setSelectedItem("Activo");
        txtDireccion.setText("");
        txtDireccion.setEditable(true);
    }

    private void Consultar() {
        crud.consultarTabla("sedes", asignarColumnasTabla(), JTSedes);
    }

    private Map<String, Integer> asignarColumnasTabla() {
        Map<String, Integer> columnas = new HashMap<>();

        columnas.put("sede", 0);
        columnas.put("ubicacion", 1);
        columnas.put("fechaApertura", 2);
        columnas.put("estado", 3);

        return columnas;
    }

    private void TransparentarTextField() {
        Proceso.transparentarTxtField(txtDireccion, txtFechaApertura, txtNuevaSede);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboEstado = new combobox.Combobox();
        comboSedes = new combobox.Combobox();
        btnLimpiar = new javax.swing.JButton();
        btnModificarSede = new javax.swing.JButton();
        btnRegistrarSede = new javax.swing.JButton();
        btnGUARDAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTSedes = new com.formato.UIDesing.TableDark();
        jlbEstado = new javax.swing.JLabel();
        jlbFechaApertura = new javax.swing.JLabel();
        txtFechaApertura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlbUbicacion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbNSede = new javax.swing.JLabel();
        jlbSede2 = new javax.swing.JLabel();
        jlbSede1 = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        txtNuevaSede = new javax.swing.JTextField();
        jlbSede = new javax.swing.JLabel();
        SEPARADORGRANDE = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setPreferredSize(new java.awt.Dimension(960, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Mantenimiento" }));
        comboEstado.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        comboEstado.setLabeText("");
        comboEstado.setLineColor(new java.awt.Color(0, 0, 0));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 130, 40));

        comboSedes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        comboSedes.setLabeText("");
        comboSedes.setLineColor(new java.awt.Color(0, 0, 0));
        comboSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSedesActionPerformed(evt);
            }
        });
        add(comboSedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 60, 40));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnNuevoRegistro.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnNuevoRegistro_press.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 80, 70));

        btnModificarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnGuardar.png"))); // NOI18N
        btnModificarSede.setBorder(null);
        btnModificarSede.setBorderPainted(false);
        btnModificarSede.setContentAreaFilled(false);
        btnModificarSede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarSede.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnGuardar_press.png"))); // NOI18N
        btnModificarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarSedeActionPerformed(evt);
            }
        });
        add(btnModificarSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 80, 70));

        btnRegistrarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnRegistrarSede.png"))); // NOI18N
        btnRegistrarSede.setBorder(null);
        btnRegistrarSede.setBorderPainted(false);
        btnRegistrarSede.setContentAreaFilled(false);
        btnRegistrarSede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarSede.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnRegistrarSede_press.png"))); // NOI18N
        btnRegistrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSedeActionPerformed(evt);
            }
        });
        add(btnRegistrarSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 80, 70));

        btnGUARDAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnGuardar.png"))); // NOI18N
        btnGUARDAR.setBorder(null);
        btnGUARDAR.setBorderPainted(false);
        btnGUARDAR.setContentAreaFilled(false);
        btnGUARDAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGUARDAR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/btnGuardar_press.png"))); // NOI18N
        btnGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUARDARActionPerformed(evt);
            }
        });
        add(btnGUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 80, 70));

        JTSedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sede", "Ubicacion", "Apertura", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTSedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTSedesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTSedes);
        if (JTSedes.getColumnModel().getColumnCount() > 0) {
            JTSedes.getColumnModel().getColumn(0).setPreferredWidth(60);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 260));

        jlbEstado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jlbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jlbEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbEstado.setText("Estado");
        add(jlbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 110, 30));

        jlbFechaApertura.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jlbFechaApertura.setForeground(new java.awt.Color(255, 255, 255));
        jlbFechaApertura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFechaApertura.setText("Fec.Apertura");
        add(jlbFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 110, 30));

        txtFechaApertura.setEditable(false);
        txtFechaApertura.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtFechaApertura.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaApertura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFechaApertura.setBorder(null);
        add(txtFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 130, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/Separadores.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 130, 20));

        jlbUbicacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        jlbUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbUbicacion.setText("Ubicacion");
        add(jlbUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 110, 30));

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setBorder(null);
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 130, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/Separadores.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 130, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/Separadores.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 80, 20));

        jlbNSede.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlbNSede.setForeground(new java.awt.Color(255, 255, 255));
        jlbNSede.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNSede.setText("Sede");
        add(jlbNSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 80, 30));

        jlbSede2.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jlbSede2.setForeground(new java.awt.Color(255, 255, 255));
        jlbSede2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSede2.setText("Lista de Sedes");
        add(jlbSede2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 220, 50));

        jlbSede1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jlbSede1.setForeground(new java.awt.Color(255, 255, 255));
        jlbSede1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSede1.setText("Nueva Sede");
        add(jlbSede1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, 50));

        jlbTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 34)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 350, 100));

        txtNuevaSede.setEditable(false);
        txtNuevaSede.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtNuevaSede.setForeground(new java.awt.Color(255, 255, 255));
        txtNuevaSede.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNuevaSede.setBorder(null);
        add(txtNuevaSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, 30));

        jlbSede.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jlbSede.setForeground(new java.awt.Color(255, 255, 255));
        jlbSede.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSede.setText("Sede:");
        add(jlbSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 100, 50));

        SEPARADORGRANDE.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        SEPARADORGRANDE.setForeground(new java.awt.Color(255, 255, 255));
        SEPARADORGRANDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEPARADORGRANDE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/SEPARADOR_GRANDE.png"))); // NOI18N
        add(SEPARADORGRANDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 780, 50));

        FONDO.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        FONDO.setForeground(new java.awt.Color(255, 255, 255));
        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/FONDO.png"))); // NOI18N
        add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUARDARActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Se finalizará la sesion\nDesea guardar los Cambios?", "Mensaje", dialog, JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/configuracion.png"));
        if (result == 0) {
            Data.GuardarSede((String) comboSedes.getSelectedItem());
            JOptionPane.showMessageDialog(null, "Programa Configurado", "Mensaje", JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/configuracion.png"));
            System.exit(0);
        }

    }//GEN-LAST:event_btnGUARDARActionPerformed

    private void comboSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSedesActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed
    Proceso ic = new Proceso();
    private void btnRegistrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSedeActionPerformed
        if (Integer.parseInt(txtNuevaSede.getText()) < DatabaseUtils.obtenerUltimoValorID("sedes", "sede") + 1) {
            JOptionPane.showMessageDialog(null, "No se puede registrar una sede existente", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!txtDireccion.getText().equals("")) {
                int dialog = JOptionPane.YES_NO_OPTION;
                int result = JOptionPane.showConfirmDialog(null, "Desea Registrar Nueva Sede?", "Mensaje", dialog, JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/preguntaNuevaSede.png"));
                if (result == 0) {
                    String horaFechaActual = Proceso.obtenerFechaHoraActual();
                    String columnas[] = {"ubicacion", "fechaApertura", "estado"};
                    String valores[] = {txtDireccion.getText(), horaFechaActual, (String) comboEstado.getSelectedItem()};
                    Crud.insertarDatos("sedes", columnas, valores);
                    String encabezados[] = {"id", "codigo", "nombre", "stock", "precio", "categoria", "marca", "urlImagen"};
                    Crud.crearTabla(nombreNuevaSede, encabezados);
                    Consultar();
                    JOptionPane.showMessageDialog(null, "Nueva Sede", "Mensaje", JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/nuevaSede.png"));
                    NuevoRegistro();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo Direccion Vacío", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegistrarSedeActionPerformed

    private void btnModificarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarSedeActionPerformed
        int fila = JTSedes.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Guardar Cambios?", "Mensaje", dialog);
            if (result == 0) {
                Map<String, String> datosInsertar = new HashMap<>();
                datosInsertar.put("estado", (String) comboEstado.getSelectedItem());
                crud.modificar("sedes", "sede", Integer.parseInt((String) JTSedes.getValueAt(fila, 0).toString()), datosInsertar);
                Consultar();
                NuevoRegistro();
            }
        }
    }//GEN-LAST:event_btnModificarSedeActionPerformed

    private void JTSedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTSedesMouseClicked
        int fila = JTSedes.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            idc = Integer.parseInt((String) JTSedes.getValueAt(fila, 0).toString());
            String Ubicacion = (String) JTSedes.getValueAt(fila, 1);
            String fechaApertura = (String) JTSedes.getValueAt(fila, 2);
            String Estado = (String) JTSedes.getValueAt(fila, 3);

            txtNuevaSede.setText(String.valueOf(idc));
            txtDireccion.setText(Ubicacion);
            txtFechaApertura.setText(fechaApertura);
            comboEstado.setSelectedItem(Estado);
            txtDireccion.setEditable(false);
        }
    }//GEN-LAST:event_JTSedesMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        NuevoRegistro();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private com.formato.UIDesing.TableDark JTSedes;
    private javax.swing.JLabel SEPARADORGRANDE;
    private javax.swing.JButton btnGUARDAR;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarSede;
    private javax.swing.JButton btnRegistrarSede;
    private combobox.Combobox comboEstado;
    private combobox.Combobox comboSedes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbEstado;
    private javax.swing.JLabel jlbFechaApertura;
    private javax.swing.JLabel jlbNSede;
    private javax.swing.JLabel jlbSede;
    private javax.swing.JLabel jlbSede1;
    private javax.swing.JLabel jlbSede2;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbUbicacion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaApertura;
    private javax.swing.JTextField txtNuevaSede;
    // End of variables declaration//GEN-END:variables
}
