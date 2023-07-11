
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
public class Ejercicio16 {

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
        buscarNum(vector, size);
    }
    
    public static int[] asignarVector(int[] vector, int size){      
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 100);
        } 
        
        return vector;
    } 
    
    public static void buscarNum(int[] vector, int size) {
        Scanner leer = new Scanner(System.in);
        
        boolean repeated = false;
        int numRep = 0;
        int position = 0;
        
        System.out.println("Ingrese el número que desea buscar.");
        int num = leer.nextInt();
        
        for (int i = 0; i < size; i++) {
            if (vector[i] == num) {
                numRep += 1;
                
                if (numRep == 1) {
                    position = i;
                }                
            } 
        } 
        
        repeated = numRep > 0;
        
        if (repeated) {
            System.out.println("El número " + num + " se encuentra " + numRep + " veces en el vector.");
            System.out.println("La primer incidencia se encuentra en la posición " + position + ".");
        } else {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
        
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
