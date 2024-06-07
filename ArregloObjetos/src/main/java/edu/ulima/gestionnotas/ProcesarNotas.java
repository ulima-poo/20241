package edu.ulima.gestionnotas;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ProcesarNotas {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del alumno
        System.out.print("Ingrese el código del alumno: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        // Crear objeto Alumno
        Alumno objAlumno = new Alumno(codigo, nombre);

        // Crear objeto GestionNotas
        GestionNotas gestionNotas = new GestionNotas(objAlumno);

        // Generar las 6 notas y calcular el promedio
        gestionNotas.generarNotas();
        gestionNotas.calcularProm();

        // Mostrar toda la información
        System.out.println(gestionNotas.informacionCompleta());
        
        scanner.close();
    }
}
