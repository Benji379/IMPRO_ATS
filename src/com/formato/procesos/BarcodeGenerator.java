package com.formato.procesos;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import org.krysalis.barcode4j.HumanReadablePlacement;

public class BarcodeGenerator {

    public void generateBarcode(String codeType, String word, JLabel label) {
        if (word.isEmpty()) {
            return;
        }

        // Asegurar que el JLabel tenga un tamaño válido
        int width = label.getWidth();
        int height = label.getHeight();

        if (width <= 0 || height <= 0) {
            System.err.println("El JLabel debe tener un tamaño válido para mostrar el código de barras.");
            return;
        }

        Code128Bean bean = new Code128Bean();
        // Configurar el bean para no mostrar las letras de control
        bean.setMsgPosition(HumanReadablePlacement.HRP_NONE);
        // Generar el código de barras
        final int dpi = 300;
        BitmapCanvasProvider canvas = new BitmapCanvasProvider(dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);
        bean.generateBarcode(canvas, word);
        BufferedImage barcodeImage = canvas.getBufferedImage();
        // Escalar la imagen al tamaño del JLabel
        Image scaledImage = barcodeImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon barcodeIcon = new ImageIcon(scaledImage);
        label.setIcon(barcodeIcon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el JFrame
            JFrame frame = new JFrame("Barcode Generator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            // Crear un JLabel para mostrar el código de barras
            JLabel barcodeLabel = new JLabel();

            // Crear una instancia de BarcodeGenerator
            BarcodeGenerator barcodeGenerator = new BarcodeGenerator();

            // Llamar al método para generar y mostrar el código de barras a través de la instancia
            String codeType = "Code128";
            String wordToEncode = "Hello123";
            barcodeGenerator.generateBarcode(codeType, wordToEncode, barcodeLabel);

            // Agregar el JLabel al JFrame y mostrarlo
            frame.add(barcodeLabel);
            frame.setVisible(true);
        });
    }
}
