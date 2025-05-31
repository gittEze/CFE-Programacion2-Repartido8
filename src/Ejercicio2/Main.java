package Ejercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //tipo arr - nombre array
        Animal[] animales = new Animal[3];
        animales[0] = new Perro("Pedro", 8, "Labrador");
        animales[1] = new Gato("Juancha", 4, "Blanco");
        animales[2] = new Conejo("Pedrito", 2, 1.22);

        for (int i = 0; i<animales.length; i++) {
            System.out.println(Arrays.toString(animales));
        }


    }
}
