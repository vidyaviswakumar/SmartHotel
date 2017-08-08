/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Rooms;

import Business.EcoSystem;
import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class RoomDirectory {
    
   private static RoomDirectory roomDirectory;
   private ArrayList<Room> roomList;
   private RoomDirectory(){
         roomList=new ArrayList<>();
    }
    
    public static RoomDirectory getInstance(){
        if(roomDirectory==null){
            roomDirectory=new RoomDirectory();
        }
        return roomDirectory;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
    
    public Room addRoom(){
        Room room=new Room();
        roomList.add(room);
        return room;
    }
    
    public Room searchRoom(String type){
        for(Room room:roomList){
            if(type==room.getRoomType()){
                return room;
            }
        }
        return null;
    }
    
}
