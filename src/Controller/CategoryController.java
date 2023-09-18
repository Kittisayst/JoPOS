package Controller;

import DAOInterface.MVC;
import DAOService.CategoryService;
import Dialog.CategoryDialog;
import JoPOS.AppDashbord;
import JoPOS.AppHome;
import Model.CategoryModel;
import Tools.JoHookEvent;
import View.CategoryView;
import View.HomeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CategoryController implements MVC, ActionListener, MouseListener {

    private CategoryView view;
    private CategoryModel model;
    private CategoryService service;
    private CategoryDialog dialog;

    public CategoryController(CategoryView view, CategoryModel model) {
        this.view = view;
        this.model = model;
        service = new CategoryService();
    }

    @Override
    public void Start() {
        HomeView.router.setView(view);
        view.showData(service.getAll());
    }

    @Override
    public void Event() {
        view.getBtnBack().addActionListener(this);
        view.getBtnAdd().addActionListener(this);
        view.getTbData().addMouseListener(this);
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
        if (event.isEvent(view.getBtnBack())) {
            AppDashbord dashbord = new AppDashbord();
        } else if (event.isEvent(view.getBtnAdd())) {
            dialog = new CategoryDialog(AppHome.Home, true, new CategoryModel(), "ເພີ່ມປະເພດສິນຄ້າ", view);
            dialog.setVisible(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        JoHookEvent event = new JoHookEvent(e.getSource());
        if (event.isEvent(view.getTbData())) {
            if (e.getClickCount() == 2) {
                model = service.read(view.getID());
                dialog = new CategoryDialog(AppHome.Home, true, model, "ແກ້ໄຂປະເພດສິນຄ້າ", view);
                dialog.setVisible(true);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
