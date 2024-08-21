
package EjerciciosArraysList;


public class ArrayClassPractice {
    private String nombre;
    private int cifra;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCifra() {
        return cifra;
    }

    public void setCifra(int cifra) {
        this.cifra = cifra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayClassPractice() {
    }

    public ArrayClassPractice(String nombre, int cifra, double precio) {
        this.nombre = nombre;
        this.cifra = cifra;
        this.precio = precio;
    }
}
