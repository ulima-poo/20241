package edu.ulima.clinica;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Principal {
    public static void main(String[] args) throws UnsupportedEncodingException{
        System.setOut(new PrintStream(System.out, true, "UTF8"));
        // Crear la clínica
        Clinica clinica = new Clinica();

        // Crear y registrar pacientes
        Paciente p1 = new Paciente("Juan Perez", 80.0, 1.75);
        Paciente p2 = new Paciente("Maria Lopez", 90.0, 1.60);
        Paciente p3 = new Paciente("Carlos Gomez", 120.0, 1.70);
        Paciente p4 = new Paciente("Ana Torres", 60.0, 1.50);

        clinica.ingresarPaciente(p1);
        clinica.ingresarPaciente(p2);
        clinica.ingresarPaciente(p3);
        clinica.ingresarPaciente(p4);

        // Mostrar todos los pacientes
        System.out.println("Lista de todos los pacientes:");
        System.out.println(clinica.getDetallePacientes());

        // Mostrar pacientes obesos
        System.out.println("Lista de pacientes con observación 'obeso':");
        System.out.println(clinica.getDetallePacientesObesos());
    }
}
