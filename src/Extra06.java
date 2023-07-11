/**
 *
 */


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 *
 */
public class Extra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat formato1 = new DecimalFormat("#.##");
        Scanner leer = new Scanner(System.in);
        
        double sum = 0;
        double sumBajas = 0;
        int personasBajas = 0;
        
        System.out.println("Ingrese el número de personas.");
        int personas = leer.nextInt();
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la estatura en metros.");
            double estatura = leer.nextFloat();
            
            sum += estatura;
            
            if (estatura < 1.60) {
                sumBajas += estatura;
                personasBajas += 1;
            }
        }
        
        double promedio = sum /personas;
        double promedioBajas = sumBajas / personasBajas;
                
        System.out.println("Total personas: " + formato1.format(personas));
        System.out.println("Estatura promedio: " + formato1.format(promedio));
        System.out.println("Total personas por debajo de 1.60mt: " + formato1.format(personasBajas));
        System.out.println("Estatura promedio por debajo de 1.60mt: " + formato1.format(promedioBajas));
    }   
}


