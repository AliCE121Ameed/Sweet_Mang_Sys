package gui;



import Package_Sweet.DataBase;


/**
 * AdminFrame class represents the admin dashboard where the admin can manage accounts,
 * content, monitoring, and reporting, and also log out.
 */
public class Admin_GUI extends javax.swing.JFrame {

    private DataBase dataBase;

    /**
     * Creates new form AdminFrame
     */
    public Admin_GUI(DataBase dataBase) {
        this.dataBase = dataBase;
        initComponents();
    }




    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        monitoringAndReportingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageAccountsButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        contentManagementButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        monitoringAndReportingButton.setBackground(new java.awt.Color(0, 0, 0));
        monitoringAndReportingButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        monitoringAndReportingButton.setForeground(new java.awt.Color(255, 255, 255));
        monitoringAndReportingButton.setText("Monitoring and Reporting");
        monitoringAndReportingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitoringAndReportingButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Admin Page");

        manageAccountsButton.setBackground(new java.awt.Color(0, 0, 0));
        manageAccountsButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        manageAccountsButton.setForeground(new java.awt.Color(255, 255, 255));
        manageAccountsButton.setText("Manage Accounts");
        manageAccountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountsButtonActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(255, 102, 102));
        logOutButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(0, 0, 0));
        logOutButton.setText("Logout");

        contentManagementButton.setBackground(new java.awt.Color(0, 0, 0));
        contentManagementButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        contentManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        contentManagementButton.setText("Content Management");
        contentManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentManagementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(258, 258, 258)
                                                .addComponent(manageAccountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(contentManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(monitoringAndReportingButton)))
                                .addContainerGap(40, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(218, 218, 218)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(contentManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(monitoringAndReportingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(manageAccountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(logOutButton)
                                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>











    private void manageAccountsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Manage_Accounts_GUI manageAccountsFrame = new Manage_Accounts_GUI(dataBase);
        manageAccountsFrame.setVisible(true);
        this.setVisible(false);
    }

    private void contentManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Content_Manag_GUI contentManagementFrame = new Content_Manag_GUI(dataBase);
        contentManagementFrame.setVisible(true);
        this.setVisible(false);
    }

    private void monitoringAndReportingButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Monitoring_And_Reporting_GUI monitoringAndReportingFrame = new Monitoring_And_Reporting_GUI(dataBase);
        monitoringAndReportingFrame.setVisible(true);
        this.setVisible(false);
    }

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Login_GUI loginFrame = new Login_GUI(dataBase);
        loginFrame.setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_GUI(new DataBase()).setVisible(true);
            }
        });
    }




    private javax.swing.JButton contentManagementButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton manageAccountsButton;
    private javax.swing.JButton monitoringAndReportingButton;

