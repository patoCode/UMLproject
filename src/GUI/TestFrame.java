package GUI;

import java.awt.*;
import java.awt.event.MouseListener;

import GUI.Elementos.Box;
import GUI.Comportamientos.*;

public class TestFrame{
    Frame frame;
    ToolBox box;
    WorkFrame drawZone;
    MainContainer main;
    Dimension buttonsDimension;
    Box rec;

    public TestFrame(){

        rec = new Box();

        buttonsDimension = new Dimension(140,20);

        box = new ToolBox(150,450,5,1);

        ToolButton boton = new ToolButton("Crear", buttonsDimension);
        ToolButton boton2 = new ToolButton("Crear 2", buttonsDimension);
        ToolButton boton3 = new ToolButton("Crear 3", buttonsDimension);
        ToolButton boton4 = new ToolButton("Crear 4", buttonsDimension);
        ToolButton boton5 = new ToolButton("Crear 5", buttonsDimension);

        box.add(boton);
        box.add(boton2);
        box.add(boton3);
        box.add(boton4);
        box.add(boton5);



        drawZone = new WorkFrame(750,550);
        //boton.addActionListener(new DrawClassElement(drawZone));
        boton2.addActionListener(new DrawInterfaceElement(drawZone));
        drawZone.add(rec);

        main = new MainContainer(box, drawZone, 1000,600);
        frame = new Frame(main, "UML",700,601);

        rec.addMouseMotionListener(new MotionListener(rec));

        frame.repaint();
    }
    public static void main(String [] args){
        new TestFrame();
    }
}
