package edu.ulima.divercity;

import java.util.Random;

public class DiverCity {
    private String pais;
    private Ciudadano[] personas;
    private int numC;

    public DiverCity(String pais) {
        this.pais = pais;
        this.personas = new Ciudadano[30];
        this.numC = 0;
    }

    public void ingresarCiudadano(Ciudadano refC) {
        if (numC >= 30) {
            System.out.println("No hay espacio disponible para más ciudadanos.");
            return;
        }
        if (buscarCiu(refC.getCui()) != null) {
            System.out.println("Error: El CUI ya está registrado.");
            return;
        }
        personas[numC] = refC;
        numC++;
    }

    public Ciudadano buscarCiu(int cui) {
        for (int i = 0; i < numC; i++) {
            if (personas[i].getCui() == cui) {
                return personas[i];
            }
        }
        return null;
    }

    public Ciudadano sortearCiudadano() {
        if (numC == 0) {
            System.out.println("No hay ciudadanos registrados.");
            return null;
        }
        Random random = new Random();
        int indice = random.nextInt(numC);
        return personas[indice];
    }

    public String getDetalleTC() {
        String info = "País: " + pais + "\n";
        for (int i = 0; i < numC; i++) {
            info += personas[i].toString() + "\n";
        }
        return info;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Ciudadano[] getPersonas() {
        return personas;
    }

    public void setPersonas(Ciudadano[] personas) {
        this.personas = personas;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }
}
