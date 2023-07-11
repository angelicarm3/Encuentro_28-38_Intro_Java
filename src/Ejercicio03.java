/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/**
 *
 * @author Angelica
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase.");
        String phrase = leer.nextLine();
                
        System.out.println("Frase original: " + phrase);   
        System.out.println("Frase mayúsculas: " + toUpperCase(phrase));
        System.out.println("Frase minúsculas: " + toLowerCase(phrase));
    }
}