package gpt;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Benji
 */
public class rellenarList {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Leer el archivo de texto y obtener las palabras
        List<String> palabras = leerArchivoDeTexto("data/gpt.txt");
        
        // Crear un arreglo de objetos para almacenar las palabras
        palabras.forEach((pal) -> {
            System.out.println(pal);
        });
    }

    // Método para leer el archivo de texto y obtener las palabras
    private static List<String> leerArchivoDeTexto(String rutaArchivo) {
        List<String> palabras = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Agregar cada palabra a la lista
                palabras.add(linea);
            }
        } catch (IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        return palabras;
    }
}
