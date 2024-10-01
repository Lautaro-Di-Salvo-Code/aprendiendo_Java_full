package Swing;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

class SwingYEventos_ventana  {
    public static void main(String[] args) {
        MasSwing masSwing = new MasSwing();
//        MasSwing masSwing2 = new MasSwing();
        masSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        masSwing2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        Eventos eventoo = new Eventos();
    }
}
//Se activa la ventana y configura las dimensiones en pantalla
class MasSwing extends JFrame {
    public MasSwing(){
        setVisible(true);
        setSize(300, 300);
        setLocation(300, 300);
        setTitle("Otro texto adicional");
        setVisible(true);
        setBounds(400, 130, 700, 500);
//        Lamina laminaPaint = new Lamina();
//        add(laminaPaint);
        // Crear una instancia de Eventos (el panel con el botón)
//        Eventos eventoo = new Eventos();
        EventosTeclado eventosTeclado = new EventosTeclado() ;
        OyenteDeClick eventosMouse = new OyenteDeClick();
//        // Agregar el panel de eventos a la ventana
//        add(eventoo);
        addMouseListener(eventosMouse);
        addKeyListener(eventosTeclado);
//        Eventos de ventana
//        Eventos_ventana oir_ventana = new Eventos_ventana();
//        Lo mismo pero con una linea menos
        addWindowListener(new Eventos_ventana());
        addWindowStateListener(new Change_state());
    }

}
class Eventos_ventana implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Abre  ventana");

    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando  ventana");

    }
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");

    }
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana...");

    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana activa");
    }
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");

    }
}
//Colores, texto , figuras, lineas y demas
//class Lamina extends JPanel{
//    public void paintComponent (Graphics g) {
//        super.paintComponent(g);
//        g.drawString("Texto de relleno", 100, 100);
//        Graphics2D grapf2 =(Graphics2D)g;
//////        Rectangulo
////          Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
////          grapf2.setPaint(Color.magenta);
////          grapf2.fill(rectangulo);
//////        Ovalo
////          Ellipse2D elipse = new Ellipse2D.Double();
////          elipse.setFrame(rectangulo);
//////        grapf2.setPaint(Color.green);
////          grapf2.fill(elipse);
////          Fuente de texto
//        Font fuente_texto = new Font("Times new Roman", Font.BOLD, 13);
//        grapf2.setFont(fuente_texto);
//        grapf2.drawString("Buenas noches", 50, 50);
//        grapf2.setColor(Color.RED);
////        Lectura de imagenes
////        File archivoImg = new File("src/SW.png");
//        try{
//            foto = ImageIO.read(new File("src/SW.pn"));
//        }catch(IOException e){
//            System.out.println("No se detectó bien la imagen");
//        }
//        grapf2.drawImage(foto,5, 5, null);
//
//    }
//    private Image foto ;
//}

//Eventos en ventana y oyentes de evento
//class Eventos extends JPanel implements ActionListener {
//    JButton boton_rojo = new JButton("Rojo");
//    JButton boton_azul = new JButton("Azul");
//    JButton reset_color = new JButton("reset");
//    public Eventos(){
//        add(boton_rojo);
//        add(boton_azul);
//        add(reset_color);
//        boton_rojo.addActionListener(this);
//        boton_azul.addActionListener(this);
//        reset_color.addActionListener(this);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Object btn_click = e.getSource();
//
//        if(btn_click==boton_rojo){
//        setBackground(Color.RED);
//
//        } if(btn_click==boton_azul){
//        setBackground(Color.BLUE);
//
//        }
//        if (btn_click == reset_color){
//        setBackground(Color.white);
//
//        }
//    }
//}
// Detector de tipo de estado de ventana
class Change_state implements WindowStateListener{
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana cambio de estado");
        if (e.getNewState() == 1){
            System.out.println("Cambio de estado on");
        } else if (e.getNewState() == 1) {
            System.out.println("Cambio de estado of");

        }
    }
}
//Oyente de teclado
class EventosTeclado implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e) {
//        int code  = e.getKeyCode() ;
//        System.out.println(code);


    }
    @Override
    public void keyPressed(KeyEvent e) {
         char letra = e.getKeyChar();
         System.out.println(letra);

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
//Oyente de Raton
class OyenteDeClick implements MouseListener{


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Se  clickeó un boton del mouse y se desclikeo");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Se precionó");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entro mouse a la ventana");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Salió el  mouse de la ventana");
    }
}
