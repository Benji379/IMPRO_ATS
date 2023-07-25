package com.ventanas.TRABAJADOR;

import com.dao.ConexionBd.ConexionSQL;
import com.dao.InnerJoin.Crud;
import com.dao.InnerJoin.daoLogin;
import com.formato.UIDesing.JScrollPaneUtils;
import com.formato.procesos.ConsultaDNI;
import com.formato.procesos.Data;
import com.formato.procesos.EnvioCorreo;
import com.formato.procesos.JSON.GenerarRegistroJsonJTableVentas;
import com.formato.procesos.JTableRellenar;
import com.formato.procesos.JTableToHTMLConverter;
import com.formato.procesos.Proceso;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import scrollbar.ScrollBarCustom;

/**
 *
 * @author Benji
 */
public final class frmVenta_TRABAJADOR extends javax.swing.JFrame {

    private double Efectivo = 0.0;
    private double Total = 0.0;
    private double vuelto = 0.0;
    private String dniCliente = "";
    private String nombresCompleto = "";
    Proceso ic = new Proceso();

    public frmVenta_TRABAJADOR() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        jPanel1.setOpaque(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/iconos/venta.png")));
        bill.setBorder(new LineBorder(new Color(1.0f, 1.0f, 1.0f, 0.0f), 5));
        bill.setFocusable(false);
        bill_print();
//        jEditorPane1.setBorder(new LineBorder(Color.BLACK));
//        try {
//            ImageUtils.setPonerImagenAjustarLabel(jLabel2, "data/boleta/logo.png");
//        } catch (IOException e) {
//        }
        Proceso.transparentarTxtField(txtDni, txtCantidad, txtCodigo, txtEfectivo, txtCorreo);
        txtNombreTrabajador.setText("<html><div style='text-align: center;'>" + daoLogin.NOMBRE + " " + daoLogin.APELLIDOS);
        JTableScrollBarCustom(jScrollPaneTextArea);
        JTableScrollBarCustom(jScrollPaneTabla);
        revisarCambiosEnCodProducto();
    }

