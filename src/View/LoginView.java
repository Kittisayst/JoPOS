package View;

import Components.JoButtonIconfont;
import Components.JoPasswordField;
import Tools.JoAlert;

public class LoginView extends javax.swing.JFrame {

    private final JoAlert alert = new JoAlert();

    public LoginView() {
        initComponents();
    }

    public JoButtonIconfont getBtnLogin() {
        return btnLogin;
    }

    public String getUser() {
        return txtUser.getText();
    }

    public String getPassword() {
        return new String(txtPassword.getPassword());
    }

    public void getMessage(String Title, String message, JoAlert.Icons icons) {
        alert.messages(Title, message, icons);
    }

    public JoPasswordField getTxtPassword() {
        return txtPassword;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        joLabelImage1 = new Components.JoLabelImage();
        joLable4 = new Components.JoLable();
        lblVersion = new Components.JoLable();
        jPanel2 = new javax.swing.JPanel();
        joLable1 = new Components.JoLable();
        joLable2 = new Components.JoLable();
        joLable3 = new Components.JoLable();
        txtUser = new Components.JoTextField();
        txtPassword = new Components.JoPasswordField();
        btnLogin = new Components.JoButtonIconfont();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(44, 88, 110));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        joLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/jc.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.ipady = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(joLabelImage1, gridBagConstraints);

        joLable4.setForeground(new java.awt.Color(190, 208, 219));
        joLable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        joLable4.setText("ຕິດຕໍ່: 020 97717015");
        joLable4.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(joLable4, gridBagConstraints);

        lblVersion.setForeground(new java.awt.Color(190, 208, 219));
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("JoPOS version");
        lblVersion.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(lblVersion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(190, 208, 219));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 169));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 556));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0};
        jPanel2Layout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanel2.setLayout(jPanel2Layout);

        joLable1.setForeground(new java.awt.Color(44, 88, 110));
        joLable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        joLable1.setText("ລະບົບ JoPOS");
        joLable1.setFont(new java.awt.Font("Phetsarath OT", 1, 36)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 89;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel2.add(joLable1, gridBagConstraints);

        joLable2.setText("UserName");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(joLable2, gridBagConstraints);

        joLable3.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 246;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(joLable3, gridBagConstraints);

        txtUser.setPlaceholder("UserName");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 299;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(txtUser, gridBagConstraints);

        txtPassword.setPlaceholder("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 299;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(txtPassword, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(174, 191, 201));
        btnLogin.setText("Login");
        btnLogin.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        btnLogin.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.LOCK);
        btnLogin.setJocolorHover(new java.awt.Color(44, 88, 110));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(btnLogin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanel2, gridBagConstraints);

        setSize(new java.awt.Dimension(934, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.JoButtonIconfont btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Components.JoLabelImage joLabelImage1;
    private Components.JoLable joLable1;
    private Components.JoLable joLable2;
    private Components.JoLable joLable3;
    private Components.JoLable joLable4;
    private Components.JoLable lblVersion;
    private Components.JoPasswordField txtPassword;
    private Components.JoTextField txtUser;
    // End of variables declaration//GEN-END:variables

    public void setVersion(String valueAt) {
       lblVersion.setText(valueAt);
    }

}
