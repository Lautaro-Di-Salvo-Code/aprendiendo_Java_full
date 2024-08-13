
package HerenciaEjercicio_y_polimorfismo;

import java.util.Scanner;


public class PolimorfismoPractica {
    public static void main(String[] args) {
        Persona poli_persona[] = new Persona[3];
        
       poli_persona[0] = new Empleado("juana remiseria", 43543543, 1, 434554454,543553533, "Juana", "Rodriguez", "godoy cruz");
       poli_persona[1] = new Consultor();
       
       
        for (Persona e : poli_persona) {
            System.out.println("Datos persona: "+ e);
        }
    }
}
