
package HerenciaEjercicio_y_polimorfismo;


public class Consultor extends Persona{
        int num_legajo;
        String puesto_laboral;
        Double sueldo;

    public Consultor() {
    }

    public Consultor(int id, int dni, int telefono, String nombre, String apellido, String domicilio) {
        super(id, dni, telefono, nombre, apellido, domicilio);
    }

    public Consultor(int num_legajo, String puesto_laboral, Double sueldo) {
        this.num_legajo = num_legajo;
        this.puesto_laboral = puesto_laboral;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getPuesto_laboral() {
        return puesto_laboral;
    }

    public void setPuesto_laboral(String puesto_laboral) {
        this.puesto_laboral = puesto_laboral;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
        
}
