/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pelota;

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
        Pelota pelotal = new Pelota("rosado", 3.0);
        Pelota pelota2 = new Pelota("azul", 4.0);
        System.out.printf("La pelota 1 es de %s.\n", pelotal.saberGenero());
        System.out.printf("La pelota 2 es de %s.\n", pelota2.saberGenero());
        pelotal.setColor("verde");
        System.out.printf("La pelota 1 es de %s. \n", pelotal.saberGenero());
    }
}
