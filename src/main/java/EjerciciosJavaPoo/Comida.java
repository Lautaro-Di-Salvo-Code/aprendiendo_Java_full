
package EjerciciosJavaPoo;

public class Comida {
    String Comida;
    int Cantidad;

    
    public Comida(String Comida, int Cantidad) {
        this.Comida = Comida;
        this.Cantidad = Cantidad;
    }

    public String getComida() {
        return Comida;
    }

    public void setComida(String Comida) {
        this.Comida = Comida;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
}
