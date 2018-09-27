package GUI.Comportamientos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawClassElement implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println("CLICK CREAR"+ command);
    }
}
