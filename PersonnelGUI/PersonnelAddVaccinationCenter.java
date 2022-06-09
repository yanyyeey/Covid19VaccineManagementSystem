package PersonnelGUI;

import Classes.VaccinationCenter;
import Classes.Vaccine;
import HelperClasses.Logging;
import HelperClasses.Validation;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeIncrement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PersonnelAddVaccinationCenter extends javax.swing.JFrame{

    private boolean reset = false;
    private String quantityReminder, quantity, vaccineBatchNumber, originCountry, supplyDate, dosRequired, requiredWaitTime, fileName;

    public PersonnelAddVaccinationCenter() {
        initComponents();
    }
    
    public PersonnelAddVaccinationCenter(String userName, String userId) {
        initComponents();
        lblUserName.setText(userName);
        lblUserId.setText(userId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblVaccineId = new javax.swing.JLabel();
        lblVaccinationCenterId = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtVaccinationCenterName = new javax.swing.JTextField();
        cmbState = new javax.swing.JComboBox<>();
        TimePickerSettings vaccinationCenterStartTimeSettings = new TimePickerSettings();
        tpStartTime = new TimePicker(vaccinationCenterStartTimeSettings);
        vaccinationCenterStartTimeSettings.generatePotentialMenuTimes(TimeIncrement.ThirtyMinutes, LocalTime.of(9, 00), LocalTime.of(19, 00));
        TimePickerSettings vaccinationCenterEndTimeSettings = new TimePickerSettings();
        tpEndTime = new TimePicker(vaccinationCenterEndTimeSettings);
        vaccinationCenterEndTimeSettings.generatePotentialMenuTimes(TimeIncrement.ThirtyMinutes, LocalTime.of(9, 00), LocalTime.of(19, 00));
        jLabel9 = new javax.swing.JLabel();
        cmbVaccineType = new javax.swing.JComboBox<>();
        btnAddNewSupply = new javax.swing.JButton();
        btnClose = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblQuantityReminder = new javax.swing.JLabel();
        spinQuantity = new javax.swing.JSpinner();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Center");
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Vaccination ");
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        lblVaccineId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaccineId.setText("ID");
        lblVaccineId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblVaccineId.setForeground(new java.awt.Color(255, 255, 255));

        lblVaccinationCenterId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaccinationCenterId.setText("ID");
        lblVaccinationCenterId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblVaccinationCenterId.setForeground(new java.awt.Color(255, 255, 255));

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Center");
        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));

        lblUserId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserId.setText("Center");
        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVaccineId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVaccinationCenterId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblVaccinationCenterId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVaccineId)
                .addGap(52, 52, 52))
        );

        jLabel1.setText("Available Vaccine(s)");
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel4.setText("Vaccination Center Name");
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel5.setText("Address");
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel6.setText("Operation Hours");
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel7.setText("Quantity");
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel8.setText("State");
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtAddress);

        txtVaccinationCenterName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName.setBorder(null);
        txtVaccinationCenterName.setPreferredSize(new java.awt.Dimension(1, 30));
        txtVaccinationCenterName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVaccinationCenterNameKeyReleased(evt);
            }
        });

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--State--", "Johor", "Malacca", "Negeri Sembilan", "Selangor", "Kuala Lumpur", "Putrajaya", "Labuan", "Perak", "Penang", "Kedah", "Perlis", "Terengganu", "Kelantan", "Pahang", "Sabah", "Sarawak" }));
        cmbState.setAutoscrolls(true);
        cmbState.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        tpStartTime.setMinimumSize(new java.awt.Dimension(80, 30));
        tpStartTime.setPreferredSize(new java.awt.Dimension(80, 30));

        tpEndTime.setMinimumSize(new java.awt.Dimension(80, 30));
        tpEndTime.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("to");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        cmbVaccineType.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cmbVaccineType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVaccineTypeItemStateChanged(evt);
            }
        });
        cmbVaccineType.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbVaccineTypePopupMenuWillBecomeVisible(evt);
            }
        });

        btnAddNewSupply.setText("Add ");
        btnAddNewSupply.setBackground(new java.awt.Color(82, 137, 128));
        btnAddNewSupply.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAddNewSupply.setPreferredSize(new java.awt.Dimension(100, 40));
        btnAddNewSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewSupplyActionPerformed(evt);
            }
        });

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
        btnBack.setPreferredSize(new java.awt.Dimension(100, 40));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblQuantityReminder.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblQuantityReminder.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tpStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(tpEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(cmbState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(cmbVaccineType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(141, 141, 141))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblQuantityReminder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtVaccinationCenterName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinQuantity, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(44, 44, 44))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddNewSupply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpStartTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tpEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVaccinationCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuantityReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNewSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new PersonnelVaccinationCenter(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog (null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
            Logging.logoutLog(lblUserId.getText(), "Personnel");
            System.exit(0); 
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnAddNewSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewSupplyActionPerformed
        //Retrieve data from form
        String vaccinationCenterId, vaccinationCenterName, vaccinationCenterStartTimeString, vaccinationCenterEndTimeString, state, address, vaccineType, vaccineSupplyQuantity;
        LocalTime vaccinationCenterStartTime, vaccinationCenterEndTime;
        
        //vaccineBatchNumber = lblVaccineId.getText();
        vaccinationCenterId = lblVaccinationCenterId.getText();
        vaccinationCenterName = txtVaccinationCenterName.getText();
        vaccinationCenterStartTime = tpStartTime.getTime();
        vaccinationCenterEndTime = tpEndTime.getTime();
        state = cmbState.getSelectedItem().toString();
        address = txtAddress.getText();
        vaccineType = cmbVaccineType.getSelectedItem().toString();
        vaccineSupplyQuantity = spinQuantity.getValue().toString();

        //Verify all the inputs are filled
        if (vaccinationCenterName.isEmpty() || state.isEmpty() || vaccineType.isEmpty() || vaccineSupplyQuantity.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Verify the vaccination center start and end time
        if (vaccinationCenterStartTime == null || vaccinationCenterEndTime == null) {
            JOptionPane.showMessageDialog(null, "Please ensure that you have selected the start and end time", "Invalid Date Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Verify the start and end time
        if (vaccinationCenterStartTime.isAfter(vaccinationCenterEndTime) || vaccinationCenterEndTime.isBefore(vaccinationCenterStartTime)) {
            JOptionPane.showMessageDialog(null, "Please ensure that you have selected the correct time", "Invalid Date Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //All verification checks passed
        vaccinationCenterStartTimeString = vaccinationCenterStartTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        vaccinationCenterEndTimeString = vaccinationCenterEndTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        
        //Creates an instance VaccinationCenter and saves it to the database
        VaccinationCenter vc = new VaccinationCenter(vaccinationCenterId, vaccinationCenterName, vaccinationCenterStartTimeString, vaccinationCenterEndTimeString, state, address, vaccineType, vaccineSupplyQuantity);
        VaccinationCenter.saveVaccinationCenter(vc, "save");
        Logging.activityLog(lblUserId.getText(), "Personnel", "6");
        
        
        //Update the vaccine stock
        quantityReminder = lblQuantityReminder.getText();
        quantity = quantityReminder.replaceAll("[^0-9]", "");
        int originalSupply = Integer.parseInt(quantity);
        int supplyAmount = Integer.parseInt(vaccineSupplyQuantity);
        String availableStock = String.valueOf(originalSupply - supplyAmount);
        Vaccine vaccine = new Vaccine(vaccineBatchNumber, vaccineType, originCountry, supplyDate, dosRequired, requiredWaitTime, availableStock);
        Vaccine.updateVaccine(vaccine, vaccineType, fileName);

        int n = JOptionPane.showConfirmDialog(null, "Vaccination Center has been saved. Add another vaccination center?", "Vaccination Center added", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == JOptionPane.YES_NO_OPTION) {
            reset = true;
            //If yes, reset the form
            txtVaccinationCenterName.setText("");
            tpStartTime.setText("");
            tpEndTime.setText("");
            cmbState.setSelectedIndex(-1);
            txtAddress.setText("");
            cmbVaccineType.setSelectedIndex(-1);
            spinQuantity.setValue(0);
            lblVaccinationCenterId.setText(VaccinationCenter.generateVaccinationId());
            lblQuantityReminder.setText("");
        } else {
            new PersonnelVaccinationCenter(lblUserName.getText(), lblUserId.getText()).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAddNewSupplyActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        lblVaccinationCenterId.setText(VaccinationCenter.generateVaccinationId());
        System.out.println(lblVaccinationCenterId.getText());
    }//GEN-LAST:event_formComponentShown

    private void cmbVaccineTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVaccineTypeItemStateChanged
        if (reset == false) {
            ArrayList<Vaccine> allVaccines = new ArrayList<>();
            String selectedVaccine = evt.getItem().toString();

            //Retrive all files in the respective vaccine folder
            allVaccines = Vaccine.getAllVaccines(selectedVaccine);

            for (Vaccine vaccine : allVaccines) {
                if (Integer.parseInt(vaccine.getQuantity()) != 0) {
                    lblQuantityReminder.setText("The available stock is " + vaccine.getQuantity());
                    fileName = vaccine.getvaccineBatchNumber() + ".txt";
                    vaccineBatchNumber = vaccine.getvaccineBatchNumber();
                    originCountry = vaccine.getOriginCountry();
                    supplyDate = vaccine.getSupplyDate();
                    dosRequired = vaccine.getDosRequired();
                    requiredWaitTime = vaccine.getRequiredWaitTime();                   
                    break;
                }
                continue;
            }
        }
        reset = true;
    }//GEN-LAST:event_cmbVaccineTypeItemStateChanged

    private void cmbVaccineTypePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbVaccineTypePopupMenuWillBecomeVisible
        ArrayList<String> vaccineType = new ArrayList<>();
        vaccineType.add("AstraZeneca");
        vaccineType.add("Pfizer-BioNTech");
        vaccineType.add("Sinovac");

        //Add Vaccination Center Name List to combo box
        DefaultComboBoxModel<String> vaccineSelector = new DefaultComboBoxModel();
        vaccineSelector.addAll(vaccineType);
        cmbVaccineType.setModel(vaccineSelector);

    }//GEN-LAST:event_cmbVaccineTypePopupMenuWillBecomeVisible

    private void txtVaccinationCenterNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVaccinationCenterNameKeyReleased
        if(Validation.isWord(txtVaccinationCenterName.getText()) == false){
            JOptionPane.showMessageDialog(null, "Only word is allowed", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtVaccinationCenterNameKeyReleased

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
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelAddVaccinationCenter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewSupply;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JComboBox<String> cmbVaccineType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lblQuantityReminder;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblVaccinationCenterId;
    private javax.swing.JLabel lblVaccineId;
    private javax.swing.JSpinner spinQuantity;
    public com.github.lgooddatepicker.components.TimePicker tpEndTime;
    public com.github.lgooddatepicker.components.TimePicker tpStartTime;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtVaccinationCenterName;
    // End of variables declaration//GEN-END:variables

}
