package edu.ulima.aplicacionacademica;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Prueba {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        Asignatura asignatura = new Asignatura();

        // Crear algunos alumnos
        Alumno alumno1 = new Alumno("Juan", "Perez", "A001", 18.5);
        Alumno alumno2 = new Alumno("Maria", "Gomez", "A002", 15.0);
        Alumno alumno3 = new Alumno("Luis", "Ramirez", "A003", 19.0);

        // Registrar alumnos en la asignatura
        asignatura.registrarAlumno(alumno1);
        asignatura.registrarAlumno(alumno2);
        asignatura.registrarAlumno(alumno3);

        // Consultar un alumno por código
        Alumno alumnoConsultado = asignatura.consultarAlumnoPorCodigo("A002");
        if (alumnoConsultado != null) {
            System.out.println("Alumno encontrado: " + alumnoConsultado);
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}
