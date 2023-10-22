/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminWorkArea.Employers;

import AdminWorkArea.ManageEmployerJPanel;
import AdminWorkArea.Professors.*;
import AdminWorkArea.ManageProfessorJPanel;
import ui.MainJFrame;

/**
 *
 * @author Abhinav Uni
 */
public class EmployerCreateProfileJPanel extends javax.swing.JPanel {
    
    MainJFrame mainframe;

    /**
     * Creates new form ProfessorDetailsJPanel
     */
    public EmployerCreateProfileJPanel(MainJFrame mainframe) {
        initComponents();
        
        this.mainframe = mainframe;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateProfile = new javax.swing.JLabel();
        perName1 = new javax.swing.JLabel();
        pertxtNUID = new javax.swing.JTextField();
        perName = new javax.swing.JLabel();
        pertxtName = new javax.swing.JTextField();
        perEmail = new javax.swing.JLabel();
        pertxtEmail = new javax.swing.JPasswordField();
        perAddress = new javax.swing.JLabel();
        pertxtAddress = new javax.swing.JPasswordField();
        perContactNum = new javax.swing.JLabel();
        pertxtContactNum = new javax.swing.JPasswordField();
        perContactNum1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        userbtnLogin3 = new javax.swing.JButton();
        stubtnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        CreateProfile.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        CreateProfile.setForeground(new java.awt.Color(255, 255, 255));
        CreateProfile.setText("Create Profile");

        perName1.setForeground(new java.awt.Color(204, 255, 255));
        perName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perName1.setText("NUID :");

        perName.setForeground(new java.awt.Color(204, 255, 255));
        perName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perName.setText("Name :");

        perEmail.setForeground(new java.awt.Color(204, 255, 255));
        perEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perEmail.setText("email :");

        perAddress.setForeground(new java.awt.Color(204, 255, 255));
        perAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perAddress.setText("Address :");

        perContactNum.setForeground(new java.awt.Color(204, 255, 255));
        perContactNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perContactNum.setText("Contact Number :");

        perContactNum1.setForeground(new java.awt.Color(204, 255, 255));
        perContactNum1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perContactNum1.setText("Profile Type :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        userbtnLogin3.setForeground(new java.awt.Color(0, 102, 102));
        userbtnLogin3.setText("Save");
        userbtnLogin3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userbtnLogin3.setBorderPainted(false);
        userbtnLogin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnLogin3ActionPerformed(evt);
            }
        });

        stubtnBack2.setBackground(new java.awt.Color(255, 102, 51));
        stubtnBack2.setForeground(new java.awt.Color(255, 255, 255));
        stubtnBack2.setText("Back");
        stubtnBack2.setBorder(null);
        stubtnBack2.setBorderPainted(false);
        stubtnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stubtnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 274, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(perName1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pertxtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(perName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(perEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pertxtName)
                                .addComponent(pertxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(perAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pertxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(perContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pertxtContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(perContactNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CreateProfile)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userbtnLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(stubtnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(CreateProfile)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perName1)
                    .addComponent(pertxtNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perName)
                    .addComponent(pertxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perEmail)
                    .addComponent(pertxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perAddress)
                    .addComponent(pertxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perContactNum)
                    .addComponent(pertxtContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(perContactNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(userbtnLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stubtnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void userbtnLogin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnLogin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userbtnLogin3ActionPerformed

    private void stubtnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stubtnBack2ActionPerformed
        // TODO add your handling code here:
        ManageEmployerJPanel manageemppanel = new ManageEmployerJPanel(mainframe);
        mainframe.setRightComponent(manageemppanel);

    }//GEN-LAST:event_stubtnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateProfile;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel perAddress;
    private javax.swing.JLabel perContactNum;
    private javax.swing.JLabel perContactNum1;
    private javax.swing.JLabel perEmail;
    private javax.swing.JLabel perName;
    private javax.swing.JLabel perName1;
    private javax.swing.JPasswordField pertxtAddress;
    private javax.swing.JPasswordField pertxtContactNum;
    private javax.swing.JPasswordField pertxtEmail;
    private javax.swing.JTextField pertxtNUID;
    private javax.swing.JTextField pertxtName;
    private javax.swing.JButton stubtnBack2;
    private javax.swing.JButton userbtnLogin3;
    // End of variables declaration//GEN-END:variables
}
