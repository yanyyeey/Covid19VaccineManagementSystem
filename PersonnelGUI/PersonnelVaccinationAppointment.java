package PersonnelGUI;

import HelperClasses.FileHandler;
import Classes.VaccinationAppointment;
import Classes.VaccinationCenter;
import HelperClasses.Logging;
import HelperClasses.State;
import HelperClasses.TableFilter;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeIncrement;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class PersonnelVaccinationAppointment extends javax.swing.JFrame {

    public PersonnelVaccinationAppointment() {
        initComponents();
    }
    
    public PersonnelVaccinationAppointment(String userName, String userId) {
        initComponents();
        txtName.setEditable(false);
        txtIC.setEditable(false);
        
        lblUserName.setText(userName);
        lblUserId.setText(userId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogEditAppointment = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        cmbState = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TimePickerSettings appointmentTimeSettings = new TimePickerSettings();
        tpAppointmentTime = new TimePicker(appointmentTimeSettings);
        appointmentTimeSettings.generatePotentialMenuTimes(TimeIncrement.ThirtyMinutes, LocalTime.of(8, 00), LocalTime.of(19, 00));
        appointmentTimeSettings.use24HourClockFormat();
        jLabel14 = new javax.swing.JLabel();
        btnUpdateAppointment = new javax.swing.JButton();
        txtVaccineType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JLabel();
        txtRegisteredDate = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblAppointmentId = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dpAppointmentDate = new DatePicker(dateSettings); dateSettings.setDateRangeLimits(LocalDate.now(), LocalDate.now().plusMonths(12));
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        rbtnNo = new javax.swing.JRadioButton();
        rbtnYes = new javax.swing.JRadioButton();
        cmbVaccinationCenter = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHealthCondition = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccinationAppointment = new JTable(new AppointmentTableModel()){

            //Implement table cell tool tips.
            public String getToolTipText(java.awt.event.MouseEvent e) {
                String tip = null;
                java.awt.Point p = e.getPoint();
                int rowIndex = rowAtPoint(p);
                int colIndex = columnAtPoint(p);

                try {
                    if(rowIndex >= 0){
                        tip = getValueAt(rowIndex, colIndex).toString();
                    }
                } catch (RuntimeException e1) {
                    //catch null pointer exception if mouse is over an empty line
                    System.out.println("Mouse is over an empty line!");
                }

                return tip;
            }
            //Implement table header tool tips.
            protected JTableHeader createDefaultTableHeader() {
                return new JTableHeader(columnModel) {
                    @Override
                    public String getToolTipText(MouseEvent e) {
                        String tip = null;
                        java.awt.Point p = e.getPoint();
                        int index = columnModel.getColumnIndexAtX(p.x);
                        int realIndex
                        = columnModel.getColumn(index).getModelIndex();
                        tip = getColumnName(realIndex);
                        return tip;
                    }
                };
            }
        };
        ((DefaultTableCellRenderer) tblVaccinationAppointment.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblVaccinationAppointment.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN,14));
        tblVaccinationAppointment.getTableHeader().setReorderingAllowed(false);
        btnClose = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox<>();
        lblUserName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        dialogEditAppointment.setMinimumSize(new java.awt.Dimension(900, 530));
        dialogEditAppointment.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(186, 221, 212));
        jPanel3.setForeground(new java.awt.Color(186, 221, 212));

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Negeri Sembilan", "Malacca", "Selangor", "Kuala Lumpur", "Putrajaya", "Labuan", "Perak", "Penang", "Kedah", "Perlis", "Terengganu", "Kelantan", "Pahang", "Sabah ", "Sarawak" }));
        cmbState.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel9.setText("Heath Condition");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        tpAppointmentTime.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel14.setText("Time");
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        btnUpdateAppointment.setText("Confirm");
        btnUpdateAppointment.setBackground(new java.awt.Color(82, 137, 128));
        btnUpdateAppointment.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnUpdateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppointmentActionPerformed(evt);
            }
        });

        txtVaccineType.setBorder(null);
        txtVaccineType.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtVaccineType.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        jLabel6.setText("Date");
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        btnCancel.setText("Cancel");
        btnCancel.setBackground(new java.awt.Color(82, 137, 128));
        btnCancel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(220, 530));
        jPanel5.setMinimumSize(new java.awt.Dimension(220, 530));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Update");
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        txtUserId.setBackground(new java.awt.Color(255, 255, 255));

        txtRegisteredDate.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Appointment");
        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        lblAppointmentId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAppointmentId.setText("Appointment ID");
        lblAppointmentId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblAppointmentId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegisteredDate)
                            .addComponent(txtUserId)
                            .addComponent(lblAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(13, 13, 13))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(31, 31, 31)
                .addComponent(lblAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUserId)
                .addGap(18, 18, 18)
                .addComponent(txtRegisteredDate)
                .addGap(88, 88, 88))
        );

        dpAppointmentDate.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel8.setText("Name");
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        txtName.setBorder(null);
        txtName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        rbtnNo.setText("No");
        rbtnNo.setBackground(new java.awt.Color(186, 221, 212));
        rbtnNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        rbtnYes.setText("Yes");
        rbtnYes.setBackground(new java.awt.Color(186, 221, 212));
        rbtnYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

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

        txtHealthCondition.setColumns(20);
        txtHealthCondition.setRows(5);
        txtHealthCondition.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(txtHealthCondition);

        jLabel5.setText("Vaccination Centre");
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel7.setText("NRIC / Passport");
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        txtIC.setBorder(null);
        txtIC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIC.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        jLabel4.setText("Close Contact");
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel13.setText("Vaccine Type");
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel11.setText("State");
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dpAppointmentDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cmbState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbVaccinationCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(rbtnNo)
                                                .addGap(32, 32, 32)
                                                .addComponent(rbtnYes))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(61, 61, 61)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(tpAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnNo)
                            .addComponent(rbtnYes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbVaccinationCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVaccineType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        dpAppointmentDate.setDateToToday();

        javax.swing.GroupLayout dialogEditAppointmentLayout = new javax.swing.GroupLayout(dialogEditAppointment.getContentPane());
        dialogEditAppointment.getContentPane().setLayout(dialogEditAppointmentLayout);
        dialogEditAppointmentLayout.setHorizontalGroup(
            dialogEditAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogEditAppointmentLayout.setVerticalGroup(
            dialogEditAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 53));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));

        jPanel2.setBackground(new java.awt.Color(186, 221, 212));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 525));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/172546_search_icon.png"))); // NOI18N

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtSearch.setBackground(new java.awt.Color(186, 221, 218));
        txtSearch.setBorder(null);
        txtSearch.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jScrollPane1.setViewportView(tblVaccinationAppointment);

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

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Status-", "Registered", "Pending", "Confirmed", "Completed", "Cancelled" }));
        cmbStatus.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStatusItemStateChanged(evt);
            }
        });

        lblUserName.setText("View Registrants");
        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(186, 221, 212));

        lblUserId.setText("View Registrants");
        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(186, 221, 212));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnClose))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("View Registrants");
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/134224_add_plus_new_icon.png"))); // NOI18N
        btnAdd.setBackground(new java.awt.Color(82, 137, 128));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/352547_edit_mode_icon.png"))); // NOI18N
        btnEdit.setBackground(new java.awt.Color(82, 137, 128));
        btnEdit.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3669361_delete_ic_icon.png"))); // NOI18N
        btnDelete.setBackground(new java.awt.Color(82, 137, 128));
        btnDelete.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3669284_ic_print_icon.png"))); // NOI18N
        btnPrint.setBackground(new java.awt.Color(82, 137, 128));
        btnPrint.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEdit))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrint)))))
                        .addGap(29, 29, 29)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint)
                    .addComponent(btnDelete))
                .addContainerGap(62, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

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

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Seach Appointment Table
        AbstractTableModel model = (AbstractTableModel)tblVaccinationAppointment.getModel();
        String search = txtSearch.getText();
        TableRowSorter<AbstractTableModel> tr = new TableRowSorter<>(model);
        tblVaccinationAppointment.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        Logging.activityLog(lblUserId.getText(), "Personnel", "4");
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new PersonnelAddVaccinationAppointment(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //Retrieve selected row for editing
        int selectedRow = tblVaccinationAppointment.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to edit", "Select Appointment", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String appointmentId = tblVaccinationAppointment.getValueAt(selectedRow, 0).toString();
        String patientName = tblVaccinationAppointment.getValueAt(selectedRow, 1).toString();
        String patientId = tblVaccinationAppointment.getValueAt(selectedRow, 2).toString();
        String state = tblVaccinationAppointment.getValueAt(selectedRow, 3).toString();
        String vaccinationCenter = tblVaccinationAppointment.getValueAt(selectedRow, 4).toString();
        String vaccineType = tblVaccinationAppointment.getValueAt(selectedRow, 5).toString();
        String appointmentDate = tblVaccinationAppointment.getValueAt(selectedRow, 7).toString();
        String appointmentTime = tblVaccinationAppointment.getValueAt(selectedRow, 8).toString();
        String healthCondition = tblVaccinationAppointment.getValueAt(selectedRow, 9).toString();
        String closeContact = tblVaccinationAppointment.getValueAt(selectedRow, 10).toString();

        //Open PersonnelUpdateVaccinationAppointment window
        dialogEditAppointment.setVisible(true);

        //Display all the data from the selected row
        lblAppointmentId.setText(appointmentId);
        txtName.setText(patientName);
        txtIC.setText(patientId);
        cmbState.setSelectedItem(state);
        txtVaccineType.setText(vaccineType);
        if(appointmentDate.equals(" ") || appointmentTime.equals(" ")){
            dpAppointmentDate.setDate(LocalDate.now());
            tpAppointmentTime.setTime(LocalTime.now());
        }

        txtHealthCondition.setText(healthCondition);

        if (closeContact.equals("No")) {
            rbtnNo.setSelected(true);
        } else {
            rbtnYes.setSelected(true);
        }

        //Populates the combo box
        DefaultComboBoxModel<String> centerSelectorList = new DefaultComboBoxModel<>();
        centerSelectorList.addElement(vaccinationCenter);
        cmbVaccinationCenter.setModel(centerSelectorList);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Delete the selected record
        int rowIndex = tblVaccinationAppointment.getSelectedRow();
        //Checks if a row has been selected
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete", "Delete Appointment", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        var selectedRow = tblVaccinationAppointment.getValueAt(rowIndex, 0);
        String fileName = selectedRow + ".txt";
        File toDelete = FileHandler.retrievePath("Appointment", fileName);

        int n = JOptionPane.showConfirmDialog(null, "Do you really want to delete appointment " + selectedRow + "?", "Delete Appointment", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            try {
                toDelete.delete();
                tblVaccinationAppointment.setModel(new AppointmentTableModel());
                Logging.activityLog(lblUserId.getText(), "Personnel", "3");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to delete appointment", "Delete Appointment", JOptionPane.INFORMATION_MESSAGE);
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        String folderDirectory = "";
        String fileName = System.getProperty("file.separator") + "VaccinationAppointment " + LocalDate.now().toString() + ".pdf";
        String[] headers = {"Appointment ID", "Name", "Identification", "State", "Vaccination Center", "Vaccine Type", "Registered Date", "Appointment Date", "Appointment Time", "Health Condition", "Close Contact", "Appointment Status"};

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int n = chooser.showSaveDialog(this);

        if (n == JFileChooser.APPROVE_OPTION) {
            folderDirectory = chooser.getSelectedFile().getPath();
        }

        Document doc = new Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(folderDirectory + fileName));

            doc.open();
            PdfPTable tbl = new PdfPTable(10);

            for (String header : headers) {
                tbl.addCell(header);
            }

            for (int i = 0; i < tblVaccinationAppointment.getRowCount(); i++) {
                String appointmentId = tblVaccinationAppointment.getValueAt(i, 0).toString();
                String patientName = tblVaccinationAppointment.getValueAt(i, 1).toString();
                String patientId = tblVaccinationAppointment.getValueAt(i, 2).toString();
                String state = tblVaccinationAppointment.getValueAt(i, 3).toString();
                String vaccinationCenter = tblVaccinationAppointment.getValueAt(i, 4).toString();
                String vaccineType = tblVaccinationAppointment.getValueAt(i, 5).toString();
                String appointmentDate = tblVaccinationAppointment.getValueAt(i, 7).toString();
                String appointmentTime = tblVaccinationAppointment.getValueAt(i, 8).toString();
                String healthCondition = tblVaccinationAppointment.getValueAt(i, 9).toString();
                String closeContact = tblVaccinationAppointment.getValueAt(i, 10).toString();
                
                tbl.addCell(appointmentId);
                tbl.addCell(patientName);
                tbl.addCell(patientId);
                tbl.addCell(state);
                tbl.addCell(vaccinationCenter);
                tbl.addCell(vaccineType);
                tbl.addCell(appointmentDate);
                tbl.addCell(appointmentTime);
                tbl.addCell(healthCondition);
                tbl.addCell(closeContact);
                
            }

            doc.add(tbl);

        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }

        doc.close();
        Logging.activityLog(lblUserId.getText(), "Personnel", "25");
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog (null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
            Logging.logoutLog(lblUserId.getText(), "Personnel");
            System.exit(0); 
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void cmbVaccinationCenterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVaccinationCenterItemStateChanged
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
    }//GEN-LAST:event_cmbVaccinationCenterItemStateChanged

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

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dialogEditAppointment.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppointmentActionPerformed
        //Validate vaccination center (check if selected)
        if (cmbVaccinationCenter.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Please select a vaccination center", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Retrive data from form
        String appointmentId, patientName, patientId, state, vaccinationCenter, vaccineType, healthCondition, closeContact, appointmentStatus, appointmentDateString, appointmentTimeString, registeredDateString, userId = null;
        LocalDate registeredDate, appointmentDate;
        LocalTime appointmentTime;

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

        //Creates an instance of VaccinationAppointment and saves it to the database
        VaccinationAppointment appointment = new VaccinationAppointment(appointmentId, patientName, patientId, state, vaccinationCenter, vaccineType, registeredDateString, appointmentDateString, appointmentTimeString, healthCondition, closeContact, appointmentStatus);
        VaccinationAppointment.saveAppointment(appointment, "Update");
        
        Logging.activityLog(lblUserId.getText(), "Personnel", "2");

        dialogEditAppointment.setVisible(false);
        tblVaccinationAppointment.setModel(new AppointmentTableModel());
    }//GEN-LAST:event_btnUpdateAppointmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new PersonnelMainMenu(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStatusItemStateChanged
        TableFilter.filter(tblVaccinationAppointment, "--Status--", cmbStatus.getSelectedItem().toString());
        Logging.activityLog(lblUserId.getText(), "Personnel", "5");
    }//GEN-LAST:event_cmbStatusItemStateChanged

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
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PersonnelVaccinationAppointment().setVisible(true);
        });
    }

