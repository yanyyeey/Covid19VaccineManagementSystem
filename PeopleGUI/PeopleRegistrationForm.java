package PeopleGUI;

import Classes.PeopleAccRegistration;
import Classes.VaccinationAppointment;
import Classes.VaccinationCenter;
import HelperClasses.Logging;
import HelperClasses.State;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PeopleRegistrationForm extends javax.swing.JFrame {

    public PeopleRegistrationForm() {
        initComponents();
    }

    public PeopleRegistrationForm(String userName, String userId, String ic) {
        initComponents();
        ArrayList<PeopleAccRegistration> allPeopleAccounts = new ArrayList<>();
        allPeopleAccounts = PeopleAccRegistration.getAllPeopleAccounts();

        for (PeopleAccRegistration account : allPeopleAccounts) {
            if (userName.equals(account.getName()) && userId.equals(account.getPeopleId())) {
                txtContact.setText(account.getContact());
                txtEmail.setText(account.getEmail());
            }
        }

        txtName.setText(userName);
        lblUserId.setText(userId);
        txtICOrPassport.setText(ic);

        txtName.setEditable(false);
        txtICOrPassport.setEditable(false);
        txtContact.setEditable(false);
        txtEmail.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerfor = new javax.swing.ButtonGroup();
        closecontact = new javax.swing.ButtonGroup();
        healthcondition = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAppointmentId = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtICOrPassport = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rbtnHealthNo = new javax.swing.JRadioButton();
        rbtnHealthYes = new javax.swing.JRadioButton();
        rbtnCloseNo = new javax.swing.JRadioButton();
        rbtnCloseYes = new javax.swing.JRadioButton();
        txtReason = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbVaccinationCenter = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblUserId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 221, 212));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(220, 530));
        jPanel2.setMinimumSize(new java.awt.Dimension(220, 530));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 530));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel4.setText("Programme");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setText("Vaccination");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("Registration");

        lblAppointmentId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblAppointmentId.setForeground(new java.awt.Color(255, 255, 255));
        lblAppointmentId.setText("Registration");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(47, 47, 47))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(lblAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        btnClose.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 0, -1, -1));

        txtContact.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtContact.setBorder(null);
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 260, 34));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel6.setText("Notifications for appointment booking and reminders will be sent to your number and email.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel9.setText("Contact Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel10.setText("Email");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        txtEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 260, 34));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel12.setText("Full Name as per IC / Passport");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        txtICOrPassport.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtICOrPassport.setBorder(null);
        jPanel1.add(txtICOrPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 260, 34));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel13.setText("NRIC (Citizen) / Passport (Non-citizen)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 260, 34));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel8.setText("Do you have any health condition?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel14.setText("Have you had close contact to confirmed or suspected case of COVID-19 within");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel15.setText("14 days?");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        rbtnHealthNo.setBackground(new java.awt.Color(186, 221, 212));
        healthcondition.add(rbtnHealthNo);
        rbtnHealthNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        rbtnHealthNo.setText("No");
        jPanel1.add(rbtnHealthNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        rbtnHealthYes.setBackground(new java.awt.Color(186, 221, 212));
        healthcondition.add(rbtnHealthYes);
        rbtnHealthYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        rbtnHealthYes.setText("Yes (Please Specify)");
        jPanel1.add(rbtnHealthYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        rbtnCloseNo.setBackground(new java.awt.Color(186, 221, 212));
        closecontact.add(rbtnCloseNo);
        rbtnCloseNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        rbtnCloseNo.setText("No");
        jPanel1.add(rbtnCloseNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        rbtnCloseYes.setBackground(new java.awt.Color(186, 221, 212));
        closecontact.add(rbtnCloseYes);
        rbtnCloseYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        rbtnCloseYes.setText("Yes");
        jPanel1.add(rbtnCloseYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        txtReason.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtReason.setBorder(null);
        jPanel1.add(txtReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 270, 25));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("Preferred Vaccination Centre");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 260, -1));

        cmbVaccinationCenter.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cmbVaccinationCenter.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbVaccinationCenterPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel1.add(cmbVaccinationCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 270, -1));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel17.setText("State");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        cmbState.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Kedah", "Kelantan", "Kuala Lumpur", "Labuan", "Malacca", "Negeri Sembilan", "Pahang", "Perak", "Perlis", "Putrajaya", "Sabah ", "Sarawak", "Terengganu" }));
        jPanel1.add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        btnBack.setBackground(new java.awt.Color(82, 137, 128));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 100, 40));

        btnSubmit.setBackground(new java.awt.Color(82, 137, 128));
        btnSubmit.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 100, 40));

        lblUserId.setBackground(new java.awt.Color(186, 221, 212));
        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(186, 221, 212));
        lblUserId.setText("Registration");
        jPanel1.add(lblUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 70, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            Logging.logoutLog(lblUserId.getText(), "People");
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //Validate vaccination center (check if selected)
        if (cmbVaccinationCenter.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Please select a vaccination center", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Retrive data from form
        String appointmentId, patientName, patientId, state, vaccinationCenter, vaccineType, healthCondition, closeContact, appointmentStatus, registeredDateString, appointmentDate, appointmentTime;
        LocalDate registeredDate;

        appointmentId = lblAppointmentId.getText();
        patientName = txtName.getText();
        patientId = txtICOrPassport.getText();
        state = cmbState.getSelectedItem().toString();
        vaccinationCenter = cmbVaccinationCenter.getSelectedItem().toString();
        vaccineType = " ";
        registeredDate = LocalDate.now();
        appointmentDate = " ";
        appointmentTime = " ";
        appointmentStatus = "Registered";

        if (rbtnCloseNo.isSelected()) {
            closeContact = rbtnCloseNo.getText();
        } else {
            closeContact = rbtnCloseYes.getText();
        }

        if (rbtnHealthNo.isSelected()) {
            healthCondition = rbtnHealthNo.getText();
        } else {
            healthCondition = txtReason.getText();

        }
        
        //Populates the combo box
        DefaultComboBoxModel<String> centerSelectorList = new DefaultComboBoxModel<>();
        centerSelectorList.addElement(vaccinationCenter);
        cmbVaccinationCenter.setModel(centerSelectorList);

        //Verify that all input are filled
        if (state.isEmpty() || vaccineType.isEmpty() || healthCondition.isEmpty() || closeContact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //All verification checks passed
        registeredDateString = registeredDate.format(DateTimeFormatter.ISO_DATE);

        //Creates an instance of VaccinationAppointment and saves it to the database
        VaccinationAppointment appointment = new VaccinationAppointment(appointmentId, patientName, patientId, state, vaccinationCenter, vaccineType, registeredDateString, appointmentDate, appointmentTime, healthCondition, closeContact, appointmentStatus);
        VaccinationAppointment.saveAppointment(appointment, "Add");
        
        try {
            VaccinationAppointment.generateEmail(appointment, "People", txtEmail.getText(), "Vaccination Programme");
            
        } catch (MessagingException ex) {
            Logger.getLogger(PeopleRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Logging.activityLog(lblUserId.getText(), "People", "28");

        new PeopleMainMenu(txtName.getText(), lblUserId.getText(), txtICOrPassport.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want cancel registration?", "Cancel Registration", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            new PeopleMainMenu(txtName.getText(), lblUserId.getText(), txtICOrPassport.getText()).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        lblAppointmentId.setText(VaccinationAppointment.generateAppointmentId());
        System.out.println(lblAppointmentId.getText());
    }//GEN-LAST:event_formComponentShown

    private void cmbVaccinationCenterPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbVaccinationCenterPopupMenuWillBecomeVisible
        ArrayList<String> centerList = new ArrayList<>();
        ArrayList<VaccinationCenter> allCenter = new ArrayList<>();
        Collection<String> availableCenter;

        //Retrieve the file path based on the state
        String state = cmbState.getSelectedItem().toString();
        String filePath = State.getStateFileDirectory(state, "VaccinationCenter");

        //Retrive all files in the respective state folder
        allCenter = VaccinationCenter.getAllVaccinationCenters(filePath);
        for (VaccinationCenter vc : allCenter) {
            //Add all relevant vaccination center name into array list
            centerList.add(vc.getVaccinationCenterName());
        }

        availableCenter = centerList;

        //Add Vaccination Center Name List to combo box
        DefaultComboBoxModel<String> centerSelector = new DefaultComboBoxModel();
        centerSelector.addAll(availableCenter);
        cmbVaccinationCenter.setModel(centerSelector);
    }//GEN-LAST:event_cmbVaccinationCenterPopupMenuWillBecomeVisible

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
            java.util.logging.Logger.getLogger(PeopleRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup closecontact;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JComboBox<String> cmbVaccinationCenter;
    private javax.swing.ButtonGroup healthcondition;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAppointmentId;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JRadioButton rbtnCloseNo;
    private javax.swing.JRadioButton rbtnCloseYes;
    private javax.swing.JRadioButton rbtnHealthNo;
    private javax.swing.JRadioButton rbtnHealthYes;
    private javax.swing.ButtonGroup registerfor;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtICOrPassport;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtReason;
    // End of variables declaration//GEN-END:variables
}
