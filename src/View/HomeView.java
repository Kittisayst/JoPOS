package View;

import Components.JoButtonIconfont;
import Components.JoScrollBar;
import Tools.JoAlert;
import Tools.JoIconFont;
import Util.JoListMenu;
import Util.Router;
import java.awt.Color;
import jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons;

public class HomeView extends javax.swing.JFrame {

    public static Router router;
    private JoListMenu listMenuManage;
    private JoListMenu listMenuService;
    private JoListMenu listMenuReport;
    private JoListMenu listMenuSetting;

    public HomeView() {
        initComponents();
        router = new Router(PnRouter);
        JoScrollBar scrollBar = new JoScrollBar(jScrollPane1);
        scrollBar.setScrollSizeV(0);
        listMenuManage = new JoListMenu(PnManage);
        listMenuService = new JoListMenu(pnService);
        listMenuReport = new JoListMenu(PnReport);
        listMenuSetting = new JoListMenu(pnSetting);

    }

    public void setUserName(String userName) {
        lblUserName.setText(userName);
        lblUserName.setIcon(new JoIconFont().setIconFont(GoogleMaterialDesignIcons.PERSON, 25, new Color(190, 208, 219)));
    }

    public void setDisplaySideBar() {
        PnSideBar.setVisible(!PnSideBar.isVisible());
    }

    public void setVersion(String version) {
        lblversion.setText("Version: " + version);
        lblTitle.setText("ລະບົບຂາຍໜ້າຮ້ານ JoPOS ເວີເຊິນ: " + version);
    }

    public int getMessage(String title, String message, JoAlert.Icons icons) {
        JoAlert alert = new JoAlert();
        return alert.messages(title, message, icons);
    }

    //=============== GETTER SETTER ============
    public JoButtonIconfont getBtnMenu() {
        return btnMenu;
    }

    //============ ຈັດການຂໍ້ມູນ ==========
    public JoButtonIconfont getBtnCategory() {
        return btnCategory;
    }

