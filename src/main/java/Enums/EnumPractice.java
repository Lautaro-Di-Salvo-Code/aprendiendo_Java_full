package Enums;

public class EnumPractice {

// SON CONSTANTES ADEMAS DE LOS DECLARABLES FINAL
    enum Colores{
        Rojo , Marron, Violeta
    }
    public static void main(String[] args) {
        Colores color = Colores.Rojo;

        System.out.println(color);
        for(Colores valor : Colores.values()) {
            System.out.println(valor);
        }

    }
}
