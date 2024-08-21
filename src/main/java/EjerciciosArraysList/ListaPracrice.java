
package EjerciciosArraysList;

import java.util.ArrayList;
import java.util.List;


public class ListaPracrice {
    
    public static void main(String[] args) {
    List<ArrayClassPractice> arregloLista = new ArrayList<> ();
    List<ArrayClassPractice> arregloLista2 = new ArrayList<> ();
    
    
        arregloLista.add( new ArrayClassPractice(" Roberto ", 23, 34.5));
        arregloLista2.add(new ArrayClassPractice(" Matias ", 45, 10.5));
        
        for (ArrayClassPractice arrayClassPractice : arregloLista) {
            System.out.println("El arreglo contiene: " 
                    + arrayClassPractice.getNombre()
                    + " cifra: "+ arrayClassPractice.getCifra()+ " Precio: "
                    +arrayClassPractice.getPrecio());
        }
        for (ArrayClassPractice arrayClassPractice : arregloLista2) {
            System.out.println("El arreglo contiene: " 
                    + arrayClassPractice.getNombre()
                    + " cifra: "+ arrayClassPractice.getCifra()+ " Precio: "
                    +arrayClassPractice.getPrecio());
        }
        
        
    }
    
}
