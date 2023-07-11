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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de grados centígrados (°C).");
        int celsius = leer.nextInt();
        int fahrenheit = 32 + ((9* celsius) / 5);
        
        System.out.println("°C: " + celsius);   
        System.out.println("°F: " + fahrenheit); 
    }
}