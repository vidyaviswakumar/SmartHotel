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
import UserInterface.LaundryPerson.LaundryWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author vidya
 */
public class AttendantRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, JPanel panel) {
        return new LaundryWorkAreaJPanel(userProcessContainer,account,organization,panel);
    }
    
}
