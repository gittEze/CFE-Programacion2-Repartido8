package Ejercicio3;

public class Support extends Campeon {

    protected int curacion;

    public Support(String nombre, String rol, int ataque, int defensa, int velocidad, int curacion) {
        super(nombre, rol, ataque, defensa, velocidad);
        this.curacion = curacion;
    }

    @Override
    public int atacar() {
        return super.atacar();
    }

    public int ataqueEspecial() {
        int curacionRecibida = curacion / 10;
        if (salud + curacionRecibida <= 100) {
            salud += curacionRecibida;
        } else {
            salud = 100;
        }
        return curacionRecibida;
    }

    @Override
    public void recibirDanio(int danio) {
        super.recibirDanio(danio);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Curacion: " + this.curacion);
    }
}
