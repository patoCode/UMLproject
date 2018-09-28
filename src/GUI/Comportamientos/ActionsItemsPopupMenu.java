package GUI.Comportamientos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionsItemsPopupMenu implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Selected: " + actionEvent.getActionCommand());
    }
}