    private void revisarCambiosEnCodProducto() {
        txtCodigo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // Se llama cuando se inserta texto en el JTextField
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // Se llama cuando se elimina texto del JTextField
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Se llama cuando hay un cambio en atributos del documento (poco común para JTextField)
                consultarPrecioProduc();
            }

        });
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

        btnAtras = new javax.swing.JButton();
        BarraTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnFinalizarCompra = new javax.swing.JButton();
        btnBuscarProducto1 = new javax.swing.JButton();
        btnBuscarDNI = new javax.swing.JButton();
        separadorGrande1 = new javax.swing.JLabel();
        jlbFacturacion = new javax.swing.JLabel();
        btnEnviarCorreo = new javax.swing.JButton();
        jlbCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        separador2 = new javax.swing.JLabel();
        jScrollPaneTextArea = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        separador1 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        separadorGrande = new javax.swing.JLabel();
        separadorGrande2 = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JLabel();
        jlbEfectivo = new javax.swing.JLabel();
        jlbTotalPagar = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        jlbCliente = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        jlbCod = new javax.swing.JLabel();
        jlbCantidad = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombreTrabajador = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JLabel();
        txtNombres = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        jlbTrabajador = new javax.swing.JLabel();
        jlbApellidoM = new javax.swing.JLabel();
        jlbApellidoP = new javax.swing.JLabel();
        jlbNombres = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        jlbDni = new javax.swing.JLabel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        tablaProductos = new com.formato.UIDesing.TableDark();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("IMPRO_ATS [Venta]");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 50));

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
        getContentPane().add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 40));

        jPanel1.setBackground(new java.awt.Color(24, 24, 24));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/FinalizarCompra.png"))); // NOI18N
        btnFinalizarCompra.setBorder(null);
        btnFinalizarCompra.setBorderPainted(false);
        btnFinalizarCompra.setContentAreaFilled(false);
        btnFinalizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/FinalizarCompra_press.png"))); // NOI18N
        btnFinalizarCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/FinalizarCompra_Select.png"))); // NOI18N
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 260, 100));

        btnBuscarProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnImprimir.png"))); // NOI18N
        btnBuscarProducto1.setBorder(null);
        btnBuscarProducto1.setBorderPainted(false);
        btnBuscarProducto1.setContentAreaFilled(false);
        btnBuscarProducto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProducto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarProducto1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnImprimir_press.png"))); // NOI18N
        btnBuscarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProducto1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 60, 60));

        btnBuscarDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnBuscarDNI.png"))); // NOI18N
        btnBuscarDNI.setBorder(null);
        btnBuscarDNI.setBorderPainted(false);
        btnBuscarDNI.setContentAreaFilled(false);
        btnBuscarDNI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarDNI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarDNI.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnBuscarDNI_press.png"))); // NOI18N
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 60, 50));

        separadorGrande1.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        separadorGrande1.setForeground(new java.awt.Color(255, 255, 255));
        separadorGrande1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/SEPARADOR_GRANDE.png"))); // NOI18N
        jPanel1.add(separadorGrande1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 350, 40));

        jlbFacturacion.setFont(new java.awt.Font("Century Schoolbook", 1, 22)); // NOI18N
        jlbFacturacion.setForeground(new java.awt.Color(255, 255, 255));
        jlbFacturacion.setText("FACTURACION");
        jPanel1.add(jlbFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 200, 40));

        btnEnviarCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnEnviarCorreo.png"))); // NOI18N
        btnEnviarCorreo.setBorder(null);
        btnEnviarCorreo.setBorderPainted(false);
        btnEnviarCorreo.setContentAreaFilled(false);
        btnEnviarCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEnviarCorreo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnEnviarCorreo_press.png"))); // NOI18N
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 90, 70, 60));

        jlbCorreo.setFont(new java.awt.Font("Century Schoolbook", 1, 22)); // NOI18N
        jlbCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCorreo.setText("Correo:");
        jPanel1.add(jlbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 90, 40));

        txtCorreo.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCorreo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 160, 30));

        separador2.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        separador2.setForeground(new java.awt.Color(255, 255, 255));
        separador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 160, 10));

        bill.setColumns(20);
        bill.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        bill.setRows(5);
        jScrollPaneTextArea.setViewportView(bill);

        jPanel1.add(jScrollPaneTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 270, 430));

        separador1.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        separador1.setForeground(new java.awt.Color(255, 255, 255));
        separador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 130, 10));

        txtEfectivo.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        txtEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        txtEfectivo.setBorder(null);
        txtEfectivo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtEfectivo.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
        });
        jPanel1.add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 30));

        separadorGrande.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        separadorGrande.setForeground(new java.awt.Color(255, 255, 255));
        separadorGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/SEPARADOR_GRANDE.png"))); // NOI18N
        jPanel1.add(separadorGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 350, 40));

        separadorGrande2.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        separadorGrande2.setForeground(new java.awt.Color(255, 255, 255));
        separadorGrande2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Configuracion/SEPARADOR_GRANDE.png"))); // NOI18N
        jPanel1.add(separadorGrande2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 350, 40));

        txtVuelto.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        txtVuelto.setForeground(new java.awt.Color(255, 255, 255));
        txtVuelto.setText("Vuelto: S/.");
        jPanel1.add(txtVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 250, 40));

        jlbEfectivo.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jlbEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        jlbEfectivo.setText("Efectivo: S/.");
        jPanel1.add(jlbEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 120, 40));

        jlbTotalPagar.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jlbTotalPagar.setForeground(new java.awt.Color(255, 255, 255));
        jlbTotalPagar.setText("Total: S/.");
        jPanel1.add(jlbTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 250, 40));

        txtPrecio.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPrecio.setText("0.0");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 90, 40));

        jlbCliente.setFont(new java.awt.Font("Century Schoolbook", 1, 26)); // NOI18N
        jlbCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlbCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCliente.setText("Cliente");
        jPanel1.add(jlbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, 40));

        txtTotal.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("Total: S/.0.0");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 190, 50));

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnBuscarProducto.png"))); // NOI18N
        btnBuscarProducto.setBorder(null);
        btnBuscarProducto.setBorderPainted(false);
        btnBuscarProducto.setContentAreaFilled(false);
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnBuscarProducto_press.png"))); // NOI18N
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 60, 60));

        jlbCod.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        jlbCod.setForeground(new java.awt.Color(255, 255, 255));
        jlbCod.setText("Cod.");
        jPanel1.add(jlbCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 70, 40));

        jlbCantidad.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        jlbCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jlbCantidad.setText("Cant.");
        jPanel1.add(jlbCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 70, 40));

        jLabel16.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio: S/.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 110, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnQuitar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnQuitar_press.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 70, 60));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnAgregar.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/btnAgregar_press.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 70, 60));

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 60, 10));

        txtCantidad.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(null);
        txtCantidad.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCantidad.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 60, 30));

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 10));

        txtCodigo.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtCodigo.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 180, 30));

        txtDni.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDni.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 30));

        txtNombreTrabajador.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtNombreTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, 60));

        txtApellidoM.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 240, 30));

        txtApellidoP.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 240, 30));

        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 240, 30));

        separador.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/inventario/separador.png"))); // NOI18N
        separador.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 140, 10));

        jlbTrabajador.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jlbTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrabajador.setText("Trabajador:");
        jPanel1.add(jlbTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 40));

        jlbApellidoM.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jlbApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        jlbApellidoM.setText("Apellido M:");
        jPanel1.add(jlbApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 40));

        jlbApellidoP.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jlbApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        jlbApellidoP.setText("Apellido P :");
        jPanel1.add(jlbApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, 40));

        jlbNombres.setFont(new java.awt.Font("Century Schoolbook", 0, 20)); // NOI18N
        jlbNombres.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombres.setText("Nombres   : ");
        jPanel1.add(jlbNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 130, 40));

        jlbTitulo.setFont(new java.awt.Font("Century Schoolbook", 0, 60)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setText("Venta");
        jPanel1.add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 180, 80));

        jlbDni.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        jlbDni.setForeground(new java.awt.Color(255, 255, 255));
        jlbDni.setText("DNI:");
        jPanel1.add(jlbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 60, 40));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nombre", "Cantidad", "Precio", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTabla.setViewportView(tablaProductos);

        jPanel1.add(jScrollPaneTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 480, 320));

        FONDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Venta/FONDO.png"))); // NOI18N
        FONDO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

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

    public static void consultarPrecioProduc() {
        try {
            double precio = Double.parseDouble(daoLogin.consultarRango(daoLogin.NOMBRE_TABLA_SEDE, "codigo", txtCodigo.getText(), "precio"));
            txtPrecio.setText(String.valueOf(precio));
        } catch (NullPointerException e) {
        }

    }
    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        consultarPrecioProduc();
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ConfirmarCancelarCompra();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void ConfirmarCancelarCompra() {
        int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de cancelar la compra?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/cancelarCompra.png"));
        if (option == JOptionPane.YES_OPTION) {
            cancelarCompra();
            frm_Principal_TRABAJADOR abrir = new frm_Principal_TRABAJADOR();
            abrir.setVisible(true);
            hide();
        }
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String codigoProducto = txtCodigo.getText();
            int stockDisponible = Integer.parseInt(daoLogin.consultarRango(daoLogin.NOMBRE_TABLA_SEDE, "codigo", codigoProducto, "stock"));
            int cantidadIngresada = Integer.parseInt(txtCantidad.getText());

            // Verificar que la cantidad ingresada sea mayor que cero y que haya suficiente stock disponible
            if (cantidadIngresada > 0 && cantidadIngresada <= stockDisponible) {

                // Buscar si ya existe una fila con el mismo código de producto en la tabla
                int filaExistente = -1;
                for (int row = 0; row < tablaProductos.getRowCount(); row++) {
                    String codigoEnTabla = tablaProductos.getValueAt(row, 0).toString();
                    if (codigoProducto.equals(codigoEnTabla)) {
                        filaExistente = row;
                        break;
                    }
                }

                // Si existe una fila con el mismo código, actualizar la cantidad y el monto
                if (filaExistente != -1) {
                    int cantidadActualEnTabla = Integer.parseInt(tablaProductos.getValueAt(filaExistente, 2).toString());
                    int totalCantidad = cantidadActualEnTabla + cantidadIngresada;
                    tablaProductos.setValueAt(totalCantidad, filaExistente, 2); // Actualizar la cantidad
                    double precio = Double.parseDouble(tablaProductos.getValueAt(filaExistente, 3).toString());
                    double monto = totalCantidad * precio; // Calcular el monto
                    tablaProductos.setValueAt(String.format(Locale.US, "%.2f", monto), filaExistente, 4); // Actualizar el monto con 2 decimales y usando el punto como separador decimal
                    bill_print();
                } else {
                    // Si no existe una fila con el mismo código, agregar una nueva fila
                    String[] info = new String[5]; // Modificar el tamaño del arreglo a 5 para las nuevas columnas
                    info[0] = codigoProducto;
                    info[1] = daoLogin.consultarRango(daoLogin.NOMBRE_TABLA_SEDE, "codigo", codigoProducto, "nombre"); // Obtener el nombre desde la base de datos
                    info[2] = String.valueOf(cantidadIngresada);
                    info[3] = txtPrecio.getText();
                    // Calcular el monto y actualizar la tabla
                    int cantidad = Integer.parseInt(info[2]);
                    double precio = Double.parseDouble(info[3]);
                    double monto = cantidad * precio;
                    info[4] = String.format(Locale.US, "%.2f", monto); // Formatear el monto con 2 decimales y usando el punto como separador decimal
                    JTableRellenar.fillRowWithData(tablaProductos, info);
                    bill_print();
                }
                // Actualizar el stock en la base de datos después de realizar la venta
                int nuevoStock = stockDisponible - cantidadIngresada;
                actualizarStock(daoLogin.NOMBRE_TABLA_SEDE, "codigo", codigoProducto, "stock", String.valueOf(nuevoStock));
                // Calcular el total y mostrarlo en el campo de texto "txtTotal"
                double total = 0;
                for (int row = 0; row < tablaProductos.getRowCount(); row++) {
                    String montoStr = tablaProductos.getValueAt(row, 4).toString();
                    double monto = Double.parseDouble(montoStr.replace(",", ".")); // Reemplazar la coma por el punto para asegurar que los valores se sumen correctamente
                    total += monto;
                }
                Total = Double.parseDouble(String.format(Locale.US, "%.2f", total));
                txtTotal.setText("Total: S/." + Total); // Mostrar el total con 2 decimales y usando el punto como separador decimal
                jlbTotalPagar.setText("Total: S/." + Total);
                bill_print();
            } else {
                // Mostrar mensaje de error personalizado
                if (stockDisponible == 0) {
                    JOptionPane.showMessageDialog(null, "No hay stock disponible para este producto.", "Almacen", JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/stockVacio.png"));
                } else if (cantidadIngresada <= 0) {
                    JOptionPane.showMessageDialog(null, "La cantidad ingresada debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible. Stock actual: ", "Almacen", JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/stockVacio.png"));
                }
            }
        } catch (NullPointerException | NumberFormatException e) {

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        try {
            ConsultaDNI consultar = new ConsultaDNI(txtDni.getText());
            consultar.ConsultaDNI();
            txtNombres.setText(Proceso.convertirPalabra(consultar.getNombres()));
            txtApellidoP.setText(Proceso.convertirPalabra(consultar.getApellidoP()));
            txtApellidoM.setText(Proceso.convertirPalabra(consultar.getApellidoM()));
            dniCliente = txtDni.getText();
            nombresCompleto = Proceso.convertirPalabra(consultar.getNombres()) + " " + Proceso.convertirPalabra(consultar.getApellidos());
            bill_print();
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    private void btnBuscarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProducto1ActionPerformed
        try {
            bill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(frmVenta_TRABAJADOR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarProducto1ActionPerformed

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased
        try {
            Efectivo = Proceso.redondear(Double.parseDouble(txtEfectivo.getText()));
        } catch (NumberFormatException e) {
            Efectivo = 0;
        }
        vuelto = Proceso.redondear(Efectivo - Total);
        txtVuelto.setText("Vuelto: S/." + vuelto);
        bill_print();
    }//GEN-LAST:event_txtEfectivoKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        try {
            int filaSeleccionada = tablaProductos.getSelectedRow();
            if (filaSeleccionada != -1) {
                String codigoProductoEliminar = tablaProductos.getValueAt(filaSeleccionada, 0).toString();
                int cantidadEliminar = Integer.parseInt(tablaProductos.getValueAt(filaSeleccionada, 2).toString());
                // Obtener el stock actual del producto desde la base de datos
                int stockActual = Integer.parseInt(daoLogin.consultarRango(daoLogin.NOMBRE_TABLA_SEDE, "codigo", codigoProductoEliminar, "stock"));
                // Calcular el nuevo stock después de eliminar la cantidad
                int nuevoStock = stockActual + cantidadEliminar;
                // Actualizar el stock en la base de datos
                actualizarStock(daoLogin.NOMBRE_TABLA_SEDE, "codigo", codigoProductoEliminar, "stock", String.valueOf(nuevoStock));
                // Eliminar la fila seleccionada de la tabla visualmente
                DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
                model.removeRow(filaSeleccionada);
                // Actualizar la variable Total restando el monto del producto eliminado
                double total = 0;
                for (int row = 0; row < tablaProductos.getRowCount(); row++) {
                    String montoStr = tablaProductos.getValueAt(row, 4).toString();
                    double monto = Double.parseDouble(montoStr.replace(",", ".")); // Reemplazar la coma por el punto para asegurar que los valores se sumen correctamente
                    total += monto;
                }
                Total = Double.parseDouble(String.format(Locale.US, "%.2f", total));
                txtTotal.setText("Total: S/." + Total); // Mostrar el total con 2 decimales y usando el punto como separador decimal
                jlbTotalPagar.setText("Total: S/." + Total);
                bill_print();

            } else {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException | NumberFormatException e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        inventarioEmergente_TRABAJADOR abrir = new inventarioEmergente_TRABAJADOR();
        abrir.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private String GenerarRegistroVenta() {
        GenerarRegistroJsonJTableVentas registroVentas = new GenerarRegistroJsonJTableVentas();
        registroVentas.agregarProductoDesdeJTable(tablaProductos, 0, 3, 2);
        String resultadoVentasJSON = registroVentas.generarRegistroVentasJSON();
        System.out.println("JSON: " + resultadoVentasJSON);
        return resultadoVentasJSON;
    }

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed

        boolean validar = Proceso.hayValorVacio(txtDni.getText(), txtEfectivo.getText()) || Total == 0 || vuelto < 0;

        if (!validar) {
            int option = JOptionPane.showConfirmDialog(null, "¿Confirmar la compra?", "Confirmar cancelación", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                String encabezados[] = {"sede", "dniTrabajador", "dniCliente", "productos", "total", "fecha", "hora"};
                String datosInsertar[] = {Data.getSede(), daoLogin.DOCUMENT, dniCliente, GenerarRegistroVenta(), String.valueOf(Total), Proceso.FechaActual(), Proceso.HoraActual()};
                Crud.insertarDatos("ventas", encabezados, datosInsertar);
                Efectivo = 0.0;
                Total = 0.0;
                vuelto = 0.0;
                dniCliente = "";
                nombresCompleto = "";
                DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
                model.setRowCount(0);
                Proceso.vaciarTxt(txtCantidad, txtCodigo, txtCorreo, txtDni, txtEfectivo);
                Proceso.vaciarTxt(txtNombres, txtApellidoP, txtApellidoM);
                jlbTotalPagar.setText("Total: S/.0.0");
                txtVuelto.setText("Vuelto: S/.");
                txtPrecio.setText("0.0");
                txtTotal.setText("Total: S/.0.0");
                bill_print();
                JOptionPane.showMessageDialog(null, "Venta Registrada", "Mensage", JOptionPane.PLAIN_MESSAGE, ic.icono("/com/img/emergentes/cheque.png"));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Datos invalidos");
        }
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ConfirmarCancelarCompra();
    }//GEN-LAST:event_formWindowClosing

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
//        consultarPrecioProduc();
    }//GEN-LAST:event_txtCodigoFocusGained

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        String correoEnviar = txtCorreo.getText();
        String asunto = "Compra Exitosa";
        String mensage = JTableToHTMLConverter.convertToHTML(tablaProductos, Total, Efectivo, vuelto, (daoLogin.NOMBRE + " " + daoLogin.APELLIDOS), dniCliente, nombresCompleto,"https://st2.depositphotos.com/1662991/9938/i/450/depositphotos_99386326-stock-photo-woman-carrying-a-basket.jpg");
        EnvioCorreo.EnviarEmail(correoEnviar, asunto, mensage);
    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void cancelarCompra() {
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        while (model.getRowCount() > 0) {
            String codigoProductoEliminar = model.getValueAt(0, 0).toString();
            int cantidadEliminar = Integer.parseInt(model.getValueAt(0, 2).toString());
            // Obtener el stock actual del producto desde la base de datos
            int stockActual = Integer.parseInt(daoLogin.consultarRango(daoLogin.NOMBRE_TABLA_SEDE, "codigo", codigoProductoEliminar, "stock"));
            // Calcular el nuevo stock después de eliminar la cantidad
            int nuevoStock = stockActual + cantidadEliminar;
            // Actualizar el stock en la base de datos
            actualizarStock(daoLogin.NOMBRE_TABLA_SEDE, "codigo", codigoProductoEliminar, "stock", String.valueOf(nuevoStock));
            // Eliminar la fila seleccionada de la tabla visualmente
            model.removeRow(0);
        }

        // Restaurar la variable Total a 0 y actualizar el campo de texto "txtTotal"
        Total = 0.0;
        txtTotal.setText("Total: S/." + Total);
        jlbTotalPagar.setText("Total: S/." + Total);
        bill_print();
    }

    public void actualizarStock(String tabla, String campoCodigo, String codigoProducto, String campoStock, String nuevoStock) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new ConexionSQL().conexion();
            String sql = "UPDATE " + tabla + " SET " + campoStock + " = ? WHERE " + campoCodigo + " = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nuevoStock);
            ps.setString(2, codigoProducto);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(frmVenta_TRABAJADOR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmVenta_TRABAJADOR().setVisible(true);
        });
    }

    public void bill_print() {
        bill.setText("\t\t\t      IMPRO ATS  \n");
        bill.setText(bill.getText() + "\t\t\t  Los mejores Precios \n");
        bill.setText(bill.getText() + "\t\t\t Av.Bolivia, Mz w.lt 10, \n");
        bill.setText(bill.getText() + "\t\t\t    +51 984 421 382 \n");
        bill.setText(bill.getText() + "--------------------------------------------------------------------------\n");
        bill.setText(bill.getText() + String.format("%-26s%-23s%-10s%-10s%-10s", "Cod.", "Producto", "Cant", "Precio", "Monto") + "\n");
        bill.setText(bill.getText() + "--------------------------------------------------------------------------\n");

        DefaultTableModel df = (DefaultTableModel) tablaProductos.getModel();
        for (int i = 0; i < tablaProductos.getRowCount(); i++) {

            String codigo = df.getValueAt(i, 0).toString();
            String producto = df.getValueAt(i, 1).toString();
            String cantidad = df.getValueAt(i, 2).toString();
            String precio = df.getValueAt(i, 3).toString();
            String monto = df.getValueAt(i, 4).toString();

            // Format the text with specified width for each field
            String formattedLine = String.format("%-16s%-35s%-8s%-10s%-10s", codigo, truncateLongText(producto, 30), cantidad, precio, monto);
            bill.setText(bill.getText() + formattedLine + "\n");
        }
        bill.setText(bill.getText() + "--------------------------------------------------------------------------\n");
        bill.setText(bill.getText() + String.format("%-32s%s", "Total     :", Total) + "\n");
        bill.setText(bill.getText() + String.format("%-32s%s", "Efectivo  :", Efectivo) + "\n");
        bill.setText(bill.getText() + String.format("%-32s%s", "Vuelto    :", vuelto) + "\n");
        bill.setText(bill.getText() + "--------------------------------------------------------------------------\n");
        bill.setText(bill.getText() + "--------------------------------------------------------------------------\n");
        bill.setText(bill.getText() + String.format("%-32s%s", "Trabajador:", daoLogin.NOMBRE + " " + daoLogin.APELLIDOS) + "\n");
        bill.setText(bill.getText() + "--------------------------------------------------------------------------\n");
        bill.setText(bill.getText() + String.format("%-32s%s", "DNI       :", dniCliente) + "\n");
        bill.setText(bill.getText() + String.format("%-32s%s", "Nombres   :", nombresCompleto) + "\n");
        bill.setText(bill.getText() + "==========================================================================\n");
        bill.setText(bill.getText() + "                          Gracias por su compra...!" + "\n");
        bill.setText(bill.getText() + "--------------------------------------------------------------------------\n");
        bill.setText(bill.getText() + "\t\t\t\tBenji379" + "\n");
    }

    private String truncateLongText(String text, int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength - 3) + "...";
        } else {
            return text;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraTitulo;
    private javax.swing.JLabel FONDO;
    private javax.swing.JTextArea bill;
    private javax.swing.JButton btnAgregar;
    public static javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscarDNI;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarProducto1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviarCorreo;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JScrollPane jScrollPaneTextArea;
    private javax.swing.JLabel jlbApellidoM;
    private javax.swing.JLabel jlbApellidoP;
    private javax.swing.JLabel jlbCantidad;
    private javax.swing.JLabel jlbCliente;
    private javax.swing.JLabel jlbCod;
    private javax.swing.JLabel jlbCorreo;
    private javax.swing.JLabel jlbDni;
    private javax.swing.JLabel jlbEfectivo;
    private javax.swing.JLabel jlbFacturacion;
    private javax.swing.JLabel jlbNombres;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbTotalPagar;
    private javax.swing.JLabel jlbTrabajador;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separadorGrande;
    private javax.swing.JLabel separadorGrande1;
    private javax.swing.JLabel separadorGrande2;
    private com.formato.UIDesing.TableDark tablaProductos;
    private javax.swing.JLabel txtApellidoM;
    private javax.swing.JLabel txtApellidoP;
    private javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JLabel txtNombreTrabajador;
    private javax.swing.JLabel txtNombres;
    public static javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtVuelto;
    // End of variables declaration//GEN-END:variables
}
