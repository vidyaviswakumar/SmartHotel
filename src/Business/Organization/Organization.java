/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Roles.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public abstract class Organization {
    
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private EmployeeDirectory employeeDirectory;
    private WorkQueue workQueue;
    private static int counter=0;
    private int organizationId;
    private String name;
    
    public Organization(String name){
        this.name=name;
        workQueue=new WorkQueue();
        employeeDirectory=new EmployeeDirectory();
        customerDirectory=new CustomerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        counter++;
        organizationId=counter;
    }
    
    public enum Type{
        
        Admin("Admin Organization"),Cook("Cook Organization"),Manager("Manager Organization"),Cleaner("Cleaning Organization"),Attendant("Attendant Organization"),Security("Security Organization"),Customer("Customer Organization");
        private String value;
        private Type(String value){
           this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
