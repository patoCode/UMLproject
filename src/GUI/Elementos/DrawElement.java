package GUI.Elementos;


import GUI.Comportamientos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawElement extends JPanel implements Drawable{
    private String tipo;
    public DrawElement(){
        super();
    }
    @Override
    public JPanel Draw(String tipo) {
        this.setTipo(tipo);
        JTextField texto = new JTextField(tipo);
        texto.setOpaque(false);
        texto.setBorder(BorderFactory.createLineBorder(new Color(150,151,155)));
        texto.setHorizontalAlignment(JTextField.CENTER);

        setLayout(new BorderLayout(5,5));
        add(texto, BorderLayout.NORTH);
        setLocation(15,15);
        setBounds(15,15,150,80);
        setBorder(BorderFactory.createLineBorder(new Color(150,151,155)));

        PopUpMenu menu = new PopUpMenu();
        ActionsItemsPopupMenu accionEditar = new ActionItemPopupMenuEdit(tipo);
        ActionsItemsPopupMenu accioncrear = new ActionItemPopupMenuCreate();

        menu.addActionElment("Agregarción", accioncrear);
        menu.addActionElment("Composicion", accionEditar);
        menu.addActionElment("Generalización", accionEditar);
        menu.addActionElment("Realización", accionEditar);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger()) menu.show(e.getComponent(), e.getX(), e.getY());
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger()) menu.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        return this;
    }

    @Override
    protected void paintComponent(Graphics g) {
        final Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(new GradientPaint(
                new Point(0, 0),
                new Color(207,208,212),
                new Point(0, getHeight()),
                new Color(153,153,153)));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
        super.paintComponent(g);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
