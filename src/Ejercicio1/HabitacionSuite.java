package Ejercicio1;

public class HabitacionSuite extends Habitacion{

    public HabitacionSuite(int numero, double precioBase) {
        super(numero, "Suite", precioBase);
    }

    public void calcularPrecioFinal(int dias) {
        System.out.println("Precio final por una estadia de " + dias + " dias es: $" + (this.getPrecioBase() * 1.2 * dias));
    }
}
