package edu.ulima.granja;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class UnDiaEnLaGranja {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        // Crear la granja
        Granja granja = new Granja("Granja de Pollos", 150.0f);
        
        // Ingresar pollitos a la granja
        Pollo p1 = new Pollo("Pollo1", 1.5f, 10);
        Pollo p2 = new Pollo("Pollo2", 1.8f, 12);
        Pollo p3 = new Pollo("Pollo3", 2.0f, 8);
        Pollo p4 = new Pollo("Pollo4", 1.2f, 5);
        Pollo p5 = new Pollo("Pollo5", 1.7f, 15);

        granja.ingresarUnPollo(p1);
        granja.ingresarUnPollo(p2);
        granja.ingresarUnPollo(p3);
        granja.ingresarUnPollo(p4);
        granja.ingresarUnPollo(p5);

        // Mostrar la información de la granja
        System.out.println(granja.concatGranja());

        // Sortear un pollo aleatoriamente
        Pollo sorteado = granja.sortearPollo();
        if (sorteado != null) {
            System.out.println("Pollito sorteado: " + sorteado);
        }

        // Buscar un pollo por nombre
        String nombreBusqueda = "Pollo3";
        Pollo encontrado = granja.buscarPolloPorNombre(nombreBusqueda);
        if (encontrado != null) {
            System.out.println("Pollito encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró un pollito con el nombre: " + nombreBusqueda);
        }

        // Mostrar la información de la granja después de las operaciones
        System.out.println(granja.concatGranja());
    }
}
