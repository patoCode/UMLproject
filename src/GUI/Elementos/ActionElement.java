package GUI.Elementos;

import java.util.ArrayList;

public class ActionElement {
    private String label;
    private String tipoLinea;
    private ArrayList<DrawElement> posible;
    public ActionElement(String label, String tipoLinea){
        this.label = label;
        this.tipoLinea = tipoLinea;
        setPosible(new ArrayList<DrawElement>());
    }
    public void addPosible(DrawElement opcion){
        getPosible().add(opcion);
    }
    public void canDo(DrawElement origen, DrawElement destino){
        if(getPosible().contains(destino)){
            System.out.println("Dibujar linea");
        }else{
            System.out.println("Mensaje de error");
        }
    }
    public ArrayList getPosible() {
        return posible;
    }

    public void setPosible(ArrayList posible) {
        this.posible = posible;
    }
}
