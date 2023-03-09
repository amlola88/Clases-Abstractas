package org.example;

//Aquí utilizo la herencia.  Tal es el hijo de...
public class ClaseAlta extends Sayayin {

    //Creo los constructores
    //vacio

    public ClaseAlta() {
    }
    //lleno
    public ClaseAlta(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        super(nombre, poderPelea, edad, colorPelo);
    }



    @Override
    public void pelear() {
        System.out.println(this.getNombre()+ " Pelea con elegancia");

    }
}
