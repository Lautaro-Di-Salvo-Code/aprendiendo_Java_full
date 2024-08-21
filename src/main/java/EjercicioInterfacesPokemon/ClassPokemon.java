
package EjercicioInterfacesPokemon;


public class ClassPokemon {
    
    public static void main(String[] args) {
        
        Pikachu pika = new Pikachu();
        pika.setNombrePokemon("Pikachu");
        pika.setSexo(" masculino ");
        pika.setNum_pokedex(3);
        pika.setPesoPokemon(5.6);
//        pika.
        System.out.println("Nombre del poke: " + pika.getNombrePokemon());
        System.out.println("Sexo del poke: "+ pika.getSexo());
        System.out.println("Peso del poke: "+ pika.getPesoPokemon());
        System.out.println("Numero del pokedex: "+ pika.getNum_pokedex());
        System.out.println(pika.atacarPlacaje());
    }
    
}
/*


(Charmander, Bulbasaur y Squirtle) y Pikachu; para ello tener en cuenta que:
Charmander es de tipo fuego, Bulbasaur es de tipo planta, Squirtle es de tipo agua y Pikachu
de tipo eléctrico.

*/