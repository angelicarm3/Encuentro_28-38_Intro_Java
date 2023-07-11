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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
               
        boolean exit = false;
        boolean back = false;
        
        System.out.println("Ingrese dos números.");
        int num1 = leer.nextInt();     
        int num2 = leer.nextInt(); 
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.println("Elija una opción:");
            int option = leer.nextInt();
            leer.nextLine();
            
            switch (option) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + sum);
                    break;
                case 2:
                    int sub = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + sub);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + mult);
                    break;
                case 4:
                    int div = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String answer = leer.nextLine().toUpperCase();
                    
                    do {
                        switch (answer) {
                            case "S":
                                back = true;
                                exit = true;
                                break;
                            case "N":
                                back = true;
                                exit = false;
                                break;
                            default:
                                System.out.println("Ingrese una opción válida.");
                                answer = leer.nextLine().toUpperCase();
                                //Por qué en la segunda vez que ingresa info no la valida sino que retorna al menú?
                        }
                    } while (!back);                    
            }
        } while (!exit);
    }
}
