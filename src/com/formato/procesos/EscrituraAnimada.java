package com.formato.procesos;

/**
 *
 * @author Benji
 */

import javax.swing.JTextPane;
import javax.swing.text.*;

import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscrituraAnimada {

    private Timer timer;
    private int index;
    
    public void mostrarTextoAnimado(JLabel label, String texto, int milisegundos) {
        label.setText("");

        ActionListener actionListener = (ActionEvent e) -> {
            if (index < texto.length()) {
                label.setText(label.getText() + texto.charAt(index));
                index++;
            } else {
                timer.stop();
            }
        };

        timer = new Timer(milisegundos, actionListener);
        timer.start();
    }

    public void mostrarTextoAnimado(JTextPane textPane, String texto, int milisegundos) {
        StyledDocument document = textPane.getStyledDocument();
        Style style = textPane.addStyle("animacion", null);
        StyleConstants.setForeground(style, textPane.getForeground());

        index = 0;

        ActionListener actionListener = (ActionEvent e) -> {
            if (index < texto.length()) {
                try {
                    document.insertString(document.getLength(), String.valueOf(texto.charAt(index)), style);
                    index++;
                } catch (BadLocationException ex) {
                    System.out.println("ERROR: " + ex.getMessage());
                }
            } else {
                timer.stop();
            }
        };
        //Instanciar la clase Timer que me da el tiempo exacto en segundos
        timer = new Timer(milisegundos, actionListener);
        timer.start();
    }
}