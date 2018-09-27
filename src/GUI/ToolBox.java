package GUI;

import javax.swing.*;
import java.awt.*;

public class ToolBox extends JPanel {
    private GridLayout layout;
    public ToolBox(int ancho, int alto,int rowsGridLayout, int colsGridLayout){
        setPreferredSize(new Dimension(ancho,alto));
        setBackground(Color.YELLOW);
    }
}
