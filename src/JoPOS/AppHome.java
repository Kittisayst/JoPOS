package JoPOS;

import Controller.HomeController;
import Model.UserModel;
import Tools.JoFrameDesign;
import View.HomeView;
import javax.swing.JFrame;

public class AppHome {
public static JFrame Home;
    private final HomeController controller;

    public AppHome(UserModel model) {
        HomeView view = new HomeView();
        Home = view;
        JoFrameDesign design = new JoFrameDesign(view);
        design.setJoUI();
        controller = new HomeController(view, model);
    }

    public void Open() {
        controller.Start();
        controller.Event();
    }

}
