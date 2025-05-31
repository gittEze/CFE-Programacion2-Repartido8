package Ejercicio3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        // 1. Crear arrays de 3 campeones para cada equipo
        Campeon[] equipo1 = new Campeon[3];
        Campeon[] equipo2 = new Campeon[3];

        // 2. Instanciar campeones y asignarlos manualmente a los arrays
        equipo1[0] = new TopLaner("Garen", "Top", 80, 70, 40, 30);
        equipo1[1] = new ADC("Jinx", "Mid", 70,50,60,40);
        equipo1[2] = new MidLaner("Ahri", "ADC", 85,45,75,35);

        equipo2[0] = new Jungla("Lee Sin", "Jungla", 70,60,65,45);
        equipo2[1] = new Support("Thresh", "Support",40,80,30,50);
        equipo2[2] = new MidLaner("Lux", "Mid",68,55,60,38);

        // 3. Mostrar info inicial
        System.out.println("EQUIPO 1:");
        for (Campeon c : equipo1) c.mostrarInfo();
        System.out.println("EQUIPO 2:");
        for (Campeon c : equipo2) c.mostrarInfo();

        while (equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)) {
            Campeon atacante = obtenerVivoAleatorio(equipo1, rand);
            Campeon defensor = obtenerVivoAleatorio(equipo2, rand);
            if (atacante != null && defensor != null) {
                int danio = rand.nextBoolean() ? atacante.atacar() : atacante.ataqueEspecial();
                if (atacante instanceof Support) {
                    int curacionAnterior = atacante.salud;
                    ((Support) atacante).ataqueEspecial();
                    int curacionRecibida = atacante.salud - curacionAnterior;
                    if (curacionRecibida > 0) {
                        System.out.print("\033[32m");
                        System.out.println(atacante.nombre + " se cura por " + curacionRecibida + ". Salud: " + atacante.salud + "% " + atacante.generarBarraVida());
                        System.out.print("\033[0m");
                    }
                }
                defensor.recibirDanio(danio);
                System.out.print("\033[31m");
                System.out.println(atacante.nombre + " ataca a " + defensor.nombre + " por " + danio + " de daño. Salud de " + defensor.nombre + ": " + defensor.salud + "% " + defensor.generarBarraVida());
                System.out.print("\033[0m");
            }
        }

        // Mostrar equipo ganador
        if (equipoSigueVivo(equipo1)) {
            System.out.println("Ganador: EQUIPO 1");
        } else {
            System.out.println("Ganador: EQUIPO 2");
        }
    }

    public static boolean equipoSigueVivo(Campeon[] equipo) {
        for (Campeon c : equipo) {
            if (c != null && c.salud > 0) return true;
        }
        return false;
    }

    public static Campeon obtenerVivoAleatorio(Campeon[] equipo, Random rand) {
        int vivosCount = 0;
        for (Campeon c : equipo) {
            if (c != null && c.salud > 0) vivosCount++;
        }
        if (vivosCount == 0) return null;
        int index = rand.nextInt(vivosCount);
        for (Campeon c : equipo) {
            if (c != null && c.salud > 0) {
                if (index == 0) return c;
                index--;
            }
        }
        return null;
    }
}
