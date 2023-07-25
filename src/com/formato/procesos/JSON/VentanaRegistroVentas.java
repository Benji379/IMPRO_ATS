package com.formato.procesos.JSON;

import javax.swing.*;
import java.awt.*;
import org.json.JSONObject;

public class VentanaRegistroVentas extends JFrame {

    private final JTable jTableVentas;

    public VentanaRegistroVentas() {
        setTitle("Registro de Ventas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Crear un JTable y agregarlo al JScrollPane
        jTableVentas = new JTable();
        JScrollPane jScrollPane = new JScrollPane(jTableVentas);
        // Agregar el JScrollPane al JFrame
        getContentPane().add(jScrollPane, BorderLayout.CENTER);
    }

    public void mostrarDatosEnJTable(String textoJSON) {
        // Crear un objeto JSON a partir del texto JSON
        LeerRegistroJsonJTableVentas lector = new LeerRegistroJsonJTableVentas();
        lector.mostrarDatosEnJTable(jTableVentas, textoJSON);
    }

    public static void main(String[] args) {
        // Supongamos que tienes un texto JSON válido
        String textoJSON = "{\"total\":\"1083.10\",\"productos\":[{\"precio\":\"31.40\",\"idProducto\":130212,\"cantidad\":36},{\"precio\":\"13.20\",\"idProducto\":130216,\"cantidad\":10},{\"precio\":\"14.10\",\"idProducto\":1243334,\"cantidad\":18},{\"precio\":\"17.30\",\"idProducto\":1482943,\"cantidad\":19}]}";
        JSONObject jsonRegistro = new JSONObject(textoJSON);
        System.out.println(jsonRegistro.getDouble("total"));
        // Crear la ventana y mostrar los datos del texto JSON en el JTable
        SwingUtilities.invokeLater(() -> {
            VentanaRegistroVentas ventana = new VentanaRegistroVentas();
            ventana.mostrarDatosEnJTable(textoJSON);
            ventana.setVisible(true);
        });
    }
}
