/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author Giancarlo
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void imprimirMatriz(int[][] matriz) {

        System.out.println("Cantidad de filas: " + matriz.length);
        System.out.println("Cantidad de columnas: " + matriz[0].length);

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] inicializarMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        System.out.println("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print("Ingrese el valor de la posición (" + fila + "," + col + ")");
                matriz[fila][col] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] inicializarMatrizRandom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        System.out.println("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[fila][col] = (int) (Math.random() * 10 + 1);
            }
        }
        return matriz;
    }

    public static int sumarElementosMatriz(int[][] matriz) {
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[0].length; col++) {
                suma += matriz[fila][col];
            }
        }
        return suma;
    }

    public static int filaConSumaMayor(int[][] matriz) {
        int suma;
        int sumaFilaMayor = 0;
        int filaMayor = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            suma = 0;
            for (int col = 0; col < matriz[0].length; col++) {
                suma += matriz[fila][col];
            }
            if (suma > sumaFilaMayor) {
                filaMayor = fila;
                sumaFilaMayor = suma;
            }
        }
        return filaMayor;
    }

    public static void imprimirMayorValorPorFila(int[][] matriz) {
        int maxValor;
        for (int fila = 0; fila < matriz.length; fila++) {
            maxValor = matriz[fila][0]; //mi máximo valor incialmente es la columna 0 de cada fila
            for (int col = 1; col < matriz[0].length; col++) {
                if (matriz[fila][col] > maxValor) {
                    maxValor = matriz[fila][col];
                }
            }
            System.out.println("Mayor elemento de la fila " + fila + " es: " + maxValor);
        }
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int[][] matrizT = new int[matriz[0].length][matriz.length];

        for (int fila = 0; fila < matrizT.length; fila++) {
            for (int col = 0; col < matrizT[0].length; col++) {
                matrizT[fila][col] = matriz[col][fila];
            }
        }
        return matrizT;
    }

    public static int[][] multiplicarMatriz(int[][] matrizA, int[][] matrizB) {
        int[][] matrizC = new int[matrizA.length][matrizB[0].length];
        int suma = 0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                matrizC[i][j] = suma;
                suma = 0;
            }

        }
        return matrizC;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Otra forma de incializar una matriz
        //int a[][] =  { {4,2,7},{4,3,8},{6,2,7},{9,1,0} }; 

        int[][] matriz = inicializarMatrizRandom();
        imprimirMatriz(matriz);
        System.out.println("Suma de elementos de la matriz: " + sumarElementosMatriz(matriz));
        System.out.println("Fila cuya suma de elementos es mayor: " + filaConSumaMayor(matriz));
        imprimirMayorValorPorFila(matriz);

        int[][] matrizA = inicializarMatrizRandom();
        imprimirMatriz(matrizA);
        int[][] matrizB = inicializarMatrizRandom();
        imprimirMatriz(matrizB);
        int[][] matrizC = multiplicarMatriz(matrizA, matrizB);
        imprimirMatriz(matrizC);

    }

}
