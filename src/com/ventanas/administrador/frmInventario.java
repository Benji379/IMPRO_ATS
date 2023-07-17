package com.ventanas.administrador;

import java.awt.Color;

/**
 *
 * @author Benji
 */
public class frmInventario extends javax.swing.JFrame {

    public frmInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        panelInventario.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventario = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        BarraTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTEmpleados = new com.formato.UIDesing.TableDark();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMPRO_ATS [Inventario]");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInventario.setBackground(new java.awt.Color(24, 24, 24));
        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnAtras.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnAtras_press.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        panelInventario.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 50));

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
        panelInventario.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INVENTARIO");
        panelInventario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        JTEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Codigo", "Nombre", "Stock", "Precio", "Categoria", "urlImagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTEmpleados);
        if (JTEmpleados.getColumnModel().getColumnCount() > 0) {
            JTEmpleados.getColumnModel().getColumn(5).setPreferredWidth(100);
            JTEmpleados.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        panelInventario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 660, 330));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/FONDO.png"))); // NOI18N
        panelInventario.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        getContentPane().add(panelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        frm_Principal abrir = new frm_Principal();
        abrir.setVisible(true);
        hide();
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(frmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmInventario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraTitulo;
    private javax.swing.JLabel FONDO;
    private com.formato.UIDesing.TableDark JTEmpleados;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelInventario;
    // End of variables declaration//GEN-END:variables
}
