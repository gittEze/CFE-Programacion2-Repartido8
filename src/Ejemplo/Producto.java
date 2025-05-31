package Ejemplo;

public class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void mostrarDetalle(){
        System.out.println("PRODUCTO");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
    }
}
