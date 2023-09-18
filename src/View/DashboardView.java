package View;

public class DashboardView extends javax.swing.JPanel {

  

    public DashboardView(String Title) {
        initComponents();
        lblTitle.setText(Title);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PnNavigation = new javax.swing.JPanel();
        joButtonIconfont1 = new Components.JoButtonIconfont();
        lblTitle = new Components.JoLable();
        joButtonIconfont2 = new Components.JoButtonIconfont();
        PNLayout = new javax.swing.JPanel();
        PnPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        joTable1 = new Components.JoTable();

        setMaximumSize(new java.awt.Dimension(1366, 768));
        setLayout(new java.awt.GridBagLayout());

        PnNavigation.setBackground(new java.awt.Color(120, 158, 177));
        PnNavigation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(44, 88, 110)));
        PnNavigation.setMaximumSize(new java.awt.Dimension(1660, 50));
        PnNavigation.setMinimumSize(new java.awt.Dimension(100, 50));
        PnNavigation.setPreferredSize(new java.awt.Dimension(0, 60));
        PnNavigation.setLayout(new java.awt.GridBagLayout());

        joButtonIconfont1.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont1.setText("ກັບຄືນ");
        joButtonIconfont1.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.ARROW_BACK);
        joButtonIconfont1.setJocolorHover(new java.awt.Color(54, 108, 135));
        joButtonIconfont1.setMargin(new java.awt.Insets(2, 10, 2, 10));
        joButtonIconfont1.setMaximumSize(new java.awt.Dimension(92, 45));
        joButtonIconfont1.setMinimumSize(new java.awt.Dimension(92, 45));
        joButtonIconfont1.setPreferredSize(new java.awt.Dimension(92, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        PnNavigation.add(joButtonIconfont1, gridBagConstraints);

        lblTitle.setForeground(new java.awt.Color(44, 88, 110));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Title");
        lblTitle.setFont(new java.awt.Font("Phetsarath OT", 0, 24)); // NOI18N
        lblTitle.setMaximumSize(new java.awt.Dimension(89, 45));
        lblTitle.setMinimumSize(new java.awt.Dimension(89, 45));
        lblTitle.setPreferredSize(new java.awt.Dimension(89, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        PnNavigation.add(lblTitle, gridBagConstraints);

        joButtonIconfont2.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont2.setText("ເພີ່ມຂໍ້ມູນ");
        joButtonIconfont2.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.ADD_CIRCLE);
        joButtonIconfont2.setJocolorHover(new java.awt.Color(54, 108, 135));
        joButtonIconfont2.setMargin(new java.awt.Insets(2, 10, 2, 10));
        joButtonIconfont2.setMaximumSize(new java.awt.Dimension(107, 45));
        joButtonIconfont2.setMinimumSize(new java.awt.Dimension(107, 45));
        joButtonIconfont2.setPreferredSize(new java.awt.Dimension(107, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        PnNavigation.add(joButtonIconfont2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        add(PnNavigation, gridBagConstraints);

        PNLayout.setBackground(new java.awt.Color(255, 250, 234));
        PNLayout.setMaximumSize(new java.awt.Dimension(1660, 618));
        PNLayout.setLayout(new java.awt.GridBagLayout());

        PnPanel.setBackground(new java.awt.Color(255, 250, 234));
        PnPanel.setLayout(new java.awt.BorderLayout());

        joTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        joTable1.setJoBackgoundHead(new java.awt.Color(44, 88, 110));
        jScrollPane1.setViewportView(joTable1);

        PnPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        PNLayout.add(PnPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        add(PNLayout, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PNLayout;
    private javax.swing.JPanel PnNavigation;
    private javax.swing.JPanel PnPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.JoButtonIconfont joButtonIconfont1;
    private Components.JoButtonIconfont joButtonIconfont2;
    private Components.JoTable joTable1;
    private Components.JoLable lblTitle;
    // End of variables declaration//GEN-END:variables
}
