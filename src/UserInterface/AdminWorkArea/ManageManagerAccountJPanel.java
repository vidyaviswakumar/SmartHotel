/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Roles.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidya
 */
public class ManageManagerAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageManagerAccountJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public ManageManagerAccountJPanel(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.enterprise=enterprise;
        this.userProcessContainer=userProcessContainer;
        popOrganizationComboBox();
        populateUsertable();
    }
    
    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationDirectory()) {
            if(organization instanceof ManagerOrganization)
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeDirectory()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    public void populateUsertable() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationDirectory()) {
            if(organization instanceof ManagerOrganization){
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountDirectory()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
          }
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

        roleJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        roleJComboBox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox);
        roleJComboBox.setBounds(240, 670, 215, 34);

        userJTable.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(45, 314, 375, 179);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        add(jLabel2);
        jLabel2.setBounds(64, 759, 94, 28);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee");
        add(jLabel3);
        jLabel3.setBounds(64, 609, 98, 28);

        employeeJComboBox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox);
        employeeJComboBox.setBounds(240, 610, 215, 34);

        backjButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1);
        backjButton1.setBounds(24, 818, 160, 37);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Organization");
        add(jLabel5);
        jLabel5.setBounds(64, 554, 130, 28);

        createUserJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton);
        createUserJButton.setBounds(290, 818, 170, 37);

        organizationJComboBox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox);
        organizationJComboBox.setBounds(240, 550, 215, 34);

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField);
        nameJTextField.setBounds(240, 720, 215, 34);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role");
        add(jLabel4);
        jLabel4.setBounds(64, 671, 80, 28);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        add(jLabel1);
        jLabel1.setBounds(64, 712, 110, 28);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marriott_logo_redBackground_187x86.gif"))); // NOI18N
        jLabel7.setText("jLabel2");
        add(jLabel7);
        jLabel7.setBounds(0, 0, 190, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\vidya\\Desktop\\images\\admincontrl.jpg")); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1760, 190);
        add(passwordJTextField);
        passwordJTextField.setBounds(240, 770, 215, 26);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.jpg"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 191, 1760, 880);
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        try{
        String userName = nameJTextField.getText();
        String password = String.valueOf(passwordJTextField.getPassword());
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
        if(role==null || organization==null || userName.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter all the informations","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(enterprise.getUserAccountDirectory().checkIfUniqueUserName(userName)){
        organization.getUserAccountDirectory().addUserAccount(userName, password, employee, role,null);
        JOptionPane.showMessageDialog(null,"User Account created successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        populateUsertable();
        }
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Please enter all the informations","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}