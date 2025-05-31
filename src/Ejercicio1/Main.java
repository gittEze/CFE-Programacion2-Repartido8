package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        HabitacionEstandar habitacion1 = new HabitacionEstandar(15,50);
        HabitacionSuite habitacion2 = new HabitacionSuite(29,50);
        HabitacionSuitePresidencial habitacion3 = new HabitacionSuitePresidencial(33,50);

        System.out.println();


        habitacion1.mostrarDetalle();
        System.out.println("--------------------------------------------------");
        habitacion1.calcularPrecioFinal(6);
        System.out.println();

        habitacion2.mostrarDetalle();
        System.out.println("--------------------------------------------------");
        habitacion2.calcularPrecioFinal(6);
        System.out.println();

        habitacion3.mostrarDetalle();
        System.out.println("--------------------------------------------------");
        habitacion3.calcularPrecioFinal(6);
        System.out.println();

        // El .toString() es un metodo que muestra la info que le coloques y no las coordenadas de la clase
    }
}
