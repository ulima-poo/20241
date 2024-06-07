package edu.ulima.salarios;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PruebaGestionEmpleado {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        GestionEmpleado gestion = new GestionEmpleado();
        gestion.ingresarDatos();
        gestion.ingresarDatos();
        gestion.buscarEmpleado();
    }
}
