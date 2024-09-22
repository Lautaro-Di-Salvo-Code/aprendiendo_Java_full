package InterfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado {

    public static void main(String[] args) {

        Marcoo probando_marco = new Marcoo();
        probando_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        probando_marco.setResizable(true);
        probando_marco.setVisible(true);
    }
}


class Marcoo extends JFrame{
    public Marcoo(){
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Dimension TamPantalla = toolKit.getScreenSize();
        int heightScreen = TamPantalla.height;
        int widthScreen = TamPantalla.width;
        setSize(800, 600);

        setLocation(400, 50);
        setTitle("Buenas tardes");
        Image imagenText  = toolKit.getImage("src/main/java/InterfacesGraficas/textImagen.jpg");

        setIconImage(imagenText);

        PanelTest panel_test = new PanelTest();

        add(panel_test);
    }
}

class PanelTest extends JPanel {
    public void paintComponent( Graphics g){

        super.paintComponent(g);

        g.drawString("Algo", 150, 150);

        g.drawRect(100, 100, 500, 300);
    }


}

