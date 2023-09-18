package Controller;

import DAOInterface.MVC;
import Database.JoProperties;
import JoPOS.AppCategory;
import Model.CategoryModel;
import Model.UserModel;
import Tools.JoAlert;
import Tools.JoHookEvent;
import View.DashboardView;
import View.HomeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeController implements MVC, ActionListener {

    private HomeView view;
    private UserModel model;
    private JoProperties properties;

    public HomeController(HomeView view, UserModel model) {
        this.view = view;
        this.model = model;
        properties = new JoProperties("Info/About.properties");
    }

    @Override
    public void Start() {
        view.setVisible(true);
        view.setUserName(model.getName());
        view.setVersion(properties.getValueAt("version"));
        HomeView.router.setView(new DashboardView("ໜ້າ Dashboard"));
    }

    @Override
    public void Event() {
        view.getBtnMenu().addActionListener(this);
        // ========== ຈັດການຂໍ້ມູນ ==========
        view.getBtnCategory().addActionListener(this);
        //=========Logout===========
        view.getBtnLogout().addActionListener(this);
    }

    @Override
    public boolean Validate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Create() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JoHookEvent event = new JoHookEvent(e.getSource());
        if (event.isEvent(view.getBtnMenu())) {
            view.setDisplaySideBar();
        } // ========== ຈັດການຂໍ້ມູນ ==========
        else if (event.isEvent(view.getBtnCategory())) {
            AppCategory category = new AppCategory(new CategoryModel());
            category.Open();
        } else if (event.isEvent(view.getBtnLogout())) { // logout
            int conf = view.getMessage("ອອກຈາກລະບົບ", "ທ່ານຕ້ອງການອອກຈາກລະບົບ ຫຼື ບໍ່!", JoAlert.Icons.warning);
            if (conf == 0) {
                System.exit(0);
            }
        }
    }

}
