
package HerenciaEjercicio2;


public class Empleado extends Persona{
    String nombre_consultora;
    int num_consultor;
    
//    encapsulamiento
    private String contaseña;
    public Empleado() {
        
    }

    
    public String getContaseña() {
        return contaseña;
    }
    public Empleado(String nombre_consultora,
            int num_consultor,
            int id, int dni, 
            int telefono,
            String nombre,
            String apellido,
            String domicilio) {
        super(id, dni, telefono, nombre, apellido, domicilio);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }
    
    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

    


    
    
    
}
