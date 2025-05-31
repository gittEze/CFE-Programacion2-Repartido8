package Ejercicio1;

public class HabitacionEstandar extends Habitacion {

    public HabitacionEstandar(int numero, double precioBase) {
        super(numero, "Estandar", precioBase);
    }

    @Override
    public void calcularPrecioFinal(int dias) {
        System.out.println("Precio final por una estadia de " + dias + " dias es: $" + (this.getPrecioBase() * dias));
    }
}
