/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formato.procesos;
import javax.swing.*;
import java.io.*;

public class HtmlViewer {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    public static void createAndShowGui() {
        JFrame frame = new JFrame("HTML Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        loadHtmlFromFile("data/boleta/boleta8mm.html", editorPane);

        JScrollPane scrollPane = new JScrollPane(editorPane);
        frame.add(scrollPane);

        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public static void loadHtmlFromFile(String filePath, JEditorPane editorPane) {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
                
                editorPane.setText(stringBuilder.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
