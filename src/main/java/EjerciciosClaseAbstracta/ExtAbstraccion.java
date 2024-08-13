
package EjerciciosClaseAbstracta;

public class ExtAbstraccion extends Abstraccion{
    private double lado;

    public ExtAbstraccion() {
    }

    

    public ExtAbstraccion(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double Abstraccion_de_calculo() {
        double pi = 3.14;
        
        double res = pi *4 *lado;
        return res;
    }

   
    
   
    
   
    
}
