package Controller;

import DAOInterface.MVC;
import DAOService.UserService;
import JoPOS.AppHome;
import Model.UserModel;
import Tools.JoAlert;
import Tools.JoHookEvent;
import View.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LoginController implements MVC, ActionListener, KeyListener {

    private UserModel model;
    private final LoginView view;

    public LoginController(UserModel model, LoginView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void Start() {
        view.setVisible(true);
    }

    @Override
    public void Event() {
        view.getBtnLogin().addActionListener(this);
        view.getTxtPassword().addKeyListener(this);
    }

    @Override
    public boolean Validate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Create() {

    }

    @Override
    public void Update() {
        UserService service = new UserService();
        service.saveLog(model.getUserID());
    }

    @Override
    public void Delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JoHookEvent event = new JoHookEvent(e.getSource());
        if (event.isEvent(view.getBtnLogin())) {
            actionLogin();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        JoHookEvent event = new JoHookEvent(e.getSource());
        if (event.isEvent(view.getTxtPassword())) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                actionLogin();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void actionLogin() {
        UserService service = new UserService();
        model = service.getAuthentication(view.getUser(), view.getPassword());
        if (model.getUserID() != 0) {
            AppHome appHome = new AppHome(model);
            appHome.Open();
            Update();
            view.setVisible(false);
        } else {
            view.getMessage("ເຂົ້າສູ່ລະບົບ", "ຊື້ຜູ້ງານ ຫຼື ລະຫັດຜ່ານບໍ່ຖືກຕ້ອງ!", JoAlert.Icons.warning);
        }
    }

}
