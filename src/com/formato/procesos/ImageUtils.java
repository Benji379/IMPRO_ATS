package com.formato.procesos;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageUtils {

    public static void setScaledImageFromUrl(String imageUrl, JLabel label) {
        try {
            // Eliminar los parámetros de consulta de la URL
            String cleanUrl = removeQueryParameters(imageUrl);

            URL url = new URL(cleanUrl);
            BufferedImage image = javax.imageio.ImageIO.read(url);

            // Obtener las dimensiones de la imagen original y del JLabel
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            int labelWidth = label.getWidth();
            int labelHeight = label.getHeight();

            // Calcular la relación de aspecto de la imagen original
            double aspectRatio = (double) originalWidth / originalHeight;

            // Calcular las dimensiones escaladas de la imagen manteniendo la relación de aspecto
            int scaledWidth;
            int scaledHeight;
            if (originalWidth > originalHeight) {
                scaledWidth = labelWidth;
                scaledHeight = (int) (scaledWidth / aspectRatio);
            } else {
                scaledHeight = labelHeight;
                scaledWidth = (int) (scaledHeight * aspectRatio);
            }

            // Escalar la imagen al tamaño calculado
            Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);

            // Establecer la imagen escalada en el JLabel
            label.setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static String removeQueryParameters(String url) {
        // Eliminar los parámetros de consulta de la URL
        int queryIndex = url.indexOf('?');
        if (queryIndex != -1) {
            return url.substring(0, queryIndex);
        }
        return url;
    }

    public static void setPonerImagenAjustarLabel(JLabel label, String imagePath) throws IOException {
        // Cargar la imagen desde el archivo
        BufferedImage originalImage = ImageIO.read(new File(imagePath));
        // Obtener las dimensiones del JLabel
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();
        // Escalar la imagen al tamaño del JLabel
        Image scaledImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
        // Crear un ImageIcon a partir de la imagen escalada
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        // Establecer el ImageIcon en el JLabel
        label.setIcon(scaledIcon);
    }
}
