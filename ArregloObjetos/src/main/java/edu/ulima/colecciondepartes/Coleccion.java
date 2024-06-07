package edu.ulima.colecciondepartes;

public class Coleccion {
    private Parte[] partes;
    private int contador;

    public Coleccion() {
        partes = new Parte[30]; // Máximo de 30 partes
        contador = 0;
    }

    public boolean agregarParte(Parte parte) {
        if (contador >= 30) {
            System.out.println("No se pueden agregar más de 30 partes.");
            return false;
        }
        if (buscarPartePorId(parte.getId()) != null) {
            System.out.println("Parte con ID " + parte.getId() + " ya existe en la colección.");
            return false;
        }
        partes[contador] = parte;
        contador++;
        System.out.println("Parte agregada: " + parte);
        return true;
    }

    public Parte buscarPartePorId(String id) {
        for (int i = 0; i < contador; i++) {
            if (partes[i].getId().equals(id)) {
                return partes[i];
            }
        }
        return null;
    }

    public Parte[] getPartes() {
        return partes;
    }

    public int getContador() {
        return contador;
    }
}
