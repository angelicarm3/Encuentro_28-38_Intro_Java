/**
 *
 */


import java.util.Scanner;

/**
 *
 *
 */
public class Extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tipo = esValido();        
        calcularDescuento(tipo);
    }
    
    public static String esValido() {
        Scanner leer = new Scanner(System.in);
        boolean tipoValido = false;
        String tipo = "";
        
        do {
            System.out.println("Ingrese el tipo de socio (A, B, C).");
            tipo = leer.nextLine().toUpperCase();
                
            if (tipo.equals("A") || tipo.equals("B") || tipo.equals("C")) {
                tipoValido = true;
            } else {
                tipoValido = false;
                System.out.println("Ingrese una opción válida.");
            }
        } while (!tipoValido);
        
        return tipo;
    }
    
    public static void calcularDescuento(String tipo) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el costo del tratamiento.");
        int tratamiento = leer.nextInt();
        double valorFinal = 0;
        
        switch (tipo) {
            case "A":
                valorFinal = tratamiento * 0.5;
                break;
            case "B":
                valorFinal = tratamiento * 0.35;
                break;
            case "C":
                valorFinal = tratamiento;
                break;
        }
        
        System.out.println("El valor a pagar es: $" + valorFinal);
    }
}


