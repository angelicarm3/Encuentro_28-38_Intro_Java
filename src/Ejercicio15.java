
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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int size = 100;
        int[] vector = new int[size];
        
        asignarVector(vector, size);
        imprimirVectorReves(vector, size);        
    }
    
    public static int[] asignarVector(int[] vector, int size){      
        for (int i = 0; i < size; i++) {
            vector[i] = i + 1;
        } 
        
        return vector;
    } 
    
    public static void imprimirVectorReves(int[] vector, int size){
        int i = size - 1;
        
        while (i >= 0) {
            if (i == 0) {
                System.out.println(vector[i]);
            } else {
                System.out.print(vector[i] + ", ");
            }
            i--;
        }
    } 
}
