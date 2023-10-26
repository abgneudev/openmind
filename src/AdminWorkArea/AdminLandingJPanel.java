/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminWorkArea;

import ui.MainJFrame;
import ui.LandingJPanel;
/**
 *
 * @author Abhinav Uni
 */
public class AdminLandingJPanel extends javax.swing.JPanel {
    
    private MainJFrame mainframe;

    /**
     * Creates new form AdminLanding
     */
    public AdminLandingJPanel(MainJFrame mainframe) {
        initComponents();
        
        this.mainframe =mainframe;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageProf = new javax.swing.JButton();
        btnManageEmp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnManageStu = new javax.swing.JButton();
        btnManageTrans = new javax.swing.JButton();
        btnViewDashboard = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btnManageProf.setForeground(new java.awt.Color(0, 102, 102));
        btnManageProf.setText("Manage Professors");
        btnManageProf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageProf.setBorderPainted(false);
        btnManageProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfActionPerformed(evt);
            }
        });

        btnManageEmp.setForeground(new java.awt.Color(0, 102, 102));
        btnManageEmp.setText("Manage Employers");
        btnManageEmp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEmp.setBorderPainted(false);
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Logout");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnManageStu.setForeground(new java.awt.Color(0, 102, 102));
        btnManageStu.setText("Manage Students");
        btnManageStu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageStu.setBorderPainted(false);
        btnManageStu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStuActionPerformed(evt);
            }
        });

        btnManageTrans.setForeground(new java.awt.Color(0, 102, 102));
        btnManageTrans.setText("Manage Transcripts");
        btnManageTrans.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageTrans.setBorderPainted(false);
        btnManageTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTransActionPerformed(evt);
            }
        });

        btnViewDashboard.setForeground(new java.awt.Color(0, 102, 102));
        btnViewDashboard.setText("View Dashboard");
        btnViewDashboard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewDashboard.setBorderPainted(false);
        btnViewDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageStu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageProf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageProf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageStu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnViewDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
        // TODO add your handling code here:
        
        ManageEmployerJPanel emp = new ManageEmployerJPanel(mainframe);
        mainframe.setRightComponent(emp);
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        LandingJPanel landingpage = new LandingJPanel(mainframe);
        mainframe.setRightComponent(landingpage);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnManageStuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStuActionPerformed
        // TODO add your handling code here:
        
        ManageStudentJPanel stu = new ManageStudentJPanel(mainframe);
        mainframe.setRightComponent(stu);
    }//GEN-LAST:event_btnManageStuActionPerformed

    private void btnManageProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfActionPerformed
        // TODO add your handling code here:
        
        ManageProfessorJPanel prof = new ManageProfessorJPanel(mainframe);
        mainframe.setRightComponent(prof);
        
    }//GEN-LAST:event_btnManageProfActionPerformed

    private void btnManageTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageTransActionPerformed

    private void btnViewDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewDashboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageProf;
    private javax.swing.JButton btnManageStu;
    private javax.swing.JButton btnManageTrans;
    private javax.swing.JButton btnViewDashboard;
    // End of variables declaration//GEN-END:variables
}
