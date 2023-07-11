
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
/**
 *
 * @author Angelica
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
               
        boolean exit = false;
        int rights = 0;
        int wrongs = 0;
        String FDE = "&&&&&";
               
        do {
            System.out.println("Ingrese una cadena.");
            String cadena = leer.nextLine(); 
            
            int stringLength = cadena.length();
            
            if (cadena.equals(FDE)) {
                System.out.println("Lecturas correctas: " + rights);
                System.out.println("Lecturas incorrectas: " + wrongs);
                exit = true;
            } else {
                if (stringLength > 5) {
                    wrongs += 1;
                } else {
                    String first = cadena.substring(0, 1).toUpperCase();
                    String last = cadena.substring(stringLength - 1, stringLength).toUpperCase();
                    
                    if (first.equals("X") && last.equals("O")) {
                        rights += 1;
                    } else {
                        wrongs += 1;
                    }
                }
            }                    
        } while (!exit);
    }
}
