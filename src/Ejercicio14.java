
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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean exit = false;
        boolean back = false;
        boolean validOption = false;
     
        System.out.println("Ingrese la cantidad de euros.");
        float euros = leer.nextInt();

        do {
            System.out.println("Seleccione la moneda a convertir:");
            System.out.println("1. Dolares");
            System.out.println("2. Yenes");
            System.out.println("3. Libras");
            int option = leer.nextInt();

            do {
                if (option > 0 && option < 4) {
                    validOption = true;
                    mostrarCambio(euros, option);
                } else {
                    System.out.println("Ingrese una opción válida.");
                    option = leer.nextInt();
                }
            } while (!validOption);
           
            System.out.println("¿Quiere realizar otro cálculo (S/N)?");
            String answer = leer.nextLine().toUpperCase();

            do {
                switch (answer) {
                    case "S":
                        back = true;
                        exit = false;
                        break;
                    case "N":
                        back = true;
                        exit = true;
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                        answer = leer.nextLine().toUpperCase();
                    //Por qué en la segunda vez que ingresa info no la valida sino que retorna al menú?
                }
            } while (!back);
        } while (!exit);
    }
    
    public static void mostrarCambio(float euros, int option){      
        switch (option) {
                case 1:
                    double dollars = euros * 1.28611;
                    System.out.println(euros + " euros = " + dollars + " dolares.");
                    break;
                case 2:
                    double yens = euros * 129.852;
                    System.out.println(euros + " euros = " + yens + " yenes.");
                    break;
                case 3:
                    double pounds = euros * 1.28611;
                    System.out.println(euros + " yenes = " + pounds + " libras.");
                    break;
        }           
    }  
}
