package GUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame {
    private JPanel panel1;
    private JPanel framework;
    private JPanel tools;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public MainFrame() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // crear objeto
                System.out.println("click");
                framework.add(new JLabel("HOLAAAAAAA"));
                framework.repaint();
            }
        });

    }
    private class Entidad extends JPanel{
        Entidad _self;
        public Entidad(){
            super();
            _self = this;
            JLabel texto = new JLabel("ENTIDAD ");

        }
    }

    public static void main(String[] args) {
        JFrame _self = new JFrame("Proyecto");
        _self.setContentPane(new MainFrame().panel1);
        _self.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _self.pack();
        _self.setSize(750,500);
        _self.setVisible(true);
    }
}
