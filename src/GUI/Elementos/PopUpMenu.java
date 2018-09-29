package GUI.Elementos;

import GUI.Comportamientos.ActionPopupMenuListener;
import GUI.Comportamientos.ActionsItemsPopupMenu;

import javax.swing.*;

public class PopUpMenu extends JPopupMenu {
    private ActionsItemsPopupMenu actionItems;

    public PopUpMenu(){
        actionItems = new ActionsItemsPopupMenu();
    }
    public void addActionElment(String label, ActionsItemsPopupMenu action){
        JMenuItem menuItem = new JMenuItem(label);
        menuItem.addActionListener(action);
        addPopupMenuListener(new ActionPopupMenuListener());
        add(menuItem);
    }
}