package com.mycompany.aprendiendojavanetbeans;

import java.util.Scanner;

public class MatrizesBidimensonales {

    public static void main(String[] args) {

        int ArrayB[][] = new int[3][3];

        Scanner escaner = new Scanner(System.in);
//        ArrayB[0][0] = 32;
//        ArrayB[0][1] = 5;
//        ArrayB[0][2] = 9;
//        ArrayB[1][0] = 90;
//        ArrayB[1][1] = 10;
//        ArrayB[1][2] = 23;
//        ArrayB[2][0] = 12;
//        ArrayB[2][1] = 6;
//        ArrayB[2][2] = 8;

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println(" fila: " + f + " Columna: " + c);
                System.out.println("Interta un numero");
                ArrayB[c][f] = escaner.nextInt();
                System.out.println("el vector resultante es" + ArrayB[c][f]);
            }

        }

    }

}
