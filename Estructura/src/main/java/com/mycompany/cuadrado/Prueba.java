package com.mycompany.cuadrado;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author billy
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        sameSize();
        differentSize();
        withDoor();
    }
    
    public static void sameSize(){
        // Crear instancias de Circulo y Cuadrado
        Circulo circulo = new Circulo(2.0);
        Cuadrado cuadrado = new Cuadrado(6.0);

        // Imprimir la información del círculo y del cuadrado
        System.out.println("Información del Círculo:");
        System.out.println(circulo);

        System.out.println("\nInformación del Cuadrado:");
        System.out.println(cuadrado);
        
        
        double areaColor = cuadrado.calcularArea() - 2 * circulo.calcularArea();
        if(areaColor > 0){
            System.out.println("Área con color: " + areaColor);
        }else{
            System.out.println("No se puede determinar");
        }        
    }
    public static void differentSize(){
        // Crear instancias de Circulo y Cuadrado
        Circulo circulo = new Circulo(2.0);
        Circulo circulo2 = new Circulo(1.0);
        Cuadrado cuadrado = new Cuadrado(6.0);

        // Imprimir la información del círculo y del cuadrado
        System.out.println("Información del Círculo:");
        System.out.println(circulo);
        System.out.println("Información del Círculo 2:");
        System.out.println(circulo2);

        System.out.println("\nInformación del Cuadrado:");
        System.out.println(cuadrado);
        
        
        double areaColor = cuadrado.calcularArea() - circulo.calcularArea() 
                - circulo2.calcularArea();
        if(areaColor > 0){
            System.out.println("Área con color: " + areaColor);
        }else{
            System.out.println("No se puede determinar");
        }        
    }
    public static void withDoor(){
        // Crear instancias de Circulo y Cuadrado
        Circulo circulo = new Circulo(2.0);
        Circulo circulo2 = new Circulo(1.0);
        Cuadrado cuadrado = new Cuadrado(6.0);
        Puerta puerta = new Puerta(1.0, 2.0);

        // Imprimir la información del círculo y del cuadrado
        System.out.println("Información del Círculo:");
        System.out.println(circulo);
        System.out.println("Información del Círculo 2:");
        System.out.println(circulo2);

        System.out.println("\nInformación del Cuadrado:");
        System.out.println(cuadrado);
        System.out.println("\nInformación de la Puerta:");
        System.out.println(puerta);
        
        
        double areaColor = cuadrado.calcularArea() - circulo.calcularArea() 
                - circulo2.calcularArea() - puerta.calcularArea();
        if(areaColor > 0){
            System.out.println("Área con color: " + areaColor);
        }else{
            System.out.println("No se puede determinar");
        }        
    }
}
