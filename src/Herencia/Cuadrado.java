package Herencia;

public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(String nombre, int lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override       //El @Override te sirve para ver si el metodo es igual al original
    public void calcularArea() {
        System.out.println("El area del cuadrado es: " + (this.lado * this.lado));
    }
}