    public JoButtonIconfont getBtnLogout() {
        return btnLogout;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PnMenuBar = new javax.swing.JPanel();
        btnMenu = new Components.JoButtonIconfont();
        lblTitle = new Components.JoLable();
        lblUserName = new Components.JoLable();
        PnSideBar = new javax.swing.JPanel();
        PnBand = new javax.swing.JPanel();
        joLabelImage1 = new Components.JoLabelImage();
        joLable3 = new Components.JoLable();
        pnMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnSideMenu = new javax.swing.JPanel();
        btnHome = new Components.JoButtonIconfont();
        btnManage = new Components.JoButtonIconfont();
        PnManage = new javax.swing.JPanel();
        joButtonIconfont4 = new Components.JoButtonIconfont();
        joButtonIconfont5 = new Components.JoButtonIconfont();
        btnCategory = new Components.JoButtonIconfont();
        joButtonIconfont13 = new Components.JoButtonIconfont();
        btnService = new Components.JoButtonIconfont();
        pnService = new javax.swing.JPanel();
        joButtonIconfont7 = new Components.JoButtonIconfont();
        joButtonIconfont8 = new Components.JoButtonIconfont();
        btnReport = new Components.JoButtonIconfont();
        PnReport = new javax.swing.JPanel();
        joButtonIconfont9 = new Components.JoButtonIconfont();
        joButtonIconfont10 = new Components.JoButtonIconfont();
        joButtonIconfont14 = new Components.JoButtonIconfont();
        pnLogout = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnLogout = new Components.JoButtonIconfont();
        lblversion = new Components.JoLable();
        btnSetting = new Components.JoButtonIconfont();
        pnSetting = new javax.swing.JPanel();
        joButtonIconfont11 = new Components.JoButtonIconfont();
        joButtonIconfont12 = new Components.JoButtonIconfont();
        PnRouter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        PnMenuBar.setBackground(new java.awt.Color(44, 88, 110));
        PnMenuBar.setMaximumSize(new java.awt.Dimension(100, 100));
        PnMenuBar.setPreferredSize(new java.awt.Dimension(0, 50));
        PnMenuBar.setLayout(new java.awt.GridBagLayout());

        btnMenu.setBackground(new java.awt.Color(39, 79, 99));
        btnMenu.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.MENU);
        btnMenu.setJocolorHover(new java.awt.Color(190, 208, 219));
        btnMenu.setMargin(new java.awt.Insets(2, 10, 2, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        PnMenuBar.add(btnMenu, gridBagConstraints);

        lblTitle.setForeground(new java.awt.Color(190, 208, 219));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("JoPOS");
        lblTitle.setFont(new java.awt.Font("Phetsarath OT", 1, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        PnMenuBar.add(lblTitle, gridBagConstraints);

        lblUserName.setForeground(new java.awt.Color(190, 208, 219));
        lblUserName.setText("userName");
        lblUserName.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        PnMenuBar.add(lblUserName, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(PnMenuBar, gridBagConstraints);

        PnSideBar.setBackground(new java.awt.Color(102, 102, 0));
        PnSideBar.setMaximumSize(new java.awt.Dimension(300, 300));
        PnSideBar.setPreferredSize(new java.awt.Dimension(300, 500));
        PnSideBar.setLayout(new java.awt.GridBagLayout());

        PnBand.setBackground(new java.awt.Color(44, 88, 110));
        PnBand.setMaximumSize(new java.awt.Dimension(50, 50));
        PnBand.setMinimumSize(new java.awt.Dimension(50, 50));
        PnBand.setPreferredSize(new java.awt.Dimension(300, 50));
        PnBand.setLayout(new java.awt.GridBagLayout());

        joLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/jc.png"))); // NOI18N
        joLabelImage1.setIconGrap(2);
        joLabelImage1.setIconTextGap(0);
        joLabelImage1.setPreferredSize(new java.awt.Dimension(45, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        PnBand.add(joLabelImage1, gridBagConstraints);

        joLable3.setForeground(new java.awt.Color(190, 208, 219));
        joLable3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joLable3.setText("ລະບົບ JoPOS");
        joLable3.setFont(new java.awt.Font("Phetsarath OT", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnBand.add(joLable3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        PnSideBar.add(PnBand, gridBagConstraints);

        pnMenu.setBackground(new java.awt.Color(44, 88, 110));
        pnMenu.setMaximumSize(new java.awt.Dimension(50, 32767));
        pnMenu.setMinimumSize(new java.awt.Dimension(50, 100));
        pnMenu.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnSideMenu.setBackground(new java.awt.Color(44, 88, 110));
        java.awt.GridBagLayout pnSideMenuLayout = new java.awt.GridBagLayout();
        pnSideMenuLayout.columnWidths = new int[] {0};
        pnSideMenuLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        pnSideMenu.setLayout(pnSideMenuLayout);

        btnHome.setBackground(new java.awt.Color(39, 79, 99));
        btnHome.setText("Home");
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.HOME);
        btnHome.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(20, 5, 5, 5);
        pnSideMenu.add(btnHome, gridBagConstraints);

        btnManage.setBackground(new java.awt.Color(39, 79, 99));
        btnManage.setText("ຈັດການຂໍ້ມູນ");
        btnManage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManage.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.STORAGE);
        btnManage.setJocolorHover(new java.awt.Color(74, 124, 153));
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(btnManage, gridBagConstraints);

        PnManage.setOpaque(false);
        PnManage.setLayout(new java.awt.GridBagLayout());

        joButtonIconfont4.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont4.setText("ຈັດການຂໍ້ມູນສິນຄ້າ");
        joButtonIconfont4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont4.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.DNS);
        joButtonIconfont4.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnManage.add(joButtonIconfont4, gridBagConstraints);

        joButtonIconfont5.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont5.setText("ຈັດການຂໍ້ມູນຜູ້ໃຊ້ງານ");
        joButtonIconfont5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont5.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.GROUP);
        joButtonIconfont5.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnManage.add(joButtonIconfont5, gridBagConstraints);

        btnCategory.setBackground(new java.awt.Color(44, 88, 110));
        btnCategory.setText("ຈັດການຂໍ້ມູນປະເພດສິນຄ້າ");
        btnCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCategory.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.GRADIENT);
        btnCategory.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnManage.add(btnCategory, gridBagConstraints);

        joButtonIconfont13.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont13.setText("ຈັດການຂໍ້ມູນຫົວໜ່ວຍສິນຄ້າ");
        joButtonIconfont13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont13.setJoIconSize(30);
        joButtonIconfont13.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.FIBER_SMART_RECORD);
        joButtonIconfont13.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnManage.add(joButtonIconfont13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(PnManage, gridBagConstraints);

        btnService.setBackground(new java.awt.Color(39, 79, 99));
        btnService.setText("ການບໍລິການ");
        btnService.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnService.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.IMPORTANT_DEVICES);
        btnService.setJocolorHover(new java.awt.Color(74, 124, 153));
        btnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(btnService, gridBagConstraints);

        pnService.setOpaque(false);
        pnService.setLayout(new java.awt.GridBagLayout());

        joButtonIconfont7.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont7.setText("ການຂາຍໜ້າຮ້ານ");
        joButtonIconfont7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont7.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.MONETIZATION_ON);
        joButtonIconfont7.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        pnService.add(joButtonIconfont7, gridBagConstraints);

        joButtonIconfont8.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont8.setText("ການສັ່ງຊື້ສິນຄ້າ");
        joButtonIconfont8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont8.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.LOCAL_SHIPPING);
        joButtonIconfont8.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        pnService.add(joButtonIconfont8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(pnService, gridBagConstraints);

        btnReport.setBackground(new java.awt.Color(39, 79, 99));
        btnReport.setText("ລາຍງານ");
        btnReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReport.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.INSERT_CHART);
        btnReport.setJocolorHover(new java.awt.Color(74, 124, 153));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(btnReport, gridBagConstraints);

        PnReport.setOpaque(false);
        PnReport.setLayout(new java.awt.GridBagLayout());

        joButtonIconfont9.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont9.setText("ລາຍງານການຂາຍ");
        joButtonIconfont9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont9.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.RECEIPT);
        joButtonIconfont9.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnReport.add(joButtonIconfont9, gridBagConstraints);

        joButtonIconfont10.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont10.setText("ລາຍງານສິນຄ້າຂາຍດີ");
        joButtonIconfont10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont10.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.BRIGHTNESS_AUTO);
        joButtonIconfont10.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnReport.add(joButtonIconfont10, gridBagConstraints);

