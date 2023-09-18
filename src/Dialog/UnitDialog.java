package Dialog;

public class UnitDialog extends javax.swing.JDialog {

    public UnitDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        joLable1 = new Components.JoLable();
        joTextField1 = new Components.JoTextField();
        joButtonIconfont1 = new Components.JoButtonIconfont();
        joButtonIconfont2 = new Components.JoButtonIconfont();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        joLable1.setForeground(new java.awt.Color(44, 88, 110));
        joLable1.setText("ຊື່ປະເພດສິນຄ້າ");
        joLable1.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 29);
        getContentPane().add(joLable1, gridBagConstraints);

        joTextField1.setJoLineColor(new java.awt.Color(44, 88, 110));
        joTextField1.setPlaceholder("ຊື່ປະເພດສິນຄ້າ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 10, 29);
        getContentPane().add(joTextField1, gridBagConstraints);

        joButtonIconfont1.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont1.setText("ບັນທຶກ");
        joButtonIconfont1.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.SAVE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 0);
        getContentPane().add(joButtonIconfont1, gridBagConstraints);

        joButtonIconfont2.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont2.setText("ລົບ");
        joButtonIconfont2.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.DELETE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 29);
        getContentPane().add(joButtonIconfont2, gridBagConstraints);

        setSize(new java.awt.Dimension(342, 243));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.JoButtonIconfont joButtonIconfont1;
    private Components.JoButtonIconfont joButtonIconfont2;
    private Components.JoLable joLable1;
    private Components.JoTextField joTextField1;
    // End of variables declaration//GEN-END:variables
}
