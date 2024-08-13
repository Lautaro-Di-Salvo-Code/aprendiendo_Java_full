package com.mycompany.aprendiendojavanetbeans;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        int Vector[] = new int[5];
        int contador = 0;
        Scanner escaner = new Scanner(System.in);

        for (int i = 0; i < Vector.length; i++) {
            Vector[i] = escaner.nextInt();
            System.out.println("El array/vector tiene estas cifras: " + Vector[i]);
        }
        System.out.println("contador: "+contador);
        
        for (int i = 0; i < 5; i++) {
             if (Vector[i] == 3) {
                contador =  contador +1;
            }
        }
       
            System.out.println("Cantidad de 3 repetidos: "+ contador);

    }
}
