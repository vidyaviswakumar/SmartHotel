/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manager;

import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vidya
 */
public class ManagerWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerWorkAreaPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private JPanel mainPanel;
    private UserAccount userAccount;
    public ManagerWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise,JPanel mainPanel,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.mainPanel=mainPanel;
        this.userAccount=userAccount;
        getUserAccount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        monitorButton = new javax.swing.JButton();
        thresoldText = new javax.swing.JTextField();
        thresoldButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        userJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton);
        userJButton.setBounds(1060, 430, 310, 37);

        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton);
        manageEmployeeJButton.setBounds(920, 340, 310, 37);

        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton);
        manageOrganizationJButton.setBounds(840, 240, 310, 37);

        logoutButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 102, 102));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        add(logoutButton);
        logoutButton.setBounds(1390, 30, 180, 41);

        monitorButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        monitorButton.setText("Monitor Fire");
        monitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorButtonActionPerformed(evt);
            }
        });
        add(monitorButton);
        monitorButton.setBounds(1410, 630, 190, 37);

        thresoldText.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        thresoldText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                thresoldTextKeyTyped(evt);
            }
        });
        add(thresoldText);
        thresoldText.setBounds(1070, 530, 110, 34);

        thresoldButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        thresoldButton.setText("Set Fire Thresold");
        thresoldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thresoldButtonActionPerformed(evt);
            }
        });
        add(thresoldButton);
        thresoldButton.setBounds(1220, 520, 330, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marriott_logo_redBackground_187x86.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 190, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manager1.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 910);
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        userProcessContainer.add(mainPanel);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private ManagerOrganization getManagerOrganization(){
        ManagerOrganization managerOrganization=null;
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationDirectory()){
            if(organization instanceof ManagerOrganization){
                managerOrganization=(ManagerOrganization)organization;
            }
        }    
        return managerOrganization;
    }
    
    private void monitorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorButtonActionPerformed
        // TODO add your handling code here:
                
                FireJPanel manageOrganizationJPanel = new FireJPanel(userProcessContainer,getManagerOrganization().getFireThresold(),userAccount);
                userProcessContainer.add("FireJPanel", manageOrganizationJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer); 
                
        
    }//GEN-LAST:event_monitorButtonActionPerformed

    private void thresoldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thresoldButtonActionPerformed
        // TODO add your handling code here:
        if(thresoldText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter a value","Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        getManagerOrganization().setFireThresold(Integer.parseInt(thresoldText.getText()));
        JOptionPane.showMessageDialog(null,"Thresold set successfully","Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_thresoldButtonActionPerformed

    private void thresoldTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thresoldTextKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_thresoldTextKeyTyped

    private void getUserAccount(){
        for(UserAccount userAccount:enterprise.getUserAccountDirectory().getUserAccountDirectory()){
            System.out.println(userAccount);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton monitorButton;
    private javax.swing.JButton thresoldButton;
    private javax.swing.JTextField thresoldText;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
