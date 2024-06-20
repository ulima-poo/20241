/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.libro;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author billy
 */
public class Prueba {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        // Crear una instancia de Libro
        Libro libro1 = new Libro("L001", "Cien Años de Soledad", "Gabriel Garcia Marquez");

        // Establecer el precio unitario del libro
        libro1.setPrecioUnitario(20.0);

        // Generar aleatoriamente las unidades vendidas
        libro1.generarUnidadesVendidas();

        // Imprimir la información de la venta
        System.out.println(libro1.obtenerInformacionVenta());

        // Crear otra instancia de Libro
        Libro libro2 = new Libro("L002", "Don Quijote de la Mancha", "Miguel de Cervantes");

        // Establecer el precio unitario del libro
        libro2.setPrecioUnitario(25.0);

        // Generar aleatoriamente las unidades vendidas
        libro2.generarUnidadesVendidas();

        // Imprimir la información de la venta
        System.out.println("\n" + libro2.obtenerInformacionVenta());
    }
}
