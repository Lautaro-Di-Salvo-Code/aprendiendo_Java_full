package Enums;

public enum MetodosEnum {
    Azul, amarillo, marron, celeste, violeta;






    public static void main(String[] args) {
        for (MetodosEnum valor : MetodosEnum.values()) {
            System.out.println(valor.name());
        }

    }
}
