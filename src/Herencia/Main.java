package Herencia;

import jdk.jfr.consumer.RecordedThreadGroup;

public class Main {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado("Cuadrado", 15);
        c1.calcularArea();

        Rectangulo r1 = new Rectangulo("Rectangulo",10,5);
        r1.calcularArea();

        Figura f1 = new Figura("Figura");
        System.out.println(f1.toString());

    }
}
