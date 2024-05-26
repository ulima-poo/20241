package edu.ulima.gestionnotas;

import java.util.Arrays;
import java.util.Random;

public class GestionNotas {
    private Alumno refAlum;
    private int[] notas;
    private float prom;
    private static final int NOTA_MAX = 20;

    // Constructor con parámetro
    public GestionNotas(Alumno refAlum) {
        this.refAlum = refAlum;
        this.notas = new int[6];
        this.prom = 0;
    }

    // Métodos getter
    public float getProm() {
        return prom;
    }

    public Alumno getRefAlum() {
        return refAlum;
    }

    public int[] getNotas() {
        return notas;
    }

    // Método para generar aleatoriamente las 6 notas del alumno
    public void generarNotas() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextInt(NOTA_MAX + 1); // Notas entre 0 y 20
        }
    }
    // Método para calcular el promedio de las 5 mejores notas
    public void calcularProm() {
        int suma = 0;
        int minNota = NOTA_MAX + 1;
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] < minNota) {
                minNota = notas[i];
            }
        }
        
        suma -= minNota; // Excluir la menor nota de la suma
        this.prom = suma / 5.0f;
    }

    // Método que retorna la concatenación de toda la información
    public String informacionCompleta() {
        return "Alumno: " + refAlum.getNombre() +
               " (Código: " + refAlum.getCod() + ")\n" +
               "Notas: " + Arrays.toString(notas) + "\n" +
               "Promedio: " + String.format("%.2f", prom) + "\n";
    }
}
