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
import UserInterface.Cleaner.CleanerWorkAreaJPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vidya
 */
public class CleanerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,JPanel panel) {
        return new CleanerWorkAreaJPanel(userProcessContainer,account,organization,panel);
    }
    
}
