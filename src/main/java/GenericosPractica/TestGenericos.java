package GenericosPractica;

public class TestGenericos {

    public static void main(String[] args) {

        Generics<String> valores = new Generics<>();
        Generics<Integer> valores2 = new Generics<>();

        valores2.setValor(1998);
        valores.setValor("Hola, como estas");
        System.out.println(valores.getValor());
        System.out.println(valores2.getValor());


    }
}
