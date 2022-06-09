package PersonnelGUI;

import Classes.PeopleAccRegistration;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeIncrement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import Classes.VaccinationAppointment;
import Classes.VaccinationCenter;
import HelperClasses.Logging;
import HelperClasses.State;
import HelperClasses.Validation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.DefaultComboBoxModel;

public class PersonnelAddVaccinationAppointment extends javax.swing.JFrame {

    private boolean reset = false;
    private String email = null;

    public PersonnelAddVaccinationAppointment() {
        initComponents();
    }

    public PersonnelAddVaccinationAppointment(String userName, String userId) {
        initComponents();
        lblUserName.setText(userName);
        lblUserId.setText(userId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        CloseContactGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JLabel();
        txtRegisteredDate = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblAppointmentId = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dpAppointmentDate = new DatePicker(dateSettings); dateSettings.setDateRangeLimits(LocalDate.now(), LocalDate.now().plusMonths(12));
        TimePickerSettings appointmentTimeSettings = new TimePickerSettings();
        tpAppointmentTime = new TimePicker(appointmentTimeSettings);
        appointmentTimeSettings.generatePotentialMenuTimes(TimeIncrement.ThirtyMinutes, LocalTime.of(8, 00), LocalTime.of(19, 00));
        appointmentTimeSettings.use24HourClockFormat();
        btnAddNewAppointment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtVaccineType = new javax.swing.JTextField();
        txtIC = new javax.swing.JTextField();
        cmbVaccinationCenter = new javax.swing.JComboBox<>();
        rbtnYes = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        btnClose = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHealthCondition = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setText("jLabel10");

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(220, 530));
        jPanel2.setMinimumSize(new java.awt.Dimension(220, 530));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 530));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New");
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        txtUserId.setBackground(new java.awt.Color(255, 255, 255));

        txtRegisteredDate.setBackground(new java.awt.Color(255, 255, 255));

        lblUserId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserId.setText("Appointment");
        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(255, 255, 255));

        lblAppointmentId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAppointmentId.setText("Appointment ID");
        lblAppointmentId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblAppointmentId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Appointment");
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Appointment");
        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegisteredDate)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtUserId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(13, 13, 13))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserId)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegisteredDate)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(323, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(180, 180, 180)))
        );

        jLabel3.setText("Close Contact");
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel4.setText("Vaccination Centre");
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel5.setText("Date");
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel6.setText("NRIC / Passport");
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel7.setText("Heath Condition");
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel8.setText("Name");
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel9.setText("Time");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        dpAppointmentDate.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        tpAppointmentTime.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        btnAddNewAppointment.setText("Add ");
        btnAddNewAppointment.setBackground(new java.awt.Color(82, 137, 128));
        btnAddNewAppointment.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddNewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewAppointmentActionPerformed(evt);
            }
        });

        jLabel10.setText("Vaccine Type");
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        txtVaccineType.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtVaccineType.setBorder(null);
        txtVaccineType.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtIC.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtIC.setBorder(null);
        txtIC.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        cmbVaccinationCenter.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cmbVaccinationCenter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVaccinationCenterItemStateChanged(evt);
            }
        });
        cmbVaccinationCenter.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbVaccinationCenterPopupMenuWillBecomeVisible(evt);
            }
        });

        CloseContactGroup.add(rbtnYes);
        rbtnYes.setText("Yes");
        rbtnYes.setBackground(new java.awt.Color(186, 221, 212));
        rbtnYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        CloseContactGroup.add(rbtnNo);
        rbtnNo.setText("No");
        rbtnNo.setBackground(new java.awt.Color(186, 221, 212));
        rbtnNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        btnClose.setText("X");
        btnClose.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.setBackground(new java.awt.Color(82, 137, 128));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtHealthCondition.setColumns(20);
        txtHealthCondition.setRows(5);
        jScrollPane1.setViewportView(txtHealthCondition);

        jLabel11.setText("State");
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Negeri Sembilan", "Malacca", "Selangor", "Kuala Lumpur", "Putrajaya", "Labuan", "Perak", "Penang", "Kedah", "Perlis", "Terengganu", "Kelantan", "Pahang", "Sabah ", "Sarawak" }));
        cmbState.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtName.setBorder(null);
        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddNewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbtnNo)
                                                .addGap(32, 32, 32)
                                                .addComponent(rbtnYes))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(150, 150, 150))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dpAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cmbVaccinationCenter, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbState, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(tpAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnNo)
                            .addComponent(rbtnYes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVaccinationCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dpAppointmentDate.setDateToToday();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //Random generate a appointment Id
        lblAppointmentId.setText(VaccinationAppointment.generateAppointmentId());
        System.out.println(lblAppointmentId.getText());
    }//GEN-LAST:event_formComponentShown

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            Logging.logoutLog(lblUserId.getText(), "Personnel");
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnAddNewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewAppointmentActionPerformed
        //Validate vaccination center (check if selected)
        if (cmbVaccinationCenter.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Please select a vaccination center", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Retrive data from form
        String appointmentId, patientName, patientId, state, vaccinationCenter, vaccineType, healthCondition, closeContact, appointmentStatus, appointmentDateString, appointmentTimeString, registeredDateString, userId = null;
        LocalDate registeredDate, appointmentDate;
        LocalTime appointmentTime;
        ArrayList<PeopleAccRegistration> allPeopleAccounts = new ArrayList<>();
        allPeopleAccounts = PeopleAccRegistration.getAllPeopleAccounts();
        boolean data = false;

        appointmentId = lblAppointmentId.getText();
        patientName = txtName.getText();
        patientId = txtIC.getText();
        state = cmbState.getSelectedItem().toString();
        vaccinationCenter = cmbVaccinationCenter.getSelectedItem().toString();
        vaccineType = txtVaccineType.getText();
        registeredDate = LocalDate.now();
        appointmentDate = dpAppointmentDate.getDate();
        appointmentTime = tpAppointmentTime.getTime();
        healthCondition = txtHealthCondition.getText();
        appointmentStatus = "Pending";

        if (rbtnNo.isSelected()) {
            closeContact = rbtnNo.getText();
        } else {
            closeContact = rbtnYes.getText();
        }

        //Verify that all input are filled
        if (patientName.isEmpty() || patientId.isEmpty() || state.isEmpty() || vaccineType.isEmpty() || healthCondition.isEmpty() || closeContact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Verify the appointment date and time
        if (appointmentDate == null || appointmentTime == null) {
            JOptionPane.showMessageDialog(null, "Please ensure that you have selected the date and time", "Invalid Date Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //All verification checks passed
        registeredDateString = registeredDate.format(DateTimeFormatter.ISO_DATE);
        appointmentDateString = appointmentDate.format(DateTimeFormatter.ISO_DATE);
        appointmentTimeString = appointmentTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        
        
        for (PeopleAccRegistration account : allPeopleAccounts) {
            if (patientName.equals(account.getName()) && patientId.equals(account.getIcOrPassport())) {
                email = account.getEmail();
                data = true;
                //Creates an instance of VaccinationAppointment and saves it to the database
                VaccinationAppointment appointment = new VaccinationAppointment(appointmentId, patientName, patientId, state, vaccinationCenter, vaccineType, registeredDateString, appointmentDateString, appointmentTimeString, healthCondition, closeContact, appointmentStatus);
                VaccinationAppointment.saveAppointment(appointment, "Add");

                try {
                    VaccinationAppointment.generateEmail(appointment, "Personnel", email, "Vaccination Appointment");
                } catch (MessagingException ex) {
                    System.out.println(ex);
                    Logger.getLogger(PersonnelAddVaccinationAppointment.class.getName()).log(Level.SEVERE, null, ex);
                }

                Logging.activityLog(lblUserId.getText(), "Personnel", "1");

                int n = JOptionPane.showConfirmDialog(null, "Appointment has been saved. Add another appointment?", "Appointment created", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (n == JOptionPane.YES_NO_OPTION) {
                    reset = true;
                    //If yes, reset the form
                    txtName.setText("");
                    txtVaccineType.setText("");
                    txtIC.setText("");
                    cmbState.setSelectedIndex(-1);
                    cmbVaccinationCenter.setSelectedIndex(-1);
                    txtVaccineType.setText("");
                    dpAppointmentDate.setDateToToday();
                    tpAppointmentTime.setText("");
                    txtHealthCondition.setText("");
                    lblAppointmentId.setText(VaccinationAppointment.generateAppointmentId());
                } else {
                    new PersonnelVaccinationAppointment(lblUserName.getText(), lblUserId.getText()).setVisible(true);
                    this.setVisible(false);
                }

            } else if (data != true){
                JOptionPane.showMessageDialog(null, "Please register an account before register for vaccination appointment", "Register Vaccination Appointment Fail!", JOptionPane.ERROR_MESSAGE);
                reset = true;
                txtName.setText("");
                txtVaccineType.setText("");
                txtIC.setText("");
                cmbState.setSelectedIndex(-1);
                cmbVaccinationCenter.setSelectedIndex(-1);
                txtVaccineType.setText("");
                dpAppointmentDate.setDateToToday();
                tpAppointmentTime.setText("");
                txtHealthCondition.setText("");
                lblAppointmentId.setText(VaccinationAppointment.generateAppointmentId());
                return;
            }
        }
    }//GEN-LAST:event_btnAddNewAppointmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new PersonnelVaccinationAppointment(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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

    private void cmbVaccinationCenterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVaccinationCenterItemStateChanged
        if (reset == false) {
            ArrayList<VaccinationCenter> allCenter = new ArrayList<>();
            String selectedVaccinationCenter = evt.getItem().toString();

            //Retrieve the file path based on the state
            String state = cmbState.getSelectedItem().toString();
            String filePath = State.getStateFileDirectory(state, "VaccinationCenter");

            //Retrive all files in the respective state folder
            allCenter = VaccinationCenter.getAllVaccinationCenters(filePath);

            //Retrieve the vaccine provided by the selected vaccination center
            for (VaccinationCenter vc : allCenter) {
                if (selectedVaccinationCenter.equals(vc.getVaccinationCenterName())) {
                    txtVaccineType.setText(vc.getVaccineType());
                }
            }
        }
    }//GEN-LAST:event_cmbVaccinationCenterItemStateChanged

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (!Validation.isWord(txtName.getText())) {
            JOptionPane.showMessageDialog(null, "Only word is allowed", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNameFocusLost

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
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelAddVaccinationAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup CloseContactGroup;
    private javax.swing.JButton btnAddNewAppointment;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JComboBox<String> cmbVaccinationCenter;
    private com.github.lgooddatepicker.components.DatePicker dpAppointmentDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAppointmentId;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnYes;
    public com.github.lgooddatepicker.components.TimePicker tpAppointmentTime;
    private javax.swing.JTextArea txtHealthCondition;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    public javax.swing.JLabel txtRegisteredDate;
    public javax.swing.JLabel txtUserId;
    private javax.swing.JTextField txtVaccineType;
    // End of variables declaration//GEN-END:variables
}
