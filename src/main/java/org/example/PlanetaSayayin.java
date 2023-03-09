package org.example;

public class PlanetaSayayin {
    public static void main(String[] args) {

        //Creando un objeto de clase alta
        ClaseAlta guerrero1 =new ClaseAlta("Vegeta", 90, 30,"negro");
        guerrero1.pelear();

        //Creando un objeto de clase baja
        ClaseBaja guerrero2 = new ClaseBaja("Goku",80,20,"negro");
        guerrero2.pelear();
    }
}