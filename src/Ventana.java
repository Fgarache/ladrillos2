import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana () {

        Canvas lienzo = new Canvas();
        Graphics g = lienzo.getGraphics();
        setBackground(Color.red);
        setSize(1500, 1000);
        setLocation(500, 300);
        add(new Cubo());
        setVisible(true);




    }
}