/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.Role;
import Business.Roles.SecurityRole;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class SecurityOrganization extends Organization {

    public SecurityOrganization() {
        super(Type.Security.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new SecurityRole());
        return roleList;
        
    }
    
}
