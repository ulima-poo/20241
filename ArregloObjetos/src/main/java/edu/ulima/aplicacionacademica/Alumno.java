package edu.ulima.aplicacionacademica;

public class Alumno {
    private String nombres;
    private String apellidos;
    private String codigoAlumno;
    private double notaFinal;

    public Alumno(String nombres, String apellidos, String codigoAlumno, double notaFinal) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigoAlumno = codigoAlumno;
        setNotaFinal(notaFinal); // Usamos el setter para validar la nota
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 20) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("La nota final debe estar entre 0 y 20.");
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", codigoAlumno='" + codigoAlumno + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
