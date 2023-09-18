/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JoPOS;

import Controller.CategoryController;
import Model.CategoryModel;
import View.CategoryView;

/**
 *
 * @author LENOVO
 */
public class AppCategory {

    private final CategoryController controller;

    public AppCategory(CategoryModel model) {
        CategoryView view = new CategoryView("ຈັດການຂໍ້ມູນປະເພດສິນຄ້າ");
        controller = new CategoryController(view, model);
    }

    public void Open() {
        controller.Start();
        controller.Event();
    }

}
