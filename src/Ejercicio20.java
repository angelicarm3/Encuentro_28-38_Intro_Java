
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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int width = 3;        
        int heigth = width;        
        int[][] matriz = new int[width][heigth];
        
        asignarMatriz(matriz, width, heigth);
        imprimirMatriz(matriz, width, heigth);
        verificarMagica(matriz, width, heigth);
    }
    
    public static int[][] asignarMatriz(int[][] matriz, int width, int heigth){ 
                
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {                
                matriz[i][j] = esValido();
            }            
        } 
        
        return matriz;
    } 
    
    public static int esValido(){ 
        Scanner leer = new Scanner(System.in);
        boolean numValido = false;
        int num = 0;
        
        do {
            System.out.println("Ingrese un número. (1 - 9)");
            num = leer.nextInt();
                
            if (num > 0 && num < 10) {
                numValido = true;
            } else {
                numValido = false;
                System.out.println("El número debe estar entre 1 y 9.");
            }
        } while (!numValido);
                
        return num;
    }
    
    public static void verificarMagica(int[][] matriz, int width, int heigth) {
        
        int sum = calcularDiagonalP(matriz, width, heigth);
//        System.out.println(sum);
        boolean esMagica1 = calcularDiagonalS(sum, matriz, width, heigth);
//        System.out.println(esMagica1);
        boolean esMagica2 = sumarFilas(sum, matriz, width, heigth);
//        System.out.println(esMagica2);
        boolean esMagica3 = sumarColumnas(sum, matriz, width, heigth);
//        System.out.println(esMagica3);
        
        if (esMagica1 && esMagica2 && esMagica3) {
            System.out.println("Esta matriz es mágica");
        } else {
            System.out.println("Esta matriz no es mágica");
        }
    }
    
    public static int calcularDiagonalP(int[][] matriz, int width, int heigth){
        int sum = 0;
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                if (i == j) {
                    sum += matriz[i][j];
                } 
            }
        }
        
        return sum;
    }

    public static boolean calcularDiagonalS(int sum, int[][] matriz, int width, int heigth) {
        int diagonalSecundaria = 0;
        int j = heigth - 1;

        for (int i = 0; i < width; i++) {
            diagonalSecundaria += matriz[i][j];
            j -= 1;
        }

        boolean esMagica = diagonalSecundaria == sum;

        return esMagica;
    }

    public static boolean sumarFilas(int sum, int[][] matriz, int width, int heigth) {
        boolean esMagica = false;
        int sumaFila = 0;
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                sumaFila += matriz[i][j];
                
                if (j == heigth - 1) {
                    esMagica = sumaFila == sum;
                    sumaFila = 0;
                } 
            }
        }
        
        return esMagica;
    }
    
    public static boolean sumarColumnas(int sum, int[][] matriz, int width, int heigth) {
        boolean esMagica = false;
        int sumaColumna = 0;
        
        for (int j = 0; j < heigth; j++) {
            for (int i = 0; i < width; i++) {
                sumaColumna += matriz[i][j];
                
                if (i == width - 1) {
                    esMagica = sumaColumna == sum;
                    sumaColumna = 0;
                } 
            }
        }
        
        return esMagica;
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
