/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.SecurityOrganization;
import Business.Rooms.Room;
import Business.Rooms.RoomDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.CarWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.Food.ViewMenuPanel;
import UserInterface.Room.RoomFacilityJPanel;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vidya
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private JPanel mainPanel;
    private UserAccount userAccount;
    private UserAccountDirectory userAccountDirectory;
    private Enterprise enterprise;
    private RoomDirectory roomList;
    
    public CustomerWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,JPanel mainPanel,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.mainPanel=mainPanel;
        this.userAccount=userAccount;
        this.enterprise=enterprise; 
        this.userAccountDirectory=enterprise.getUserAccountDirectory();
        roomList=RoomDirectory.getInstance(); 
        roomText.setText("000");
        populateTable();
        populateRoom();
        populateCarRequestTable();        
    }
    
    private void populateRoom(){
        if(userAccount.getCustomer().getRoom()==null){
            return;
        }
        roomText.setText(userAccount.getCustomer().getRoom().getRoomNo());
    }
    
    public void populateCarRequestTable(){
        DefaultTableModel model = (DefaultTableModel)carTable.getModel();
        
        model.setRowCount(0);
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationDirectory()){
            if(organization instanceof SecurityOrganization){
                SecurityOrganization securityOrganization=(SecurityOrganization)organization;
            for(WorkRequest request : securityOrganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof CarWorkRequest){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getCustomer().getName();
            row[2] = request.getReceiver()== null ? null : request.getReceiver().getEmployee().getName(); 
            row[3] = request.getMessage();
            row[4] = request.getStatus();
            CarWorkRequest carRequest=(CarWorkRequest)request;
            row[5]=carRequest.getResult();
            model.addRow(row);
            }
          }
        }
      }
    }
    
    private void populateTable(){
        roomList=populateRoomData();
        if(roomList!=null){
        DefaultTableModel model=(DefaultTableModel)roomTable.getModel();
        model.setRowCount(0);
        if(roomList!=null){
        for(Room room:roomList.getRoomList()){ 
            Object[] row=new Object[5];
             row[0]=room;
             row[1]=room.getAvailability();
             row[2]=room.getRoomType();
             row[3]=room.getPrice();
             row[4]=room.getView();
             model.addRow(row);
        }
        }
        }
    }
    
    private RoomDirectory populateRoomData(){
        ManagerOrganization managerOrganization=null;
        
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationDirectory()){
        if(organization instanceof ManagerOrganization){
            managerOrganization=(ManagerOrganization)organization;
        
       if(managerOrganization.getRoomDirectory()==null){
        
        Room room1=roomList.addRoom();
        room1.setAvailability("Available");
        room1.setLocation("Take second Elevator , go to second floor and walk left");
        room1.setPrice(120);
        room1.setRoomType("Deluxe");
        room1.setView("City View");

        Room room2=roomList.addRoom();
        room2.setAvailability("Available");
        room2.setLocation("Take first Elevator, go to first floor and walk left");
        room2.setPrice(250);
        room2.setRoomType("Suite");
        room2.setView("Pool View");
        
        Room room3=roomList.addRoom();
        room3.setAvailability("Available");
        room3.setLocation("Take first Elevator, go to first floor and walk right");
        room3.setPrice(100);
        room3.setRoomType("Standard");
        room3.setView("Garden View");
        
        Room room4=roomList.addRoom();
        room4.setAvailability("Available");
        room4.setLocation("Take second Elevator , go to second floor and walk left");
        room4.setPrice(120);
        room4.setRoomType("Deluxe");
        room4.setView("City View");
       
        Room room5=roomList.addRoom();
        room5.setAvailability("Available");
        room5.setLocation("Take second Elevator, go to second floor and walk straight");
        room5.setPrice(200);
        room5.setRoomType("Suite");
        room5.setView("Garden View");    
              
        Room room6=roomList.addRoom();
        room6.setAvailability("Available");
        room6.setLocation("Take first Elevator, go to first floor and walk right");
        room6.setPrice(100);
        room6.setRoomType("Standard");
        room6.setView("Pool View");
        
        Room room7=roomList.addRoom();
        room7.setAvailability("Available");
        room7.setLocation("Take second Elevator , go to second floor and walk left");
        room7.setPrice(120);
        room7.setRoomType("Deluxe");
        room7.setView("Garden View");
      
        Room room8=roomList.addRoom();
        room8.setAvailability("Available");
        room8.setLocation("Take first Elevator, go to second floor and walk straight");
        room8.setPrice(190);
        room8.setRoomType("Suite");
        room8.setView("City View");

        Room room9=roomList.addRoom();
        room9.setAvailability("Available");
        room9.setLocation("Take first Elevator, go to first floor and walk right");
        room9.setPrice(100);
        room9.setRoomType("Standard");
        room9.setView("Garden View");
        
        Room room10=roomList.addRoom();
        room10.setAvailability("Occupied");
        room10.setLocation("Take second Elevator , go to second floor and walk left");
        room10.setPrice(120);
        room10.setRoomType("Deluxe");
        room10.setView("Pool View");

        Room room11=roomList.addRoom();
        room11.setAvailability("Available");
        room11.setLocation("Take first Elevator, go to first floor and walk straight");
        room11.setPrice(250);
        room11.setRoomType("Suite");
        room11.setView("Pool View");

        Room room12=roomList.addRoom();
        room12.setAvailability("Available");
        room12.setLocation("Take first Elevator, go to first floor and walk right");
        room12.setPrice(100);
        room12.setRoomType("Standard");
        room12.setView("Garden View");      
        
        managerOrganization.setRoomDirectory(roomList);
        
       }  
       
      }
    }
     return managerOrganization.getRoomDirectory();
       
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        addDetailsButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        foodButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        roomSelectButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        directionButton = new javax.swing.JButton();
        directionsText = new javax.swing.JTextField();
        proceedButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        roomText = new javax.swing.JTextField();
        checkoutButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        daysText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        logoutButton.setFont(new java.awt.Font("Snap ITC", 2, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 102, 102));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        add(logoutButton);
        logoutButton.setBounds(1296, 16, 180, 41);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 102));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        addDetailsButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        addDetailsButton.setText("Add Details");
        addDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDetailsButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(255, 255, 255));
        viewButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        viewButton.setText("View and Edit Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        paymentButton.setBackground(new java.awt.Color(255, 255, 255));
        paymentButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        paymentButton.setText("Payment Details");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(991, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(addDetailsButton)
                .addGap(41, 41, 41)
                .addComponent(viewButton)
                .addGap(48, 48, 48)
                .addComponent(paymentButton)
                .addContainerGap(345, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Account Information", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foodButton.setBackground(new java.awt.Color(255, 255, 255));
        foodButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        foodButton.setText("Order Food");
        foodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(foodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1096, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(foodButton)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Food Service", jPanel3);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        roomSelectButton.setBackground(new java.awt.Color(255, 255, 255));
        roomSelectButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        roomSelectButton.setText("Book Room");
        roomSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomSelectButtonActionPerformed(evt);
            }
        });

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Availability", "Type", "Price", "View"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(roomTable);

        directionButton.setBackground(new java.awt.Color(255, 255, 255));
        directionButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        directionButton.setText("Find Directions");
        directionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directionButtonActionPerformed(evt);
            }
        });

        directionsText.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        proceedButton.setBackground(new java.awt.Color(255, 255, 255));
        proceedButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        proceedButton.setText("Room Service");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Booked Room No ");

        roomText.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        checkoutButton.setBackground(new java.awt.Color(255, 255, 255));
        checkoutButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        checkoutButton.setText("Checkout Room");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No of Days");

        daysText.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        daysText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                daysTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomSelectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(directionButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(directionsText, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(proceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roomText, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(daysText))))
                        .addContainerGap(173, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(roomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(daysText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(roomSelectButton)
                                .addGap(84, 84, 84)
                                .addComponent(proceedButton)
                                .addGap(94, 94, 94)
                                .addComponent(checkoutButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(directionButton)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(directionsText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jTabbedPane1.addTab("Room Service", jPanel1);

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));

        jPanel5.setBackground(new java.awt.Color(0, 102, 51));

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer", "Security Official", "Message", "Status", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(carTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Message");

        requestTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        requestTestJButton.setText("Request A Car");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(requestTestJButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestTestJButton))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Additional Services", jPanel4);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(190, 140, 1339, 685);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marriott_logo_redBackground_187x86.gif"))); // NOI18N
        jLabel4.setText("jLabel2");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 190, 90);

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer2.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 0, 1800, 880);
    }// </editor-fold>//GEN-END:initComponents

    private void addDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDetailsButtonActionPerformed
        // TODO add your handling code here:
        AddDetailsJPanel addPanel=new AddDetailsJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("AddDetailsJPanel",addPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addDetailsButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        ViewDetailsJPanel viewPanel=new ViewDetailsJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("ViewDetailsJPanel",viewPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void foodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodButtonActionPerformed
        // TODO add your handling code here:
        ViewMenuPanel viewPanel=new ViewMenuPanel(userProcessContainer, userAccount,enterprise);
        userProcessContainer.add("ViewMenuPanel",viewPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_foodButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.removeAll();
        userProcessContainer.add(mainPanel);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void roomSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomSelectButtonActionPerformed
        // TODO add your handling code here:
        try{
        int selectedRow = roomTable.getSelectedRow();     
        
        if (selectedRow < 0) {           
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(daysText.getText().isEmpty()){
            if((Integer.parseInt(daysText.getText()))==0){
                JOptionPane.showMessageDialog(this, "Please enter the no of days", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        Room room =  (Room)roomTable.getValueAt(selectedRow, 0);
        if(room.getAvailability().equalsIgnoreCase("Occupied")){
            JOptionPane.showMessageDialog(this, "Sorry!!! The room is already booked", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        else if(room.getRoomNo().equals("000")){
            
            room.setAvailability("Occupied");
            userAccount.getCustomer().setRoom(room);
            JOptionPane.showMessageDialog(this, "Room booked successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            userAccount.getCustomer().setRoomBill(calculateRoomBill(0));
            userAccount.getCustomer().setNoOfDays(Integer.parseInt(daysText.getText())); 
            roomText.setText(room.getRoomNo());
            populateRoom();
        }
        else{
           JOptionPane.showMessageDialog(this, "You already have booked a room", "Success", JOptionPane.INFORMATION_MESSAGE); 
        }
        
        populateTable();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Please enter the no of days", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_roomSelectButtonActionPerformed

    private void directionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directionButtonActionPerformed
        // TODO add your handling code here:
        Room room=userAccount.getCustomer().getRoom();       
        directionsText.setText(room.getLocation());
    }//GEN-LAST:event_directionButtonActionPerformed

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedButtonActionPerformed
        // TODO add your handling code here:
        
        RoomFacilityJPanel roomPanel=new RoomFacilityJPanel(userProcessContainer,userAccount,enterprise);
        userProcessContainer.add("RoomFacilityJPanel",roomPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_proceedButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
       
           
       if(userAccount.getCustomer().getRoom()!=null){      
            Date date2=new Date();
            long d1=userAccount.getCustomer().getRoom().getBookedDate().getTime();
            long d2=date2.getTime(); 
            long day=1000*60*60*24;
            int days = (int)Math.round((d1-d2+0.0)/day);
            
            if(days>userAccount.getCustomer().getNoOfDays()){
                double initialValue=userAccount.getCustomer().getRoom().getPrice() * userAccount.getCustomer().getNoOfDays();
                  userAccount.getCustomer().setNoOfDays(days);
                  userAccount.getCustomer().setRoomBill(calculateRoomBill(initialValue));
            }
        
        userAccount.getCustomer().getRoom().setAvailability("Available");
        Room room=new Room();
        room.setRoomNo("000");
        userAccount.getCustomer().setRoom(room);
        JOptionPane.showMessageDialog(this,"Room checked out successfully","Sucess",JOptionPane.INFORMATION_MESSAGE);        
        roomText.setText(userAccount.getCustomer().getRoom().getRoomNo());
        populateTable();
       
       }
    }//GEN-LAST:event_checkoutButtonActionPerformed

     private double calculateRoomBill(double initialValue){
     int roomBill=0;
     float price=userAccount.getCustomer().getRoom().getPrice();
     int days=Integer.parseInt(daysText.getText());
     double totalRoomBill=(price*days)+userAccount.getCustomer().getRoomBill()-initialValue;  
     return totalRoomBill;
    }
    
    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // TODO add your handling code here:
        PaymentPanel roomPanel=new PaymentPanel(userProcessContainer,userAccount.getCustomer());
        userProcessContainer.add("PaymentPanel",roomPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void daysTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daysTextKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_daysTextKeyTyped

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = messageJTextField.getText();

        CarWorkRequest request = new CarWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.getSender().setCustomer(userAccount.getCustomer());
        request.getSender().getCustomer().setPhoneNo(userAccount.getCustomer().getPhoneNo());

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationDirectory()){
            if (organization instanceof SecurityOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        populateCarRequestTable();
    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDetailsButton;
    private javax.swing.JTable carTable;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JTextField daysText;
    private javax.swing.JButton directionButton;
    private javax.swing.JTextField directionsText;
    private javax.swing.JButton foodButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton paymentButton;
    private javax.swing.JButton proceedButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton roomSelectButton;
    private javax.swing.JTable roomTable;
    private javax.swing.JTextField roomText;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
