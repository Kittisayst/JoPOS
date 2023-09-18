package View;

import Components.JoButtonIconfont;
import Components.JoTable;
import Tools.JoDataTable;

public class UnitView extends javax.swing.JPanel {

    private JoDataTable dataTable;

    public UnitView(String Title) {
        initComponents();
        lblTitle.setText(Title);
    }

    public void showData() {
        tbData.JoClearModel();
        tbData.JoClearModel();
        PnData.removeAll();
        PnData.add(jScrollPane1);
        //=============
        dataTable = new JoDataTable(PnData);
        dataTable.setHiddenColumns(1);
        dataTable.showDataTableAll();
    }

    public int getID() {
        return tbData.getIntValue(1);
    }

    //============= GETTER SETTER ==================
    public JoButtonIconfont getBtnAdd() {
        return btnAdd;
    }

    public JoButtonIconfont getBtnBack() {
        return btnBack;
    }

    public JoTable getTbData() {
        return tbData;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PnNavigation = new javax.swing.JPanel();
        btnBack = new Components.JoButtonIconfont();
        lblTitle = new Components.JoLable();
        btnAdd = new Components.JoButtonIconfont();
        PNLayout = new javax.swing.JPanel();
        PnData = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new Components.JoTable();

        setMaximumSize(new java.awt.Dimension(1366, 768));
        setLayout(new java.awt.GridBagLayout());

        PnNavigation.setBackground(new java.awt.Color(120, 158, 177));
        PnNavigation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(44, 88, 110)));
        PnNavigation.setMaximumSize(new java.awt.Dimension(1660, 50));
        PnNavigation.setMinimumSize(new java.awt.Dimension(100, 50));
        PnNavigation.setPreferredSize(new java.awt.Dimension(0, 60));
        PnNavigation.setLayout(new java.awt.GridBagLayout());

        btnBack.setBackground(new java.awt.Color(44, 88, 110));
        btnBack.setText("ກັບຄືນ");
        btnBack.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.ARROW_BACK);
        btnBack.setJocolorHover(new java.awt.Color(54, 108, 135));
        btnBack.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnBack.setMaximumSize(new java.awt.Dimension(92, 45));
        btnBack.setMinimumSize(new java.awt.Dimension(92, 45));
        btnBack.setPreferredSize(new java.awt.Dimension(92, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        PnNavigation.add(btnBack, gridBagConstraints);

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

        btnAdd.setBackground(new java.awt.Color(44, 88, 110));
        btnAdd.setText("ເພີ່ມຂໍ້ມູນ");
        btnAdd.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.ADD_CIRCLE);
        btnAdd.setJocolorHover(new java.awt.Color(54, 108, 135));
        btnAdd.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnAdd.setMaximumSize(new java.awt.Dimension(107, 45));
        btnAdd.setMinimumSize(new java.awt.Dimension(107, 45));
        btnAdd.setPreferredSize(new java.awt.Dimension(107, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        PnNavigation.add(btnAdd, gridBagConstraints);

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

        PnData.setBackground(new java.awt.Color(255, 250, 234));
        PnData.setLayout(new java.awt.BorderLayout());

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.setJoBackgoundHead(new java.awt.Color(44, 88, 110));
        jScrollPane1.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(0).setMinWidth(80);
            tbData.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbData.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        PnData.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        PNLayout.add(PnData, gridBagConstraints);

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
    private javax.swing.JPanel PnData;
    private javax.swing.JPanel PnNavigation;
    private Components.JoButtonIconfont btnAdd;
    private Components.JoButtonIconfont btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.JoLable lblTitle;
    private Components.JoTable tbData;
    // End of variables declaration//GEN-END:variables
}
