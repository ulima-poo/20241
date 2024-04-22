package com.mycompany.arreglounidimensional;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class ExercisesSolved {
    static Scanner sc = new Scanner(System.in);//toda la clase

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        System.out.println("[Exercises Solved]");
        //exerciseN();
    }
    public static String toString(int[] arreglo){
        return toStringIdx(arreglo, 0, arreglo.length);
    }
    public static String toStringIdx(int[] arreglo, int inicio, int fin){
        String strArray = "[";
        for (int i = inicio; i <= fin; i++) {
            strArray += arreglo[i];
            if (i < fin) {
                strArray += ", ";
            }
        }
        strArray += "]";
        return strArray;
    }
    public static void sort(int[] numeros){
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
    }
    public static int[] copy(int[] array1){
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        return array2;
    }
    public static void exercise1(){
        System.out.println("Ingrese el nombre del vendedor:");
        String nombre = sc.nextLine();
        
        int MAX_DAYS = 30;//
        double[] ventas = new double[MAX_DAYS];
        for (int i = 0; i < MAX_DAYS; i++) {
            System.out.println("Ingrese las ventas del día " + (i + 1) + ":");
            ventas[i] = sc.nextDouble();
        }
        
        double totalVentas = 0;
        
        System.out.println("\nReporte de ventas:");
        System.out.println("Vendedor: " + nombre);
        
        for (int i = 0; i < MAX_DAYS; i++) {
            System.out.println("Día " + (i + 1) + ": S/" + ventas[i]);
            totalVentas += ventas[i];
        }
        
        System.out.println("Venta total del mes: S/" + totalVentas);
    }
    public static void exercise2(){
        int MAX_DAYS = 30;//
        double[] lluvia = new double[MAX_DAYS];
        
        for (int i = 0; i < MAX_DAYS; i++) {
            System.out.println("Ingrese la cantidad de lluvia del día " + (i + 1) + " en mm:");
            lluvia[i] = sc.nextDouble();
        }
        
        double max = lluvia[0];
        double min = lluvia[0];
        double total = 0;
        
        for (double dia : lluvia) {
            if (dia > max) {
                max = dia;
            }
            if (dia < min) {
                min = dia;
            }
            total += dia;
        }
        
        double promedio = total / MAX_DAYS;
        
        System.out.println("\nDía con mayor cantidad de lluvia: " + max + " mm");
        System.out.println("Día con menor cantidad de lluvia: " + min + " mm");
        System.out.println("Promedio de lluvia diaria: " + promedio + " mm");
    }
    public static void exercise3(){
        //TODO input
        int[] A = {1, 5, 7, 2, 9, 4, 8, 3, 6, 10};
        int[] B = {2, 6, 8, 1, 7, 5, 9, 4, 3, 10};
        int[] C = new int[10];
        
        for (int i = 0; i < 10; i++) {
            C[i] = Math.min(A[i], B[i]);
        }
        
        System.out.println("Arreglo A: " + toString(A));
        System.out.println("Arreglo B: " + toString(B));
        System.out.println("Arreglo C: " + toString(C));
    }
    public static void exercise4(){
        //TODO input
        int[] arreglo = {1, 2, 3, 4, 5};
        
        System.out.println("Ingrese la posición i:");
        int i = sc.nextInt();
        
        System.out.println("Ingrese la posición j:");
        int j = sc.nextInt();
        
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
        
        System.out.println("Arreglo resultante: " + toString(arreglo));
    }
    public static void exercise5(){
        int MAX_IN = 12;//
        int[] numeros = new int[MAX_IN];
        int pares = 0;
        int positivos = 0;
        
        for (int i = 0; i < MAX_IN; i++) {
            System.out.println("Ingrese número " + (i + 1) +":");
            numeros[i] = sc.nextInt();
            
            if (numeros[i] % 2 == 0) {
                pares++;
            }
            
            if (numeros[i] > 0) {
                positivos++;
            }
        }
        
        sort(numeros);
        System.out.println(toString(numeros));
        
        System.out.println("\nPorcentaje de valores pares: " + (pares * 100 / MAX_IN) + "%");
        
        if (positivos > 0) {
            System.out.println("Valores positivos en orden descendente:");
            for (int i = MAX_IN - 1; i >= 0; i--) {
                if (numeros[i] > 0) {
                    System.out.println(numeros[i]);
                }
            }
        } else {
            System.out.println("No hay valores positivos en el listado.");
        }
        if ( pares == 0) {
            System.out.println("No hay valores pares en el listado.");
        }
    }
    public static void exercise6(){
        int MAX_MONTHS = 12;//
        double[] ventasMensuales = new double[MAX_MONTHS];
        
        // Ingresar las ventas mensuales
        for (int i = 0; i < MAX_MONTHS; i++) {
            System.out.println("Ingrese las ventas del mes " + (i + 1) + " en S/:");
            ventasMensuales[i] = sc.nextDouble();
        }
        
        // Calcular el promedio anual de ventas
        double totalVentas = 0;
        
        for (double venta : ventasMensuales) {
            totalVentas += venta;
        }
        
        double promedioAnual = totalVentas / MAX_MONTHS;
        
        // Calcular el porcentaje de meses con ventas bajas (< 50% del promedio anual)
        int mesesBajos = 0;
        
        for (double venta : ventasMensuales) {
            if (venta < 0.5 * promedioAnual) {
                mesesBajos++;
            }
        }
        
        double porcentajeMesesBajos = (mesesBajos * 100.0) / MAX_MONTHS;
        
        // Identificar los meses con ventas excelentes (> 75% del promedio anual)
        System.out.println("\nMonto de la venta anual promedio: S/" + promedioAnual);
        System.out.println("Porcentaje de meses con ventas bajas: " + porcentajeMesesBajos + "%");
        System.out.println("Meses con ventas excelentes:");
        
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                  "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = 0; i < MAX_MONTHS; i++) {
            if (ventasMensuales[i] > 0.75 * promedioAnual) {
                System.out.println(meses[i]);
            }
        }
    }
    public static void exercise7(){
        int MAX = 10;//
        int[] arreglo1 = new int[MAX];
        int[] arreglo2 = new int[MAX];
        
        // Generar valores aleatorios para el arreglo1
        Random rand = new Random();
        
        for (int i = 0; i < MAX; i++) {
            arreglo1[i] = rand.nextInt(100); // Números aleatorios entre 0 y 99
        }
        arreglo1[0] = arreglo1[1];
        arreglo1[MAX-2] = arreglo1[MAX-1];
        
        // Copiar y ordenar arreglo1 en arreglo2
        arreglo2 = copy(arreglo1);
        sort(arreglo2);
        //System.out.println("Arreglo2^: " + toString(arreglo2));
        
        // Eliminar valores repetidos en arreglo2
        int[] arreglo2NoRepetidos = new int[arreglo2.length];
        int index = 1;
        arreglo2NoRepetidos[0] = arreglo2[0];
        for (int i = 1; i < MAX; i++) {
            if (arreglo2[i] != arreglo2NoRepetidos[index - 1]) {
                arreglo2NoRepetidos[index] = arreglo2[i];
                index++;
            }
        }
        
        // Imprimir los valores finales de ambos arreglos
        System.out.println("Arreglo1: " + toString(arreglo1));
        System.out.println("Arreglo2: " + toString(arreglo2NoRepetidos));
    }
    public static void exercise8(){
        int[] arreglo = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 9, 4, 3};
        
        int[] resultado = new int[arreglo.length];
        int index = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            boolean esDuplicado = false;            
            for (int j = 0; j < index; j++) {
                if (arreglo[i] == resultado[j]) {
                    esDuplicado = true;
                    break;
                }
            }            
            if (!esDuplicado) {
                resultado[index++] = arreglo[i];
            }
        }
        System.out.println("Arreglo: " + toString(resultado));
    }
    public static void exercise9(){
        int[] arreglo = {2, 4, 6, 10};       
        int objetivo = 16;//TODO
        
        for (int i = 0; i < arreglo.length; i++) {
            int suma = 0;
            for (int j = i; j < arreglo.length; j++) {
                suma += arreglo[j];
                //System.out.println("i: " + i + ", j: " + j + ", e: "+arreglo[j]+", Suma: " + suma);
                System.out.println("i: " + i + ", j: " + j + ", e: "+arreglo[j]+", Suma: " + suma+", Arr: " + toStringIdx(arreglo, i, j));
                if (suma == objetivo) {
                    System.out.println(toStringIdx(arreglo, i, j));
                }
            }
        }
    }
    
    public static void exercise10(){
        int[] arreglo = {-2, 3, 9, 5};
         int n = arreglo.length;
        int maxProducto = arreglo[0];
        int inicio = 0;
        int fin = 0;

        for (int i = 0; i < n; i++) {
            int productoActual = 1;
            for (int j = i; j < n; j++) {
                productoActual *= arreglo[j];
                //System.out.println("i: " + i + ", j: " + j + ", e: "+arreglo[j]+", producto: " + productoActual);
                //System.out.println("i: " + i + ", j: " + j + ", e: "+arreglo[j]+", producto: " + productoActual+", Arr: " + toStringIdx(arreglo, i, j));
                if (productoActual > maxProducto) {
                    maxProducto = productoActual;
                    inicio = i;
                    fin = j;
                }
            }
        }
        System.out.println(toStringIdx(arreglo, inicio, fin));
    }
}
