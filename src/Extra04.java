/**
 *
 */


import java.util.Scanner;

/**
 *
 *
 */
public class Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = esValido();
        String romano = aRomano(num);
        
        System.out.println("Número: " + num + " = " + romano);
    }
    
    public static int esValido() {
        Scanner leer = new Scanner(System.in);
        boolean numValido = false;
        int num = 0;
        
        do {
            System.out.println("Ingrese un número. (1 - 10)");
            num = leer.nextInt();
                
            if (num > 0 && num < 11) {
                numValido = true;
            } else {
                numValido = false;
                System.out.println("El número debe estar entre 1 y 10.");
            }
        } while (!numValido);
        
        return num;
    }
    
    public static String aRomano(int num) {
        String romano = "";
        
        switch (num) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
        }
        
        return romano;
    }
}


