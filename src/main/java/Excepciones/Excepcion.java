package Excepciones;

import java.io.FileReader;
import java.io.IOException;
// las excepciones IO no dependen del programador, Java te obliga a que lo soluciones
public class Excepcion {
    public static void main(String[] args) {
        int cifra = 1/ 1;
        int cifra2 = 4*3;

          try{
            System.out.println("Esto es el resultado: "+  cifra );
            System.out.println("Segundo resultado: "+ cifra2 );
          }catch(Exception e){
            System.out.println( cifra);

          }


    }



}




