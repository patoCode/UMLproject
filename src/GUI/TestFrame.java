package GUI;

import java.awt.*;
import java.util.ArrayList;

import GUI.Comportamientos.ActionItemPopupMenu;
import GUI.Elementos.*;

public class TestFrame{

    Frame frame;
    ToolBox box;
    WorkFrame drawZone;
    MainContainer main;
    Dimension buttonsDimension;
    DrawInterfaceElement dibujo;

    public TestFrame(){
        buttonsDimension = new Dimension(150,50);
        // CAJA DE HERRAMIENTAS
        box = new ToolBox(150,450);
        // ZONA DE DIBUJO
        drawZone = new WorkFrame(750,550);
        // QUE DIBUJARE
        DrawElement interfaseGrafico = new DrawInterfaceElement("interface");
        DrawElement claseGrafico = new DrawClassElement("clase");
        DrawElement personaGrafico = new DrawPersonaElement("persona");

        // OBJETO PARA EMPAQUTAR REGLAS Y posibilidad de hacer
        ActionItemPopupMenu agregar = new ActionItemPopupMenu("Agregacion", "punteada", drawZone);
        agregar.setMe(interfaseGrafico);
        agregar.addPosible(interfaseGrafico);
        agregar.addPosible(claseGrafico);

        ArrayList<ActionItemPopupMenu> config = new ArrayList<>();
        config.add(agregar);
        ArrayList<ActionItemPopupMenu> config2 = new ArrayList<>();
        ArrayList<ActionItemPopupMenu> config3 = new ArrayList<>();

        // LAPIZ
        ToolButton redondos = new ToolButton(drawZone, interfaseGrafico, config,"Interface", buttonsDimension);
        ToolButton cuadrados = new ToolButton(drawZone, claseGrafico,config2, "Clase", buttonsDimension);
        ToolButton personas = new ToolButton(drawZone, personaGrafico, config3, "User", buttonsDimension);

        //agrego lapiz a mi toolbox
        box.add(redondos);
        box.add(cuadrados);
        box.add(personas);

        main = new MainContainer(box, drawZone, 1000,600);
        frame = new Frame(main, "UEMELE",700,601);
        frame.repaint();
    }
    public static void main(String [] args){
        new TestFrame();
    }
}
