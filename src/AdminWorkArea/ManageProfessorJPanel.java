/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminWorkArea;

import ui.MainJFrame;
import AdminWorkArea.Professors.ProfessorCreateProfileJPanel;
import AdminWorkArea.Professors.AdminProfessorUpdateJPanel;
import Database.DatabaseConnection;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author abhilashkumargorle
 */
public class ManageProfessorJPanel extends javax.swing.JPanel {
    
     private MainJFrame mainframe;
      private String selectedNUID;

    /**
     * Creates new form AdminJPanel
     */
    public ManageProfessorJPanel(MainJFrame mainframe) {
        
        this.mainframe = mainframe;
        initComponents();
        populateProfessorTable();
    }
    
    
    
    
      private void deleteProfessor(String NUID) {
       
        try {
            Connection connection = (Connection)DatabaseConnection.getConnection();

            String sql = "DELETE FROM UserInformation WHERE NUID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, NUID);

            int result = preparedStatement.executeUpdate();

            preparedStatement.close();
//            DatabaseConnection.closeConnection(connection);
            populateProfessorTable();
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting course.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    
    private void populateProfessorTable() {
    DefaultTableModel model = (DefaultTableModel) tblProfessor.getModel();
    model.setRowCount(0); // Clear the table

    try {
        Connection connection = (Connection)DatabaseConnection.getConnection();

        // Define the SQL query to retrieve professor data
        String sql = "SELECT NUID, Name, ContactNumber, Email, Address FROM UserInformation WHERE ProfileType = 'professor'";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Vector<Object> row = new Vector<>();
            row.add(resultSet.getString("NUID"));
            row.add(resultSet.getString("Name"));
            row.add(resultSet.getString("ContactNumber"));
            row.add(resultSet.getString("Email"));
            row.add(resultSet.getString("Address"));
            model.addRow(row);
        }

        resultSet.close();
        preparedStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
//        DatabaseConnection.closeConnection();
    }
}
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblProfessor = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnCreateProfile = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(969, 407));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(500, 500));

        tblProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NUID", "Name", "ContactNumber", "Email", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblProfessor);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Search NUID..");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnsearch.setForeground(new java.awt.Color(0, 102, 102));
        btnsearch.setText("Search");
        btnsearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsearch.setBorderPainted(false);
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnCreateProfile.setForeground(new java.awt.Color(0, 102, 102));
        btnCreateProfile.setText("Create Profile");
        btnCreateProfile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateProfile.setBorderPainted(false);
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });

        btnView.setForeground(new java.awt.Color(0, 102, 102));
        btnView.setText("View");
        btnView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.setBorderPainted(false);

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(255, 102, 51));
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnUpdate1.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate1.setText("Update");
        btnUpdate1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate1.setBorderPainted(false);
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Professors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateProfile, btnDelete, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(btnback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateProfile, btnDelete, btnView});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:
      
       ProfessorCreateProfileJPanel createprof = new ProfessorCreateProfileJPanel(mainframe);
       mainframe.setRightComponent(createprof);

    }//GEN-LAST:event_btnCreateProfileActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblProfessor.getSelectedRow();
        if (selectedRow != -1) {
            // Get the NUID value from the first column of the selected row
           selectedNUID = (String) tblProfessor.getValueAt(selectedRow, 0);
           

            // Now you have the NUID value
            System.out.println("Selected NUID: " + selectedNUID);
            deleteProfessor(selectedNUID);
           
        } else {
            // Handle the case where no row is selected
            System.out.println("No row selected.");
              JOptionPane.showMessageDialog(this, "No row selected.");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
        AdminLandingJPanel adminlanding = new AdminLandingJPanel(mainframe);
        mainframe.setRightComponent(adminlanding);
       
      
      
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
              
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblProfessor.getSelectedRow();
        if (selectedRow != -1) {
            // Get the NUID value from the first column of the selected row
           selectedNUID = (String) tblProfessor.getValueAt(selectedRow, 0);

            // Now you have the NUID value
            System.out.println("Selected NUID: " + selectedNUID);
            AdminProfessorUpdateJPanel profupdate = new AdminProfessorUpdateJPanel(mainframe,selectedNUID);
        mainframe.setRightComponent(profupdate);
        } else {
            // Handle the case where no row is selected
            System.out.println("No row selected.");
              JOptionPane.showMessageDialog(this, "No row selected.");
        }
        
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
         String searchNUID = txtSearch.getText().trim(); // Get the NUID from the text field

        try {
            Connection connection = (Connection) DatabaseConnection.getConnection();
            Integer Flag=0;
             DefaultTableModel tableModel = (DefaultTableModel) tblProfessor.getModel();
            // Define the SQL query to retrieve values based on NUID
            String sql;
            if (searchNUID.isEmpty()) {
                 tableModel.setRowCount(0);
                // If searchNUID is empty, retrieve all records
                 populateProfessorTable();
            } else {
                Flag=0;
                 tableModel.setRowCount(0);
                // Otherwise, retrieve records based on the NUID
                sql = "SELECT NUID, Name, Email, Address, ContactNumber, ProfileType, Username, Password FROM UserInformation WHERE NUID = ?";
            

            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setString(1, searchNUID);

            ResultSet resultSet = preparedStatement.executeQuery();

            

            boolean found = false; // Flag to check if any results are found

            while (resultSet.next()) {
                // Populate the table with retrieved data
                String NUID = resultSet.getString("NUID");
                String name = resultSet.getString("Name");
                String email = resultSet.getString("Email");
                String address = resultSet.getString("Address");
                String contactNumber = resultSet.getString("ContactNumber");
                String profileType = resultSet.getString("ProfileType");
                String username = resultSet.getString("Username");
                String password = resultSet.getString("Password");
               
                // Clear the existing table data
                 if (searchNUID.isEmpty()) {
                    Object[] rowData = {NUID, name, email, address, contactNumber, profileType, username, password};
                    tableModel.addRow(rowData);
                 }
                 else{
                     
                    Object[] rowData = {searchNUID, email, address, contactNumber, profileType, username, password};
                    tableModel.addRow(rowData);
                     
                 }

                found = true; // Records were found
            }

            resultSet.close();
            preparedStatement.close();
//            DatabaseConnection.closeConnection(connection);

            if (!found) {
                 tableModel.setRowCount(0);
                // No results found, display a message
                JOptionPane.showMessageDialog(mainframe, "User not found.", "User Not Found", JOptionPane.INFORMATION_MESSAGE);
            }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblProfessor;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
