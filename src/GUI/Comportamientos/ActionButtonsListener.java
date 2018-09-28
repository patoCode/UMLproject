package GUI.Comportamientos;

import GUI.Elementos.DrawElement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ActionButtonsListener implements ActionListener {
    private JPanel actionZone;
    private DrawElement elemento;
    private String tipo;

    public ActionButtonsListener(JPanel actionZone, String tipo){
        this.actionZone = actionZone;
        this.tipo = tipo;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        elemento = new DrawElement();
        JPanel dibujo = elemento.Draw(tipo);
        dibujo.addMouseMotionListener(new MotionListener(dibujo));

        this.actionZone.add(dibujo);
        this.actionZone.revalidate();
        this.actionZone.repaint();
    }
}
