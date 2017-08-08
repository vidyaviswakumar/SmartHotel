/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.CookRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class CookOrganization extends Organization{
    public CookOrganization(String name) {
        super(Type.Cook.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new CookRole());
        return roleList;
    }
    
}
