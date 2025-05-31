package Ejemplo;

public class Main {
    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico("Heladera",2000, "A");
        Electrodomestico e2 = new Electrodomestico("Licuadora",1000,"B");

        e1.mostrarDetalle();
        System.out.println();
        e2.mostrarDetalle();
    }
}
