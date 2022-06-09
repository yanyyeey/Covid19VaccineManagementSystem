package PersonnelGUI;

import Classes.PeopleAccRegistration;
import Classes.PersonnelAccRegistration;
import HelperClasses.FileHandler;
import HelperClasses.Logging;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class PersonnelManagePeople extends javax.swing.JFrame {

    public PersonnelManagePeople() {
        initComponents();
    }

    public PersonnelManagePeople(String userName, String userId) {
        initComponents();
        txtPersonnelId.setEditable(false);
        lblUserName.setText(userName);
        lblUserId.setText(userId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogPersonnelEditPeopleDetails = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPeopleId = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dpPeopleDOB = new com.github.lgooddatepicker.components.DatePicker();
        txtPeopleName = new javax.swing.JTextField();
        txtPeopleContact = new javax.swing.JTextField();
        txtPeopleICOrPassport = new javax.swing.JTextField();
        txtPeopleEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPeopleAddress = new javax.swing.JTextArea();
        btnPeopleCancel = new javax.swing.JButton();
        btnUpdatePeopleDetails = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        rbtnPeopleCitizenYes = new javax.swing.JRadioButton();
        rbtnPeopleCitizenNo = new javax.swing.JRadioButton();
        dialogPersonnelEditPersonnelDetails = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPersonnelCOrPassport = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPersonnelId = new javax.swing.JTextField();
        btnPersonnelCancel = new javax.swing.JButton();
        btnUpdatePersonnelDetails = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtPersonnelName = new javax.swing.JTextField();
        txtPersonnelEmail = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        btnClose = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        userTabbedPane = new javax.swing.JTabbedPane();
        peoplePane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeople = new JTable(new PeopleTableModel()){

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
        ((DefaultTableCellRenderer) tblPeople.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblPeople.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN,14));
        tblPeople.getTableHeader().setReorderingAllowed(false);
        personnelPane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPersonnel = new JTable(new PersonnelTableModel()){

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
        ((DefaultTableCellRenderer) tblPersonnel.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblPersonnel.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN,14));
        tblPersonnel.getTableHeader().setReorderingAllowed(false);
        lblUserName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        dialogPersonnelEditPeopleDetails.setMinimumSize(new java.awt.Dimension(900, 530));
        dialogPersonnelEditPeopleDetails.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(186, 221, 212));
        jPanel3.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel3.setMinimumSize(new java.awt.Dimension(900, 530));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 530));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        jLabel12.setText("Register");
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        lblPeopleId.setText("Account");
        lblPeopleId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblPeopleId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Account");
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(13, 13, 13))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPeopleId, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(44, 44, 44)
                .addComponent(lblPeopleId)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jLabel3.setText("Full Name as per IC / Passport");
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        jLabel4.setText("Email");
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        jLabel5.setText("Contact Number");
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        jLabel6.setText("Date of Birth");
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        jLabel7.setText("NRIC (Citizen) / Passport (Non-citizen)");
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        jLabel8.setText("Address");
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        dpPeopleDOB.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        txtPeopleName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPeopleName.setBorder(null);

        txtPeopleContact.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPeopleContact.setBorder(null);

        txtPeopleICOrPassport.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPeopleICOrPassport.setBorder(null);

        txtPeopleEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPeopleEmail.setBorder(null);

        txtPeopleAddress.setColumns(20);
        txtPeopleAddress.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPeopleAddress.setRows(5);
        jScrollPane1.setViewportView(txtPeopleAddress);

        btnPeopleCancel.setText("Cancel");
        btnPeopleCancel.setBackground(new java.awt.Color(82, 137, 128));
        btnPeopleCancel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnPeopleCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleCancelActionPerformed(evt);
            }
        });

        btnUpdatePeopleDetails.setText("Update");
        btnUpdatePeopleDetails.setBackground(new java.awt.Color(82, 137, 128));
        btnUpdatePeopleDetails.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnUpdatePeopleDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePeopleDetailsActionPerformed(evt);
            }
        });

        jLabel13.setText("Citizen");
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N

        rbtnPeopleCitizenYes.setText("Yes");
        rbtnPeopleCitizenYes.setBackground(new java.awt.Color(186, 221, 212));
        rbtnPeopleCitizenYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        rbtnPeopleCitizenNo.setText("No");
        rbtnPeopleCitizenNo.setBackground(new java.awt.Color(186, 221, 212));
        rbtnPeopleCitizenNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnPeopleCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePeopleDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtnPeopleCitizenNo)
                                .addGap(12, 12, 12)
                                .addComponent(rbtnPeopleCitizenYes))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(txtPeopleName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeopleContact, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(dpPeopleDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPeopleEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeopleICOrPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeopleICOrPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeopleEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeopleContact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeopleName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dpPeopleDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnPeopleCitizenYes)
                            .addComponent(rbtnPeopleCitizenNo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatePeopleDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeopleCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout dialogPersonnelEditPeopleDetailsLayout = new javax.swing.GroupLayout(dialogPersonnelEditPeopleDetails.getContentPane());
        dialogPersonnelEditPeopleDetails.getContentPane().setLayout(dialogPersonnelEditPeopleDetailsLayout);
        dialogPersonnelEditPeopleDetailsLayout.setHorizontalGroup(
            dialogPersonnelEditPeopleDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(dialogPersonnelEditPeopleDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogPersonnelEditPeopleDetailsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dialogPersonnelEditPeopleDetailsLayout.setVerticalGroup(
            dialogPersonnelEditPeopleDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(dialogPersonnelEditPeopleDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogPersonnelEditPeopleDetailsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dialogPersonnelEditPersonnelDetails.setLocationByPlatform(true);
        dialogPersonnelEditPersonnelDetails.setMinimumSize(new java.awt.Dimension(900, 530));
        dialogPersonnelEditPersonnelDetails.setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(186, 221, 212));
        jPanel5.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel5.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel5.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(220, 530));
        jPanel6.setMinimumSize(new java.awt.Dimension(220, 530));

        jLabel9.setText("Account");
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel15.setText("Update");
        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel18.setText("Staff ID");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 53, -1, -1));

        txtPersonnelCOrPassport.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPersonnelCOrPassport.setBorder(null);
        jPanel5.add(txtPersonnelCOrPassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 80, 260, 34));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel19.setText("Staff Email");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 182, -1, -1));

        txtPersonnelId.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPersonnelId.setBorder(null);
        jPanel5.add(txtPersonnelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 80, 260, 34));

        btnPersonnelCancel.setText("Cancel");
        btnPersonnelCancel.setBackground(new java.awt.Color(82, 137, 128));
        btnPersonnelCancel.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnPersonnelCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonnelCancelActionPerformed(evt);
            }
        });
        jPanel5.add(btnPersonnelCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 100, 40));

        btnUpdatePersonnelDetails.setBackground(new java.awt.Color(82, 137, 128));
        btnUpdatePersonnelDetails.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnUpdatePersonnelDetails.setText("Update");
        btnUpdatePersonnelDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonnelDetailsActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdatePersonnelDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 100, 40));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel20.setText("Staff Name");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 182, -1, -1));

        txtPersonnelName.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPersonnelName.setBorder(null);
        jPanel5.add(txtPersonnelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 209, 260, 34));

        txtPersonnelEmail.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtPersonnelEmail.setBorder(null);
        jPanel5.add(txtPersonnelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 209, 260, 34));

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 19)); // NOI18N
        jLabel21.setText("Staff IC / Passport");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 53, -1, -1));

        javax.swing.GroupLayout dialogPersonnelEditPersonnelDetailsLayout = new javax.swing.GroupLayout(dialogPersonnelEditPersonnelDetails.getContentPane());
        dialogPersonnelEditPersonnelDetails.getContentPane().setLayout(dialogPersonnelEditPersonnelDetailsLayout);
        dialogPersonnelEditPersonnelDetailsLayout.setHorizontalGroup(
            dialogPersonnelEditPersonnelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogPersonnelEditPersonnelDetailsLayout.setVerticalGroup(
            dialogPersonnelEditPersonnelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMaximumSize(new java.awt.Dimension(900, 530));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 53));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));

        jPanel2.setBackground(new java.awt.Color(186, 221, 212));
        jPanel2.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 525));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/172546_search_icon.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 272, 10));

        txtSearch.setBackground(new java.awt.Color(186, 221, 212));
        txtSearch.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtSearch.setBorder(null);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 6, 272, 38));

        btnClose.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 0, -1, 44));

        btnBack.setText("Back");
        btnBack.setBackground(new java.awt.Color(82, 137, 128));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.setPreferredSize(new java.awt.Dimension(100, 40));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 484, -1, -1));

        jScrollPane2.setViewportView(tblPeople);

        javax.swing.GroupLayout peoplePaneLayout = new javax.swing.GroupLayout(peoplePane);
        peoplePane.setLayout(peoplePaneLayout);
        peoplePaneLayout.setHorizontalGroup(
            peoplePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peoplePaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        peoplePaneLayout.setVerticalGroup(
            peoplePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peoplePaneLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        userTabbedPane.addTab("People", peoplePane);

        jScrollPane3.setViewportView(tblPersonnel);

        javax.swing.GroupLayout personnelPaneLayout = new javax.swing.GroupLayout(personnelPane);
        personnelPane.setLayout(personnelPaneLayout);
        personnelPaneLayout.setHorizontalGroup(
            personnelPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        personnelPaneLayout.setVerticalGroup(
            personnelPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personnelPaneLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        userTabbedPane.addTab("Personnel", personnelPane);

        jPanel2.add(userTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 630, 390));

        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(186, 221, 212));
        lblUserName.setText("Manage People");
        jPanel2.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 80, 10));

        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(186, 221, 212));
        lblUserId.setText("Manage People");
        jPanel2.add(lblUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 80, 10));

        jLabel1.setText("Manage People");
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAdd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEdit))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnDelete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPrint))))
                        .addGap(29, 29, 29)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (userTabbedPane.getSelectedIndex() == 0) {
            AbstractTableModel model = (AbstractTableModel) tblPeople.getModel();
            String search = txtSearch.getText();
            TableRowSorter<AbstractTableModel> tr = new TableRowSorter<>(model);
            tblPeople.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        } else {
            AbstractTableModel model = (AbstractTableModel) tblPersonnel.getModel();
            String search = txtSearch.getText();
            TableRowSorter<AbstractTableModel> tr = new TableRowSorter<>(model);
            tblPersonnel.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        }

        if (lblUserId.getText().contains("PLP")) {
            Logging.activityLog(lblUserId.getText(), "People", "18");
        } else {
            Logging.activityLog(lblUserId.getText(), "Personnel", "24");
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            Logging.logoutLog(lblUserId.getText(), "Personnel");
            System.exit(0);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new PersonnelMainMenu(lblUserName.getText(), lblUserId.getText()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (userTabbedPane.getSelectedIndex() == 0) {
            new PersonnelRegisterPeople(lblUserName.getText(), lblUserId.getText()).setVisible(true);
            this.setVisible(false);
        } else {
            new PersonnelRegisterPersonnel(lblUserName.getText(), lblUserId.getText()).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String peopleId = null, peopleName = null, peopleIC = null, peopleDob = null, peopleContact = null, peopleAddress = null, peopleCitizen = null, peopleEmail = null, personnelId = null,
                personnelName = null, personnelIC = null, personnelEmail = null;

        //Retrieve selected row for editing
        int selectedRow;

        if (userTabbedPane.getSelectedIndex() == 0) {
            selectedRow = tblPeople.getSelectedRow();
            //Retrieve from people table
            peopleId = tblPeople.getValueAt(selectedRow, 0).toString();
            peopleName = tblPeople.getValueAt(selectedRow, 1).toString();
            peopleIC = tblPeople.getValueAt(selectedRow, 2).toString();
            peopleDob = tblPeople.getValueAt(selectedRow, 3).toString();
            peopleContact = tblPeople.getValueAt(selectedRow, 4).toString();
            peopleAddress = tblPeople.getValueAt(selectedRow, 5).toString();
            peopleCitizen = tblPeople.getValueAt(selectedRow, 6).toString();
            peopleEmail = tblPeople.getValueAt(selectedRow, 7).toString();
        } else {
            selectedRow = tblPersonnel.getSelectedRow();
            //Retrieve from personnel table
            personnelId = tblPersonnel.getValueAt(selectedRow, 0).toString();
            personnelName = tblPersonnel.getValueAt(selectedRow, 1).toString();
            personnelIC = tblPersonnel.getValueAt(selectedRow, 2).toString();
            personnelEmail = tblPersonnel.getValueAt(selectedRow, 3).toString();
        }

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to edit", "Select Account", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        //Open PersonnelEditPersonnelDetails or PersonnelEditPeopleDetails window
        if (userTabbedPane.getSelectedIndex() == 0) {
            dialogPersonnelEditPeopleDetails.setVisible(true);

            //Display all the data from the selected row
            lblPeopleId.setText(peopleId);
            txtPeopleName.setText(peopleName);
            txtPeopleICOrPassport.setText(peopleIC);
            txtPeopleContact.setText(peopleContact);
            txtPeopleEmail.setText(peopleEmail);
            dpPeopleDOB.setDate(LocalDate.parse(peopleDob));
            txtPeopleAddress.setText(peopleAddress);

            if (peopleCitizen.equals("No")) {
                rbtnPeopleCitizenNo.setSelected(true);
            } else {
                rbtnPeopleCitizenYes.setSelected(true);
            }
        } else {
            dialogPersonnelEditPersonnelDetails.setVisible(true);

            //Display all the data from the selected row
            txtPersonnelId.setText(personnelId);
            txtPersonnelName.setText(personnelName);
            txtPersonnelCOrPassport.setText(personnelIC);
            txtPersonnelEmail.setText(personnelEmail);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Delete the selected record
        int rowIndex;
        Object selectedRow;

        if (userTabbedPane.getSelectedIndex() == 0) {
            rowIndex = tblPeople.getSelectedRow();
        } else {
            rowIndex = tblPersonnel.getSelectedRow();
        }

        //Checks if a row has been selected
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete", "Delete Account", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (userTabbedPane.getSelectedIndex() == 0) {
            selectedRow = tblPeople.getValueAt(rowIndex, 0);
        } else {
            selectedRow = tblPersonnel.getValueAt(rowIndex, 0);
        }

        String fileName = selectedRow + ".txt";
        File toDeletePeople = FileHandler.retrievePath("People", fileName);
        File toDeletePersonnel = FileHandler.retrievePath("Personnel", fileName);

        int n = JOptionPane.showConfirmDialog(null, "Do you really want to delete account " + selectedRow + "?", "Delete Account", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (n == JOptionPane.YES_OPTION) {
            if (userTabbedPane.getSelectedIndex() == 0) {
                try {
                    toDeletePeople.delete();
                    tblPeople.setModel(new PersonnelManagePeople.PeopleTableModel());
                    Logging.activityLog(lblUserId.getText(), "People", "17");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Failed to delete account", "Delete Account", JOptionPane.INFORMATION_MESSAGE);
                    System.err.println(e);
                }
            } else {
                try {
                    toDeletePersonnel.delete();
                    tblPersonnel.setModel(new PersonnelManagePeople.PersonnelTableModel());
                    Logging.activityLog(lblUserId.getText(), "Personnel", "22");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Failed to delete account", "Delete Account", JOptionPane.INFORMATION_MESSAGE);
                    System.err.println(e);
                }
            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        String folderDirectory = "";
        String fileName = null;
        String[] headers = {};

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int n = chooser.showSaveDialog(this);

        if (n == JFileChooser.APPROVE_OPTION) {
            folderDirectory = chooser.getSelectedFile().getPath();
        }

        Document doc = new Document();

        if (userTabbedPane.getSelectedIndex() == 0) {
            fileName = System.getProperty("file.separator") + "PeopleAccount " + LocalDate.now().toString() + ".pdf";
            headers = new String[]{"People Id", "Name", "IC/Passport", "DOB", "Contact", "Address", "Citizen", "Email"};

            try {
                PdfWriter.getInstance(doc, new FileOutputStream(folderDirectory + fileName));

                doc.open();

                PdfPTable tbl = new PdfPTable(8);

                for (String header : headers) {
                    tbl.addCell(header);
                }

                for (int i = 0; i < tblPeople.getRowCount(); i++) {
                    String peopleId = tblPeople.getValueAt(i, 0).toString();
                    String peopleName = tblPeople.getValueAt(i, 1).toString();
                    String peopleIC = tblPeople.getValueAt(i, 2).toString();
                    String peopleDob = tblPeople.getValueAt(i, 3).toString();
                    String peopleContact = tblPeople.getValueAt(i, 4).toString();
                    String peopleAddress = tblPeople.getValueAt(i, 5).toString();
                    String peopleCitizen = tblPeople.getValueAt(i, 6).toString();
                    String peopleEmail = tblPeople.getValueAt(i, 7).toString();

                    tbl.addCell(peopleId);
                    tbl.addCell(peopleName);
                    tbl.addCell(peopleIC);
                    tbl.addCell(peopleDob);
                    tbl.addCell(peopleContact);
                    tbl.addCell(peopleAddress);
                    tbl.addCell(peopleCitizen);
                    tbl.addCell(peopleEmail);
                }

                doc.add(tbl);

            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(PersonnelManagePeople.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.close();
            Logging.activityLog(lblUserId.getText(), "Personnel", "25");
        } else {
            fileName = System.getProperty("file.separator") + "PersonnelAccount " + LocalDate.now().toString() + ".pdf";
            headers = new String[]{"Personnel Id", "Name", "IC/Passport", "Email"};

            try {
                PdfWriter.getInstance(doc, new FileOutputStream(folderDirectory + fileName));

                doc.open();

                PdfPTable tbl = new PdfPTable(4);

                for (String header : headers) {
                    tbl.addCell(header);
                }

                for (int i = 0; i < tblPersonnel.getRowCount(); i++) {
                    String personnelId = tblPersonnel.getValueAt(i, 0).toString();
                    String personnelName = tblPersonnel.getValueAt(i, 1).toString();
                    String personnelContact = tblPersonnel.getValueAt(i, 2).toString();
                    String personnelEmail = tblPersonnel.getValueAt(i, 3).toString();

                    tbl.addCell(personnelId);
                    tbl.addCell(personnelName);
                    tbl.addCell(personnelContact);
                    tbl.addCell(personnelEmail);
                }

                doc.add(tbl);

            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(PersonnelManagePeople.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.close();
            Logging.activityLog(lblUserId.getText(), "Personnel", "25");
        }

    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPeopleCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleCancelActionPerformed
        dialogPersonnelEditPeopleDetails.setVisible(false);
    }//GEN-LAST:event_btnPeopleCancelActionPerformed

    private void btnUpdatePeopleDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePeopleDetailsActionPerformed
        //Retrieve data from form
        String peopleId, name, icOrPassport, dob, contact, address, citizen, email, password = null;

        peopleId = lblPeopleId.getText();
        name = txtPeopleName.getText();
        icOrPassport = txtPeopleICOrPassport.getText();
        dob = String.valueOf(dpPeopleDOB.getDate());
        contact = txtPeopleContact.getText();
        address = txtPeopleAddress.getText();
        email = txtPeopleEmail.getText();

        //Retrieve the password from text file
        ArrayList<PeopleAccRegistration> allPeopleAccounts = new ArrayList<>();
        allPeopleAccounts = PeopleAccRegistration.getAllPeopleAccounts();

        for (PeopleAccRegistration account : allPeopleAccounts) {
            if (name.equals(account.getName()) && peopleId.equals(account.getPeopleId())) {
                password = account.getPassword();
            }
        }

        if (rbtnPeopleCitizenNo.isSelected()) {
            citizen = rbtnPeopleCitizenNo.getText();
        } else {
            citizen = rbtnPeopleCitizenYes.getText();
        }

        //Verify all the inputs are filled
        if (name.isEmpty() || icOrPassport.isEmpty() || dob.isEmpty() || contact.isEmpty() || address.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Creates an instance PeopleAccRegistration and saves it to the database
        PeopleAccRegistration update = new PeopleAccRegistration(peopleId, name, icOrPassport, contact, dob, address, citizen, email, password);
        PeopleAccRegistration.saveRegistration(update, "update");
        Logging.activityLog(lblUserId.getText(), "Personnel", "16");

        dialogPersonnelEditPeopleDetails.setVisible(false);
        tblPeople.setModel(new PersonnelManagePeople.PeopleTableModel());
    }//GEN-LAST:event_btnUpdatePeopleDetailsActionPerformed

    private void btnPersonnelCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonnelCancelActionPerformed
        dialogPersonnelEditPersonnelDetails.setVisible(false);
    }//GEN-LAST:event_btnPersonnelCancelActionPerformed

    private void btnUpdatePersonnelDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonnelDetailsActionPerformed
        //Retrive data from form
        String personnelId, name, ic, email, password = null;

        personnelId = txtPersonnelId.getText();
        name = txtPersonnelName.getText();
        ic = txtPersonnelCOrPassport.getText();
        email = txtPersonnelEmail.getText();

        //Retrieve password from text file
        ArrayList<PersonnelAccRegistration> allPersonnelAccounts = new ArrayList<>();
        allPersonnelAccounts = PersonnelAccRegistration.getAllPersonnelAccounts();

        for (PersonnelAccRegistration account : allPersonnelAccounts) {
            if (name.equals(account.getName()) && personnelId.equals(account.getPersonnelId())) {
                password = account.getPassword();
            }
        }

        //Verify all the inputs are filled
        if (name.isEmpty() || ic.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Creates an instance PersonnelAccRegistration and saves it to the database
        PersonnelAccRegistration update = new PersonnelAccRegistration(personnelId, name, ic, email, password);
        PersonnelAccRegistration.savePersonnelRegistration(update, "update");
        Logging.activityLog(lblUserId.getText(), "Personnel", "21");

        dialogPersonnelEditPersonnelDetails.setVisible(false);
        tblPersonnel.setModel(new PersonnelManagePeople.PersonnelTableModel());
    }//GEN-LAST:event_btnUpdatePersonnelDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(PersonnelManagePeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelManagePeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelManagePeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelManagePeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelManagePeople().setVisible(true);
            }
        });
    }

    //Model for populating the Appointment Table display
    class PeopleTableModel extends AbstractTableModel {

        final private String[] peopleColumnNames = {"People Id", "Name", "IC/Passport", "DOB", "Contact", "Address", "Citizen", "Email"};
        final private ArrayList<PeopleAccRegistration> peopleList = PeopleAccRegistration.getAllPeopleAccounts();

        @Override
        public int getColumnCount() {
            return peopleColumnNames.length;
        }

        @Override
        public int getRowCount() {
            return peopleList.size();
        }

        @Override
        public String getColumnName(int col) {
            return peopleColumnNames[col];
        }

        @Override
        public Object getValueAt(int row, int col) {
            Object temp = null;
            switch (col) {
                case 0 ->
                    temp = peopleList.get(row).getPeopleId();
                case 1 ->
                    temp = peopleList.get(row).getName();
                case 2 ->
                    temp = peopleList.get(row).getIcOrPassport();
                case 3 ->
                    temp = peopleList.get(row).getDob();
                case 4 ->
                    temp = peopleList.get(row).getContact();
                case 5 ->
                    temp = peopleList.get(row).getAddress();
                case 6 ->
                    temp = peopleList.get(row).getCitizen();
                case 7 ->
                    temp = peopleList.get(row).getEmail();
            }
            return temp;
        }

        @Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void removeRow(int row) {
            peopleList.remove(row);
        }
    }

    class PersonnelTableModel extends AbstractTableModel {

        final private String[] personnelColumnNames = {"Personnel Id", "Name", "IC/Passport", "Email"};
        final private ArrayList<PersonnelAccRegistration> personnelList = PersonnelAccRegistration.getAllPersonnelAccounts();

        @Override
        public int getColumnCount() {
            return personnelColumnNames.length;
        }

        @Override
        public int getRowCount() {
            return personnelList.size();
        }

        @Override
        public String getColumnName(int col) {
            return personnelColumnNames[col];
        }

        @Override
        public Object getValueAt(int row, int col) {
            Object temp = null;

            switch (col) {
                case 0 ->
                    temp = personnelList.get(row).getPersonnelId();
                case 1 ->
                    temp = personnelList.get(row).getName();
                case 2 ->
                    temp = personnelList.get(row).getIc();
                case 3 ->
                    temp = personnelList.get(row).getEmail();
            }
            return temp;
        }

        @Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void removeRow(int row) {
            personnelList.remove(row);

        }
    }

    //RowSorter for searching the table
    class RowSorter extends TableRowSorter<TableModel> {

        final private TableRowSorter<TableModel> rowSorter;

        RowSorter() {
            if (userTabbedPane.getSelectedIndex() == 0) {
                rowSorter = new TableRowSorter<>(tblPeople.getModel());
                tblPeople.setRowSorter(rowSorter);
            } else {
                rowSorter = new TableRowSorter<>(tblPersonnel.getModel());
                tblPersonnel.setRowSorter(rowSorter);
            }

        }

        public void searchTable() {
            txtSearch.getDocument().addDocumentListener(new DocumentListener() {

                @Override
                public void insertUpdate(DocumentEvent e) {
                    String searchText = txtSearch.getText();
                    if (searchText.trim().length() == 0) {
                        rowSorter.setRowFilter(null);
                    } else {
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    String searchText = txtSearch.getText();
                    if (searchText.trim().length() == 0) {
                        rowSorter.setRowFilter(null);
                    } else {
                        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPeopleCancel;
    private javax.swing.JButton btnPersonnelCancel;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdatePeopleDetails;
    private javax.swing.JButton btnUpdatePersonnelDetails;
    private javax.swing.JDialog dialogPersonnelEditPeopleDetails;
    private javax.swing.JDialog dialogPersonnelEditPersonnelDetails;
    private com.github.lgooddatepicker.components.DatePicker dpPeopleDOB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPeopleId;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel peoplePane;
    private javax.swing.JPanel personnelPane;
    private javax.swing.JRadioButton rbtnPeopleCitizenNo;
    private javax.swing.JRadioButton rbtnPeopleCitizenYes;
    public javax.swing.JTable tblPeople;
    public javax.swing.JTable tblPersonnel;
    private javax.swing.JTextArea txtPeopleAddress;
    private javax.swing.JTextField txtPeopleContact;
    private javax.swing.JTextField txtPeopleEmail;
    private javax.swing.JTextField txtPeopleICOrPassport;
    private javax.swing.JTextField txtPeopleName;
    private javax.swing.JTextField txtPersonnelCOrPassport;
    private javax.swing.JTextField txtPersonnelEmail;
    private javax.swing.JTextField txtPersonnelId;
    private javax.swing.JTextField txtPersonnelName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTabbedPane userTabbedPane;
    // End of variables declaration//GEN-END:variables
}
