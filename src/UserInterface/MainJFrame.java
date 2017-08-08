/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Customer.Customer;
import Business.Organization.CustomerOrganization;
import Business.Roles.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vidya
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private JPanel panel;
    private Enterprise inEnterprise;
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        panel=this.jPanel2;
        setSize(1780, 910);
        getDisplayLayout();
        
    }
    
    private void getDisplayLayout(){
        this.jPanel3.setOpaque(false);
        this.jPanel4.setOpaque(false);
        this.jPanel3.setVisible(false);
        this.jPanel4.setVisible(false);
        userNameLoginText.setText("");
        passwordLoginText.setText("");
        passwordRegText.setText("");
        userNameRegText.setText("");
        nameRegText.setText("");
        emailAddressText.setText("");
        errorLabel.setText("");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProcessContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userNameRegText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailAddressText = new javax.swing.JTextField();
        nameRegText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        passwordRegText = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        userNameLoginText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordLoginText = new javax.swing.JPasswordField();
        loginSelectButton = new javax.swing.JButton();
        regSelectButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        userProcessContainer.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Username");

        userNameRegText.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Password");

        emailAddressText.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N

        nameRegText.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        nameRegText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameRegTextKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Email Address");

        registerButton.setBackground(new java.awt.Color(153, 255, 153));
        registerButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        registerButton.setForeground(new java.awt.Color(0, 102, 102));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        passwordRegText.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameRegText, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(userNameRegText)
                    .addComponent(emailAddressText)
                    .addComponent(passwordRegText))
                .addGap(136, 136, 136))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRegText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameRegText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordRegText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(registerButton)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 430, 600, 470);

        jPanel4.setBackground(new java.awt.Color(239, 239, 239));

        jLabel6.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Name");

        userNameLoginText.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("Password");

        loginButton.setBackground(new java.awt.Color(153, 255, 153));
        loginButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 102, 102));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordLoginText.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(passwordLoginText))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(loginButton)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(26, 26, 26))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(730, 570, 520, 250);

        loginSelectButton.setBackground(new java.awt.Color(255, 255, 153));
        loginSelectButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        loginSelectButton.setForeground(new java.awt.Color(0, 102, 102));
        loginSelectButton.setText("SIGN IN");
        loginSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSelectButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginSelectButton);
        loginSelectButton.setBounds(30, 90, 170, 41);

        regSelectButton.setBackground(new java.awt.Color(255, 255, 153));
        regSelectButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        regSelectButton.setForeground(new java.awt.Color(0, 102, 102));
        regSelectButton.setText("SIGN UP");
        regSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regSelectButtonActionPerformed(evt);
            }
        });
        jPanel2.add(regSelectButton);
        regSelectButton.setBounds(30, 180, 170, 41);

        errorLabel.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(errorLabel);
        errorLabel.setBounds(210, 50, 1220, 60);

        imageLabel.setFont(new java.awt.Font("Snap ITC", 3, 24)); // NOI18N
        imageLabel.setForeground(new java.awt.Color(255, 0, 51));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main1.jpg"))); // NOI18N
        jPanel2.add(imageLabel);
        imageLabel.setBounds(0, 0, 1760, 860);

        userProcessContainer.add(jPanel2, "card2");

        getContentPane().add(userProcessContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
      String userName=userNameLoginText.getText();
        String password=String.valueOf(passwordLoginText.getPassword());
        Organization inOrganization=null;
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUserAccount(userName, password);
        if(userAccount==null){
            for(Network network:system.getNetworkList()){
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDirectory()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUserAccount(userName, password);
                    if(userAccount==null){
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationDirectory()){
                            userAccount=organization.getUserAccountDirectory().authenticateUserAccount(userName, password);
                            if(userAccount!=null){
                                inOrganization=organization;
                                inEnterprise=enterprise;
                                break;
                            }
                        }
                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    } 
                    
                }
                if(inEnterprise!=null){
                        break;
                    }
            }
        }
        if(userAccount==null){
            JOptionPane.showMessageDialog(null,"Please enter valid credentials!","Error",JOptionPane.WARNING_MESSAGE);
        }
        else{
            getDisplayLayout();
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add("workArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system,panel));
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void regSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSelectButtonActionPerformed
        // TODO add your handling code here:
        this.jPanel3.setVisible(true);
        this.jPanel4.setVisible(false);
    }//GEN-LAST:event_regSelectButtonActionPerformed

    private void loginSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSelectButtonActionPerformed
        // TODO add your handling code here:
        this.jPanel4.setVisible(true);
        this.jPanel3.setVisible(false);
    }//GEN-LAST:event_loginSelectButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        errorLabel.setText("");
        String username=userNameRegText.getText();
        String password=String.valueOf(passwordRegText.getPassword());
        Customer customer=new Customer();
        customer.setEmailAddress(emailAddressText.getText());
        customer.setName(nameRegText.getText());
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter all the required fields!","Error",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for(Network network:system.getNetworkList()){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseDirectory()){
                
                for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationDirectory()){
                    if(organization instanceof CustomerOrganization){
                    }
                
                     if(organization.getUserAccountDirectory().checkIfUniqueUserName(username)){
                        if(organization instanceof CustomerOrganization){
                            
                            organization.getCustomerDirectory().addCustomer(customer);                          
                            organization.getUserAccountDirectory().addUserAccount(username, password, null, new CustomerRole(), customer);
                            JOptionPane.showMessageDialog(null,"Your account created successful","Success",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }                       
                    
                }
                else{
                        errorLabel.setText("Oops!!! This userName is already taken.. Please try another one");
                        return;
                        
            } 
                
            }
               
        }
            
        }   
    }//GEN-LAST:event_registerButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_formWindowClosing

    private void nameRegTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameRegTextKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_nameRegTextKeyTyped

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
    private javax.swing.JTextField emailAddressText;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginSelectButton;
    private javax.swing.JTextField nameRegText;
    private javax.swing.JPasswordField passwordLoginText;
    private javax.swing.JPasswordField passwordRegText;
    private javax.swing.JButton regSelectButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField userNameLoginText;
    private javax.swing.JTextField userNameRegText;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}