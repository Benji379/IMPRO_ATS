package test;

import com.formato.procesos.EnvioCorreo;

/**
 *
 * @author Benji
 */
public class mandarCorreo {
    public static void main(String[] args) {
        EnvioCorreo.EnviarEmail("benjij379@gmail.com", "Probando mensage", "Hola como estas mi nombre es Benjamin Justo");
    }
}