//Model for populating the Appointment Table display
    class AppointmentTableModel extends AbstractTableModel {

        final private String[] columnNames = {"Appointment ID", "Name", "Identification", "State", "Vaccination Center", "Vaccine Type", "Registered Date", "Appointment Date", "Appointment Time", "Health Condition", "Close Contact", "Appointment Status"};
        final private ArrayList<VaccinationAppointment> appointmentList = VaccinationAppointment.getAllVaccinationAppointments();

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public int getRowCount() {
            return appointmentList.size();
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Object getValueAt(int row, int col) {
            Object temp = null;
            switch (col) {
                case 0 ->
                    temp = appointmentList.get(row).getAppointmentId();
                case 1 ->
                    temp = appointmentList.get(row).getPatientName();
                case 2 ->
                    temp = appointmentList.get(row).getPatientIdentification();
                case 3 ->
                    temp = appointmentList.get(row).getState();
                case 4 ->
                    temp = appointmentList.get(row).getVaccinationCenter();
                case 5 ->
                    temp = appointmentList.get(row).getVaccineType();
                case 6 ->
                    temp = appointmentList.get(row).getRegisteredDate();
                case 7 ->
                    temp = appointmentList.get(row).getAppointmentDate();
                case 8 ->
                    temp = appointmentList.get(row).getAppointmentTime();
                case 9 ->
                    temp = appointmentList.get(row).getHealthCondition();
                case 10 ->
                    temp = appointmentList.get(row).getCloseContact();
                case 11 ->
                    temp = appointmentList.get(row).getAppointmentStatus();
            }
            return temp;
        }

        @Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void removeRow(int row) {
            appointmentList.remove(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdateAppointment;
    public javax.swing.JComboBox<String> cmbState;
    private javax.swing.JComboBox<String> cmbStatus;
    public javax.swing.JComboBox<String> cmbVaccinationCenter;
    private javax.swing.JDialog dialogEditAppointment;
    public com.github.lgooddatepicker.components.DatePicker dpAppointmentDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblAppointmentId;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    public javax.swing.JRadioButton rbtnNo;
    public javax.swing.JRadioButton rbtnYes;
    public javax.swing.JTable tblVaccinationAppointment;
    public com.github.lgooddatepicker.components.TimePicker tpAppointmentTime;
    public javax.swing.JTextArea txtHealthCondition;
    public javax.swing.JTextField txtIC;
    public javax.swing.JTextField txtName;
    public javax.swing.JLabel txtRegisteredDate;
    private javax.swing.JTextField txtSearch;
    public javax.swing.JLabel txtUserId;
    public javax.swing.JTextField txtVaccineType;
    // End of variables declaration//GEN-END:variables
}
