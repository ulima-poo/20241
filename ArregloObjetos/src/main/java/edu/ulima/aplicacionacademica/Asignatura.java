package edu.ulima.aplicacionacademica;

public class Asignatura {
    private Alumno[] alumnos;
    private int contador;

    public Asignatura() {
        alumnos = new Alumno[30];
        contador = 0;
    }

    public void registrarAlumno(Alumno alumno) {
        if (contador < 30) {
            alumnos[contador] = alumno;
            contador++;
        } else {
            System.out.println("No hay espacio disponible para más pacientes.");
        }
    }

    public Alumno consultarAlumnoPorCodigo(String codigoAlumno) {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].getCodigoAlumno().equals(codigoAlumno)) {
                return alumnos[i];
            }
        }
        return null; // Si no se encuentra el alumno
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public int getContador() {
        return contador;
    }
}
