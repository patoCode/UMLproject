package GUI.Comportamientos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ActionsItemsPopupMenu implements ActionListener {
    private ArrayList<String> rules;

    public ActionsItemsPopupMenu() {
        this.rules = new ArrayList<String>();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("PADRE");
    }
    public void addRule(String rule){
        rules.add(rule);
    }
}