        joButtonIconfont14.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont14.setText("ລາຍງານສິນຄ້າ");
        joButtonIconfont14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont14.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.ASSIGNMENT);
        joButtonIconfont14.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        PnReport.add(joButtonIconfont14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(PnReport, gridBagConstraints);

        pnLogout.setMaximumSize(new java.awt.Dimension(10, 100));
        pnLogout.setMinimumSize(new java.awt.Dimension(10, 100));
        pnLogout.setOpaque(false);
        pnLogout.setPreferredSize(new java.awt.Dimension(10, 100));
        pnLogout.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        pnLogout.add(jPanel1, gridBagConstraints);

        btnLogout.setBackground(new java.awt.Color(255, 104, 66));
        btnLogout.setText("ອອກຈາກລະບົບ");
        btnLogout.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.HIGHLIGHT_OFF);
        btnLogout.setJocolorHover(new java.awt.Color(255, 134, 104));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnLogout.add(btnLogout, gridBagConstraints);

        lblversion.setForeground(new java.awt.Color(190, 208, 219));
        lblversion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblversion.setText("version");
        lblversion.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pnLogout.add(lblversion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(pnLogout, gridBagConstraints);

        btnSetting.setBackground(new java.awt.Color(39, 79, 99));
        btnSetting.setText("ຕັ້ງຄ່າ");
        btnSetting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSetting.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.SETTINGS);
        btnSetting.setJocolorHover(new java.awt.Color(74, 124, 153));
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(btnSetting, gridBagConstraints);

        pnSetting.setOpaque(false);
        pnSetting.setLayout(new java.awt.GridBagLayout());

        joButtonIconfont11.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont11.setText("ຕັ້ງຄ່າບິນ");
        joButtonIconfont11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont11.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.RECEIPT);
        joButtonIconfont11.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        pnSetting.add(joButtonIconfont11, gridBagConstraints);

        joButtonIconfont12.setBackground(new java.awt.Color(44, 88, 110));
        joButtonIconfont12.setText("ຕັ້ງຄ່າປີ້ນເຕີ");
        joButtonIconfont12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        joButtonIconfont12.setJoIcons(jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons.PRINT);
        joButtonIconfont12.setJocolorHover(new java.awt.Color(74, 124, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        pnSetting.add(joButtonIconfont12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pnSideMenu.add(pnSetting, gridBagConstraints);

        jScrollPane1.setViewportView(pnSideMenu);

        pnMenu.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        PnSideBar.add(pnMenu, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(PnSideBar, gridBagConstraints);

        PnRouter.setBackground(new java.awt.Color(190, 208, 219));
        PnRouter.setMaximumSize(new java.awt.Dimension(1366, 768));
        PnRouter.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout PnRouterLayout = new javax.swing.GroupLayout(PnRouter);
        PnRouter.setLayout(PnRouterLayout);
        PnRouterLayout.setHorizontalGroup(
            PnRouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PnRouterLayout.setVerticalGroup(
            PnRouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(PnRouter, gridBagConstraints);

        setSize(new java.awt.Dimension(1382, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        listMenuManage.setDisplay();
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        listMenuService.setDisplay();
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        listMenuReport.setDisplay();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        listMenuSetting.setDisplay();
    }//GEN-LAST:event_btnSettingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnBand;
    private javax.swing.JPanel PnManage;
    private javax.swing.JPanel PnMenuBar;
    private javax.swing.JPanel PnReport;
    private javax.swing.JPanel PnRouter;
    private javax.swing.JPanel PnSideBar;
    private Components.JoButtonIconfont btnCategory;
    private Components.JoButtonIconfont btnHome;
    private Components.JoButtonIconfont btnLogout;
    private Components.JoButtonIconfont btnManage;
    private Components.JoButtonIconfont btnMenu;
    private Components.JoButtonIconfont btnReport;
    private Components.JoButtonIconfont btnService;
    private Components.JoButtonIconfont btnSetting;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.JoButtonIconfont joButtonIconfont10;
    private Components.JoButtonIconfont joButtonIconfont11;
    private Components.JoButtonIconfont joButtonIconfont12;
    private Components.JoButtonIconfont joButtonIconfont13;
    private Components.JoButtonIconfont joButtonIconfont14;
    private Components.JoButtonIconfont joButtonIconfont4;
    private Components.JoButtonIconfont joButtonIconfont5;
    private Components.JoButtonIconfont joButtonIconfont7;
    private Components.JoButtonIconfont joButtonIconfont8;
    private Components.JoButtonIconfont joButtonIconfont9;
    private Components.JoLabelImage joLabelImage1;
    private Components.JoLable joLable3;
    private Components.JoLable lblTitle;
    private Components.JoLable lblUserName;
    private Components.JoLable lblversion;
    private javax.swing.JPanel pnLogout;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnService;
    private javax.swing.JPanel pnSetting;
    private javax.swing.JPanel pnSideMenu;
    // End of variables declaration//GEN-END:variables
}
