
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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
               
        System.out.println("Ingrese un número.");
        int num = leer.nextInt(); 
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == num - 1) {
                        System.out.print("*");
                } else {
                    System.out.print(" ");
                }                
            }
            System.out.println("");
        }            
    }
}
