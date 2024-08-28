package EjerciciosPOOIntegrador;

public class Arbusto extends Planta{
    private int ancho;
    private boolean esDomestico, sePosaoNo;

    public Arbusto() {
    }



    public Arbusto(int ancho, boolean esDomestico, boolean sePosaoNo, String variedad, String colorHojas) {
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.sePosaoNo = sePosaoNo;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
    }

    public Arbusto(String nombre, String climaIdeal, double altoDeTallo, boolean tieneHojas, int ancho, boolean esDomestico, boolean sePosaoNo, String variedad, String colorHojas) {
        super(nombre, climaIdeal, altoDeTallo, tieneHojas);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.sePosaoNo = sePosaoNo;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
    }

    private String variedad, colorHojas;
    @Override
    public String DecirQueSoy() {
        return "Soy un Arbusto";
    }

}
