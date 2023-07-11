
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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector.");
        int size = leer.nextInt();
        
        int[] vector = new int[size];
        
        asignarVector(vector, size);
//        imprimirVector(vector, size);
        contarNum(vector, size);
    }
    
    public static int[] asignarVector(int[] vector, int size){ 
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un numero.");
            vector[i] = leer.nextInt();
        } 
        
        return vector;
    } 
    
    public static void contarNum(int[] vector, int size) {        
        int oneDigit = 0;
        int twoDigit = 0;
        int threeDigit = 0;        
        int fourDigit = 0;
        int fiveDigit = 0;
        
        for (int i = 0; i < size; i++) {
            if ((int) vector[i] / 10 == 0) {
                oneDigit += 1;
            } else if ((int) vector[i] / 100 == 0) {
                twoDigit += 1;
            } else if ((int) vector[i] / 1000 == 0) {
                threeDigit += 1;
            } else if ((int) vector[i] / 10000 == 0) {
                fourDigit += 1;
            } else if ((int) vector[i] / 100000 == 0) {
                fiveDigit += 1;
            }
        } 
        
        System.out.println("Elementos de un dígito: " + oneDigit);
        System.out.println("Elementos de dos dígitos: " + twoDigit);
        System.out.println("Elementos de tres dígitos: " + threeDigit);
        System.out.println("Elementos de cuatro dígitos: " + fourDigit);
        System.out.println("Elementos de cinco dígitos: " + fiveDigit);
    }
    
    public static void imprimirVector(int[] vector, int size){
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.println(vector[i]);
            } else {
                System.out.print(vector[i] + ", ");
            }
        }
    } 
}
