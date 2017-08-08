/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseDirectory;

    public EnterpriseDirectory() {
        enterpriseDirectory=new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(ArrayList<Enterprise> enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    public Enterprise addEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hotel){
            enterprise=new HotelEnterprise(name);
            enterpriseDirectory.add(enterprise);
        }
        
        return enterprise;
    }
    
}
