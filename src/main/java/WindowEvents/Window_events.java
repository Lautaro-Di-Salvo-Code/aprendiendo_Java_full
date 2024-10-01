package WindowEvents;



import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Wndow_events {

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
//        addWindowListener(new Eventos_ventana());
//        addWindowStateListener(new Change_state());
    }

}
//Oyente de teclado
class EventosTeclado implements KeyListener {
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
class OyenteDeClick implements MouseListener {
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