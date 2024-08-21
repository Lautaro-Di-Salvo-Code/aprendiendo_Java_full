package InterfacesPractica;

public class Obalo implements Dibujable, Rotable{

    @Override
    public String EsDibujable() {
     return "El obalo es dibujable";   
    }

    @Override
    public String EsRotable() {
        return "El obalo es es rotable";
    }
    
}
