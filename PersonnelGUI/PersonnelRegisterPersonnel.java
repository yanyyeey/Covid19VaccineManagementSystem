package PersonnelGUI;

import javax.swing.JOptionPane;
import Classes.PersonnelAccRegistration;
import Classes.VaccinationCenter;
import HelperClasses.EncryptAndDecrypt;
import HelperClasses.Logging;
import HelperClasses.Validation;

public class PersonnelRegisterPersonnel extends javax.swing.JFrame {

    public PersonnelRegisterPersonnel() {
        initComponents();
    }
    
    public PersonnelRegisterPersonnel(String userName, String userId) {
        initComponents();
        lblUserName.setText(userName);
        lblUserId.setText(userId);
        txtPersonnelId.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtICOrPassport = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPersonnelId = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblPaswordValidation = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(186, 221, 212));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(220, 530));
        jPanel2.setMinimumSize(new java.awt.Dimension(220, 530));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setText("Account");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setText("Register");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Account");

        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(255, 255, 255));
        lblUserId.setText("Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnClose.setText("X");
        btnClose.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel12.setText("Staff ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 53, -1, -1));

        txtICOrPassport.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtICOrPassport.setBorder(null);
        jPanel1.add(txtICOrPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 80, 260, 34));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel13.setText("Staff Email");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 182, -1, -1));

        txtPersonnelId.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPersonnelId.setBorder(null);
        jPanel1.add(txtPersonnelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 80, 260, 34));

        btnCancel.setText("Cancel");
        btnCancel.setBackground(new java.awt.Color(82, 137, 128));
        btnCancel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 100, 40));

        btnRegister.setBackground(new java.awt.Color(82, 137, 128));
        btnRegister.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 100, 40));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel14.setText("Staff Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 182, -1, -1));

        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtName.setBorder(null);
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 209, 260, 34));

        txtEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 209, 260, 34));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel15.setText("Staff IC / Passport");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 53, -1, -1));

        lblPaswordValidation.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblPaswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblPaswordValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 280, 17));

        txtConfirmPassword.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        txtConfirmPassword.setBorder(null);

        txtPassword.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPasswordMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel9.setText("Password");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel10.setText("Confirm Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(157, 157, 157))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog (null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
            Logging.logoutLog(lblUserId.getText(), "Personnel");
            System.exit(0); 
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int dialog = JOptionPane.showConfirmDialog(null, "Changes have not been saved! Cancel?", "Cancel Changes", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            new PersonnelManagePeople(lblUserName.getText(), lblUserId.getText()).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //Retrive data from form
        String personnelId, name, ic, email, password, confirmedPassword, encryptedPassword;
        
        personnelId = txtPersonnelId.getText();
        name = txtName.getText();
        ic = txtICOrPassport.getText();
        email = txtEmail.getText();
        password = String.valueOf(txtPassword.getPassword());
        confirmedPassword = String.valueOf(txtConfirmPassword.getPassword());
        
        //Verify all the inputs are filled
        if(name.isEmpty() || ic.isEmpty() || email.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Verify the password and comfirmed password
        if(!(password.equals(confirmedPassword))){
            JOptionPane.showMessageDialog(null, "Password provided are not same. Please try again", "Invalid Password Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Encrypt the password
        encryptedPassword = EncryptAndDecrypt.encryptPassword(password);
        
        //Creates an instance PersonnelAccRegistration and saves it to the database
        PersonnelAccRegistration register = new PersonnelAccRegistration(personnelId, name, ic, email, encryptedPassword);
        PersonnelAccRegistration.savePersonnelRegistration(register, "save");
        Logging.activityLog(lblUserId.getText(), "Personnel", "19");
        
        int n = JOptionPane.showConfirmDialog(null, "Registration has been saved. Add another personnel account?", "Personnel account added", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_NO_OPTION) {
            //If yes, reset the form
            txtName.setText("");
            txtICOrPassport.setText("");
            txtEmail.setText("");
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            txtPersonnelId.setText(VaccinationCenter.generateVaccinationId());
        } else {
            new PersonnelManagePeople(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtPersonnelId.setText(PersonnelAccRegistration.generatePersonnelId());
        System.out.println(txtPersonnelId.getText());
    }//GEN-LAST:event_formComponentShown

    private void txtPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseExited
        //Verify password length
        if(String.valueOf(txtPassword.getPassword()).length() < 8){
            lblPaswordValidation.setText("Password must consist of at least 8 characters");
            return;
        }
    }//GEN-LAST:event_txtPasswordMouseExited

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if(!Validation.isWord(txtName.getText())){
            JOptionPane.showMessageDialog(null, "Only word is allowed", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(!Validation.isEmail(txtEmail.getText())){
            JOptionPane.showMessageDialog(null, "Wrong email format. Please try again!", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonnelRegisterPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelRegisterPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelRegisterPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelRegisterPersonnel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelRegisterPersonnel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPaswordValidation;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtICOrPassport;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPersonnelId;
    // End of variables declaration//GEN-END:variables
}
