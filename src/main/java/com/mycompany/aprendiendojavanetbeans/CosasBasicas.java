package com.mycompany.aprendiendojavanetbeans;


import java.util.Scanner;


public class CosasBasicas {
    public static void main(String[] args) {
        int cifra;
        String algo;
        
        
        Scanner escaner = new Scanner(System.in );
            
        
        System.out.println("Ingrese una cifra");
        cifra = escaner.nextInt();
        
        algo = cifra >= 5 ? "Verdadero": "Falso";
        
        System.out.println("Resultado => " + algo + " "+ cifra) ;
        
        
        
    }
}   
