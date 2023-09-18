package Dialog;

import DAOService.CategoryService;
import Model.CategoryModel;
import Tools.JoAlert;
import View.CategoryView;

public class CategoryDialog extends javax.swing.JDialog {

    private CategoryModel model;
    private CategoryService service;
    CategoryView view;

    public CategoryDialog(java.awt.Frame parent, boolean modal, CategoryModel model, String Title, CategoryView view) {
        super(parent, modal);
        initComponents();
        this.model = model;
        this.view = view;
        service = new CategoryService();
        btnSave.setText(Title);
        btnDelete.setVisible(model.getCategoryID() > 0);
        txtName.setText(model.getCategoryName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        joLable1 = new Components.JoLable();
        txtName = new Components.JoTextField();
        btnSave = new Components.JoButtonIconfont();
        btnDelete = new Components.JoButtonIconfont();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        joLable1.setForeground(new java.awt.Color(44, 88, 110));
        joLable1.setText("ຊື່ປະເພດສິນຄ້າ");
        joLable1.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(9, 20, 0, 20);
        getContentPane().add(joLable1, gridBagConstraints);

        txtName.setJoLineColor(new java.awt.Color(44, 88, 110));
        txtName.setPlaceholder("ຊື່ປະເພດສິນຄ້າ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 7, 20);
        getContentPane().add(txtName, gridBagConstraints);

        btnSave.setBackground(new java.awt.Color(44, 88, 110));
        btnSave.setText("ບັນທຶກ");
        btnSave.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.SAVE);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(btnSave, gridBagConstraints);

        btnDelete.setBackground(new java.awt.Color(44, 88, 110));
        btnDelete.setText("ລົບ");
        btnDelete.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.DELETE);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(btnDelete, gridBagConstraints);

        setSize(new java.awt.Dimension(342, 243));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtName.TextEmpty()) {
            model.setCategoryName(txtName.getText());
            if (model.getCategoryID() == 0) {
                service.create(model);
                view.showData(service.getAll());
                this.dispose();
            } else {
                service.update(model);
                view.showData(service.getAll());
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JoAlert alert = new JoAlert();
        if (alert.JoSubmitDelete()) {
            service.delete(model.getCategoryID());
            view.showData(service.getAll());
            this.dispose();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.JoButtonIconfont btnDelete;
    private Components.JoButtonIconfont btnSave;
    private Components.JoLable joLable1;
    private Components.JoTextField txtName;
    // End of variables declaration//GEN-END:variables
}
