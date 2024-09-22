package Swing;

import javax.swing.*;
import java.awt.*;

class ContinuandoSwing extends JFrame{

    public ContinuandoSwing(){

        Toolkit toolKit = Toolkit.getDefaultToolkit();
        toolKit.getScreenSize();
        Dimension dimen = toolKit.getScreenSize();
        int alturaPantalla = dimen.height;
        int anchoPantalla = dimen.width;

        setTitle("Titulo con swing");

        setSize(anchoPantalla / 2, alturaPantalla / 2);
    }
}

class LlamadaSwing {
    public static void main(String[] args) {
        ContinuandoSwing swingTest = new ContinuandoSwing();

        swingTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        swingTest.setVisible(true);

    }

}