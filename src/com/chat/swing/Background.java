package com.chat.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Background extends JPanel {

    public Background() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        int width = getWidth();
        int height = getHeight();
//        g2.setPaint(new GradientPaint(0, 0, new Color(58, 72, 85), width, 0, new Color(28, 38, 50)));
//        g2.setPaint(new GradientPaint(0, 0, new Color(37, 81, 149), width, 0, new Color(9, 35, 75)));
//        g2.setPaint(new GradientPaint(0, 0, new Color(24, 24, 24), width, 0, new Color(24, 24, 24)));
        g2.setPaint(new GradientPaint(0, 0, new Color(1.0f, 1.0f, 1.0f, 0.0f), width, 0, new Color(1.0f, 1.0f, 1.0f, 0.0f)));
        g2.fillRect(0, 0, width, height);
        g2.dispose();
        super.paintComponent(grphcs);
    }
}
