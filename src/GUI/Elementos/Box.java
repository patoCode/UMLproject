package GUI.Elementos;

import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {
    JPanel contenedorClase;
    JTextPane texto;
    JPopupMenu menu;
    public Box(){
        texto = new JTextPane();
        texto.setText("Prueba");
        texto.setSize(300,150);
        menu = new JPopupMenu();
        menu.add("Hola");
        menu.add("vete");
        menu.add("al");
        menu.add("Joraca");
        contenedorClase = new JPanel();
        contenedorClase.setPreferredSize(new Dimension(100, 40));
        contenedorClase.setBackground(Color.ORANGE);
        contenedorClase.setToolTipText("clase");
        contenedorClase.setComponentPopupMenu(menu);
        contenedorClase.add(texto);
    }

}
