/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import logins.CreateProfileJPanel;
import logins.EmployerLoginJPanel;
import logins.AdminLoginJPanel;
import logins.StudentLoginJPanel;
import logins.ProfessorLoginJPanel;
import java.awt.Component;


/**
 *
 * @author abhilashkumargorle
 */
public class MainJFrame extends javax.swing.JFrame {
    
    
    
   
    

    /**
     * Creates new form MainJFrame
     */
    


    public MainJFrame() {
        initComponents();
       
        LandingJPanel landingpage = new LandingJPanel();
        jSplitPane1.setRightComponent(landingpage);
        
    
      
    
    }
    

    
    // Add a person to the list
   

    
     public void setRightComponent(Component component) {
        jSplitPane1.setRightComponent(component);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        LoginJPanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnProfessorLogin = new javax.swing.JButton();
        Welcome = new javax.swing.JLabel();
        AppName = new javax.swing.JLabel();
        SelectLogin = new javax.swing.JLabel();
        NewHere = new javax.swing.JLabel();
        btnCreateProfile = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnEmployer = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setPreferredSize(new java.awt.Dimension(1173, 700));

        LoginJPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginJPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginJPanel.setForeground(new java.awt.Color(0, 0, 102));
        LoginJPanel.setPreferredSize(new java.awt.Dimension(400, 393));

        btnAdmin.setForeground(new java.awt.Color(0, 102, 102));
        btnAdmin.setText("Admin");
        btnAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdmin.setBorderPainted(false);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnProfessorLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnProfessorLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnProfessorLogin.setText("Professor");
        btnProfessorLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfessorLogin.setBorderPainted(false);
        btnProfessorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorLoginActionPerformed(evt);
            }
        });

        Welcome.setFont(new java.awt.Font("Baskerville Old Face", 1, 21)); // NOI18N
        Welcome.setForeground(new java.awt.Color(0, 102, 102));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("Welcome to");

        AppName.setFont(new java.awt.Font("Baskerville Old Face", 1, 21)); // NOI18N
        AppName.setForeground(new java.awt.Color(0, 102, 102));
        AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppName.setText("OpenMind");

        SelectLogin.setForeground(new java.awt.Color(51, 51, 51));
        SelectLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectLogin.setText("Select Login");

        NewHere.setForeground(new java.awt.Color(51, 51, 51));
        NewHere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewHere.setText("New here?");

        btnCreateProfile.setBackground(new java.awt.Color(204, 255, 255));
        btnCreateProfile.setText("Create Profile");
        btnCreateProfile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateProfile.setBorderPainted(false);
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });

        btnStudent.setBackground(new java.awt.Color(0, 102, 102));
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("Student");
        btnStudent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudent.setBorderPainted(false);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnEmployer.setBackground(new java.awt.Color(0, 102, 102));
        btnEmployer.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployer.setText("Employer");
        btnEmployer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmployer.setBorderPainted(false);
        btnEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginJPanelLayout = new javax.swing.GroupLayout(LoginJPanel);
        LoginJPanel.setLayout(LoginJPanelLayout);
        LoginJPanelLayout.setHorizontalGroup(
            LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(SelectLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LoginJPanelLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCreateProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(NewHere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(btnProfessorLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmployer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LoginJPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AppName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        LoginJPanelLayout.setVerticalGroup(
            LoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginJPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AppName)
                .addGap(40, 40, 40)
                .addComponent(SelectLogin)
                .addGap(18, 18, 18)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfessorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233)
                .addComponent(NewHere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(LoginJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
       
        AdminLoginJPanel adminlogin = new AdminLoginJPanel(this);
        jSplitPane1.setRightComponent(adminlogin);

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnProfessorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorLoginActionPerformed
        // TODO add your handling code here:

        ProfessorLoginJPanel professorlogin = new ProfessorLoginJPanel(this);
        jSplitPane1.setRightComponent(professorlogin);
    }//GEN-LAST:event_btnProfessorLoginActionPerformed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:
//
        CreateProfileJPanel login = new CreateProfileJPanel(this);
        jSplitPane1.setRightComponent(login);

    }//GEN-LAST:event_btnCreateProfileActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:

        StudentLoginJPanel studentlogin = new StudentLoginJPanel(this);
        jSplitPane1.setRightComponent(studentlogin);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployerActionPerformed
        // TODO add your handling code here:
        EmployerLoginJPanel employerlogin = new EmployerLoginJPanel(this);
        jSplitPane1.setRightComponent(employerlogin);
        
    }//GEN-LAST:event_btnEmployerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppName;
    private javax.swing.JPanel LoginJPanel;
    private javax.swing.JLabel NewHere;
    private javax.swing.JLabel SelectLogin;
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JButton btnEmployer;
    private javax.swing.JButton btnProfessorLogin;
    private javax.swing.JButton btnStudent;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

