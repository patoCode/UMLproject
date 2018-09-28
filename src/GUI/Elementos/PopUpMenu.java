package GUI.Elementos;

import javax.swing.*;

public class PopUpMenu extends JPopupMenu {
    public PopUpMenu(){
        JMenuItem uno = new JMenuItem("Eliminar");
        add(uno);
        addSeparator();
        JMenuItem dos = new JMenuItem("Crear");
        add(dos);
        addSeparator();
        JMenuItem tres = new JMenuItem("Edit");
        add(tres);
    }
}