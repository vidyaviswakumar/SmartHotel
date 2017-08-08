/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class FoodOrderCatalog {
    private ArrayList<FoodOrder> masterList;
    
    public FoodOrderCatalog(){
        masterList=new ArrayList<>();
    }

    public ArrayList<FoodOrder> getMasterList() {
        return masterList;
    }

    public void setMasterList(ArrayList<FoodOrder> masterList) {
        this.masterList = masterList;
    }
    
    public FoodOrder addToMaster(FoodOrder foodOrder){
        masterList.add(foodOrder);
        return foodOrder;
    }
}
