package Ejemplo;

public class Electrodomestico extends Producto {

    private String clasificacion;

    public Electrodomestico(String nombre, int precio, String clasificacion) {
        super(nombre, precio);
        this.clasificacion = clasificacion;
    }

    double calcularPrecioFinal() {
        if (this.clasificacion.equals("A")) {
            return  (getPrecio() * 1.20);
        } else {
            return  getPrecio();
        }
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Clasificacion: " + this.clasificacion);
        System.out.println("Precio fianl: " + calcularPrecioFinal());
    }

}
