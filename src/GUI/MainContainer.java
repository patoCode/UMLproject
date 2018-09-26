package GUI;

import javax.swing.*;
import java.awt.*;

public class MainContainer extends JPanel {
    BorderLayout layout = new BorderLayout();
    public MainContainer(ToolBox box, WorkFrame frame, int ancho, int alto){
        setLayout(layout);
        setSize(ancho,alto);
        setBackground(Color.BLACK);
        add(box, layout.WEST);
        add(frame, layout.CENTER);
    }

}
