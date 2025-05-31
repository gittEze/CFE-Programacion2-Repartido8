package Herencia;

public class Figura {

    private String nombre;  //Si no se coloca el "private antes del atributo, por defecto queda en publico.

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void calcularArea() {
        System.out.println("Figura no definida.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
