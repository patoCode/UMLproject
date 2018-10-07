package GUI.Comportamientos;

import GUI.Elementos.DrawElement;
import GUI.WorkFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class ActionButtonsListener implements ActionListener {
    private JPanel actionZone;
    private ArrayList<ActionItemPopupMenu> acciones;
    private DrawElement elemento;
    private String tipo;

    public ActionButtonsListener(JPanel actionZone, String tipo, ArrayList<ActionItemPopupMenu> acciones){
        this.actionZone = actionZone;
        this.tipo = tipo;
        this.acciones = acciones;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        elemento = new DrawElement(tipo);
        JPanel dibujo = elemento.Draw(tipo, this.acciones);
        dibujo.addMouseMotionListener(new MotionListener(dibujo));
        this.actionZone.add(dibujo);
        this.actionZone.revalidate();
        this.actionZone.repaint();
    }
}
