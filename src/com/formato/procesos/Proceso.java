package com.formato.procesos;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Benji
 */
public class Proceso {

    public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException ex) {
        }
    }

    public static void transparentarTxtField(JTextField... txtField) {
        for (JTextField txt : txtField) {
            txt.setBackground(new java.awt.Color(0, 0, 0, 1));
        }
    }

    public static void ComprobarTxtVacio(JTextField txt, String nameText, JLabel alerta) {
        if ("".equals(txt.getText())) {
            alerta.setText(nameText + " vacío");
        }
    }

    public static void comprobar2Iguales(JTextField txt, JTextField txt1, JLabel alerta) {
        if (txt.getText().equals(txt1.getText())) {
        } else {
            alerta.setText("Repita la contraseña");
        }
    }

    public void cambiarIconoJlabel(JLabel label, String urlImagen) {
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource(urlImagen)));
    }

    public static void cambiarColorLetraTxtField(JTextField textField, int n1, int n2, int n3) {
        textField.setForeground(new java.awt.Color(n1, n2, n3));
    }

    public static void limitacionCaracteres(JTextField txtField, KeyEvent evt, int cantNumeros) {
        int key = evt.getKeyChar();
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= cantNumeros) {
                evt.consume();
            }
        }
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void FechaActual(JLabel txtLabel) {
        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd-MM-YYYY");
        String fecha = formatoFecha.format(fechaActual);
        txtLabel.setText(fecha);
    }

    public static void DiaSemana(JLabel txtLabel) {
        Calendar calendar = Calendar.getInstance();
        String diaSemana = "";
        String diasSemanas[] = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};

        for (int i = 0; i < diasSemanas.length; i++) {
            //El metodo Calendar.DAY_OF_WEEK
            if (calendar.get(Calendar.DAY_OF_WEEK) == i + 1) {
                diaSemana = diasSemanas[i];
            }
        }
        txtLabel.setText(diaSemana);
    }

    public static String getDiaSemana() {
        Calendar calendar = Calendar.getInstance();
        String diaSemana = "";
        String diasSemanas[] = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};

        for (int i = 0; i < diasSemanas.length; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == i + 1) {
                diaSemana = diasSemanas[i];
            }
        }

        return diaSemana;
    }

    public static int getAño() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

    public static boolean validarCorreo(String correo) {
        // Patrón para verificar la estructura del correo electrónico
        String patron = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    public static boolean hayValorVacio(String... NValores) {
        for (String valor : NValores) {
            if (valor.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void vaciarTxt(JTextField... txt) {
        for (JTextField text : txt) {
            text.setText("");
        }
    }

    public static String obtenerPalabra(String oracion, int posicionDePalabra) {
        String[] palabras = oracion.split(" ");
        if (palabras.length > (posicionDePalabra - 1)) {
            return palabras[(posicionDePalabra - 1)];
        } else {
            return "";
        }
    }

    public static String convertirPalabra(String palabra) {
        String[] palabras = palabra.toLowerCase().split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabraActual : palabras) {
            if (!palabraActual.isEmpty()) {
                char primeraLetra = Character.toUpperCase(palabraActual.charAt(0));
                String restoPalabra = palabraActual.substring(1);
                resultado.append(primeraLetra).append(restoPalabra).append(" ");
            }
        }

        return resultado.toString().trim();
    }

}
