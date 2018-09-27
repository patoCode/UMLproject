package GUI.Comportamientos;

import GUI.Elementos.Box;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawInterfaceElement implements ActionListener, MouseMotionListener {
    private JPanel frame;
    private Box dibujo;
    private JPanel movingPanel;
    private Point pt;
    public DrawInterfaceElement(JPanel frame){
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        dibujo = new Box();
        this.frame.add(dibujo);
        this.frame.revalidate();
        this.frame.repaint();
        System.out.println("INTERFACE");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        pt = SwingUtilities.convertPoint(movingPanel, e.getX(), e.getY(), movingPanel.getParent());
        movingPanel.setBounds(pt.x, pt.y, movingPanel.getWidth(), movingPanel.getHeight());
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
}
