package InterfacesPractica;

public class LeerInterface {
    public static void main(String[] args) {
        
        Obalo obalo = new Obalo();
        Triangulo tri = new Triangulo();
        
        System.out.println(obalo.EsDibujable()+ " "+ obalo.EsRotable());
        System.out.println(tri.EsDibujable()+ " "+ tri.EsRotable());
    }
}
