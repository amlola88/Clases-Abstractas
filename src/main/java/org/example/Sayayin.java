package org.example;

//Aqui utilizo la palabra reservada abstract, que me permite crear metodos abstractos y ordinarios.
public abstract class Sayayin {

    //Atributos
    private String nombre;
    private Integer poderPelea;
    private Integer edad;
    private String colorPelo;

//Creo getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoderPelea() {
        return poderPelea;
    }

    public void setPoderPelea(Integer poderPelea) {
        this.poderPelea = poderPelea;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    //creo un metodo ordinario
    public void comer(){
        System.out.println("Hola soy Sayayin y como mucho.");

    }
    //Asi creo un metodo para declarar una clase abstracta.  Es una funcion que no estoy implementando solo la llamo, por eso no tiene llaves, solo parentesis.
    public abstract void pelear();

//constructor vacio
    public Sayayin() {
    }
//Constructor lleno
    public Sayayin(String nombre, Integer poderPelea, Integer edad, String colorPelo) {
        this.nombre = nombre;
        this.poderPelea = poderPelea;
        this.edad = edad;
        this.colorPelo = colorPelo;
    }

}
