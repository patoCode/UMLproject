package GUI.Comportamientos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionItemPopupMenuEdit extends ActionsItemsPopupMenu{
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String valor = actionEvent.getActionCommand();
        System.out.println("HIJO");
    }

}