package CastingDatos;

public class CastingValues {
    public static void main(String[] args) {
    String cifra = "453543";
    int algo = 6546;

    int saludoConvertido = Integer.parseInt(cifra);
    double saludoConvertido2 = Double.parseDouble(cifra);
    String palabra = String.valueOf(algo);



        System.out.println("Entero "+ saludoConvertido);
        System.out.println("Decimal "+ saludoConvertido2);
        System.out.println("Texto "+ palabra);
    }
}
