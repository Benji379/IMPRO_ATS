package gpt;

/**
 *
 * @author Benji
 */
public class pausa {

    private static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("HOLAAA");
            pausa(1000);
        }
        
    }
    
}
