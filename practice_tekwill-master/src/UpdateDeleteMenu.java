
import com.tekwill.model.Product;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrei
 */
public class UpdateDeleteMenu extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDeleteMenu
     */
    public UpdateDeleteMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        findByNameField = new javax.swing.JTextField();
        findButton2 = new javax.swing.JButton();
        findLabel2 = new javax.swing.JLabel();
        findByIdField = new javax.swing.JTextField();
        findButton1 = new javax.swing.JButton();
        findLabel1 = new javax.swing.JLabel();
        updateName1Field = new javax.swing.JTextField();
        updateSize1Field = new javax.swing.JTextField();
        updateType1Field = new javax.swing.JTextField();
        updateLabel1 = new javax.swing.JLabel();
        updateButton1 = new javax.swing.JButton();
        updateName2Field = new javax.swing.JTextField();
        updateLabel2 = new javax.swing.JLabel();
        updateButton2 = new javax.swing.JButton();
        updateSize2Field1 = new javax.swing.JTextField();
        updateType2Field = new javax.swing.JTextField();
        deleteButton2 = new javax.swing.JButton();
        deleteNameField = new javax.swing.JTextField();
        deleteLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        deleteIdField = new javax.swing.JTextField();
        deleteLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        findByNameField.setText("Find by Name");

        findButton2.setText("Find");
        findButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton2ActionPerformed(evt);
            }
        });

        findLabel2.setText("  ");

        findByIdField.setText("Find by Id");

        findButton1.setText("Find");
        findButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButton1ActionPerformed(evt);
            }
        });

        findLabel1.setText("  ");

        updateName1Field.setText("Enter name");

        updateSize1Field.setText("Enter size");

        updateType1Field.setText("Enter type");

        updateButton1.setText("Update");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        updateName2Field.setText("Enter name");

        updateButton2.setText("Update");
        updateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton2ActionPerformed(evt);
            }
        });

        updateSize2Field1.setText("Enter size");

        updateType2Field.setText("Enter type");

        deleteButton2.setText("Delete ");
        deleteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton2ActionPerformed(evt);
            }
        });

        deleteNameField.setText("Enter name");

        jButton2.setText("Delete ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        deleteIdField.setText("Enter ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(findButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(findByIdField))
                            .addComponent(findLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(updateType1Field, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(updateSize1Field, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(updateName1Field, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(updateButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(findButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(findByNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updateType2Field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updateSize2Field1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updateName2Field, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findByIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findByNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findButton1)
                    .addComponent(findButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateName2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateName1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateSize1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateType1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton1)
                        .addGap(26, 26, 26)
                        .addComponent(updateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateSize2Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateType2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton2)
                        .addGap(26, 26, 26)
                        .addComponent(updateLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton2)
                        .addGap(41, 41, 41)
                        .addComponent(deleteLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(41, 41, 41)
                        .addComponent(deleteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(157, 157, 157))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    CreateMenu createMenu = new CreateMenu();


    private void findButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton2ActionPerformed

        Product findByName = createMenu.service.find(findByNameField.getText());
        if (findByName != null) {

            findLabel2.setText(findByName.toString());

        } else {
            findLabel2.setText("Can not find product with the specified name");
        }
    }//GEN-LAST:event_findButton2ActionPerformed

    private void findButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButton1ActionPerformed
        try {

            Product findById = createMenu.service.find(Double.parseDouble(findByIdField.getText()));
            if (findById != null) {
                findLabel1.setText(findById.toString());
            } else {

                findLabel1.setText("Can not find product with the specified Id.");
            }
        } catch (NumberFormatException numE) {

            findLabel1.setText("Invalid input only, please try again.");
        }

    }//GEN-LAST:event_findButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        try {

            Product updateProductById = createMenu.service.find(Double.parseDouble(findByIdField.getText()));
            if (updateProductById != null) {
                updateProductById.setSize(Double.parseDouble(updateSize1Field.getText()));
                updateProductById.setName(updateName1Field.getText());
                updateProductById.setType(updateType1Field.getText());
                updateLabel1.setText(updateProductById.toString());
            } else {

                updateLabel1.setText("Can not update the specified product");

            }

        } catch (NumberFormatException numE) {

            updateLabel1.setText("Invalid input");
        }


    }//GEN-LAST:event_updateButton1ActionPerformed

    private void updateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton2ActionPerformed
        try {

            Product updateProductByName = createMenu.service.find(findByNameField.getText());
            if (updateProductByName != null) {

                updateProductByName.setSize(Double.parseDouble(updateSize2Field1.getText()));
                updateProductByName.setName(updateName2Field.getText());
                updateProductByName.setType(updateType2Field.getText());
                updateLabel2.setText(updateProductByName.toString());
            } else {
                updateLabel2.setText("Can not update the specified product, please try again.");

            }
        } catch (NumberFormatException numE) {

            updateLabel2.setText("Invalid input");

        }
    }//GEN-LAST:event_updateButton2ActionPerformed

    private void deleteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton2ActionPerformed
        Product find = createMenu.service.find(deleteNameField.getText());
        if (find != null) {
            createMenu.service.delete(deleteNameField.getText());
            deleteLabel2.setText("The object was deleted");
        } else {
            deleteLabel2.setText("Can not delete product with specified name.");

        }


    }//GEN-LAST:event_deleteButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Product findProduct = createMenu.service.find(Double.parseDouble(deleteIdField.getText()));
            if (findProduct != null) {
                createMenu.service.delete(Integer.parseInt(deleteIdField.getText()));
                deleteLabel1.setText("The object was deleted");
            } else {
                deleteLabel1.setText("Can not delete product with specified id.");

            }
        } catch (NumberFormatException numE) {

            deleteLabel1.setText("Invalid input");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDeleteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton2;
    private javax.swing.JTextField deleteIdField;
    private javax.swing.JLabel deleteLabel1;
    private javax.swing.JLabel deleteLabel2;
    private javax.swing.JTextField deleteNameField;
    private javax.swing.JButton findButton1;
    private javax.swing.JButton findButton2;
    private javax.swing.JTextField findByIdField;
    private javax.swing.JTextField findByNameField;
    private javax.swing.JLabel findLabel1;
    private javax.swing.JLabel findLabel2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton updateButton1;
    private javax.swing.JButton updateButton2;
    private javax.swing.JLabel updateLabel1;
    private javax.swing.JLabel updateLabel2;
    private javax.swing.JTextField updateName1Field;
    private javax.swing.JTextField updateName2Field;
    private javax.swing.JTextField updateSize1Field;
    private javax.swing.JTextField updateSize2Field1;
    private javax.swing.JTextField updateType1Field;
    private javax.swing.JTextField updateType2Field;
    // End of variables declaration//GEN-END:variables
}
