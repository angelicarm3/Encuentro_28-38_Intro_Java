/**
 *
 */


import java.util.Scanner;

/**
 *
 *
 */
public class Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra.");
        String letra = leer.nextLine().toUpperCase();
        
        esVocal(letra);
    }
    
    public static void esVocal(String letra) {
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println(letra + " es una vocal.");
        } else {
            System.out.println(letra + " no es una vocal.");
        }
    }
}


