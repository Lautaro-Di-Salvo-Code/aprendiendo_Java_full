
package EjerciciosArraysList;

import java.util.ArrayList;
import java.util.List;


public class ListaPracrice {
    
    public static void main(String[] args) {
    List<ArrayClassPractice> arregloLista = new ArrayList<> ();
    List<ArrayClassPractice> arregloLista2 = new ArrayList<> ();
    List<ArrayClassPractice> arregloLista3 = new ArrayList<> ();


        arregloLista.add( new ArrayClassPractice(" Roberto ", 23, 34.5));
        arregloLista2.add(new ArrayClassPractice(" Matias ", 45, 10.5));
        arregloLista3.add(new ArrayClassPractice(" Lautaro ", 26, 50));

        for (ArrayClassPractice arrayClassPractice : arregloLista) {
            System.out.println("El arreglo contiene: " 
                    + arrayClassPractice.getNombre()
                    + " cifra: "+ arrayClassPractice.getCifra()+ " Precio: "
                    +arrayClassPractice.getPrecio());
        }
        for (ArrayClassPractice arrayClassPractice : arregloLista2) {
            System.out.println("El arreglo2 contiene: "
                    + arrayClassPractice.getNombre()
                    + " cifra: "+ arrayClassPractice.getCifra()+ " Precio: "
                    +arrayClassPractice.getPrecio());
        } for (ArrayClassPractice arrayClassPractice : arregloLista3) {
            System.out.println("El arreglo3 contiene: "
                    + arrayClassPractice.getNombre()
                    + " cifra: "+ arrayClassPractice.getCifra()+ " Precio: "
                    +arrayClassPractice.getPrecio());
        }
        
        
    }
    
}
