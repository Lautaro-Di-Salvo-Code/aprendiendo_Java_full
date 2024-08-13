
package EjerciciosClaseAbstracta;

public abstract class Abstraccion {
    protected double x;
    protected double y;
    
    public Abstraccion(){
        
    }
    public Abstraccion(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    public abstract double Abstraccion_de_calculo();
    
    
}
