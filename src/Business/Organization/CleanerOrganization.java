/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Roles.CleanerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class CleanerOrganization extends Organization{

    public CleanerOrganization() {
        super(Type.Cleaner.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new CleanerRole());
        return roleList;
       
    }
    
}
