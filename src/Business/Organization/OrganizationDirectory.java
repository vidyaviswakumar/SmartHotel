/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationDirectory;

    public OrganizationDirectory() {
        organizationDirectory=new ArrayList<>();
    }

    
    
    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(ArrayList<Organization> organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public Organization addOrganization(Type type){
        Organization organization=null;
        if(type.getValue().equals(Type.Attendant.getValue())){
            organization=new AttendantOrganization();
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equals(Type.Cleaner.getValue())){
            organization=new CleanerOrganization();
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equals(Type.Manager.getValue())){
            organization=new ManagerOrganization();
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equals(Type.Security.getValue())){
            organization=new SecurityOrganization();
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equals(Type.Cook.getValue())){
            organization=new CookOrganization(Type.Cook.getValue());
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equals(Type.Customer.getValue())){
            organization=new CustomerOrganization(Type.Customer.getValue());
            organizationDirectory.add(organization);
        }
        return organization;
        
    }
}
