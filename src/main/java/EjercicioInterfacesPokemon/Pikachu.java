
package EjercicioInterfacesPokemon;

public class Pikachu extends AbstractPokemon implements IElectrico{
    
    public Pikachu() {
        
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }

    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }
    
    public Pikachu(String sexo, String nombrePokemon, int num_pokedex, int temporadaQueAparece, double pesoPokemon) {
        super(sexo, nombrePokemon, num_pokedex, temporadaQueAparece, pesoPokemon);
    }

   

    @Override
    public String atacarImpactrueno() {
        return " ataque de impactrueno";
    }

    @Override
    public String atacarPunioTrueno() {
        return " ataque de puño trueno";
    }

    @Override
    public String atacarRayo() {
        return " ataque de rayo";
    }

    @Override
    public String atacarRayoCarga() {
        return " ataque de rayo carga";
    }

    @Override
    public String atacarPlacaje() {
        return " ataque a placaje";
    }

    @Override
    public String atacarArañazo() {
        return " ataque de arañazo";
    }

    @Override
    public String atacarMordisco() {
        return " ataque de mordisco";
    }

    
    
}
