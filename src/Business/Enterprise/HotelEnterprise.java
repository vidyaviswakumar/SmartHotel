/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class HotelEnterprise extends Enterprise{

    public HotelEnterprise(String name) {
        super(name,EnterpriseType.Hotel);
    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
