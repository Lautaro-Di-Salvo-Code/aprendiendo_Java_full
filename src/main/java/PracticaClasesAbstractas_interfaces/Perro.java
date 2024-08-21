
package PracticaClasesAbstractas_interfaces;


public class Perro extends Animal {

    public Perro() {
    }
    
    @Override
    public String hacer_sonido() {
        return "El perro ladra";
    }

    @Override
    public String moverse() {
           return "Camina con sus patas por el suelo o corre";
    }
    
}
