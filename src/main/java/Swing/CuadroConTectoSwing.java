package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

class CuadroConTectoSwing  {
    public static void main(String[] args) {
        MasSwing masSwing = new MasSwing();
        masSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MasSwing extends JFrame {

    public MasSwing(){
        setVisible(true);
        setSize(600, 300);
        setLocation(300, 300);
        setTitle("Otro texto adicional");
        setVisible(true);
        Lamina laminaPaint = new Lamina();
        add(laminaPaint);
    }
}
class Lamina extends JPanel{
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        g.drawString("Texto de relleno", 100, 100);
        Graphics2D grapf2 =(Graphics2D)g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        grapf2.setPaint(Color.magenta);
        grapf2.fill(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        grapf2.setPaint(Color.green);
        grapf2.fill(elipse);

    }
}


