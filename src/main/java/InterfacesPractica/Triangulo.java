package InterfacesPractica;

public class Triangulo implements Dibujable, Rotable{

    public Triangulo() {
    }

    @Override
    public String EsDibujable() {
        return "El triangulo es dibujable";
    }

    @Override
    public String EsRotable() {
        return "El triangulo no es rotable";
    }
    
}
