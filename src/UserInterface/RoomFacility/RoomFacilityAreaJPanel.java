/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RoomFacility;

import UserInterface.LaundryPerson.*;
import Business.Organization.AttendantOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LaundryWorkRequest;
import Business.WorkQueue.RoomEssentialsRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidya
 */
public class RoomFacilityAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RoomFacilityAreaJPanel
     */
    private JPanel userProcessContainer;
    private Organization organization;
    private AttendantOrganization attendantOrganization;
    private UserAccount userAccount;
    private JPanel mainPanel;
    public RoomFacilityAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,Organization organization,JPanel mainPanel) {
        initComponents();
        attendantOrganization=(AttendantOrganization)organization;
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.mainPanel=mainPanel;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)roomTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : attendantOrganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof RoomEssentialsRequest){
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getCustomer().getName();
            row[2] = request.getReceiver()== null ? null : request.getReceiver().getEmployee().getName();          
            row[3] = request.getMessage();
            row[4] = request.getStatus();
            RoomEssentialsRequest roomRequest=(RoomEssentialsRequest)request;
            row[5]=roomRequest.getResult();
            row[6]=request.getSender().getCustomer().getRoom().getRoomNo();
            
            model.addRow(row);
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

        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 102, 102));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer", "Attendant", "Message", "Status", "Comments", "Room No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(roomTable);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marriott_logo_redBackground_187x86.gif"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(243, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processJButton)
                        .addGap(341, 341, 341))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoutButton))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = roomTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)roomTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("In Progress");
        JOptionPane.showMessageDialog(this, "This work is assigned to you", "Success", JOptionPane.WARNING_MESSAGE);
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = roomTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }

        RoomEssentialsRequest request = (RoomEssentialsRequest)roomTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");

        ProcessRoomFacilityRequestJPanel processWorkRequestJPanel = new ProcessRoomFacilityRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("ProcessRoomFacilityRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        userProcessContainer.add(mainPanel);
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable roomTable;
    // End of variables declaration//GEN-END:variables
}
