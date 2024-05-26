package edu.ulima.divercity;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Prueba {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        // Crear una instancia de DiverCity en Perú
        DiverCity diverCityPeru = new DiverCity("Perú");

        // Crear ciudadanos
        Ciudadano c1 = new Ciudadano(1, 10, "Juan", "Perez");
        Ciudadano c2 = new Ciudadano(2, 12, "Maria", "Lopez");
        Ciudadano c3 = new Ciudadano(3, 8, "Carlos", "Gomez");

        // Ingresar ciudadanos
        diverCityPeru.ingresarCiudadano(c1);
        diverCityPeru.ingresarCiudadano(c2);
        diverCityPeru.ingresarCiudadano(c3);

        // Mostrar información de todos los ciudadanos
        System.out.println(diverCityPeru.getDetalleTC());

        // Sortear un ciudadano
        Ciudadano sorteado = diverCityPeru.sortearCiudadano();
        if (sorteado != null) {
            System.out.println("Ciudadano sorteado: " + sorteado);
        }

        // Buscar un ciudadano por CUI
        int cuiBusqueda = 2;
        Ciudadano encontrado = diverCityPeru.buscarCiu(cuiBusqueda);
        if (encontrado != null) {
            System.out.println("Ciudadano encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró un ciudadano con el CUI: " + cuiBusqueda);
        }
    }
}
