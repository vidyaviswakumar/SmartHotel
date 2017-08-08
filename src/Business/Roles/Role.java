/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vidya
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"), Manager("Manager"), Attendor("Attendor"),Cleaner("Cleaner"),Cook("Cook"),Security("Security");
        private String value;
        
        private RoleType(String value){
            this.value=value;
        }

        @Override
        public String toString() {
            return value;
        }              
    } 
       
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            JPanel panel);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
