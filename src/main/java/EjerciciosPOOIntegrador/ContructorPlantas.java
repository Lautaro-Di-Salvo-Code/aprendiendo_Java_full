package EjerciciosPOOIntegrador;

public class ContructorPlantas {
    public static void main(String[] args) {
        Arbusto arbustoObjeto = new Arbusto();
        Flor florObjeto = new Flor();
        Arbol alborObjeto = new Arbol();


        arbustoObjeto.setTieneHojas(true);
        arbustoObjeto.setClimaIdeal("Luz, agua, aire y nutrientes");
        arbustoObjeto.setAltoDeTallo(5);// 1 a 5 metros siendo adulto
        arbustoObjeto.setNombre("Roble");
        arbustoObjeto.DecirQueSoy();
        florObjeto.getAltoDeTallo(40.5); //centimetros
        florObjeto.setClimaIdeal("Luz, agua, aire y nutrientes");
        florObjeto.setNombre("Flor argentina");
        florObjeto.setTieneHojas(true);
        florObjeto.DecirQueSoy();
        alborObjeto.setAltoDeTallo(30);
        alborObjeto.setTieneHojas(true);
        alborObjeto.setNombre("Roble");
        alborObjeto.setClimaIdeal("Primavera");
        alborObjeto.DecirQueSoy();

        System.out.println();
    }
}
