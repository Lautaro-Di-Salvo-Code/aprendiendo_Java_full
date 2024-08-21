
package EjercicioInterfacesPokemon;

public abstract class  AbstractPokemon {
    
    protected String sexo, nombrePokemon;
    protected int num_pokedex, temporadaQueAparece ;
    protected double pesoPokemon;

    public AbstractPokemon() {
    }
    public AbstractPokemon(String sexo, String nombrePokemon,
            int num_pokedex, int temporadaQueAparece,
            double pesoPokemon) {
        this.sexo = sexo;
        this.nombrePokemon = nombrePokemon;
        this.num_pokedex = num_pokedex;
        this.temporadaQueAparece = temporadaQueAparece;
        this.pesoPokemon = pesoPokemon;
    }

    public abstract String atacarPlacaje();
    public abstract String atacarArañazo();
    public abstract String atacarMordisco();
}
