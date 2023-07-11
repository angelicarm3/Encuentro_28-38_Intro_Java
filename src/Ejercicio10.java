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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int sum = 0;
        
        System.out.println("Ingrese un valor límite positivo.");
        int limit = leer.nextInt();        
        
        while (sum <= limit) {
            System.out.println("Ingrese un número.");
            sum += leer.nextInt(); 
            
            if (sum < limit) {
                System.out.println("Suma: " + sum);
                continue;
            } else {
                System.out.println("La suma de los números ingresados supera el límite.");
                break;
            }            
        }
    }
}