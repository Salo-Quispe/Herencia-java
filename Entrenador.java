package Seleccion;

public class Entrenador extends SeleccionFutbol {

    //elementos propios
    private String idFederacion;
    private int experienciaEntrenador;

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion, int experienciaEntrenador) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
        this.experienciaEntrenador = experienciaEntrenador;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public int getExperienciaEntrenador() {
        return experienciaEntrenador;
    }

    public void setExperienciaEntrenador(int experienciaEntrenador) {
        this.experienciaEntrenador = experienciaEntrenador;
    }

    public void dirigirPartido(){
        System.out.println("Dirigir partido");
    }
    public void dirigirEntrenamiento(){
        System.out.println("Dirigir entrenamiento");
    }

}
