package Seleccion;

public class Futbolista extends SeleccionFutbol{

    //elementos propios
    private int velocidad;
    private int resistencia;

    public Futbolista(int id, String nombre, String apellido, int edad, int velocidad, int resistencia) {
        super(id, nombre, apellido, edad);
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public void jugarPartido(){
        System.out.println("Jugar partido");
    }
    public void entrenar(){
        System.out.println("Entrenar");
    }
}
