package com.formato.procesos;

import com.dao.InnerJoin.daoLogin;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Benji
 */
public class PrintPanel {

    public static void capturePanel(JPanel panel) {
        BufferedImage image = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        panel.printAll(graphics);
        graphics.dispose();
        String downloadFolderPath = System.getProperty("user.home") + File.separator + "Downloads";
        String nombre = "Carnet "+daoLogin.CODIGO;
        String fileName = nombre + ".png";
        String filePath = downloadFolderPath + File.separator + fileName;

        try {
            ImageIO.write(image, "png", new File(filePath));
            JOptionPane.showMessageDialog(null, "Descarga completa", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e, "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
}
