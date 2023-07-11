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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase.");
        String phrase = leer.nextLine();
        String letter = phrase.substring(0, 1).toUpperCase();
        
        
        if (letter.equals("A")) {
            System.out.println("Correcto! ");
        }else {
            System.out.println("Incorrecto");
        }
    }
}