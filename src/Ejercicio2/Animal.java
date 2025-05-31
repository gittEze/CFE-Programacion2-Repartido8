package Ejercicio2;

public class Animal {

    private String nombre;
    private int edad;
    private String especie;

    public Animal(String nombre, int edad, String especie) {
      this.nombre = nombre;
      this.edad = edad;
      this.especie = especie;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " // Edad: " + this.edad + " años " + " // Especie: " + this.especie;
    }
}
