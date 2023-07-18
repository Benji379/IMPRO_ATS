package com.ventanas.administrador;

import com.formato.UIDesing.JScrollPaneUtils;
import com.formato.procesos.ImageUtils;
import com.formato.procesos.Proceso;
import com.ventanas.administrador.trabajadores.NuevoProducto;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author Benji
 */
public class frmInventario extends javax.swing.JFrame {

    public static boolean ventanaNuevoProducto = false;

    public frmInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        panelInventario.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/inventario.png")));
        ImageUtils.setScaledImageFromUrl("https://s7d2.scene7.com/is/image/TottusPE/42756819_2?wid=240&hei=240&qlt=70&fmt=webp", imagenProducto);
        JTableScrollBarCustom(jScrollPaneDatos);
        JTableScrollBarCustom(jScrollPaneFiltrar);
        TransparentarTxt();
    }

    private void JTableScrollBarCustom(JScrollPane scrollPane) {
        JScrollPaneUtils.removeWhiteBorder(scrollPane);
        scrollPane.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scrollPane.setHorizontalScrollBar(sp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventario = new javax.swing.JPanel();
        btnFiltrar = new javax.swing.JButton();
        btnAgregarNuevo = new javax.swing.JButton();
        jScrollPaneFiltrar = new javax.swing.JScrollPane();
        panelFiltrar = new javax.swing.JPanel();
        txtFiltrarStock = new javax.swing.JTextField();
        separador8 = new javax.swing.JLabel();
        jlbFiltrarStock = new javax.swing.JLabel();
        txtFiltrarPrecio = new javax.swing.JTextField();
        separador9 = new javax.swing.JLabel();
        jlbFiltrarPrecio = new javax.swing.JLabel();
        txtFiltrarCodigo = new javax.swing.JTextField();
        separador10 = new javax.swing.JLabel();
        jlbFiltrarCodigo = new javax.swing.JLabel();
        txtFiltrarNombre = new javax.swing.JTextField();
        separador11 = new javax.swing.JLabel();
        jlbFiltrarNombre = new javax.swing.JLabel();
        txtFiltrarMarca = new javax.swing.JTextField();
        separador12 = new javax.swing.JLabel();
        jlbFiltrarMarca = new javax.swing.JLabel();
        txtFiltrarCategoria = new javax.swing.JTextField();
        separador13 = new javax.swing.JLabel();
        jlbFiltrarCategoria = new javax.swing.JLabel();
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
        txtNombre = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        txtStock = new javax.swing.JLabel();
        jlbStock = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JLabel();
        jlbCategoria = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jlbPrecio = new javax.swing.JLabel();
        txtMarca = new javax.swing.JLabel();
        jlbMarca = new javax.swing.JLabel();
        separador5 = new javax.swing.JLabel();
        separador1 = new javax.swing.JLabel();
        separador2 = new javax.swing.JLabel();
        separador3 = new javax.swing.JLabel();
        separador4 = new javax.swing.JLabel();
        separador6 = new javax.swing.JLabel();
        fondoFiltros = new javax.swing.JLabel();
        fonoDatos = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("IMPRO_ATS [Inventario]");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInventario.setBackground(new java.awt.Color(24, 24, 24));
        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnFiltrar.png"))); // NOI18N
        btnFiltrar.setBorder(null);
        btnFiltrar.setBorderPainted(false);
        btnFiltrar.setContentAreaFilled(false);
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFiltrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnFiltrar_press.png"))); // NOI18N
        panelInventario.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 70, 60));

        btnAgregarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnNuevo.png"))); // NOI18N
        btnAgregarNuevo.setBorder(null);
        btnAgregarNuevo.setBorderPainted(false);
        btnAgregarNuevo.setContentAreaFilled(false);
        btnAgregarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarNuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/btnNuevo_press.png"))); // NOI18N
        btnAgregarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNuevoActionPerformed(evt);
            }
        });
        panelInventario.add(btnAgregarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 70, 60));

        panelFiltrar.setBackground(new java.awt.Color(24, 24, 24));
        panelFiltrar.setPreferredSize(new java.awt.Dimension(950, 150));
        panelFiltrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFiltrarStock.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltrarStock.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltrarStock.setBorder(null);
        txtFiltrarStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarStockKeyTyped(evt);
            }
        });
        panelFiltrar.add(txtFiltrarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 140, 30));

        separador8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        panelFiltrar.add(separador8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 140, 5));

        jlbFiltrarStock.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbFiltrarStock.setForeground(new java.awt.Color(255, 255, 255));
        jlbFiltrarStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFiltrarStock.setText("Stock:");
        panelFiltrar.add(jlbFiltrarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        txtFiltrarPrecio.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltrarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltrarPrecio.setBorder(null);
        txtFiltrarPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarPrecioKeyTyped(evt);
            }
        });
        panelFiltrar.add(txtFiltrarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 140, 30));

        separador9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        panelFiltrar.add(separador9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 140, 5));

        jlbFiltrarPrecio.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbFiltrarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jlbFiltrarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFiltrarPrecio.setText("Precio:");
        panelFiltrar.add(jlbFiltrarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        txtFiltrarCodigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltrarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltrarCodigo.setBorder(null);
        txtFiltrarCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarCodigoKeyTyped(evt);
            }
        });
        panelFiltrar.add(txtFiltrarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 140, 30));

        separador10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        panelFiltrar.add(separador10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 140, 5));

        jlbFiltrarCodigo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbFiltrarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlbFiltrarCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFiltrarCodigo.setText("Codigo:");
        panelFiltrar.add(jlbFiltrarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtFiltrarNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltrarNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltrarNombre.setBorder(null);
        txtFiltrarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarNombreKeyTyped(evt);
            }
        });
        panelFiltrar.add(txtFiltrarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 30));

        separador11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        panelFiltrar.add(separador11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, 5));

        jlbFiltrarNombre.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbFiltrarNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbFiltrarNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFiltrarNombre.setText("Nombre:");
        panelFiltrar.add(jlbFiltrarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtFiltrarMarca.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltrarMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltrarMarca.setBorder(null);
        txtFiltrarMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarMarcaKeyTyped(evt);
            }
        });
        panelFiltrar.add(txtFiltrarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 140, 30));

        separador12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        panelFiltrar.add(separador12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 140, 5));

        jlbFiltrarMarca.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbFiltrarMarca.setForeground(new java.awt.Color(255, 255, 255));
        jlbFiltrarMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFiltrarMarca.setText("Marca:");
        panelFiltrar.add(jlbFiltrarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        txtFiltrarCategoria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFiltrarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltrarCategoria.setBorder(null);
        txtFiltrarCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarCategoriaKeyTyped(evt);
            }
        });
        panelFiltrar.add(txtFiltrarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 140, 30));

        separador13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        panelFiltrar.add(separador13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 140, 5));

        jlbFiltrarCategoria.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jlbFiltrarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlbFiltrarCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFiltrarCategoria.setText("Categoria:");
        panelFiltrar.add(jlbFiltrarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jScrollPaneFiltrar.setViewportView(panelFiltrar);

        panelInventario.add(jScrollPaneFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 650, 160));

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
        panelInventario.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

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
                "id", "Codigo", "Nombre", "Stock", "Precio", "Marca", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTable.setViewportView(JTProductos);
        if (JTProductos.getColumnModel().getColumnCount() > 0) {
            JTProductos.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        panelInventario.add(jScrollPaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 780, 300));

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

        txtNombre.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtNombre.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, 30));

        jlbNombre.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbNombre.setText("nombre:");
        panelDatos.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 30));

        txtStock.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStock.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtStock.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 30));

        jlbStock.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbStock.setForeground(new java.awt.Color(255, 255, 255));
        jlbStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbStock.setText("Stock:");
        panelDatos.add(jlbStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        txtCategoria.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCategoria.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtCategoria.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 150, 30));

        jlbCategoria.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlbCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCategoria.setText("Categoría:");
        panelDatos.add(jlbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 30));

        txtPrecio.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPrecio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtPrecio.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 30));

        jlbPrecio.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jlbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbPrecio.setText("Precio:");
        panelDatos.add(jlbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 30));

        txtMarca.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMarca.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        txtMarca.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 150, 30));

        jlbMarca.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jlbMarca.setForeground(new java.awt.Color(255, 255, 255));
        jlbMarca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbMarca.setText("Marca:");
        panelDatos.add(jlbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 30));

        separador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 150, 10));

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

        separador6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        separador6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        separador6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separador6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panelDatos.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, 10));

        jScrollPaneDatos.setViewportView(panelDatos);

        panelInventario.add(jScrollPaneDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 300, 270));

        fondoFiltros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/fondoFiltros.png"))); // NOI18N
        fondoFiltros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelInventario.add(fondoFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 740, 220));

        fonoDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fonoDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/FondoDatos.png"))); // NOI18N
        fonoDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelInventario.add(fonoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 380, 420));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/FONDO.png"))); // NOI18N
        panelInventario.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        getContentPane().add(panelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransparentarTxt() {
        Proceso.transparentarTxtField(txtFiltrarCodigo, txtFiltrarCategoria,
                txtFiltrarMarca, txtFiltrarNombre, txtFiltrarPrecio, txtFiltrarStock);
    }

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

    private void txtFiltrarStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarStockKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarStockKeyTyped

    private void txtFiltrarPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarPrecioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarPrecioKeyTyped

    private void txtFiltrarCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarCodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarCodigoKeyTyped

    private void txtFiltrarNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarNombreKeyTyped

    private void txtFiltrarMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarMarcaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarMarcaKeyTyped

    private void txtFiltrarCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarCategoriaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarCategoriaKeyTyped

    private void btnAgregarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNuevoActionPerformed
        NuevoProducto nuevo = new NuevoProducto();
        nuevo.setVisible(true);
    }//GEN-LAST:event_btnAgregarNuevoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (ventanaNuevoProducto) {
            JOptionPane.showMessageDialog(null, "Cierre la ventana de registro", "Mensage", JOptionPane.WARNING_MESSAGE);
        } else {
            frmInventario.ventanaNuevoProducto = false;
            frm_Principal abrir = new frm_Principal();
            abrir.setVisible(true);
            hide();
        }
    }//GEN-LAST:event_formWindowClosing

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
    public static javax.swing.JButton btnAgregarNuevo;
    public static javax.swing.JButton btnAtras;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JLabel fondoFiltros;
    private javax.swing.JLabel fonoDatos;
    private javax.swing.JLabel imagenProducto;
    private javax.swing.JScrollPane jScrollPaneDatos;
    private javax.swing.JScrollPane jScrollPaneFiltrar;
    private javax.swing.JScrollPane jScrollPaneTable;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbDatos1;
    private javax.swing.JLabel jlbFiltrarCategoria;
    private javax.swing.JLabel jlbFiltrarCodigo;
    private javax.swing.JLabel jlbFiltrarMarca;
    private javax.swing.JLabel jlbFiltrarNombre;
    private javax.swing.JLabel jlbFiltrarPrecio;
    private javax.swing.JLabel jlbFiltrarStock;
    private javax.swing.JLabel jlbMarca;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbStock;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelFiltrar;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador10;
    private javax.swing.JLabel separador11;
    private javax.swing.JLabel separador12;
    private javax.swing.JLabel separador13;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador4;
    private javax.swing.JLabel separador5;
    private javax.swing.JLabel separador6;
    private javax.swing.JLabel separador8;
    private javax.swing.JLabel separador9;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtFiltrarCategoria;
    private javax.swing.JTextField txtFiltrarCodigo;
    private javax.swing.JTextField txtFiltrarMarca;
    private javax.swing.JTextField txtFiltrarNombre;
    private javax.swing.JTextField txtFiltrarPrecio;
    private javax.swing.JTextField txtFiltrarStock;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtStock;
    // End of variables declaration//GEN-END:variables
}
