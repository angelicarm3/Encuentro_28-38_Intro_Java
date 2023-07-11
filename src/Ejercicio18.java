
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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int width = 4;        
        int heigth = width;        
        int[][] matriz = new int[width][heigth];
        
        asignarMatriz(matriz, width, heigth);
        imprimirMatriz(matriz, width, heigth);
        trasponerMatriz(matriz, width, heigth);
    }
    
    public static int[][] asignarMatriz(int[][] matriz, int width, int heigth){ 
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }            
        } 
        
        return matriz;
    } 
    
    public static void trasponerMatriz(int[][] matriz, int width, int heigth) {        
        int[][] matrizT = new int[width][heigth];
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
                
        imprimirMatriz(matrizT, width, heigth);
    }
    
    public static void imprimirMatriz(int[][] matriz, int width, int heigth) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                if (j == width - 1) {
                    System.out.println(matriz[i][j]);
                } else {
                    System.out.print(matriz[i][j] + ", ");
                }
            }

        }
        System.out.println("");
    } 
}
