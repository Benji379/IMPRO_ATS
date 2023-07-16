package com.formato.procesos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class GeneradorQR {

    public static void generateQRCode(String text, JLabel label, int borderSize) {
        SwingUtilities.invokeLater(() -> {
            int width = label.getWidth();
            int height = label.getHeight();

            if (width <= 0 || height <= 0) {
                // El JLabel no tiene un tamaño válido aún, esperamos un poco y volvemos a intentar
                SwingUtilities.invokeLater(() -> generateQRCode(text, label, borderSize));
                return;
            }

            try {
                // Configurar los parámetros del código QR
                ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
                QRCodeWriter qrCodeWriter = new QRCodeWriter();
                BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

                // Encontrar los límites del contenido del código QR sin bordes blancos
                int left = width;
                int top = height;
                int right = 0;
                int bottom = 0;

                // Buscar los límites izquierdo, superior, derecho e inferior del contenido del código QR
                for (int x = 0; x < width; x++) {
                    for (int y = 0; y < height; y++) {
                        if (bitMatrix.get(x, y)) {
                            left = Math.min(left, x);
                            top = Math.min(top, y);
                            right = Math.max(right, x);
                            bottom = Math.max(bottom, y);
                        }
                    }
                }

                // Calcular el ancho y alto del contenido del código QR
                int contentWidth = right - left + 1;
                int contentHeight = bottom - top + 1;

                // Calcular el tamaño del código QR con bordes blancos
                int qrWidth = contentWidth + (2 * borderSize);
                int qrHeight = contentHeight + (2 * borderSize);

                // Crear la imagen del código QR con bordes blancos
                BufferedImage qrImage = new BufferedImage(qrWidth, qrHeight, BufferedImage.TYPE_INT_RGB);
                Graphics2D graphics = qrImage.createGraphics();
                graphics.setColor(Color.WHITE);
                graphics.fillRect(0, 0, qrWidth, qrHeight);
                graphics.setColor(Color.BLACK);
                for (int x = left; x <= right; x++) {
                    for (int y = top; y <= bottom; y++) {
                        if (bitMatrix.get(x, y)) {
                            int offsetX = x - left + borderSize;
                            int offsetY = y - top + borderSize;
                            graphics.fillRect(offsetX, offsetY, 1, 1);
                        }
                    }
                }
                graphics.dispose();

                // Ajustar la imagen al tamaño del JLabel
                Image scaledImage = qrImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                label.setIcon(new ImageIcon(scaledImage));
            } catch (WriterException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        });
    }
}
