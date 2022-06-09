package CommonGUI;

import Classes.Vaccine;
import HelperClasses.Logging;
import HelperClasses.TableFilter;
import PeopleGUI.PeopleMainMenu;

import PersonnelGUI.PersonnelMainMenu;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
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

public class VaccinationStatus extends javax.swing.JFrame {

    public VaccinationStatus() {
        initComponents();
    }

    public VaccinationStatus(String userName, String userId, String ic) {
        initComponents();
        lblUserName.setText(userName);
        lblUserId.setText(userId);
        lblUserIc.setText(ic);
    }
    
    public VaccinationStatus(String userName, String userId) {
        initComponents();
        lblUserName.setText(userName);
        lblUserId.setText(userId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblUserIc = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccine = new JTable(new VaccineTableModel()){

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
        ((DefaultTableCellRenderer) tblVaccine.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        tblVaccine.getTableHeader().setFont(new Font("Berlin Sans FB", Font.PLAIN,14));
        tblVaccine.getTableHeader().setReorderingAllowed(false);
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbVaccineType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        setMinimumSize(new java.awt.Dimension(900, 530));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 221, 212));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 530));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblUserName.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Vaccination Status");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biglogo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vaccination Status");

        lblUserId.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(255, 255, 255));
        lblUserId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserId.setText("Vaccination Status");

        lblUserIc.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblUserIc.setForeground(new java.awt.Color(255, 255, 255));
        lblUserIc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserIc.setText("Vaccination Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUserIc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUserIc, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 559));

        btnClose.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 0, -1, -1));

        jScrollPane1.setViewportView(tblVaccine);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 660, 390));

        btnBack.setBackground(new java.awt.Color(82, 137, 128));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/172546_search_icon.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 6, -1, -1));

        txtSearch.setBackground(new java.awt.Color(186, 221, 212));
        txtSearch.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtSearch.setBorder(null);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 6, 222, 38));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 50, 222, 10));

        cmbVaccineType.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbVaccineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Vaccine Type--", "AstraZeneca", "Pfizer-BioNTech", "Sinovac" }));
        cmbVaccineType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVaccineTypeItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbVaccineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 129, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (lblUserId.getText().contains("PLP")) {
            new PeopleMainMenu(lblUserName.getText(), lblUserId.getText(), lblUserIc.getText()).setVisible(true);
            this.setVisible(false);
        } else {
            new PersonnelMainMenu(lblUserName.getText(), lblUserId.getText()).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        if (lblUserId.getText().contains("PLP")) {
            int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
            if (dialog == JOptionPane.YES_OPTION) {
                Logging.logoutLog(lblUserId.getText(), "People");
                System.exit(0);
            }
        } else {
            int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
            if (dialog == JOptionPane.YES_OPTION) {
                Logging.logoutLog(lblUserId.getText(), "Personnel");
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // Seach Vaccination Center Table
        AbstractTableModel model = (AbstractTableModel)tblVaccine.getModel();
        String search = txtSearch.getText();
        TableRowSorter<AbstractTableModel> tr = new TableRowSorter<>(model);
        tblVaccine.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        Logging.activityLog(lblUserId.getText(), "Personnel", "12");
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cmbVaccineTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVaccineTypeItemStateChanged
        TableFilter.filter(tblVaccine, "--Vaccine Type--", cmbVaccineType.getSelectedItem().toString());
        Logging.activityLog(lblUserId.getText(), "Personnel", "13");
    }//GEN-LAST:event_cmbVaccineTypeItemStateChanged

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
            java.util.logging.Logger.getLogger(VaccinationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccinationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccinationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccinationStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccinationStatus().setVisible(true);
            }
        });
    }

    //Model for populating the Vaccine Table display
    class VaccineTableModel extends AbstractTableModel {

        final private String[] columnNames = {"Vaccine ID", "Name", "Supply Quantity"};
        final private ArrayList<Vaccine> vaccineList = Vaccine.getAllVaccinesForTable();

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public int getRowCount() {
            return vaccineList.size();
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
                    temp = vaccineList.get(row).getvaccineBatchNumber();
                case 1 ->
                    temp = vaccineList.get(row).getVaccineName();
                case 2 ->
                    temp = vaccineList.get(row).getQuantity();
            }
            return temp;
        }

        @Override
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        public void removeRow(int row) {
            vaccineList.remove(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JComboBox<String> cmbVaccineType;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUserIc;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblVaccine;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
