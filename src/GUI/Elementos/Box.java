package GUI.Elementos;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Box extends JPanel {
    private int red;
    private int blue;
    private int green;
    final Random r = new Random();
    public void paint(Graphics g){
        super.paint(g);
        red = r.nextInt(150);
        blue = r.nextInt(200);
        green = r.nextInt(256);
        g.setColor(new Color(red,green,blue));
        g.fillRoundRect(r.nextInt(10),r.nextInt(20),100,50, 15,15);
        //setLocation(10,10);
        //setOpaque(false);
    }

}
