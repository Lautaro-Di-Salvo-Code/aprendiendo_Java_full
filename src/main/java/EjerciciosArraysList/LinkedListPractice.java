package EjerciciosArraysList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {

         List<ArrayClassPractice> arregloLista = new LinkedList<ArrayClassPractice>();

        arregloLista.add(  new ArrayClassPractice("Santiago", 25, 42.3));
        arregloLista.add(  new ArrayClassPractice("Roberto", 50, 65.8));
        arregloLista.add(  new ArrayClassPractice("Matias", 30, 56.8));
        arregloLista.add(0,   new ArrayClassPractice("Lautaro", 80, 65.8));


        for (ArrayClassPractice valor : arregloLista ) {



            System.out.println("esto es lo que contiene el array: "+ valor.getNombre());
            System.out.println("esto es lo que contiene el array: "+ valor.getCifra());
            System.out.println("esto es lo que contiene el array: "+ valor.getPrecio());

        }


    }

    }


