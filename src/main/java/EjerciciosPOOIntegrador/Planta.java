package EjerciciosPOOIntegrador;

public abstract class Planta {
    protected String nombre;
    protected String climaIdeal;

    protected double altoDeTallo;
    protected boolean tieneHojas;

    public Planta() {
    }
    public Planta(String nombre, String climaIdeal, double altoDeTallo, boolean tieneHojas) {
        this.nombre = nombre;
        this.climaIdeal = climaIdeal;
        this.altoDeTallo = altoDeTallo;
        this.tieneHojas = tieneHojas;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public double getAltoDeTallo(double v) {
        return altoDeTallo;
    }

    public void setAltoDeTallo(double altoDeTallo) {
        this.altoDeTallo = altoDeTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }
    public abstract String DecirQueSoy();
}
