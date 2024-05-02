package matrices;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class MatricesSolved {
    //ejercicio 1
    public static void iniciarRecaudacion() {
        final int LINEAS = 2;//3;
        final int COCHES = 2;//12;
        Scanner scanner = new Scanner(System.in);
        double[][] recaudacion = new double[LINEAS][COCHES];
        for (int i = 0; i < LINEAS; i++) {
            for (int j = 0; j < COCHES; j++) {
                System.out.println("Ingrese la recaudación del coche " + (j + 1) + " de la línea " + (i + 1) + ":");
                recaudacion[i][j] = scanner.nextDouble();
            }
        }
        double[] recaudacionPorLinea = calcularRecaudacionPorLinea(recaudacion);
        double[] recaudacionPorCoche = calcularRecaudacionPorCoche(recaudacion);
        double recaudacionTotalGeneral = calcularRecaudacionTotal(recaudacion);
        mostrarRecaudacionPorLinea(recaudacionPorLinea);
        mostrarRecaudacionPorCoche(recaudacionPorCoche);
        System.out.println("La recaudación total general es: S/" + recaudacionTotalGeneral);
    }

    // Método para calcular la recaudación total por línea de colectivo
    public static double[] calcularRecaudacionPorLinea(double[][] recaudacion) {
        double[] recaudacionPorLinea = new double[recaudacion.length];

        for (int i = 0; i < recaudacion.length; i++) {
            for (int j = 0; j < recaudacion[0].length; j++) {
                recaudacionPorLinea[i] += recaudacion[i][j];
            }
        }

        return recaudacionPorLinea;
    }

    // Método para calcular la recaudación total por coche
    public static double[] calcularRecaudacionPorCoche(double[][] recaudacion) {
        double[] recaudacionPorCoche = new double[recaudacion[0].length];

        for (int j = 0; j < recaudacion[0].length; j++) {
            for (int i = 0; i < recaudacion.length; i++) {
                recaudacionPorCoche[j] += recaudacion[i][j];
            }
        }

        return recaudacionPorCoche;
    }

    // Método para calcular la recaudación total general
    public static double calcularRecaudacionTotal(double[][] recaudacion) {
        double recaudacionTotal = 0;

        for (int i = 0; i < recaudacion.length; i++) {
            for (int j = 0; j < recaudacion[0].length; j++) {
                recaudacionTotal += recaudacion[i][j];
            }
        }

        return recaudacionTotal;
    }

    // Método para mostrar la recaudación por línea de colectivo
    public static void mostrarRecaudacionPorLinea(double[] recaudacionPorLinea) {
        System.out.println("Recaudación por línea:");
        for (int i = 0; i < recaudacionPorLinea.length; i++) {
            System.out.println("Línea " + (i + 1) + ": S/" + recaudacionPorLinea[i]);
        }
    }

    // Método para mostrar la recaudación por coche
    public static void mostrarRecaudacionPorCoche(double[] recaudacionPorCoche) {
        System.out.println("Recaudación por coche:");
        for (int j = 0; j < recaudacionPorCoche.length; j++) {
            System.out.println("Coche " + (j + 1) + ": S/" + recaudacionPorCoche[j]);
        }
    }
    //ejercicio 2
    // Método para generar la matriz con unos en la diagonal principal y ceros en el resto
    public static int[][] generarMatrizCero() {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Si estamos en la diagonal principal, asignamos 1
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
    
    //ejercicio 3
    //from Matrices.java
    public static int[][] transponerMatriz(int[][] matriz) {
        int[][] matrizT = new int[matriz[0].length][matriz.length];

        for (int fila = 0; fila < matrizT.length; fila++) {
            for (int col = 0; col < matrizT[0].length; col++) {
                matrizT[fila][col] = matriz[col][fila];
            }
        }
        return matrizT;
    }
    //from Matrices.java
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
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        
        //ejercicio 1
        //iniciarRecaudacion();
        
        //ejercicio 2
        //imprimirMatriz(generarMatrizCero());
        
        //ejercicio 3
        //int[][] matrix = Matrices.inicializarMatrizRandom();
        //imprimirMatriz(matrix);
        //imprimirMatriz(transponerMatriz(matrix));
    }
}
