package edu.ulima.colecciondepartes;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Prueba {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        Coleccion coleccion = new Coleccion();

        // Crear algunas partes
        Parte parte1 = new Parte("P001", "Motor");
        Parte parte2 = new Parte("P002", "Transmisión");
        Parte parte3 = new Parte("P003", "Filtro de aire");

        // Agregar partes a la colección
        coleccion.agregarParte(parte1);
        coleccion.agregarParte(parte2);
        coleccion.agregarParte(parte3);

        // Intentar agregar una parte con el mismo ID
        Parte parteDuplicada = new Parte("P001", "Radiador");
        coleccion.agregarParte(parteDuplicada);

        // Buscar una parte por ID
        Parte parteBuscada = coleccion.buscarPartePorId("P002");
        if (parteBuscada != null) {
            System.out.println("Parte encontrada: " + parteBuscada);
        } else {
            System.out.println("Parte no encontrada.");
        }
    }
}
