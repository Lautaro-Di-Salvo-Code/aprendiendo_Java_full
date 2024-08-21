/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaClasesAbstractas_interfaces;


public class Pajaro extends Animal {
//    tendria que tener variables declaradas protejidas
//    protected String valor;
    public Pajaro() {
    }

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }
     
    @Override
    public String hacer_sonido() {
        return "Hace pio pio desde su pico";
    }

    @Override
    public String moverse() {
        return "Se mueve caminando con sus pequeñas patas o vuela con sus alas";
    }
    
}
