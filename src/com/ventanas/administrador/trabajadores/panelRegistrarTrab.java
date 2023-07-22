package com.ventanas.administrador.trabajadores;

import com.formato.procesos.ConsultaDNI;
import com.dao.InnerJoin.ConsultasSQL;
import com.formato.procesos.Proceso;
import com.dao.InnerJoin.RellenarComboBox;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Benji
 */
public class panelRegistrarTrab extends javax.swing.JPanel {

    public panelRegistrarTrab() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        TransparentarTxt();
        RellenarComboBox.rellenarComboBox(comboSede, "sedes", "sede");
        int NuevoPuerto = ConsultasSQL.obtenerUltimoValor("trabajadores", "puerto") + 1;
        txtPuerto.setText(String.valueOf(NuevoPuerto));
        ojoAbierto.setVisible(false);
        txtDni.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ojoCerrado = new javax.swing.JButton();
        ojoAbierto = new javax.swing.JButton();
        comboGenero = new combobox.Combobox();
        comboSede = new combobox.Combobox();
        jlbTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnGenerarCodigo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtPuerto = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jlbDni = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jlbNombres = new javax.swing.JLabel();
        jlbApellidos = new javax.swing.JLabel();
        jlbEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jlbContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jlbContraseña2 = new javax.swing.JLabel();
        txtContraseña2 = new javax.swing.JPasswordField();
        jlbGenero = new javax.swing.JLabel();
        jlbCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jlbCodigo = new javax.swing.JLabel();
        jlbSede = new javax.swing.JLabel();
        jlbPuerto = new javax.swing.JLabel();
        separador = new javax.swing.JLabel();
        separador1 = new javax.swing.JLabel();
        separador2 = new javax.swing.JLabel();
        separador3 = new javax.swing.JLabel();
        separador4 = new javax.swing.JLabel();
        separador5 = new javax.swing.JLabel();
        separador6 = new javax.swing.JLabel();
        separador8 = new javax.swing.JLabel();
        separador10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ojoCerrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnOjoCerrado.png"))); // NOI18N
        ojoCerrado.setBorder(null);
        ojoCerrado.setBorderPainted(false);
        ojoCerrado.setContentAreaFilled(false);
        ojoCerrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojoCerrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojoCerradoActionPerformed(evt);
            }
        });
        add(ojoCerrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 50, 50));

        ojoAbierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnOjoAbierto.png"))); // NOI18N
        ojoAbierto.setBorder(null);
        ojoAbierto.setBorderPainted(false);
        ojoAbierto.setContentAreaFilled(false);
        ojoAbierto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojoAbierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ojoAbiertoActionPerformed(evt);
            }
        });
        add(ojoAbierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 50, 50));

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        comboGenero.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboGenero.setLabeText("");
        comboGenero.setLineColor(new java.awt.Color(0, 0, 0));
        add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 60, 40));

        comboSede.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboSede.setLabeText("");
        comboSede.setLineColor(new java.awt.Color(0, 0, 0));
        add(comboSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 60, 40));

        jlbTitulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 48)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setText("Registrar Trabajador");
        add(jlbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 630, 60));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnRegistrarEnModulo.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnRegistrarEnModulo_press.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 270, 90));

        btnGenerarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnCodigoGenerar.png"))); // NOI18N
        btnGenerarCodigo.setBorder(null);
        btnGenerarCodigo.setBorderPainted(false);
        btnGenerarCodigo.setContentAreaFilled(false);
        btnGenerarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerarCodigo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnCodigoGenerar_press.png"))); // NOI18N
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });
        add(btnGenerarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, 60, 60));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnBuscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/btnBuscar_press.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 60, 60));

        txtPuerto.setEditable(false);
        txtPuerto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPuerto.setForeground(new java.awt.Color(255, 255, 255));
        txtPuerto.setBorder(null);
        add(txtPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 170, 30));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 170, 30));

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);
        add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 170, 30));

        jlbDni.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbDni.setForeground(new java.awt.Color(255, 255, 255));
        jlbDni.setText("DNI:");
        add(jlbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 140, 30));

        txtNombres.setEditable(false);
        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);
        add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, 30));

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 170, 30));

        jlbNombres.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbNombres.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombres.setText("Nombres:");
        add(jlbNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, 30));

        jlbApellidos.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbApellidos.setForeground(new java.awt.Color(255, 255, 255));
        jlbApellidos.setText("Apellidos:");
        add(jlbApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 150, 30));

        jlbEdad.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbEdad.setForeground(new java.awt.Color(255, 255, 255));
        jlbEdad.setText("Edad:");
        add(jlbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 150, 30));

        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setBorder(null);
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 170, 30));

        jlbContraseña.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jlbContraseña.setText("Contraseña:");
        add(jlbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 180, 30));

        txtContraseña.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 170, 30));

        jlbContraseña2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        jlbContraseña2.setText("Contraseña:");
        add(jlbContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 180, 30));

        txtContraseña2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        txtContraseña2.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña2.setBorder(null);
        txtContraseña2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseña2KeyTyped(evt);
            }
        });
        add(txtContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 170, 30));

        jlbGenero.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbGenero.setForeground(new java.awt.Color(255, 255, 255));
        jlbGenero.setText("Genero:");
        add(jlbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 140, 30));

        jlbCorreo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCorreo.setText("Correo:");
        add(jlbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 140, 30));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 170, 30));

        jlbCodigo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo.setText("Codigo:");
        add(jlbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 150, 30));

        jlbSede.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbSede.setForeground(new java.awt.Color(255, 255, 255));
        jlbSede.setText("Sede:");
        add(jlbSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 180, 30));

        jlbPuerto.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jlbPuerto.setForeground(new java.awt.Color(255, 255, 255));
        jlbPuerto.setText("Puerto:");
        add(jlbPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 180, 30));

        separador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 170, 5));

        separador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, 5));

        separador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, 5));

        separador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 170, 5));

        separador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 170, 5));

        separador5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 170, 5));

        separador6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 170, 5));

        separador8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 170, 5));

        separador10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        separador10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/Separador .png"))); // NOI18N
        add(separador10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 170, 5));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/modulos/FONDO.png"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void TransparentarTxt() {
        Proceso.transparentarTxtField(txtDni, txtNombres, txtApellidos,
                txtContraseña, txtContraseña2, txtEdad, txtCorreo, txtCodigo, txtPuerto);
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ConsultaDNI consultar = new ConsultaDNI(txtDni.getText());
        consultar.ConsultaDNI();
        txtNombres.setText(Proceso.convertirPalabra(consultar.getNombres()));
        txtApellidos.setText(Proceso.convertirPalabra(consultar.getApellidos()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        try {
            String rango = "TR";
            int NSede = Integer.parseInt((String) comboSede.getSelectedItem());
            String sede = String.format("%02d", NSede);
            String nombre = txtNombres.getText().substring(0, 3);
            String apellido = txtApellidos.getText().substring(0, 2);
            String añoActual = String.valueOf(Proceso.getAño());
            String año = añoActual.substring(añoActual.length() - 2);
            String dosPrinerasCifrasDNI = txtDni.getText().substring(0, 2);
            //TR + SEDE + 3PrimerasNombre + 2PrimeraApellido+ 2UltimasAño + 2PrimerasCifrasDNI
            String CODIGO = (rango + sede + nombre + apellido + año + dosPrinerasCifrasDNI).toUpperCase();
            txtCodigo.setText(CODIGO);
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Rellena los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String dni = txtDni.getText();
        String contraseña = txtContraseña.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String edad = txtEdad.getText();
        String genero = (String) comboGenero.getSelectedItem();
        String correo = txtCorreo.getText();
        String cargo = "Trabajador";
        String codigo = txtCodigo.getText();
        String sede = (String) comboSede.getSelectedItem();
        String puerto = txtPuerto.getText();
        String contraseña2 = txtContraseña2.getText();

        //VERIFICACIONES DE VALIDACION
        boolean v1 = false, v2 = false, v3 = false, v4 = false;

        boolean trabajadorExistente = ConsultasSQL.encontrarValor("trabajadores", "dni", dni);
        boolean valoresVacios = Proceso.hayValorVacio(dni, contraseña, nombres, apellidos, edad, genero, correo, cargo, codigo, sede, puerto);
        boolean contraseñaValida = contraseña.equals(contraseña2);
        boolean correoValido = Proceso.validarCorreo(correo);

        if (valoresVacios == true) {
            JOptionPane.showMessageDialog(null, "Rellene todos los valores", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            v1 = true;
            if (trabajadorExistente == true) {
                JOptionPane.showMessageDialog(null, "Trabajador existente", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                v2 = true;
                if (contraseñaValida == false) {
                    JOptionPane.showMessageDialog(null, "Repita la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    v3 = true;
                    if (correoValido == false) {
                        JOptionPane.showMessageDialog(null, "Ingrese un correo Válido", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        v4 = true;
                    }
                }
            }
        }

        if (Integer.parseInt(edad) >= 18) {
            if (v1 == true && v2 == true && v3 == true && v4 == true) {
                ConsultasSQL.insertarDatos("trabajadores", dni, contraseña, nombres,
                        apellidos, edad, genero, correo, cargo, codigo, sede, puerto);
                NuevoRegistro();
                JOptionPane.showMessageDialog(null, "A sido Registrado exitosamente", "Registro", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: Edad menor a 18", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        Proceso.limitacionNumeros(txtDni, evt, 8);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        Proceso.limitacionNumeros(txtEdad, evt, 2);
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        Proceso.limitacionCaracteres(txtContraseña, evt, 15, false);
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtContraseña2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseña2KeyTyped
        Proceso.limitacionCaracteres(txtContraseña2, evt, 15, false);
    }//GEN-LAST:event_txtContraseña2KeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        Proceso.limitacionCaracteres(txtCorreo, evt, 70, false);
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void ojoCerradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojoCerradoActionPerformed
        ojoAbierto.setVisible(true);
        ojoCerrado.setVisible(false);
        txtContraseña.setEchoChar((char) 0);
        txtContraseña.transferFocus();
        txtContraseña2.setEchoChar((char) 0);
        txtContraseña2.transferFocus();
    }//GEN-LAST:event_ojoCerradoActionPerformed

    private void ojoAbiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ojoAbiertoActionPerformed
        ojoCerrado.setVisible(true);
        ojoAbierto.setVisible(false);
        txtContraseña.setEchoChar('*');
        txtContraseña.transferFocus();
        txtContraseña2.setEchoChar('*');
        txtContraseña2.transferFocus();
    }//GEN-LAST:event_ojoAbiertoActionPerformed

    private void NuevoRegistro() {
        Proceso.vaciarTxt(txtDni, txtNombres, txtApellidos, txtContraseña, txtContraseña2, txtCorreo, txtEdad, txtCodigo);
        int NuevoPuerto = ConsultasSQL.obtenerUltimoValor("trabajadores", "puerto") + 1;
        txtPuerto.setText(String.valueOf(NuevoPuerto));
        comboGenero.setSelectedIndex(0);
        comboSede.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JButton btnRegistrar;
    private combobox.Combobox comboGenero;
    private combobox.Combobox comboSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbApellidos;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbContraseña;
    private javax.swing.JLabel jlbContraseña2;
    private javax.swing.JLabel jlbCorreo;
    private javax.swing.JLabel jlbDni;
    private javax.swing.JLabel jlbEdad;
    private javax.swing.JLabel jlbGenero;
    private javax.swing.JLabel jlbNombres;
    private javax.swing.JLabel jlbPuerto;
    private javax.swing.JLabel jlbSede;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JButton ojoAbierto;
    private javax.swing.JButton ojoCerrado;
    private javax.swing.JLabel separador;
    private javax.swing.JLabel separador1;
    private javax.swing.JLabel separador10;
    private javax.swing.JLabel separador2;
    private javax.swing.JLabel separador3;
    private javax.swing.JLabel separador4;
    private javax.swing.JLabel separador5;
    private javax.swing.JLabel separador6;
    private javax.swing.JLabel separador8;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseña2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPuerto;
    // End of variables declaration//GEN-END:variables
}
