
package EjerciciosArraysList;

import java.util.ArrayList;
import java.util.List;


public class ArrayListPracrice {

    public static void main(String[] args) {
    List<ArrayClassPractice> arregloLista = new ArrayList<> ();
    List<ArrayClassPractice> arregloLista2 = new ArrayList<> ();
    List<ArrayClassPractice> arregloLista3 = new ArrayList<> ();
//        arregloLista3.

        arregloLista.add( new ArrayClassPractice(" Roberto ", 23, 34.5));
        arregloLista2.add(new ArrayClassPractice(" Matias ", 45, 10.5));
        arregloLista3.add(new ArrayClassPractice(" Lautaro ", 26, 50.3));

        for (ArrayClassPractice arrayClassPractice : arregloLista) {
            System.out.println("El arreglo contiene=> "
                    + arrayClassPractice.getNombre()
                    + " edad: "+ arrayClassPractice.getCifra()+ " Precio: "
                    +arrayClassPractice.getPrecio());
        }


    for (ArrayClassPractice index  : arregloLista2 ) {
        System.out.println(index.getNombre());
    }

    }
}