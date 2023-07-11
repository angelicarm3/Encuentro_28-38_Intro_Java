
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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int widthM = 10;        
        int heigthM = widthM;        
        int[][] matrizM = new int[widthM][heigthM];
        
        int widthP = 3;        
        int heigthP = widthP;        
        int[][] matrizP = new int[widthP][heigthP];
        
        asignarMatrizRandom(matrizM, widthM, heigthM);
        imprimirMatriz(matrizM, widthM, heigthM);
        asignarMatriz(matrizP, widthP, heigthP);
        imprimirMatriz(matrizP, widthP, heigthP);
        comprobarMatrices(matrizM, widthM, heigthM, matrizP, widthP, heigthP);
    }
    
    public static int[][] asignarMatrizRandom(int[][] matriz, int width, int heigth){ 
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {     
                matriz[i][j] = (int) (Math.random() * 100);
            }            
        } 
        
        return matriz;
    } 
    
    public static int[][] asignarMatriz(int[][] matriz, int width, int heigth){ 
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                System.out.println("Ingrese un número.");      
                matriz[i][j] = leer.nextInt();
            }            
        } 
        
        return matriz;
    } 
    
    public static void comprobarMatrices(int[][] matrizM, int widthM, int heigthM, int[][] matrizP, int widthP, int heigthP) {

        for (int i = 0; i < (widthM - widthP + 1); i++) {
            for (int j = 0; j < (heigthM - heigthP + 1); j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    if (contieneMatrizP(matrizM, matrizP, widthP, heigthP, i, j)) {
                        System.out.println("Las coordenadas donde se encuentra la matriz P son: [" + i + "][" + j + "].");
                    } else {
                        System.out.println("La matriz P no esta presente en la matriz M.");
                    }
                }
            }
        }
    }

    public static boolean contieneMatrizP(int[][] matrizM, int[][] matrizP, int width, int heigth, int i, int j) {
        for (int k = 0; k < width; k++) {
            for (int l = 0; l < heigth; l++) {
                if (matrizM[k + i][l + j] != matrizP[k][l] ) {
                    return false;
                }
            }
        }
        return true;
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