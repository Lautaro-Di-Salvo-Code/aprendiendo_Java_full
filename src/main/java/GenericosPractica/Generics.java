package GenericosPractica;

public class Generics<T> {
    private T valor ;
    public Generics() {
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Generics(T valor) {
        this.valor = valor;
    }

}
