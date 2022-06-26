package Seleccion;

public class Masajista extends SeleccionFutbol{

    //elelemntos propios
    private String registroSalud;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String registroSalud, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.registroSalud = registroSalud;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getRegistroSalud() {
        return registroSalud;
    }

    public void setRegistroSalud(String registroSalud) {
        this.registroSalud = registroSalud;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public void darMasaje(){
        System.out.println("Dar masaje");
    };

}
