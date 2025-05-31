package Ejercicio3;

public class Campeon {

    protected String nombre;
    protected String rol;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int salud;

    public Campeon(String nombre, String rol, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.ataque = ataque;
        this.velocidad = velocidad;
        this.salud = 100;
    }

    public int atacar() {
        return (ataque + velocidad) / 2;
    }

    public int ataqueEspecial() {
        return (ataque + defensa) / 2;
    }

    public void recibirDanio(int danio) {
        if (this.salud < 0) {
            System.out.println("El rival esta muerto.");
        } else {
            this.salud -= danio;
        }
    }

    public void mostrarInfo() {
        System.out.println("Campeon");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Rol: " + this.rol);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("Salud: " + this.salud);
    }

    @Override
    public String toString() {
        String barraVida = generarBarraVida();
        return salud + "% " + barraVida + "}";
    }

    String generarBarraVida() {
        int longitudTotal = 11;
        int saludProporcional = (salud * longitudTotal) / 100;
        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < longitudTotal - 1; i++) {
            if (i < saludProporcional) {
                barra.append("#");
            } else {
                barra.append("-");
            }
        }
        barra.append("] ").append(salud).append("%");
        return barra.toString();
    }
}


