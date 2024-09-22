package Enums;

public class EnumPractice {

// SON CONSTANTES ADEMAS DE LOS DECLARABLES FINAL
    enum Colores{
        Rojo , Marron, Violeta
    }
    public static void main(String[] args) {

    MetodosEnum colores = MetodosEnum.celeste;

        System.out.println(colores.ordinal());

        for(Colores valor : Colores.values()) {
            System.out.println(valor.ordinal());
        }

    }
}
