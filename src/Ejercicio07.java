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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase.");
        String phrase = leer.nextLine();
        
        String eureka = "eureka";
        
        if (phrase.equals(eureka)) {
            System.out.println("Correcto! ");
        }else {
            System.out.println("Lo sentimos, la frase no coincide.");
        }
    }
}