
package PracticaClasesAbstractas_interfaces;

public abstract class Animal {
        protected String nombre;
        protected int edad;

    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
        
     public abstract String hacer_sonido();   
     public abstract String moverse();   
}
