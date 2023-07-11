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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número.");
        int num = leer.nextInt();
        int x2 = num * 2;
        int x3 = num * 3;
        int square = (int) Math.sqrt(num);
        
        System.out.println("Número: " + num);   
        System.out.println("x2; " + x2); 
        System.out.println("x3; " + x3);         
        System.out.println("Raíz cuadrada; " + square); 
    }
}