package Util;

import javax.swing.JPanel;

public class JoListMenu {

    private final JPanel Pnmenu;

    public JoListMenu(JPanel Pnmenu) {
        this.Pnmenu = Pnmenu;
        this.Pnmenu.setVisible(false);
    }

    public void setDisplay() {
        Pnmenu.setVisible(!Pnmenu.isVisible());
    }

}
