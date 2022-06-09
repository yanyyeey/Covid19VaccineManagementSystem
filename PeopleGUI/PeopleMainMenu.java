package PeopleGUI;

import javax.swing.JOptionPane;
import CommonGUI.VaccinationStatus;
import CommonGUI.Login;
import HelperClasses.Logging;

public class PeopleMainMenu extends javax.swing.JFrame {

    public PeopleMainMenu() {
        initComponents();
    }

    public PeopleMainMenu(String userName, String userId, String ic) {
        initComponents();
        lblUserName.setText(userName);
        lblUserId.setText(userId);
        lblIC.setText(ic);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblIC = new javax.swing.JTextField();
        btnClose = new javax.swing.JLabel();
        btnVaccinationStatus = new javax.swing.JLabel();
        btnVaccinationRegister = new javax.swing.JLabel();
        btnManageVaccinationAppointment3 = new javax.swing.JLabel();
        btnViewPersonalDetails = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        lblUserId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 221, 212));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(218, 530));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setText("Welcome,");

        lblUserName.setEditable(false);
        lblUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblUserName.setText("name");
        lblUserName.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        lblIC.setEditable(false);
        lblIC.setBackground(new java.awt.Color(255, 255, 255));
        lblIC.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblIC.setForeground(new java.awt.Color(255, 255, 255));
        lblIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblIC.setText("name");
        lblIC.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblIC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lblIC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClose.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        btnVaccinationStatus.setBackground(new java.awt.Color(135, 196, 180));
        btnVaccinationStatus.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnVaccinationStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4230540_analysis_graph_report_icon.png"))); // NOI18N
        btnVaccinationStatus.setText(" Vaccination Status");
        btnVaccinationStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnVaccinationStatus.setOpaque(true);
        btnVaccinationStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaccinationStatusMouseClicked(evt);
            }
        });

        btnVaccinationRegister.setBackground(new java.awt.Color(135, 196, 180));
        btnVaccinationRegister.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnVaccinationRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4280503_new_outlined_window_browser_new window_icon.png"))); // NOI18N
        btnVaccinationRegister.setText("Vaccination Programme");
        btnVaccinationRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnVaccinationRegister.setOpaque(true);
        btnVaccinationRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaccinationRegisterMouseClicked(evt);
            }
        });

        btnManageVaccinationAppointment3.setBackground(new java.awt.Color(135, 196, 180));
        btnManageVaccinationAppointment3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnManageVaccinationAppointment3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4335985_availability_calendar_custom_programme_schedule_icon.png"))); // NOI18N
        btnManageVaccinationAppointment3.setText(" Vaccination Appointment");
        btnManageVaccinationAppointment3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnManageVaccinationAppointment3.setOpaque(true);
        btnManageVaccinationAppointment3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageVaccinationAppointment3MouseClicked(evt);
            }
        });

        btnViewPersonalDetails.setBackground(new java.awt.Color(135, 196, 180));
        btnViewPersonalDetails.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnViewPersonalDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7738938_report_document_sheet_file_paper_icon.png"))); // NOI18N
        btnViewPersonalDetails.setText("Personal Details");
        btnViewPersonalDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnViewPersonalDetails.setOpaque(true);
        btnViewPersonalDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewPersonalDetailsMouseClicked(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        lblUserId.setEditable(false);
        lblUserId.setBackground(new java.awt.Color(186, 221, 212));
        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(186, 221, 212));
        lblUserId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblUserId.setText("name");
        lblUserId.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnLogout)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                                .addComponent(btnClose)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnManageVaccinationAppointment3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVaccinationRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVaccinationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(137, 137, 137))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnVaccinationRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnManageVaccinationAppointment3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnViewPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnVaccinationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(15, 15, 15))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            Logging.logoutLog(lblUserId.getText(), "People");
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int n = JOptionPane.showConfirmDialog(null, "Would you like to logout?", "Terminate System", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            Logging.logoutLog(lblUserId.getText(), "People");
            System.exit(0);
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnVaccinationStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaccinationStatusMouseClicked
        new VaccinationStatus(lblUserName.getText(), lblUserId.getText(), lblIC.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVaccinationStatusMouseClicked

    private void btnVaccinationRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaccinationRegisterMouseClicked
        new PeopleProgrammeMenu(lblUserName.getText(), lblUserId.getText(), lblIC.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVaccinationRegisterMouseClicked

    private void btnManageVaccinationAppointment3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageVaccinationAppointment3MouseClicked
        new PeopleViewAppointment(lblUserName.getText(), lblUserId.getText(), lblIC.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageVaccinationAppointment3MouseClicked

    private void btnViewPersonalDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPersonalDetailsMouseClicked
        new PeopleViewPersonalDetails(lblUserName.getText(), lblUserId.getText(), lblIC.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewPersonalDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(PeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnManageVaccinationAppointment3;
    private javax.swing.JLabel btnVaccinationRegister;
    private javax.swing.JLabel btnVaccinationStatus;
    private javax.swing.JLabel btnViewPersonalDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lblIC;
    private javax.swing.JTextField lblUserId;
    private javax.swing.JTextField lblUserName;
    // End of variables declaration//GEN-END:variables
}
