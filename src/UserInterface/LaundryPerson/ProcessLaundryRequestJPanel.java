/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LaundryPerson;

import Business.WorkQueue.LaundryWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vidya
 */
public class ProcessLaundryRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessLaundryRequestJPanel
     */
    private LaundryWorkRequest request;
    private JPanel userProcessContainer;
    public ProcessLaundryRequestJPanel(JPanel userProcessContainer,LaundryWorkRequest request) {
        initComponents();
        this.request=request;
        this.userProcessContainer=userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(690, 720, 111, 37);

        submitJButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(870, 720, 171, 37);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1);
        jLabel1.setBounds(690, 590, 111, 28);

        resultJTextField.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        add(resultJTextField);
        resultJTextField.setBounds(798, 580, 260, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marriott_logo_redBackground_187x86.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 190, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/request.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1730, 1160);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LaundryWorkAreaJPanel dwjp = (LaundryWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(resultJTextField.getText().length()>0){
        request.setResult(resultJTextField.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(this, "Work is successfully completed", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please give valid comment", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
