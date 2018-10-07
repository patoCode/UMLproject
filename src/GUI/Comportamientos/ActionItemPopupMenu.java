package GUI.Comportamientos;

import GUI.Elementos.DrawElement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ActionItemPopupMenu implements ActionListener
{
    private static final javax.swing.JOptionPane JOptionPane = new JOptionPane();
    private String label;
    private String tipoLinea;
    private ArrayList<DrawElement> posible;
    private DrawElement me;
    private JPanel drawZone;
    public ActionItemPopupMenu(){
        this.setLabel("NADA");
        this.tipoLinea = "NINGUNA";
        this.posible = new ArrayList<>();
    }
    public ActionItemPopupMenu(String label, String tipoLinea, JPanel drawZone) {
        this.setLabel(label);
        this.tipoLinea = tipoLinea;
        this.posible = new ArrayList<>();
        this.drawZone = drawZone;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String name = JOptionPane.showInputDialog(null,
                "Destino de accion?", null);
        String valor = actionEvent.getActionCommand();
        canDo(getMe(), getMe());
    }
    public void addPosible(DrawElement opcion){
        getPosible().add(opcion);
    }
    public ArrayList getPosible() {
        return posible;
    }
    public void setPosible(ArrayList posible) {
        this.posible = posible;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    private void canDo(DrawElement origen, DrawElement destino){
        if(getPosible().contains(destino)){
            System.out.println("Dibujar linea");
        }else{
            System.out.println("Mensaje de error");
        }
    }
    public DrawElement getMe() {
        return me;
    }

    public void setMe(DrawElement me) {
        this.me = me;
    }
}