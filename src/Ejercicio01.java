/**
 *
 */


import java.util.Scanner;

/**
 *
 *
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos números.");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);        
    }
}
