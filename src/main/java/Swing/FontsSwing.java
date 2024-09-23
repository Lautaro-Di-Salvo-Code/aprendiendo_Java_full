package Swing;

import javax.swing.*;
import java.awt.*;

public class FontsSwing {
    public static void main(String[] args) {


        String checkFontExist = JOptionPane.showInputDialog("introduce la fuente");
            boolean fontExist = false;
        String [] nameFonts = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        
        for (String names  :nameFonts ) {

            if(names.equals(checkFontExist)){
                fontExist = true;
            }
            System.out.println(names);
        }
        if (fontExist){
            System.out.println("La fuente ya existe");
        }else{
            System.out.println("La fuente hay que instalarla");
        }
    }
}
