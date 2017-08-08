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
public class FoodOrder {
    
    private ArrayList<FoodMenuItem> foodOrderList;
    private int orderNo;
    private static int count=0;
    
    public FoodOrder(){
        foodOrderList=new ArrayList<>();
        count++;
        orderNo=count;
    }

    public ArrayList<FoodMenuItem> getFoodOrderList() {
        return foodOrderList;
    }

    public void setFoodOrderList(ArrayList<FoodMenuItem> foodOrderList) {
        this.foodOrderList = foodOrderList;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        FoodOrder.count = count;
    }  
    
    public FoodMenuItem addToMasterFoodCatalog(FoodMenuItem foodItem){
        foodOrderList.add(foodItem);
        return foodItem;
    }
}
