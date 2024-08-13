
package HerenciaEjercicio2;

public class MainHerencia {
    public static void main(String[] args) {
        String name, apellido, domicilio;
        Consultor extension = new Consultor();
        
        extension.setNombre("Rodrigo");
        extension.setApellido("Di Salvo");
        name = extension.getNombre();
        apellido = extension.getApellido();
        
        System.out.println("Su nombre es "+ name);
        System.out.println("De apellido: "+ apellido);
    }
}
