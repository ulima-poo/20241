package edu.ulima.granja;

import java.util.Random;
import java.util.Scanner;

public class Granja {
    private String nombGranja;
    private float area;
    private Pollo[] pollitos;
    private int num;

    public Granja(String nombGranja, float area) {
        this.nombGranja = nombGranja;
        this.area = area;
        this.pollitos = new Pollo[10];
        this.num = 0;
    }

    public void ingresarTodosLosPollos() {
        Scanner scanner = new Scanner(System.in);
        while (num < pollitos.length) {
            System.out.println("Ingrese nombre del pollito:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese peso del pollito:");
            float peso = scanner.nextFloat();
            System.out.println("Ingrese tiempo en días del pollito:");
            int tiempoDias = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea
            pollitos[num] = new Pollo(nombre, peso, tiempoDias);
            num++;
        }
    }

    public void ingresarUnPollo(Pollo refP) {
        if (num < pollitos.length) {
            pollitos[num] = refP;
            num++;
        } else {
            System.out.println("No hay espacio disponible para más pollitos.");
        }
    }

    public Pollo sortearPollo() {
        if (num == 0) {
            System.out.println("No hay pollitos registrados.");
            return null;
        }
        Random random = new Random();
        int indice = random.nextInt(num);
        return pollitos[indice];
    }

    public Pollo buscarPolloPorNombre(String nomb) {
        for (int i = 0; i < num; i++) {
            if (pollitos[i].getNombre().equalsIgnoreCase(nomb)) {
                return pollitos[i];
            }
        }
        System.out.println("No se encontró un pollito con el nombre: " + nomb);
        return null;
    }

    public String concatGranja() {
        String infoGranja = "Granja: " + nombGranja + ", Área: " + area + "\n";
        for (int i = 0; i < num; i++) {
            infoGranja += pollitos[i].toString() + "\n";
        }
        return infoGranja;
    }

    // Getters and Setters
    public String getNombGranja() {
        return nombGranja;
    }

    public void setNombGranja(String nombGranja) {
        this.nombGranja = nombGranja;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Pollo[] getPollitos() {
        return pollitos;
    }

    public void setPollitos(Pollo[] pollitos) {
        this.pollitos = pollitos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
