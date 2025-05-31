package Ejercicio3;

public class TopLaner extends Campeon {

    protected int resistencia;

    public TopLaner(String nombre, String rol, int ataque, int defensa, int velocidad, int resistencia) {
        super(nombre, rol, ataque, defensa, velocidad);
        this.resistencia = resistencia;
    }

    @Override
    public int atacar() {
        return super.atacar();
    }

    @Override
    public int ataqueEspecial() {
        return super.ataqueEspecial();
    }

    @Override
    public void recibirDanio(int danio) {
        int danioFinal = danio - (resistencia / 10);
        super.recibirDanio(danio);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Restistencia: " + this.resistencia);
    }
}
