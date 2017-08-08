/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;



/**
 *
 * @author vidya
 */
public abstract class Enterprise extends Organization{
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
       

    public Enterprise(String name,EnterpriseType enterpriseType) {
        super(name);
        this.organizationDirectory=new OrganizationDirectory();
        this.enterpriseType=enterpriseType;
        
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }     
    
    public enum EnterpriseType{
        Hotel("Hotel Enterprise");
        private String value;
        private EnterpriseType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
        
        
    }

    @Override
    public String toString() {
        return enterpriseType.value;
    }
    
    
}
