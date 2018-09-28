package GUI.Comportamientos;

import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class ActionPopupMenuListener implements PopupMenuListener {
    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
        System.out.println("Canceled");
    }

    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
        System.out.println("Becoming Invisible");
    }

    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
        System.out.println("Becoming Visible");
    }
}