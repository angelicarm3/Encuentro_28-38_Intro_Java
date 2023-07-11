/**
 *
 */


import java.util.Scanner;

/**
 *
 *
 */
public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tiempo en minutos.");
        int minutes = leer.nextInt();
        
        int days = (int) Math.floor(minutes / 1440);
        int hours = (int) ((minutes % 1440) / 60);
        int finalMinutes = (int) ((minutes % 1440) % 60);
        
        System.out.println(minutes + " minutos = " + days + " dias, " + hours + " horas y " + finalMinutes + " minutos.");        
    }
}
