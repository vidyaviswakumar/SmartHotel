/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Customer.Customer;
import Business.Roles.Role;
import Business.Rooms.RoomDirectory;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountDirectory;
    
    public UserAccountDirectory() {
        userAccountDirectory=new ArrayList<>();      
    }
    
    
    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public UserAccount addUserAccount(String userName,String password,Employee employee,Role role,Customer customer){
        UserAccount userAccount=new UserAccount();
        userAccount.setPassword(password);
        userAccount.setUserName(userName);
        userAccount.setRole(role);
        userAccount.setCustomer(customer);
        userAccount.setEmployee(employee);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    
    public UserAccount authenticateUserAccount(String userName,String password){
        for(UserAccount ua: userAccountDirectory){
            if(ua.getUserName().equals(userName)&&(ua.getPassword().equals(password))){
                return ua;
            }
            
        }
        return null;
    }
    
    public boolean checkIfUniqueUserName(String userName){
        for(UserAccount ua: userAccountDirectory){
            if(ua.getUserName().equals(userName)){
                return false;
            }
            
        }
        return true;
    }
    
}
