/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arreglounidimensional;

import java.util.Scanner;

/**
 *
 * @author ProfL3301
 */
public class ArregloUnidimensional {

    public static int[] inicializarArreglo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números: ");
        int longitud = sc.nextInt();

        int[] arreglo = new int[longitud];

        for (int i = 0; i <= longitud - 1; i++) {
            System.out.println("Ingresa el número " + i + ":");
            arreglo[i] = sc.nextInt();
        }
        
        return arreglo;
    }

    public static void imprimirArreglo(int [] arreglo){
        for (int i = 0; i <= arreglo.length - 1; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
    }
    
    public static void imprimirArregloReves(int [] arreglo){
        for (int i = arreglo.length-1; i >= 0 ; i--) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
    }
    
    public static int[] copiarArreglos(int [] arreglo){
        int [] arregloCopia = new int [arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arregloCopia[i] = arreglo[i];
        }
        return arregloCopia;
    }
    
    public static void main(String[] args) {
        /*int[] arreglo = {1, 5, 6, 7};
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println("tamaño arreglo 1: " + arreglo.length);

        int[] arreglo2 = new int[4];
        arreglo2[0] = 1;
        arreglo2[1] = 5;
        arreglo2[2] = 6;
        arreglo2[3] = 7;

        System.out.println(arreglo2[0]);
        System.out.println(arreglo2[1]);
        System.out.println(arreglo2[2]);
        System.out.println(arreglo2[3]);
        System.out.println("tamaño arreglo 2: " + arreglo2.length);
        
        int [] arreglo3 = inicializarArreglo();
        imprimirArreglo(arreglo3);
        imprimirArregloReves(arreglo3);
        
        int [] arreglo4 = {1,4,8};
        arreglo4 = arreglo3;
        System.out.println("");
        imprimirArreglo(arreglo4);
        arreglo4[2]=1258;
        System.out.println("Arreglo 3");
        imprimirArreglo(arreglo3);
        System.out.println("Arreglo 4");
        imprimirArreglo(arreglo4);
        
        int [] arreglo5 = copiarArreglos(arreglo4);
        System.out.println("Arreglo 5 (copy de arreglo 4)");
        imprimirArreglo(arreglo5);*/
        
        ejercicio5();
    }
    public static void bubleSortMejorado(int[] arreglo) {
        int contBucles = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                contBucles++;
                if (arreglo[j] > arreglo[j + 1]) {
                    //intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        //System.out.println("Cant Bucles: " + contBucles);
    }
    
    /*
    5. Solicitar al usuario un listado de 12 números enteros de todo tipo 
    (positivos, negativos, ceros), para luego 
    [x] a. mostrar en pantalla porcentaje de valores pares ingresados
    [x] b. listado de valores positivos de manera descendente. 
    [x] c. si no hay valores pares
    [x] d. si no hay valores positivos en el listado.
    */
    public static void ejercicio5(){
        int[] arreglo = inicializarArreglo();
        int contadorPares = 0;
        int contadorPositivos = 0;//ctrl+shift+DOWN
        // i <= arreglo.length - 1
        for (int i = 0; i < arreglo.length; i++) {
            //System.out.println(arreglo[i]);
            int numero = arreglo[i];
            if(numero % 2 == 0){
                contadorPares++;
            }
            if(numero > 0){
                contadorPositivos++;
            }
        }
        System.out.println("% de pares ingresados: " + ((contadorPares / (float)arreglo.length) * 100 + "%"));
        if(contadorPares == 0){
            System.out.println("No hay pares"); 
        }
        
        imprimirArreglo(arreglo);
        bubleSortMejorado(arreglo);//ordena el arreglo
        
        //from arregloReves
        if(contadorPositivos == 0){
            System.out.println("No hay positivos"); 
        }else{            
            for (int i = arreglo.length-1; i >= 0 ; i--) {
               if(arreglo[i] > 0){
                System.out.println("arreglo[" + i + "] = " + arreglo[i]);
               }
            }
        }
    }
}
