/**
 *
 */


import java.util.Scanner;

/**
 *
 *
 */
public class Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cuatro números.");
        int A = leer.nextInt();
        int B = leer.nextInt();
        int C = leer.nextInt();
        int D = leer.nextInt();
        
        System.out.println("Valores iniciales:");
        imprimirValores(A, B, C, D);
        
        int temp = B;
        B = C;
        C = A;
        A = D;
        D = temp;
        
        System.out.println("Valores finales:");
        imprimirValores(A, B, C, D);
    }
    
    public static void imprimirValores(int A, int B, int C, int D) {
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
}


