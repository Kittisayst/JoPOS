package JoPOS;

import Model.UserModel;
import Tools.JoFrameDesign;
import View.LoginView;
import Controller.LoginController;
import Database.JoProperties;
import theme.JoTheme;

public class JoPos {

    public static void main(String[] args) {
        JoProperties properties = new JoProperties("Info/About.properties");
        properties.addValue("version", "0.0.1");
        UserModel model = new UserModel();
        LoginView view = new LoginView();
        view.setVersion(properties.getValueAt("version"));
        JoFrameDesign design = new JoFrameDesign(view);
        design.setJoUI();
        JoTheme theme = new JoTheme();
        theme.setLookUI();
        LoginController controller = new LoginController(model, view);
        controller.Start();
        controller.Event();
    }

}
