package GUI;

import javax.swing.*;
import java.awt.*;

public class WorkFrame extends JPanel {
    public WorkFrame(int ancho, int alto){
        setSize(ancho, alto);
        setBackground(Color.magenta);
        setLayout(new GridLayout());
    }
}
