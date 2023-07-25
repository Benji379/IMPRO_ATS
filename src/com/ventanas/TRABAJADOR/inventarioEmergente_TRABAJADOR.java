package com.ventanas.TRABAJADOR;

import com.dao.InnerJoin.CrudJTable;
import com.dao.InnerJoin.daoLogin;
import com.formato.procesos.Proceso;
import com.formato.procesos.filtrarDatos;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import scrollbar.ScrollBarCustom;

public final class inventarioEmergente_TRABAJADOR extends javax.swing.JFrame {

    CrudJTable crud = new CrudJTable();

    public inventarioEmergente_TRABAJADOR() {
        initComponents();
        this.setLocationRelativeTo(null);
        Proceso.transparentarTxtField(txtCodigo, txtNombre, txtMarca, txtPrecio);
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane2.setHorizontalScrollBar(sp);
        filtrarDatos.setupTableSorting(JTProductos);
        Consultar();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/inventario.png")));
    }

    public void Consultar() {
        crud.consultarTabla(daoLogin.NOMBRE_TABLA_SEDE, asignarColumnasTabla(), JTProductos);
    }

    private Map<String, Integer> asignarColumnasTabla() {
        Map<String, Integer> columnas = new HashMap<>();

        columnas.put("id", 0);
        columnas.put("codigo", 1);
        columnas.put("nombre", 2);
        columnas.put("stock", 3);
        columnas.put("precio", 4);
        columnas.put("marca", 5);
        return columnas;
    }

    public void Filtrar() {
        List<String> filteredColumns = Arrays.asList("id", "codigo", "nombre", "stock", "precio", "marca");
        filtrarDatos.filterAndPopulateTable(daoLogin.NOMBRE_TABLA_SEDE, JTProductos, obtenerColumnFilters(), filteredColumns);
    }

    private Map<String, String> obtenerColumnFilters() {
        Map<String, String> columnFilters = new HashMap<>();
        columnFilters.put("codigo", txtCodigo.getText());
        columnFilters.put("nombre", txtNombre.getText());
        columnFilters.put("precio", txtPrecio.getText());
        columnFilters.put("marca", txtMarca.getText());
        return columnFilters;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtMarca = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTProductos = new com.formato.UIDesing.TableDark();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Productos & stock");
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

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(24, 24, 24));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 663, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio: S/.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        txtPrecio.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        txtPrecio.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 120, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 120, 10));

        txtMarca.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(null);
        txtMarca.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMarca.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 180, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 180, 10));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        JTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "codigo", "nombre", "stock", "precio", "marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTProductos);
        if (JTProductos.getColumnModel().getColumnCount() > 0) {
            JTProductos.getColumnModel().getColumn(0).setPreferredWidth(5);
            JTProductos.getColumnModel().getColumn(1).setPreferredWidth(50);
            JTProductos.getColumnModel().getColumn(2).setPreferredWidth(70);
            JTProductos.getColumnModel().getColumn(3).setPreferredWidth(10);
            JTProductos.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 640, 270));

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 120, 30));

        txtCodigo.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCodigo.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 120, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 120, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int LayoutX;
    int LayoutY;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        frmVenta_TRABAJADOR.txtCodigo.setText(codigoProducto);
        frmVenta_TRABAJADOR.txtCodigo.requestFocus();
        frmVenta_TRABAJADOR.consultarPrecioProduc();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        Filtrar();
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        Filtrar();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        Filtrar();

    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        Filtrar();

    }//GEN-LAST:event_txtPrecioKeyReleased
    String codigoProducto;
    private void JTProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTProductosMouseClicked
        int fila = JTProductos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        } else {
            codigoProducto = (String) JTProductos.getValueAt(fila, 1).toString();
        }
    }//GEN-LAST:event_JTProductosMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        frmVenta_TRABAJADOR.txtCodigo.setText(codigoProducto);
        frmVenta_TRABAJADOR.txtCodigo.requestFocus();
        frmVenta_TRABAJADOR.consultarPrecioProduc();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        toFront();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        toFront();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(inventarioEmergente_TRABAJADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inventarioEmergente_TRABAJADOR().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.formato.UIDesing.TableDark JTProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
