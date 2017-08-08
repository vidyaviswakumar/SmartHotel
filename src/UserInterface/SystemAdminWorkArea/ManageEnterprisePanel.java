/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidya
 */
public class ManageEnterprisePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterprisePanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public ManageEnterprisePanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populateComboBox();
        populateEnterpriseTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        networkCombo = new javax.swing.JComboBox();
        typeCombo = new javax.swing.JComboBox();
        createEnterpriseButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTable);
        if (enterpriseTable.getColumnModel().getColumnCount() > 0) {
            enterpriseTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Network Name");

        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextKeyTyped(evt);
            }
        });

        jLabel2.setText("Type");

        jLabel3.setText("Enterprise Name");

        networkCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        createEnterpriseButton.setText("Create Enterprise");
        createEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEnterpriseButtonActionPerformed(evt);
            }
        });

        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marriott_logo_redBackground_187x86.gif"))); // NOI18N
        jLabel5.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(109, 109, 109))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backButton)
                                .addComponent(jLabel2))
                            .addGap(125, 125, 125)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(97, 97, 97)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createEnterpriseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(networkCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createEnterpriseButton)
                            .addComponent(backButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEnterpriseButtonActionPerformed
        // TODO add your handling code here:
        Network network=(Network)networkCombo.getSelectedItem();
        EnterpriseType type=(EnterpriseType)typeCombo.getSelectedItem();
        
        if(network==null || type==null){
            JOptionPane.showMessageDialog(null,"Please select a valid type and network","Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(nameText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter a name for Enterprise","Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Enterprise enterprise=network.getEnterpriseDirectory().addEnterprise(nameText.getText(), type);
        JOptionPane.showMessageDialog(null,"Enterprise admin account added successfully","Success", JOptionPane.INFORMATION_MESSAGE);
        populateEnterpriseTable();
        
    }//GEN-LAST:event_createEnterpriseButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_nameTextKeyTyped

    private void populateEnterpriseTable(){
        DefaultTableModel model=(DefaultTableModel)enterpriseTable.getModel();
        model.setRowCount(0);
        for(Network network: system.getNetworkList()){
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseDirectory()){
                Object[] row=new Object[3];
                row[0]=enterprise.getName();
                row[1]=network;
                row[2]=enterprise.getEnterpriseType().getValue();
                model.addRow(row);
            }
        }
        
    }
    
    private void populateComboBox(){
        networkCombo.removeAllItems();
        for(Network network:system.getNetworkList()){
            networkCombo.addItem(network);
        }
        
        typeCombo.removeAllItems();
        for(Enterprise.EnterpriseType type:Enterprise.EnterpriseType.values()){
            typeCombo.addItem(type);
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createEnterpriseButton;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox networkCombo;
    private javax.swing.JComboBox typeCombo;
    // End of variables declaration//GEN-END:variables
}
