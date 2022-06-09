package PersonnelGUI;

import Classes.VaccinationAppointment;
import Classes.VaccinationCenter;
import Classes.Vaccine;
import HelperClasses.FileHandler;
import HelperClasses.Logging;
import HelperClasses.State;
import HelperClasses.TableFilter;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class PersonnelVaccinationCenter extends javax.swing.JFrame {

    private boolean reset = false;
    private String quantityReminder, quantity, vaccineBatchNumber, originCountry, supplyDate, dosRequired, requiredWaitTime, fileName;

    public PersonnelVaccinationCenter() {
        initComponents();
    }
    
    public PersonnelVaccinationCenter(String userName, String userId) {
        initComponents();
        lblUserName.setText(userName);
        lblUserId.setText(userId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dialogEditVaccinationCenter = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblVaccineId = new javax.swing.JLabel();
        lblVaccinationCenterId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtVaccinationCenterName = new javax.swing.JTextField();
        cmbStateSelected = new javax.swing.JComboBox<>();
        TimePickerSettings vaccinationCenterStartTimeSettings = new TimePickerSettings();
        tpStartTime = new TimePicker(vaccinationCenterStartTimeSettings);
        vaccinationCenterStartTimeSettings.generatePotentialMenuTimes(TimeIncrement.ThirtyMinutes, LocalTime.of(9, 00), LocalTime.of(19, 00));
        TimePickerSettings vaccinationCenterEndTimeSettings = new TimePickerSettings();
        tpEndTime = new TimePicker(vaccinationCenterEndTimeSettings);
        vaccinationCenterEndTimeSettings.generatePotentialMenuTimes(TimeIncrement.ThirtyMinutes, LocalTime.of(9, 00), LocalTime.of(19, 00));
        jLabel14 = new javax.swing.JLabel();
        cmbVaccineTypeSelected = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblQuantityReminder = new javax.swing.JLabel();
        spinQuantity = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbState = new javax.swing.JComboBox<>();
        cmbVaccineType = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVaccinationCenter = new JTable(new VaccinationCenterTableModel()){

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
        ((DefaultTableCellRenderer) tblVaccinationCenter.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblVaccinationCenter.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN,14));
        tblVaccinationCenter.getTableHeader().setReorderingAllowed(false);
        btnBack = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        dialogEditVaccinationCenter.setMinimumSize(new java.awt.Dimension(900, 530));
        dialogEditVaccinationCenter.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(186, 221, 212));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Center");
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("New Vaccination ");
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        lblVaccineId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaccineId.setText("ID");
        lblVaccineId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblVaccineId.setForeground(new java.awt.Color(255, 255, 255));

        lblVaccinationCenterId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaccinationCenterId.setText("ID");
        lblVaccinationCenterId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblVaccinationCenterId.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVaccineId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVaccinationCenterId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(lblVaccinationCenterId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVaccineId)
                .addGap(52, 52, 52))
        );

        jLabel1.setText("Available Vaccine(s)");
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel7.setText("Vaccination Center Name");
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel8.setText("Address");
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel9.setText("Operation Hours");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel12.setText("Quantity");
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        jLabel13.setText("State");
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(txtAddress);

        txtVaccinationCenterName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtVaccinationCenterName.setBorder(null);
        txtVaccinationCenterName.setPreferredSize(new java.awt.Dimension(1, 30));

        cmbStateSelected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--State--", "Johor", "Malacca", "Negeri Sembilan", "Selangor", "Kuala Lumpur", "Putrajaya", "Labuan", "Perak", "Penang", "Kedah", "Perlis", "Terengganu", "Kelantan", "Pahang", "Sabah", "Sarawak" }));
        cmbStateSelected.setAutoscrolls(true);
        cmbStateSelected.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        tpStartTime.setMinimumSize(new java.awt.Dimension(80, 30));
        tpStartTime.setPreferredSize(new java.awt.Dimension(80, 30));

        tpEndTime.setMinimumSize(new java.awt.Dimension(80, 30));
        tpEndTime.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("to");
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        cmbVaccineTypeSelected.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        cmbVaccineTypeSelected.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVaccineTypeSelectedItemStateChanged(evt);
            }
        });
        cmbVaccineTypeSelected.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbVaccineTypeSelectedPopupMenuWillBecomeVisible(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setBackground(new java.awt.Color(82, 137, 128));
        btnUpdate.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnUpdate.setPreferredSize(new java.awt.Dimension(100, 40));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setBackground(new java.awt.Color(82, 137, 128));
        btnCancel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnCancel.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblQuantityReminder.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblQuantityReminder.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tpStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(tpEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(cmbStateSelected, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(cmbVaccineTypeSelected, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(141, 141, 141))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblQuantityReminder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtVaccinationCenterName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinQuantity, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(44, 44, 44))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbStateSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tpStartTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tpEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVaccinationCenterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVaccineTypeSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuantityReminder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout dialogEditVaccinationCenterLayout = new javax.swing.GroupLayout(dialogEditVaccinationCenter.getContentPane());
        dialogEditVaccinationCenter.getContentPane().setLayout(dialogEditVaccinationCenterLayout);
        dialogEditVaccinationCenterLayout.setHorizontalGroup(
            dialogEditVaccinationCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogEditVaccinationCenterLayout.setVerticalGroup(
            dialogEditVaccinationCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 221, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Center");
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vaccination ");
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addComponent(btnPrint))
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/172546_search_icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 6, -1, -1));

        txtSearch.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtSearch.setBackground(new java.awt.Color(186, 221, 212));
        txtSearch.setBorder(null);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 6, 222, 38));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 50, 222, 10));

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--States--", "Johor", "Kedah", "Kelantan", "Kuala Lumpur", "Labuan", "Malacca", "Negeri Sembilan", "Pahang", "Perak", "Perlis", "Putrajaya", "Sabah ", "Sarawak", "Terengganu" }));
        cmbState.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbState.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStateItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 6, 129, -1));

        cmbVaccineType.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbVaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Vaccine Type--", "AstraZeneca", "Pfizer-BioNTech", "Sinovac" }));
        cmbVaccineType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVaccineTypeItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbVaccineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 34, 129, -1));

        btnClose.setText("X");
        btnClose.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jScrollPane2.setViewportView(tblVaccinationCenter);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 640, 390));

        btnBack.setBackground(new java.awt.Color(82, 137, 128));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setPreferredSize(new java.awt.Dimension(100, 40));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Center");
        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(186, 221, 212));
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 70, 20));

        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(186, 221, 212));
        lblUserId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserId.setText("Center");
        jPanel1.add(lblUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 70, 20));

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new PersonnelMainMenu(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog (null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
            Logging.logoutLog(lblUserId.getText(), "Personnel");
            System.exit(0); 
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new PersonnelAddVaccinationCenter(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //Retrieve selected row for editing
        int selectedRow = tblVaccinationCenter.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to edit", "Select Appointment", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String vaccinationCenterId = tblVaccinationCenter.getValueAt(selectedRow, 0).toString();
        String name = tblVaccinationCenter.getValueAt(selectedRow, 1).toString();
        String startTime = tblVaccinationCenter.getValueAt(selectedRow, 2).toString();
        String endTime = tblVaccinationCenter.getValueAt(selectedRow, 3).toString();
        String state = tblVaccinationCenter.getValueAt(selectedRow, 4).toString();
        String address = tblVaccinationCenter.getValueAt(selectedRow, 5).toString();
        String vaccineType = tblVaccinationCenter.getValueAt(selectedRow, 6).toString();
        String supplyQuantity = tblVaccinationCenter.getValueAt(selectedRow, 7).toString();

        //Open PersonnelUpdateVaccinationAppointment window
        dialogEditVaccinationCenter.setVisible(true);

        //Display all the data from the selected row
        lblVaccinationCenterId.setText(vaccinationCenterId);
        txtVaccinationCenterName.setText(name);
        tpStartTime.setTime(LocalTime.parse(startTime));
        tpEndTime.setTime(LocalTime.parse(endTime));
        cmbStateSelected.setSelectedItem(state);
        txtAddress.setText(address);
        spinQuantity.setValue(Integer.parseInt(supplyQuantity));

        //Populates the combo box
        DefaultComboBoxModel<String> centerSelectorList = new DefaultComboBoxModel<>();
        centerSelectorList.addElement(vaccineType);
        cmbVaccineTypeSelected.setModel(centerSelectorList);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Delete the selected record
        int rowIndex = tblVaccinationCenter.getSelectedRow();
        //Checks if a row has been selected
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete", "Delete Vaccination Center", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        var selectedState = tblVaccinationCenter.getValueAt(rowIndex, 4);
        var selectedRow = tblVaccinationCenter.getValueAt(rowIndex, 0);
        String folderDirectory = State.getStateFileDirectory(selectedState.toString(), "VaccinationCenter");
        String fileName = selectedRow + ".txt";
        File toDelete = FileHandler.retrievePath(folderDirectory, fileName);

        int n = JOptionPane.showConfirmDialog(null, "Do you really want to delete vaccinationCenter " + selectedRow + "?", "Delete Vaccination Center", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            try {
                toDelete.delete();
                tblVaccinationCenter.setModel(new VaccinationCenterTableModel());
                Logging.activityLog(lblUserId.getText(), "Personnel", "8");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to delete appointment", "Delete Appointment", JOptionPane.INFORMATION_MESSAGE);
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        String folderDirectory = "";
        String fileName = System.getProperty("file.separator") + "VaccinationCenter " + LocalDate.now().toString() + ".pdf";
        String[] headers = {"Vaccination Center ID", "Name", "Start Time", "End Time", "State", "Address", "Vaccine Type", "Supply Quantity"};

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
            PdfPTable tbl = new PdfPTable(8);

            for (String header : headers) {
                tbl.addCell(header);
            }

            for (int i = 0; i < tblVaccinationCenter.getRowCount(); i++) {
                String vaccinationCenterId = tblVaccinationCenter.getValueAt(i, 0).toString();
                String name = tblVaccinationCenter.getValueAt(i, 1).toString();
                String startTime = tblVaccinationCenter.getValueAt(i, 2).toString();
                String endTime = tblVaccinationCenter.getValueAt(i, 3).toString();
                String state = tblVaccinationCenter.getValueAt(i, 4).toString();
                String address = tblVaccinationCenter.getValueAt(i, 5).toString();
                String vaccineType = tblVaccinationCenter.getValueAt(i, 6).toString();
                String supplyQuantity = tblVaccinationCenter.getValueAt(i, 7).toString();
                
                tbl.addCell(vaccinationCenterId);
                tbl.addCell(name);
                tbl.addCell(startTime);
                tbl.addCell(endTime);
                tbl.addCell(state);
                tbl.addCell(address);
                tbl.addCell(vaccineType);
                tbl.addCell(supplyQuantity);   
            }
            
            doc.add(tbl);
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(PersonnelVaccinationCenter.class.getName()).log(Level.SEVERE, null, ex);
        }

        doc.close();
        Logging.activityLog(lblUserId.getText(), "Personnel", "25");
    }//GEN-LAST:event_btnPrintActionPerformed

    private void cmbStateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStateItemStateChanged
        TableFilter.filterTwoQuery(tblVaccinationCenter, "--States--", "--Vaccine Type--", cmbState.getSelectedItem().toString(), cmbVaccineType.getSelectedItem().toString());
        Logging.activityLog(lblUserId.getText(), "Personnel", "10");
    }//GEN-LAST:event_cmbStateItemStateChanged

    private void cmbVaccineTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVaccineTypeItemStateChanged
        TableFilter.filter(tblVaccinationCenter, "--Vaccine Type--", cmbVaccineType.getSelectedItem().toString());
        Logging.activityLog(lblUserId.getText(), "Personnel", "10");
    }//GEN-LAST:event_cmbVaccineTypeItemStateChanged

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Seach Vaccination Center Table
        AbstractTableModel model = (AbstractTableModel)tblVaccinationCenter.getModel();
        String search = txtSearch.getText();
        TableRowSorter<AbstractTableModel> tr = new TableRowSorter<>(model);
        tblVaccinationCenter.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        Logging.activityLog(lblUserId.getText(), "Personnel", "9");
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cmbVaccineTypeSelectedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVaccineTypeSelectedItemStateChanged
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
    }//GEN-LAST:event_cmbVaccineTypeSelectedItemStateChanged

    private void cmbVaccineTypeSelectedPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbVaccineTypeSelectedPopupMenuWillBecomeVisible
        ArrayList<String> vaccineType = new ArrayList<>();
        vaccineType.add("AstraZeneca");
        vaccineType.add("Pfizer-BioNTech");
        vaccineType.add("Sinovac");

        //Add Vaccination Center Name List to combo box
        DefaultComboBoxModel<String> vaccineSelector = new DefaultComboBoxModel();
        vaccineSelector.addAll(vaccineType);
        cmbVaccineTypeSelected.setModel(vaccineSelector);
    }//GEN-LAST:event_cmbVaccineTypeSelectedPopupMenuWillBecomeVisible

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Retrieve data from form
        String vaccinationCenterId, vaccinationCenterName, vaccinationCenterStartTimeString, vaccinationCenterEndTimeString, state, address, vaccineType, vaccineSupplyQuantity;
        LocalTime vaccinationCenterStartTime, vaccinationCenterEndTime;

        //vaccineBatchNumber = lblVaccineId.getText();
        vaccinationCenterId = lblVaccinationCenterId.getText();
        vaccinationCenterName = txtVaccinationCenterName.getText();
        vaccinationCenterStartTime = tpStartTime.getTime();
        vaccinationCenterEndTime = tpEndTime.getTime();
        state = cmbStateSelected.getSelectedItem().toString();
        address = txtAddress.getText();
        vaccineType = cmbVaccineTypeSelected.getSelectedItem().toString();
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
        VaccinationCenter.saveVaccinationCenter(vc, "update");
        
        Logging.activityLog(lblUserId.getText(), "Personnel", "7");

        //Update the vaccine stock
        quantityReminder = lblQuantityReminder.getText();
        quantity = quantityReminder.replaceAll("[^0-9]", "");
        int originalSupply = Integer.parseInt(quantity);
        int supplyAmount = Integer.parseInt(vaccineSupplyQuantity);
        String availableStock = String.valueOf(originalSupply - supplyAmount);
        Vaccine vaccine = new Vaccine(vaccineBatchNumber, vaccineType, originCountry, supplyDate, dosRequired, requiredWaitTime, availableStock);
        Vaccine.updateVaccine(vaccine, vaccineType, fileName);

        dialogEditVaccinationCenter.setVisible(false);
        tblVaccinationCenter.setModel(new VaccinationCenterTableModel());
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dialogEditVaccinationCenter.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(PersonnelVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelVaccinationCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelVaccinationCenter().setVisible(true);
            }
        });
    }

    //Model for populating the Appointment Table display
    class VaccinationCenterTableModel extends AbstractTableModel {

        final private String[] columnNames = {"Vaccination Center ID", "Name", "Start Time", "End Time", "State", "Address", "Vaccine Type", "Supply Quantity"};
        final private ArrayList<VaccinationCenter> vaccinationCenterList = VaccinationCenter.getAllVaccinationCentersForTable();
        
        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public int getRowCount() {
            return vaccinationCenterList.size();
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
                    temp = vaccinationCenterList.get(row).getVaccinationCenterId();
                case 1 ->
                    temp = vaccinationCenterList.get(row).getVaccinationCenterName();
                case 2 ->
                    temp = vaccinationCenterList.get(row).getVaccinationCenterStartTime();
                case 3 ->
                    temp = vaccinationCenterList.get(row).getVaccinationCenterEndTime();
                case 4 ->
                    temp = vaccinationCenterList.get(row).getState();
                case 5 ->
                    temp = vaccinationCenterList.get(row).getAddress();
                case 6 ->
                    temp = vaccinationCenterList.get(row).getVaccineType();
                case 7 ->
                    temp = vaccinationCenterList.get(row).getVaccineSupplyQuantity();
            }
            return temp;
        }

        @Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void removeRow(int row) {
            vaccinationCenterList.remove(row);
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
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JComboBox<String> cmbStateSelected;
    private javax.swing.JComboBox<String> cmbVaccineType;
    private javax.swing.JComboBox<String> cmbVaccineTypeSelected;
    private javax.swing.JDialog dialogEditVaccinationCenter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblQuantityReminder;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblVaccinationCenterId;
    private javax.swing.JLabel lblVaccineId;
    private javax.swing.JSpinner spinQuantity;
    private javax.swing.JTable tblVaccinationCenter;
    public com.github.lgooddatepicker.components.TimePicker tpEndTime;
    public com.github.lgooddatepicker.components.TimePicker tpStartTime;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtVaccinationCenterName;
    // End of variables declaration//GEN-END:variables
}
