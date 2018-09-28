package GUI.Elementos;


import GUI.Comportamientos.ActionPopupMenuListener;
import GUI.Comportamientos.ActionsItemsPopupMenu;
import GUI.Comportamientos.Drawable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class DrawElement extends JPanel implements Drawable{
    protected int r,g,b;
    static final Random rand = new Random();
    private ActionListener acciones;
    public DrawElement(){
        super();
        acciones = new ActionsItemsPopupMenu();
        r = rand.nextInt(256);
        g = rand.nextInt(256);
        b = rand.nextInt(256);
    }
    @Override
    public JPanel Draw(String tipo) {
        JTextField texto = new JTextField(tipo);
        texto.setOpaque(false);
        texto.setBorder(BorderFactory.createLineBorder(new Color(150,151,155)));
        texto.setHorizontalAlignment(JTextField.CENTER);
        setLayout(new BorderLayout(5,5));
        add(texto, BorderLayout.NORTH);
        setLocation(15,15);
        setBounds(15,15,150,80);
        setBorder(BorderFactory.createLineBorder(new Color(150,151,155)));

        final JPopupMenu menu = new JPopupMenu();
        ActionsItemsPopupMenu actionItems = new ActionsItemsPopupMenu();
        menu.addPopupMenuListener(new ActionPopupMenuListener());
        JMenuItem item = new JMenuItem("Nuevo");
        item.addActionListener(actionItems);
        menu.add(item);

        JMenuItem item2 = new JMenuItem("Editar");
        item2.addActionListener(actionItems);
        menu.add(item2);

        JMenuItem item3 = new JMenuItem("Copiar");
        item3.addActionListener(actionItems);
        menu.add(item3);

        JMenuItem item4 = new JMenuItem("Eliminar");
        item4.addActionListener(actionItems);
        menu.add(item4);

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
}
