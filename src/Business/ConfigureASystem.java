/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Roles.AdminRole;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author vidya
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
       EcoSystem business=EcoSystem.getInstance();
        Employee employee=business.getEmployeeDirectory().addEmployee("System Admin",0,0,null);
        UserAccount userAccount=business.getUserAccountDirectory().addUserAccount("sysadmin","sysadmin",employee,new SystemAdminRole(),null);       
        return business;
    }
      
}
