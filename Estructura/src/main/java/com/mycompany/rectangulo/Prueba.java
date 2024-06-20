package com.mycompany.rectangulo;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Prueba {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        // Crear una instancia de Rectangulo con valores predeterminados
        Rectangulo rectangulo1 = new Rectangulo();

        // Imprimir la información del rectángulo con valores predeterminados
        System.out.println("Rectángulo 1 con valores predeterminados:");
        System.out.println(rectangulo1);

        // Crear una instancia de Rectangulo con valores específicos
        Rectangulo rectangulo2 = new Rectangulo(5.0, 10.0);

        // Imprimir la información del rectángulo con valores específicos
        System.out.println("\nRectángulo 2 con valores específicos:");
        System.out.println(rectangulo2);

        // Modificar los atributos del rectángulo
        rectangulo2.setLongitud(7.5);
        rectangulo2.setAnchura(12.5);

        // Imprimir la información del rectángulo después de modificar los atributos
        System.out.println("\nRectángulo 2 después de modificar los atributos:");
        System.out.println(rectangulo2);

        // Intentar establecer un valor inválido
        rectangulo2.setLongitud(25.0);
        System.out.println(rectangulo2);

        rectangulo2.setAnchura(-5.0);
        System.out.println(rectangulo2);       
    }
}

