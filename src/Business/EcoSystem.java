/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Roles.Role;
import Business.Roles.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private EcoSystem(){
        super(null);
         networkList=new ArrayList<>();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public Network addNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        if(this.getUserAccountDirectory().checkIfUniqueUserName(userName)){
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    
    
}
