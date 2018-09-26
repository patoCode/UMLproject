package GUI;

import javax.swing.*;
import java.awt.*;

public class ToolButton extends JButton {
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
}
