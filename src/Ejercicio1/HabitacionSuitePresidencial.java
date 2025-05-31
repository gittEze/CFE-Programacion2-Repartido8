package Ejercicio1;

public class HabitacionSuitePresidencial extends Habitacion {

    public HabitacionSuitePresidencial(int numero, double precioBase) {
        super(numero, "Suite Presidencial", precioBase);
    }

    public void calcularPrecioFinal(int dias) {
        double total = (this.getPrecioBase() * 1.5 * dias);
        if (dias > 5) {
            total = total - (total * 0.10);
        }
        System.out.println("Precio final por una estadia de " + dias + " dias es: $" + (total));
    }

}
