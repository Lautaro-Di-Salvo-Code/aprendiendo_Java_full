
package com.mycompany.aprendiendojavanetbeans;

import java.util.Scanner;

public class ArraysVectores {
    public static void main(String[] args) {
        
        
        
        int Arreglo[] = new int[5 ];
        
        Scanner escaner = new Scanner(System.in);
        
//        Arreglo[0] = 54;
//        Arreglo[1] = 4;
//        Arreglo[2] = 76;
//        Arreglo[3] = 5;
//        Arreglo[4] = 90;
        
        for (int i = 0; i < Arreglo.length; i++) {
//        System.out.println("Estoy parado en el indice" + i);
        System.out.println("Ingrese el valor, estas parado en el indice: "+ i);
        Arreglo[i] = escaner.nextInt();
        System.out.println(Arreglo[i]);
            
        }
        
            System.out.println("El vector resultante es: ");
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println( Arreglo[i]);
        }
        
    }
}
