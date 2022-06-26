import Seleccion.Entrenador;
import Seleccion.Futbolista;
import Seleccion.Masajista;
import Seleccion.SeleccionFutbol;

import java.util.ArrayList;

public class Principal {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
    public static void main(String[] args){

        Entrenador profeLuis = new Entrenador(1, "Luis","Silva",50,"fed12345",15);
        Futbolista Oliver = new Futbolista(2, "Oliver","Avila",25,15,20);
        Masajista Andres = new Masajista(3,"Andres","Saltos",30,"salud12345",5);

        integrantes.add(profeLuis);
        integrantes.add(Oliver);
        integrantes.add(Andres);

        //aplica para todos
        System.out.println("\nIntegrantes");
        for (SeleccionFutbol integrante:integrantes) {
            System.out.println(integrante.getNombre()+" "+integrante.getApellido()+" ");
            integrante.Concentrarse();
        }

        //aplica para entrenador
        System.out.println("\nSolo el entrenador ");
            System.out.println(profeLuis.getNombre()+" "+profeLuis.getApellido()+"--");
            profeLuis.dirigirPartido();

        //aplica para futbolista
        System.out.println("\nSolo el futbolista ");
            System.out.println(Oliver.getNombre()+" "+Oliver.getApellido()+"--");
            Oliver.entrenar();
        //aplica para masajista
        System.out.println("\nSolo el masajista ");
            System.out.println(Andres.getNombre()+" "+Andres.getApellido()+"--");
            Andres.darMasaje();

    }

}
