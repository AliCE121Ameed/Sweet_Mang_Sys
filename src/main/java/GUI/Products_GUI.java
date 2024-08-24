package GUI;

import Package_Sweet.DataBase;
import Package_Sweet.Owner;
import Package_Sweet.Product;

import javax.swing.*;

public class Products_GUI extends javax.swing.JFrame {

    private Owner owner;
    private DataBase dataBase;


    public Products_GUI(DataBase dataBase, Owner owner) {
        this.owner = owner;
        this.dataBase = dataBase;
        initComponents();
    }


    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        productPriceField = new javax.swing.JTextField();
        productNameField.addActionListener(e -> productNameFieldActionPerformed());
    productPriceField.addActionListener(e -> productPriceFieldActionPerformed());
        backButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        actionComboBox = new javax.swing.JComboBox();  //
        allergicRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setText("Products Owner Page");

        productNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        productPriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        backButton.setBackground(new java.awt.Color(255, 102, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("← Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        okButton.setBackground(new java.awt.Color(0, 0, 0));
        okButton.setFont(new java.awt.Font("Segoe UI", 3, 21)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("Save");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        actionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"add", "edit", "delete"}));

        allergicRadioButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        allergicRadioButton.setText("Allergic");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 21)); // NOI18N
        jLabel7.setText(" Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 21)); // NOI18N
        jLabel8.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(allergicRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(actionComboBox, 0, 98, Short.MAX_VALUE))
                                                                .addGap(46, 46, 46))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(productPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(171, 171, 171))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(backButton)
                                                .addGap(334, 350, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(actionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(59, 59, 59))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(productPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(allergicRadioButton)))
                                .addGap(40, 40, 40)
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(backButton)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Navigate back to the previous frame, perhaps OwnerFrame
        Owner_GUI ownerFrame = new Owner_GUI(dataBase, owner);
        ownerFrame.setVisible(true);
        this.setVisible(false);
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String action = actionComboBox.getSelectedItem().toString();
        String productName = productNameField.getText();
        String priceText = productPriceField.getText();
        boolean allergic = allergicRadioButton.isSelected();

        if (productName.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both product name and price.");
            return;
        }

        double price;
        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price.");
            return;
        }

        if (action.equals("add")) {
            addProduct(productName, price, allergic);
        } else if (action.equals("edit")) {
            editProduct(productName, price, allergic);
        } else if (action.equals("delete")) {
            deleteProduct(productName);
        } else {
            JOptionPane.showMessageDialog(this, "Unknown action.");
        }

        // Update the owner in the database after any changes
        dataBase.updateOwner(owner);
    }


    private void productNameFieldActionPerformed{
       
    }

    private void productPriceFieldActionPerformed {
      
    }

    private void addProduct(String name, double price, boolean allergic) {
        for (Product product : owner.getList()) {
            if (product.getName().equals(name)) {
                JOptionPane.showMessageDialog(this, "Product already exists. Please use the edit option.");
                return;
            }
        }

        Product newProduct = new Product(name, price, allergic);
        owner.getList().add(newProduct);
        JOptionPane.showMessageDialog(this, "Product added successfully.");
    }

    private void editProduct(String name, double price, boolean allergic) {
        for (Product product : owner.getList()) {
            if (product.getName().equals(name)) {
                product.setPrice(price);
                product.setAllergic(allergic);
                JOptionPane.showMessageDialog(this, "Product updated successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Product not found.");
    }

    private void deleteProduct(String name) {
        for (Product product : owner.getList()) {
            if (product.getName().equals(name)) {
                owner.getList().remove(product);
                JOptionPane.showMessageDialog(this, "Product deleted successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Product not found.");
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
            java.util.logging.Logger.getLogger(Products_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products_GUI(new DataBase(), new Owner("John Doe", "password", "email@example.com", "New York")).setVisible(true);
            }
        });
    }


    private javax.swing.JComboBox<String> actionComboBox;
    private javax.swing.JRadioButton allergicRadioButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField productPriceField;

}
