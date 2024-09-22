package com.mycompany.aprendiendojavanetbeans;

public class AprendiendoJavaNetBeans {

    public static void main(String[] args) {
        int num = 35;
        int num2 = 20;
        int VariableAux;


        System.out.println("Antes");
        System.out.println("num: "+ num);
        System.out.println("num2: "+ num2);
        
        
        VariableAux = num;
        
        num2 = num;
        num = num2;
        
        System.out.println("Despues");
        System.out.println("num: "+ num);
        System.out.println("num2: "+ num2);
    }
}
