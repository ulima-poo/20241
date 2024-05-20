/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matricula;

/**
 *
 * @author Lucinda
 */
public class Matricula {

    public static void main(String[] args) {
        AlumnoFIS alumno1 = new AlumnoFIS("Yadhira", "20214190", 18, 423);
        AlumnoFIS alumno2 = new AlumnoFIS("Jorge", "20214195", 16, 413);
        
        System.out.println("Pension total: "+alumno1.calcularMontoTotalCiclo());
        System.out.println("Pension total: "+alumno2.calcularMontoTotalCiclo());
        
        System.out.println(alumno1.getDatosAlumno());
        System.out.println(alumno2.getDatosAlumno());
    }
}
