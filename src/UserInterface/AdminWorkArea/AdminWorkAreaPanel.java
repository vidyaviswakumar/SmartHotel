/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author vidya
 */
public class AdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private JPanel panel;
    private EcoSystem system;
    public AdminWorkAreaPanel(JPanel userProcessContainer,Enterprise enterprise,JPanel panel,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.panel=panel;
        this.system=system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        customerJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        customerJButton.setText("Manage Manager Account");
        customerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerJButtonActionPerformed(evt);
            }
        });
        add(customerJButton);
        customerJButton.setBounds(580, 590, 460, 37);

        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        manageEmployeeJButton.setText("Manage Manager");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton);
        manageEmployeeJButton.setBounds(590, 470, 460, 37);

        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        manageOrganizationJButton.setText("Manage Manager Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton);
        manageOrganizationJButton.setBounds(590, 360, 450, 37);

        logoutButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 51, 204));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        add(logoutButton);
        logoutButton.setBounds(1360, 210, 180, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marriott_logo_redBackground_187x86.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 190, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidya\\Desktop\\images\\admincontrl.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1760, 190);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidya\\Desktop\\images\\customer.jpg")); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 190, 1760, 930);
    }// </editor-fold>//GEN-END:initComponents

    private void customerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerJButtonActionPerformed
        // TODO add your handling code here:
        ManageManagerAccountJPanel manageManagerAccountJPanel = new ManageManagerAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageManagerAccountJPanel", manageManagerAccountJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_customerJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageManagerJPanel manageManagerJPanel = new ManageManagerJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageManagerJPanel", manageManagerJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageManagerOrganizationJPanel manageManagerOrganizationJPanel = new ManageManagerOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageManagerOrganizationJPanel", manageManagerOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        userProcessContainer.add(panel);
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    // End of variables declaration//GEN-END:variables
}
