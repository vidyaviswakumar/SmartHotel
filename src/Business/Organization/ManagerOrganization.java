/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.ManagerRole;
import Business.Roles.Role;
import Business.Rooms.RoomDirectory;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */  
public class ManagerOrganization extends Organization {

    private RoomDirectory roomDirectory;
    private int fireThresold;
    public ManagerOrganization() {
        super(Type.Manager.getValue());
    }

    public RoomDirectory getRoomDirectory() {
        return roomDirectory;
    }

    public void setRoomDirectory(RoomDirectory roomDirectory) {
        this.roomDirectory = roomDirectory;
    }

    public int getFireThresold() {
        return fireThresold;
    }

    public void setFireThresold(int fireThresold) {
        this.fireThresold = fireThresold;
    }
    
      
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new ManagerRole());
        return roleList;
    }
    
}
