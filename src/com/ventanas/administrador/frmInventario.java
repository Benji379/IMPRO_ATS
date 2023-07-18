package com.ventanas.administrador;

import com.formato.UIDesing.JScrollPaneUtils;
import com.formato.UIDesing.TableDark;
import com.formato.procesos.ImageUtils;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JScrollBar;
import scrollbar.ScrollBarCustom;

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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/icon.png")));
        ImageUtils.setScaledImageFromUrl("https://s7d2.scene7.com/is/image/TottusPE/42756819_2?wid=240&hei=240&qlt=70&fmt=webp", imagenProducto);
        TableDark p = new TableDark();
        p.fixTable(jScrollPaneDatos);
        JScrollPaneUtils.removeWhiteBorder(jScrollPaneDatos);
        jScrollPaneDatos.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPaneDatos.setHorizontalScrollBar(sp);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventario = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jlbTitulo = new javax.swing.JLabel();
        BarraTitulo = new javax.swing.JLabel();
        MarcoImagen = new javax.swing.JLabel();
        imagenProducto = new javax.swing.JLabel();
        jScrollPaneTable = new javax.swing.JScrollPane();
        JTProductos = new com.formato.UIDesing.TableDark();
        jlbDatos1 = new javax.swing.JLabel();
        jScrollPaneDatos = new javax.swing.JScrollPane();
        panelDatos = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JLabel();
        jlbCodigo = new javax.swing.JLabel();
        txtStock = new javax.swing.JLabel();
        jlbStock = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jlbPrecio = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JLabel();
        jlbCategoria = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        jlbMarca = new javax.swing.JLabel();
        txtUrlImg = new javax.swing.JLabel();
        jlbUrlImg = new javax.swing.JLabel();
        separador1 = new javax.swing.JLabel();
        separador2 = new javax.swing.JLabel();
        separador3 = new javax.swing.JLabel();
        separador4 = new javax.swing.JLabel();
        separador5 = new javax.swing.JLabel();
        separador6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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

        jlbTitulo.setFont(new java.awt.Font("Georgia", 0, 55)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("INVENTARIO");
        panelInventario.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

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

        MarcoImagen.setFont(new java.awt.Font("Georgia", 0, 55)); // NOI18N
        MarcoImagen.setForeground(new java.awt.Color(255, 255, 255));
        MarcoImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarcoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/MarcoImagen.png"))); // NOI18N
        MarcoImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelInventario.add(MarcoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 220, 210));

        imagenProducto.setFont(new java.awt.Font("Georgia", 0, 55)); // NOI18N
        imagenProducto.setForeground(new java.awt.Color(255, 255, 255));
        imagenProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelInventario.add(imagenProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 200, 200));

        JTProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneTable.setViewportView(JTProductos);
        if (JTProductos.getColumnModel().getColumnCount() > 0) {
            JTProductos.getColumnModel().getColumn(5).setPreferredWidth(100);
            JTProductos.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        panelInventario.add(jScrollPaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 780, 340));

        jlbDatos1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jlbDatos1.setForeground(new java.awt.Color(255, 255, 255));
        jlbDatos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbDatos1.setText("Datos");
        panelInventario.add(jlbDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 100, 30));

        panelDatos.setBackground(new java.awt.Color(24, 24, 24));
        panelDatos.setPreferredSize(new java.awt.Dimension(280, 340));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCodigo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtCodigo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 150, 30));

        jlbCodigo.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCodigo.setText("Código:");
        panelDatos.add(jlbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        txtStock.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStock.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtStock.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, 30));

        jlbStock.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbStock.setForeground(new java.awt.Color(255, 255, 255));
        jlbStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbStock.setText("Stock:");
        panelDatos.add(jlbStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 30));

        txtPrecio.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPrecio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtPrecio.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 30));

        jlbPrecio.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jlbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbPrecio.setText("Precio:");
        panelDatos.add(jlbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        txtCategoria.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCategoria.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtCategoria.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 30));

        jlbCategoria.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlbCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCategoria.setText("Categoría:");
        panelDatos.add(jlbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 30));

        txtMarca.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMarca.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtMarca.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 150, 30));

        jlbMarca.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbMarca.setForeground(new java.awt.Color(255, 255, 255));
        jlbMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbMarca.setText("Marca:");
        panelDatos.add(jlbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 30));

        txtUrlImg.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtUrlImg.setForeground(new java.awt.Color(255, 255, 255));
        txtUrlImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUrlImg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtUrlImg.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtUrlImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 150, 30));

        jlbUrlImg.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbUrlImg.setForeground(new java.awt.Color(255, 255, 255));
        jlbUrlImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbUrlImg.setText("url-Imagen");
        panelDatos.add(jlbUrlImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 30));

        separador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 150, 10));

        separador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 150, 10));

        separador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 150, 10));

        separador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, 10));

        separador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 150, 10));

        separador6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, 10));

        jScrollPaneDatos.setViewportView(panelDatos);

        panelInventario.add(jScrollPaneDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 300, 270));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/FondoDatos.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelInventario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 380, 420));

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
    private com.formato.UIDesing.TableDark JTProductos;
    private javax.swing.JLabel MarcoImagen;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel imagenProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPaneDatos;
    private javax.swing.JScrollPane jScrollPaneTable;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbDatos1;
    private javax.swing.JLabel jlbMarca;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbStock;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbUrlImg;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador4;
    private javax.swing.JLabel separador5;
    private javax.swing.JLabel separador6;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtStock;
    private javax.swing.JLabel txtUrlImg;
    // End of variables declaration//GEN-END:variables
}
