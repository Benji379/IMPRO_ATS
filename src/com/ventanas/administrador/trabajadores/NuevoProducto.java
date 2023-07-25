package com.ventanas.administrador.trabajadores;

import com.dao.InnerJoin.Crud;
import com.dao.InnerJoin.DatabaseUtils;
import com.dao.InnerJoin.daoLogin;
import com.formato.jnafilechooser.api.JnaFileChooser;
import com.formato.procesos.BarcodeGenerator;
import static com.formato.procesos.EditableComboBoxUtil.makeEditableComboBox;
import com.formato.procesos.ImageUtils;
import com.formato.procesos.PrintPanel;
import com.formato.procesos.Proceso;
import com.ventanas.administrador.frmInventario;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NuevoProducto extends javax.swing.JFrame {

    public NuevoProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        Apariencia();
        TransparentarTxt();
        makeEditableComboBox(comboMarcas, true);
        NuevoRegistro();
    }
    private int idProducto;

    private void NuevoRegistro() {
        idProducto = DatabaseUtils.obtenerUltimoValorID(daoLogin.NOMBRE_TABLA_SEDE, "id") + 1;
        txtId.setText(String.valueOf(idProducto));
        EscribirHtmlCentrar(IMAGEN, "");
        Proceso.vaciarTxt(txtCodigo,txtNombre,txtPrecio,txtStock,txtUrlImagen);
        GenerarBarras("");
        IMAGEN.setIcon(null);
    }

    private void Apariencia() {
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        frmInventario.ventanaNuevoProducto = true;
        frmInventario.btnAtras.setEnabled(false);
        frmInventario.btnAgregarNuevo.setEnabled(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/inventario.png")));
    }

    private void EscribirHtmlCentrar(JLabel label, String palabra) {
        label.setText("<html><div style='text-align: center;'>" + palabra);
    }

    private void GenerarBarras(String texto) {
        BarcodeGenerator generar = new BarcodeGenerator();
        generar.generateBarcode("Code128", texto, codigoBarras);
        jlbCodigoBarras.setText(texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelVistaProducto = new javax.swing.JPanel();
        marcoImagen = new javax.swing.JLabel();
        IMAGEN = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        codigoBarras = new javax.swing.JLabel();
        jlbCodigoBarras = new javax.swing.JLabel();
        fondoCodigo = new javax.swing.JLabel();
        jlbNombreProducto = new javax.swing.JLabel();
        txtUrlImagen = new javax.swing.JTextField();
        separador4 = new javax.swing.JLabel();
        jlbUrlImagen = new javax.swing.JLabel();
        comboCategoria = new combobox.Combobox();
        comboMarcas = new combobox.Combobox();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jlbTitulo = new javax.swing.JLabel();
        jlbCategoria = new javax.swing.JLabel();
        jlbMarca = new javax.swing.JLabel();
        jlbStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        separador2 = new javax.swing.JLabel();
        jlbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        separador3 = new javax.swing.JLabel();
        jlbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        separador = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        separador1 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelVistaProducto.setBackground(new java.awt.Color(24, 24, 24));
        panelVistaProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marcoImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marcoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/MarcoImagenGrande.png"))); // NOI18N
        marcoImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelVistaProducto.add(marcoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 240));

        IMAGEN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMAGEN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IMAGEN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IMAGEN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMAGENMouseClicked(evt);
            }
        });
        panelVistaProducto.add(IMAGEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, 200));

        txtId.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId.setText("01");
        panelVistaProducto.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, -1));

        codigoBarras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoBarras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelVistaProducto.add(codigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 190, 60));

        jlbCodigoBarras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlbCodigoBarras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelVistaProducto.add(jlbCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 190, 20));

        fondoCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/fondoCodigooBarras.png"))); // NOI18N
        fondoCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelVistaProducto.add(fondoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 230, 120));

        jlbNombreProducto.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 15)); // NOI18N
        jlbNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombreProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNombreProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelVistaProducto.add(jlbNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 70));

        jPanel1.add(panelVistaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 480));

        txtUrlImagen.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtUrlImagen.setForeground(new java.awt.Color(255, 255, 255));
        txtUrlImagen.setBorder(null);
        txtUrlImagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUrlImagenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUrlImagenKeyTyped(evt);
            }
        });
        jPanel1.add(txtUrlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 240, 30));

        separador4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador4.setForeground(new java.awt.Color(255, 255, 255));
        separador4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separadorGrande.png"))); // NOI18N
        separador4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 240, 10));

        jlbUrlImagen.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jlbUrlImagen.setForeground(new java.awt.Color(255, 255, 255));
        jlbUrlImagen.setText("url Imagen");
        jPanel1.add(jlbUrlImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alimentos envasados", "Alimentos frescos", "Bebidas", "Cuidado del bebé", "Cuidado personal", "Cuidado de mascotas", "Cuidado del automóvil", "Cuidado de la ropa", "Llimpieza del hogar", "Productos para el hogar" }));
        comboCategoria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboCategoria.setLabeText("");
        comboCategoria.setLineColor(new java.awt.Color(0, 0, 0));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 200, 40));

        comboMarcas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abbott Laboratories", "Ajinomoto Co., Inc.", "Anheuser-Busch InBev", "Arla Foods", "Carlsberg Group", "Chr. Hansen Holding A/S", "Coca-Cola Company", "Colgate-Palmolive", "ConAgra Brands", "Conagra Brands", "Danone", "Del Monte Foods", "Diageo", "Energizer Holdings, Inc.", "Estée Lauder Companies", "Ferrero Group", "General Electric (GE)", "General Mills", "Grupo Bimbo", "H.J. Heinz Company", "Henkel AG & Co. KGaA", "Hershey Company", "Hormel Foods", "Hostess Brands, Inc.", "JBS S.A.", "Johnson & Johnson", "Kao Corporation", "Kellogg Company", "Kellogg's", "Kimberly-Clark", "Kimberly-Clark Corporation", "Kirin Holdings ", "Kraft Foods Group, Inc.", "Kraft Heinz Company", "L'Oréal", "Louis Vuitton", "Mars, Inc.", "McCormick ", "Mead Johnson", "Meiji Holdings Company", "Molson Coors Beverage", "Mondelez International", "Mondelez International", "Nestlé", "PepsiCo", "PepsiCo, Inc.", "Pernod Ricard", "Post Holdings, Inc.", "Procter & Gamble", "Quaker Oats Company", "Ralcorp Holdings", "Reckitt Benckiser", "Royal FrieslandCampina", "SABMiller", "Sara Lee Corporation", "SC Johnson", "Smucker Company", "Suntory Holdings", "The Clorox Company", "The Coca-Cola Company", "The Colgate-Palmolive", "The Hershey Company", "The J.M. Smucker ", "The Kellogg Company", "The Kraft Heinz Company", "The Procter & Gamble", "The Quaker Oats", "The Tyson Foods", "The Unilever Group", "The Wm. Wrigley Jr. ", "Tyson Foods", "Unilever Group", "Unilever Group", "Wm. Wrigley Jr. Company" }));
        comboMarcas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboMarcas.setLabeText("");
        comboMarcas.setLineColor(new java.awt.Color(0, 0, 0));
        comboMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcasActionPerformed(evt);
            }
        });
        jPanel1.add(comboMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 210, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnCerrar.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnCerrar_press.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 60, 60));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnAgregar.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnAgregar_press.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 80, 80));

        jlbTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 50)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setText("Nuevo Registro");
        jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jlbCategoria.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlbCategoria.setText("Categoría");
        jPanel1.add(jlbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        jlbMarca.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbMarca.setForeground(new java.awt.Color(255, 255, 255));
        jlbMarca.setText("Marca");
        jPanel1.add(jlbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        jlbStock.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbStock.setForeground(new java.awt.Color(255, 255, 255));
        jlbStock.setText("Stock");
        jPanel1.add(jlbStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        txtStock.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setBorder(null);
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStockKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 180, 30));

        separador2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador2.setForeground(new java.awt.Color(255, 255, 255));
        separador2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 190, 10));

        jlbPrecio.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jlbPrecio.setText("Precio");
        jPanel1.add(jlbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 20)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 180, 30));

        separador3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador3.setForeground(new java.awt.Color(255, 255, 255));
        separador3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 190, 10));

        jlbCodigo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo.setText("Codigo");
        jPanel1.add(jlbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 180, 30));

        separador.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 190, 10));

        jlbNombre.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre.setText("Nombre");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        txtNombre.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 180, 30));

        separador1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        separador1.setForeground(new java.awt.Color(255, 255, 255));
        separador1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        separador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 190, 10));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/fondoRegisterNuevo.png"))); // NOI18N
        FONDO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransparentarTxt() {
        Proceso.transparentarTxtField(txtCodigo, txtNombre, txtPrecio, txtStock, txtUrlImagen);
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salirRegistro();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        toFront();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        toFront();
    }//GEN-LAST:event_formWindowLostFocus

    private void salirRegistro() {
        int valor = JOptionPane.showConfirmDialog(this, "Cancelar registro?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (valor == JOptionPane.YES_NO_OPTION) {
            frmInventario.ventanaNuevoProducto = false;
            frmInventario.btnAtras.setEnabled(true);
            frmInventario.btnAgregarNuevo.setEnabled(true);
            frmInventario p = new frmInventario();
            p.Filtrar();
            p.Consultar();
            setVisible(false);
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salirRegistro();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void comboMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMarcasActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        boolean vacio = Proceso.ComprobarTxtVacio(txtCodigo, txtNombre, txtPrecio, txtStock, txtUrlImagen);

        if (vacio) {
            JOptionPane.showMessageDialog(null, "Campos Vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (Proceso.validacionDeDecimal(txtPrecio)) {
                int valor = JOptionPane.showConfirmDialog(this, "Confirmar Ingreso de Producto", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (valor == JOptionPane.YES_NO_OPTION) {
                    GuardarProducto();
                    NuevoRegistro();
                    JOptionPane.showMessageDialog(null, "Nuevo producto Registrado", "Mensage", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Precio Inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void GuardarProducto() {

        DecimalFormat df = new DecimalFormat("#.00");
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String stock = txtStock.getText();
        String precio = df.format(Double.parseDouble(txtPrecio.getText())).replace(",", ".");
        String categoria = (String) comboCategoria.getSelectedItem();
        String marca = (String) comboMarcas.getSelectedItem();
        String url = txtUrlImagen.getText();

        String encabezadosTabla[] = {"codigo", "nombre", "stock", "precio", "categoria", "marca", "urlImagen"};
        String Datos[] = {codigo, nombre, stock, precio, categoria, marca, url};
        Crud.insertarDatos(daoLogin.NOMBRE_TABLA_SEDE, encabezadosTabla, Datos);
    }


    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        GenerarBarras(txtCodigo.getText());
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void IMAGENMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMAGENMouseClicked
        String defaultFileName = "Producto #" + txtId.getText();
        if (evt.getClickCount() == 2) {
            // Obtener el Window padre del JPanel
            javax.swing.SwingUtilities.invokeLater(() -> {
                java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(panelVistaProducto);
                if (parentWindow != null) {
                    JnaFileChooser jnaCh = new JnaFileChooser();
                    jnaCh.setDefaultFileName(defaultFileName); // Establecer el nombre por defecto en el campo de texto
                    boolean save = jnaCh.showOpenDialog(parentWindow);
                    if (save) {
                        String fileName = jnaCh.getSelectedFile().getName();
                        if (fileName.isEmpty() || fileName.equals(defaultFileName)) {
                            fileName = defaultFileName;
                        }
                        PrintPanel.capturePanel(panelVistaProducto, jnaCh.getSelectedFile().getParentFile(), fileName);
                    }
                }
            });
        }
    }//GEN-LAST:event_IMAGENMouseClicked

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        EscribirHtmlCentrar(jlbNombreProducto, txtNombre.getText());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtUrlImagenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUrlImagenKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ImageUtils.setScaledImageFromUrl(txtUrlImagen.getText(), IMAGEN);
        }
    }//GEN-LAST:event_txtUrlImagenKeyReleased

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        Proceso.limitacionCaracteres(txtCodigo, evt, 30, false);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Proceso.limitacionCaracteres(txtNombre, evt, 60, true);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        Proceso.limitacionNumeros(txtStock, evt, 5);
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        Proceso.limitacionNumerosDecimales(txtStock, evt, 7);
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtUrlImagenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUrlImagenKeyTyped
        Proceso.limitacionEspacio(txtUrlImagen, evt);
    }//GEN-LAST:event_txtUrlImagenKeyTyped

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
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NuevoProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel IMAGEN;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel codigoBarras;
    private combobox.Combobox comboCategoria;
    private combobox.Combobox comboMarcas;
    private javax.swing.JLabel fondoCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbCodigoBarras;
    private javax.swing.JLabel jlbMarca;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbNombreProducto;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbStock;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbUrlImagen;
    private javax.swing.JLabel marcoImagen;
    private javax.swing.JPanel panelVistaProducto;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador4;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtUrlImagen;
    // End of variables declaration//GEN-END:variables
}
