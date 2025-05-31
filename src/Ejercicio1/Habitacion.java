package Ejercicio1;

public class Habitacion {

    private int numero;
    private String tipo;
    private double precioBase;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precio;
    }

    public void calcularPrecioFinal(int dias) {
        System.out.println("Precio final por la estadía");
    }

    public int getNumero() {
        return this.numero;
    }
    public String getTipo() {
        return this.tipo;
    }
    public double getPrecioBase() {
        return this.precioBase;
    }

    public void mostrarDetalle() {
        System.out.println("El numero de la habitacion es: " + getNumero());
        System.out.println("El tipo de habitacion es: " + getTipo());
        System.out.println("El precio base de la habitacion es: " + getPrecioBase());
    }
}
