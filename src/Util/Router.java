package Util;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Router {

    private final JPanel view;

    public Router(JPanel view) {
        this.view = view;
        view.setLayout(new BorderLayout(2, 2));
    }

    public void setView(JPanel panel) {
        view.removeAll();
        view.add(panel);
        view.repaint();
        view.revalidate();
    }

}
