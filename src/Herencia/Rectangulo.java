package Herencia;

public class Rectangulo extends Figura {

    private int largo;
    private int ancho;

    public Rectangulo (String nombre, int largo, int ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del Rectangulo es : " + (this.largo * this.ancho));
    }
}
