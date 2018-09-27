package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolButton extends JButton implements ActionListener {
    private int ancho;
    private int alto;
    public ToolButton(String texto, Dimension dimension) {
        setText(texto);
        setPreferredSize(dimension);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand())
        {
            case "1":System.out.println("pressed button 1");
                break;
            case "2":System.out.println("pressed button 2");
                break;
            case "*":System.out.println("pressed button *");
                break;
            case "\u221A":System.out.println("pressed button \\u221A");
                break;

        }
    }
}
