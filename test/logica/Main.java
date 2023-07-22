/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.text.DecimalFormat;

/**
 *
 * @author Benji
 */
public class Main {
    public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat("#.00");
         String precio = df.format(Double.parseDouble("1.32344")).replace(",", ".");
         
         System.out.println("Precio: "+precio );
    }
}
