/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package logins;

import ProfessorWorkArea.ProfessorLandingJPanel;
import ui.LandingJPanel;
import ui.MainJFrame;

/**
 *
 * @author abhilashkumargorle
 */
public class ProfessorLoginJPanel extends javax.swing.JPanel {
    
     private MainJFrame mainframe;
    /**
     * Creates new form ProfessorLoginJPanel
     */
    public ProfessorLoginJPanel(MainJFrame mainframe) {
        
        this.mainframe = mainframe;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfessorLoginJPanel = new javax.swing.JPanel();
        HelloProfessor = new javax.swing.JLabel();
        proflblUsername = new javax.swing.JLabel();
        proflblPassword = new javax.swing.JLabel();
        userbtnLogin = new javax.swing.JButton();
        proftxtUsername = new javax.swing.JTextField();
        profPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        adminbtnRegister = new javax.swing.JButton();
        profbtnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(969, 407));

        ProfessorLoginJPanel.setBackground(new java.awt.Color(0, 102, 102));
        ProfessorLoginJPanel.setForeground(new java.awt.Color(255, 255, 255));
        ProfessorLoginJPanel.setPreferredSize(new java.awt.Dimension(969, 407));

        HelloProfessor.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        HelloProfessor.setForeground(new java.awt.Color(255, 255, 255));
        HelloProfessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HelloProfessor.setText("Hello, Professor!");

        proflblUsername.setForeground(new java.awt.Color(204, 255, 255));
        proflblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        proflblUsername.setText("Username :");

        proflblPassword.setForeground(new java.awt.Color(204, 255, 255));
        proflblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        proflblPassword.setText("Password :");

        userbtnLogin.setForeground(new java.awt.Color(0, 102, 102));
        userbtnLogin.setText("Login");
        userbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnLoginActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Not registered yet? ");

        adminbtnRegister.setBackground(new java.awt.Color(204, 255, 255));
        adminbtnRegister.setForeground(new java.awt.Color(0, 102, 102));
        adminbtnRegister.setText("Register");
        adminbtnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminbtnRegister.setBorderPainted(false);
        adminbtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfessorLoginJPanelLayout = new javax.swing.GroupLayout(ProfessorLoginJPanel);
        ProfessorLoginJPanel.setLayout(ProfessorLoginJPanelLayout);
        ProfessorLoginJPanelLayout.setHorizontalGroup(
            ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessorLoginJPanelLayout.createSequentialGroup()
                .addGroup(ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfessorLoginJPanelLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(userbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfessorLoginJPanelLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addGroup(ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HelloProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfessorLoginJPanelLayout.createSequentialGroup()
                                .addGroup(ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(proflblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(proflblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(proftxtUsername)
                                    .addComponent(profPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ProfessorLoginJPanelLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminbtnRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ProfessorLoginJPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        ProfessorLoginJPanelLayout.setVerticalGroup(
            ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfessorLoginJPanelLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(HelloProfessor)
                .addGap(33, 33, 33)
                .addGroup(ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proflblUsername)
                    .addComponent(proftxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ProfessorLoginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proflblPassword)
                    .addComponent(profPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(userbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminbtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        profbtnBack.setBackground(new java.awt.Color(255, 102, 51));
        profbtnBack.setForeground(new java.awt.Color(255, 255, 255));
        profbtnBack.setText("Back");
        profbtnBack.setBorder(null);
        profbtnBack.setBorderPainted(false);
        profbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profbtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(ProfessorLoginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(profbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ProfessorLoginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnLoginActionPerformed
        // TODO add your handling code here:
        
        ProfessorLandingJPanel proflanding = new ProfessorLandingJPanel(mainframe);
        mainframe.setRightComponent(proflanding);

    }//GEN-LAST:event_userbtnLoginActionPerformed

    private void profbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profbtnBackActionPerformed
        // TODO add your handling code here:
         LandingJPanel landingpanel = new LandingJPanel();
           mainframe.setRightComponent(landingpanel);

        
    }//GEN-LAST:event_profbtnBackActionPerformed

    private void adminbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnRegisterActionPerformed
        // TODO add your handling code here:

        CreateProfileJPanel login = new CreateProfileJPanel(mainframe);
        mainframe.setRightComponent(login);
    }//GEN-LAST:event_adminbtnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HelloProfessor;
    private javax.swing.JPanel ProfessorLoginJPanel;
    private javax.swing.JButton adminbtnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField profPassword;
    private javax.swing.JButton profbtnBack;
    private javax.swing.JLabel proflblPassword;
    private javax.swing.JLabel proflblUsername;
    private javax.swing.JTextField proftxtUsername;
    private javax.swing.JButton userbtnLogin;
    // End of variables declaration//GEN-END:variables
}
