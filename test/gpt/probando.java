/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpt;

/**
 *
 * @author Benji
 */
public class probando {
    
    public static void main(String[] args) {
        System.out.println(eliminarPalabra("n", "Benjamin"));
    }
    
    public static String eliminarPalabra(String palabraAEliminar, String cadena) {
    String resultado = "";
    String[] palabras = cadena.split(""); 
    // Separa la cadena por espacios en blanco y crea un arreglo de Strings
    for(String palabra : palabras) {
        if(!palabra.equals(palabraAEliminar)) { // Si la palabra actual no es la que se desea eliminar, la agrega al resultado
            resultado += palabra + "";
        }
    }
    return resultado.trim(); // Retorna el resultado, eliminando el último espacio en blanco agregado
}
}
