package InterfacesGraficas;
import javax.swing.*;
import java.awt.*;

class Marco extends  JFrame{
    public Marco(){

//    setSize(700, 500);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setLocation(500, 200);
    setBounds(500, 200, 700, 500);
    setResizable(false);
    setResizable(true);
//    setExtendedState(Frame.MAXIMIZED_BOTH);
    }


}




public class AprendiendoSwing {

    public static void main(String[] args) {
    Marco mi_marco = new Marco();



    }


}
