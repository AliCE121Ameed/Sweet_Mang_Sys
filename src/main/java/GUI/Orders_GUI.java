package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.Supplier;

import javax.swing.*;
import java.util.List;

/**
 * OrdersFrame class for managing and displaying orders.
 */
public class Orders_GUI extends javax.swing.JFrame {

    private DataBase dataBase;
    private Owner owner;


    public Orders_GUI(DataBase dataBase, Owner owner) {
        this.dataBase = dataBase;
        this.owner = owner;
        initComponents();
    }


    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {

        makeOrderButton = new javax.swing.JButton();
        showOrdersButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel0 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        makeOrderButton.setBackground(new java.awt.Color(0, 0, 0));
        makeOrderButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        makeOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        makeOrderButton.setText("Create Order");
        makeOrderButton.addActionListener(new java.awt.event.ActionListener() {
    
}

            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeOrderButtonActionPerformed(evt);
            }
        });

        showOrdersButton.setBackground(new java.awt.Color(0, 0, 0));
        showOrdersButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        showOrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        showOrdersButton.setText("Show Order");
        showOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOrdersButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel0.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel0.setText("Order Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton)
                                .addContainerGap(383, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(showOrdersButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(makeOrderButton, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel0)
                                .addGap(63, 63, 63)
                                .addComponent(makeOrderButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showOrdersButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>





    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Owner_GUI ownerFrame = new Owner_GUI(dataBase, owner);
        ownerFrame.setVisible(true);
        this.dispose();
    }

    private void makeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String supplierName = JOptionPane.showInputDialog(this, "Enter the supplier's name:");
        String productName = JOptionPane.showInputDialog(this, "Enter the product name:");

        if (supplierName == null || productName == null || supplierName.isEmpty() || productName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide both supplier name and product name.");
            return;
        }

        Supplier supplier = findSupplierByName(supplierName);

        if (supplier == null) {
            JOptionPane.showMessageDialog(this, "Supplier not found.");
        } else {
            String order = "Order: " + productName + " from " + owner.getName();
            supplier.getOrders().add(order);
            owner.getMyOrders().add(order);
            JOptionPane.showMessageDialog(this, "Order placed successfully!");
        }
    }

    private void showOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        List<String> orders = owner.getOrders();

        if (orders == null || orders.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No orders available.");
        } else {
            StringBuilder ordersMessage = new StringBuilder("Your Orders:\n");
            for (String order : orders) {
                ordersMessage.append(order).append("\n");
            }
            JOptionPane.showMessageDialog(this, ordersMessage.toString());
        }
    }

    private Supplier findSupplierByName(String name) {
        for (Supplier supplier : dataBase.signedSuppliers) {
            if (supplier.getName().equalsIgnoreCase(name)) {
                return supplier;
            }
        }
        return null;
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
            java.util.logging.Logger.getLogger(Orders_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Pass the actual owner and database here
                new Orders_GUI(new DataBase(), new Owner("OwnerName", "password", "email", "city")).setVisible(true);
            }
        });
    }

 
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JButton makeOrderButton;
    private javax.swing.JButton showOrdersButton;

}
