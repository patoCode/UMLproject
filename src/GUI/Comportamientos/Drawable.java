package GUI.Comportamientos;

import javax.swing.*;
import java.util.ArrayList;

public interface Drawable {
    JPanel Draw(String tipo, ArrayList<ActionItemPopupMenu> config);
}
