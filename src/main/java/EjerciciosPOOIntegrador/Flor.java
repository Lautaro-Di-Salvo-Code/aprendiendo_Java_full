package EjerciciosPOOIntegrador;

public class Flor extends Planta{
    private String variedad, tipoTronco,colorPistillo,estacionQueFlorece, colorPetalo, tipoHojas;
    private int cantidadPRomedioPetalos;

    public Flor() {
    }

    @Override
    public String DecirQueSoy() {
        return "Soy una Flor";
    }


    public Flor(String variedad, String tipoTronco,
                String colorPistillo,
                String estacionQueFlorece,
                String colorPetalo,
                String tipoHojas,
                int cantidadPRomedioPetalos) {
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.colorPistillo = colorPistillo;
        this.estacionQueFlorece = estacionQueFlorece;
        this.colorPetalo = colorPetalo;
        this.tipoHojas = tipoHojas;
        this.cantidadPRomedioPetalos = cantidadPRomedioPetalos;
    }

    public Flor(String nombre, String climaIdeal, double altoDeTallo, boolean tieneHojas, String variedad, String tipoTronco, String colorPistillo, String estacionQueFlorece, String colorPetalo, String tipoHojas, int cantidadPRomedioPetalos) {
        super(nombre, climaIdeal, altoDeTallo, tieneHojas);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.colorPistillo = colorPistillo;
        this.estacionQueFlorece = estacionQueFlorece;
        this.colorPetalo = colorPetalo;
        this.tipoHojas = tipoHojas;
        this.cantidadPRomedioPetalos = cantidadPRomedioPetalos;
    }


}
