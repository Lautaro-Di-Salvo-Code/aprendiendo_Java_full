package EjerciciosPOOIntegrador;

public class Arbol extends Planta{
    private String variedad, tipoTronco, color, tipoHojas;

    public Arbol() {
    }


    private double radioTronco;
    public Arbol(String variedad, String tipoTronco, String color, String tipoHojas, double radioTronco) {
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
        this.radioTronco = radioTronco;
    }
    public Arbol(String nombre, String climaIdeal, double altoDeTallo, boolean tieneHojas, String variedad, String tipoTronco, String color, String tipoHojas, double radioTronco) {
        super(nombre, climaIdeal, altoDeTallo, tieneHojas);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
        this.radioTronco = radioTronco;
    }
    @Override
    public String DecirQueSoy() {
        return "Soy un Arbol";
    }
}
