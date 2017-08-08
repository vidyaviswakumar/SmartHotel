/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.AdminRole;
import Business.Roles.AttendantRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class AttendantOrganization extends Organization {

    public AttendantOrganization() {
        super(Type.Attendant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new AttendantRole());
        return roleList;
    }
    
}
