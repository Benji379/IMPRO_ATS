package com.formato.procesos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Benji
 */

public class Data {
    
    private static final String FILE_PATH = "data/temp_.dat";

    public static void GuardarSede(String numeroSede) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            objectOutputStream.writeObject(numeroSede);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static String getSede() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            String nSede = (String) objectInputStream.readObject();
//            System.out.println("Numero Sede: " + nSede);
            return nSede;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }
    
    //tester
    //gmail.com
//    
//    public static void main(String[] args) {
//        // Ejemplo de uso
//        System.out.println(getSede());
//        String sede = "1";
//        GuardarSede(sede);
//    }
}
