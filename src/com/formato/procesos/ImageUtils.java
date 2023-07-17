package com.formato.procesos;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

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
}
    