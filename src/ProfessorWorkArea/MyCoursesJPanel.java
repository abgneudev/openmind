/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProfessorWorkArea;

import AdminWorkArea.Professors.AdminProfessorUpdateJPanel;
import ui.MainJFrame;
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
 * @author Abhinav Uni
 */
public class MyCoursesJPanel extends javax.swing.JPanel {
    
    MainJFrame mainframe;
     private String selectedNUID;

    /**
     * Creates new form MyCoursesJPanel
     */
    public MyCoursesJPanel(MainJFrame mainframe,String selectedNUID) {
        this.selectedNUID = selectedNUID;
        initComponents();
        displayCourseDataForProfessor();
        
        this.mainframe = mainframe;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void displayCourseDataForProfessor() {
        try {
            Connection connection = (Connection)DatabaseConnection.getConnection();
            String professorNUID = selectedNUID;
            String sql = "SELECT CourseID, CourseName, Year, Semester FROM Courses WHERE NUID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, professorNUID);

            ResultSet resultSet = preparedStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblCourses.getModel();

            // Clear any existing rows in the table
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            // Add rows from the result set to the table
            while (resultSet.next()) {
                Vector<String> row = new Vector<>();
                row.add(resultSet.getString("CourseID"));
                row.add(resultSet.getString("CourseName"));
                row.add(resultSet.getString("Year"));
                row.add(resultSet.getString("Semester"));
                model.addRow(row);
            }

            resultSet.close();
            preparedStatement.close();
//            DatabaseConnection.closeConnection(connection);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving course data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     private void deleteCourse(int row) {
         DefaultTableModel model = (DefaultTableModel) tblCourses.getModel();
        String courseID = (String) model.getValueAt(row, 0);

        try {
            Connection connection = (Connection)DatabaseConnection.getConnection();

            String sql = "DELETE FROM Courses WHERE CourseID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, courseID);

            int result = preparedStatement.executeUpdate();

            preparedStatement.close();
//            DatabaseConnection.closeConnection(connection);

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Course deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                 model.removeRow(row);
            } else {
                JOptionPane.showMessageDialog(this, "Error deleting course.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting course.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     
    private void searchCourse(int courseID) {
        try {
             DefaultTableModel model = (DefaultTableModel) tblCourses.getModel();
            Connection connection = (Connection)DatabaseConnection.getConnection();

            String sql = "SELECT CourseID, CourseName, Year, Semester FROM Courses WHERE CourseID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, courseID);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }

            while (resultSet.next()) {
                Vector<String> row = new Vector<>();
                row.add(resultSet.getString("CourseID"));
                row.add(resultSet.getString("CourseName"));
                row.add(resultSet.getString("Year"));
                row.add(resultSet.getString("Semester"));
                row.add("Delete");
                model.addRow(row);
            }

            resultSet.close();
            preparedStatement.close();
//            DatabaseConnection.closeConnection(connection);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving course data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCourses = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Courses");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setForeground(new java.awt.Color(0, 102, 102));
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.setBorderPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course ID", "Course", "Year", "Semester"
            }
        ));
        jScrollPane2.setViewportView(tblCourses);

        btnView.setBackground(new java.awt.Color(204, 255, 255));
        btnView.setForeground(new java.awt.Color(0, 102, 102));
        btnView.setText("View & Update");
        btnView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.setBorderPainted(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setBorderPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 102, 51));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnSearch, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnSearch, btnView, txtSearch});

    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        ProfessorLandingJPanel proflanding = new ProfessorLandingJPanel(mainframe,selectedNUID);
        mainframe.setRightComponent(proflanding);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCourses.getSelectedRow();
        
        if (selectedRow != -1) {
            // Get the NUID value from the first column of the selected row
           deleteCourse(selectedRow);

            // Now you have the NUID value
            
        } else {
            // Handle the case where no row is selected
            System.out.println("No row selected.");
              JOptionPane.showMessageDialog(this, "No row selected.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtSearch.getText().isEmpty()) {
            displayCourseDataForProfessor();
    // The text is empty
    
        } else {
    // The text is not empty
    

        int CourseID = Integer.parseInt(txtSearch.getText());
        
        searchCourse(CourseID);
        }
             
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCourses;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
