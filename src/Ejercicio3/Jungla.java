package Ejercicio3;

public class Jungla extends Campeon {

     protected int controlMapa;

     public Jungla(String nombre, String rol, int ataque, int defensa, int velocidad, int controlMapa) {
         super(nombre, rol, ataque, defensa, velocidad);
         this.controlMapa = controlMapa;
     }

    @Override
    public int atacar() {
        return super.atacar();
    }

    @Override
     public int ataqueEspecial() {
         return super.ataqueEspecial() +  (controlMapa / 5);
     }

    @Override
    public void recibirDanio(int danio) {
        super.recibirDanio(danio);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Control: " + this.controlMapa);
    }
}
