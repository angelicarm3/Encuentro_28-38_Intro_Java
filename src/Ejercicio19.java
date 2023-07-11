
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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int width = 3;        
        int heigth = width;        
        int[][] matriz = new int[width][heigth];
        
        asignarMatriz(matriz, width, heigth);
//        imprimirMatriz(matriz, width, heigth);
        trasponerMatriz(matriz, width, heigth);
    }
    
    public static int[][] asignarMatriz(int[][] matriz, int width, int heigth){ 
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                System.out.println("Ingrese un numero.");
                matriz[i][j] = leer.nextInt();
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
                
//        imprimirMatriz(matrizT, width, heigth);
        esAntisimetrica(matriz, matrizT, width, heigth);
    }
    
    public static void esAntisimetrica(int[][] matriz, int[][] matrizT, int width, int heigth) {
        boolean antisimetrica = false;
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                if (matriz[i][j] == matriz[i][j] * -1) {
                    antisimetrica = true;
                } else {
                    antisimetrica = false;
                }
            }
        }
        
        if (antisimetrica) {
            System.out.println("La matriz es anti simétrica.");
        } else {
            System.out.println("La matriz no es anti simétrica.");
        }
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
