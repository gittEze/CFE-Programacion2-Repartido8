package Ejercicio3;

public class ADC extends Campeon {

    protected int rango;

    public ADC(String nombre, String rol, int ataque, int defensa, int velocidad, int rango) {
        super(nombre, rol, ataque, defensa, velocidad);
        this.rango = rango;
    }

    @Override
    public int atacar() {
        return super.atacar() + (rango / 4);
    }

    @Override
    public int ataqueEspecial() {
        return super.ataqueEspecial();
    }

    @Override
    public void recibirDanio(int danio) {
        super.recibirDanio(danio);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rango: " + this.rango);
    }
}

