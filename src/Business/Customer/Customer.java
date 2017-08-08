/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Food.FoodOrderCatalog;
import Business.Payment.Payment;
import Business.Person.Person;
import Business.Rooms.Room;

/**
 *
 * @author vidya
 */
public class Customer extends Person{
    
    private Payment payment;
    private String carNo;
    private Room room;
    private int temp;
    private String paymentType;
    private int noOfDays;
    private double roomBill;
    private FoodOrderCatalog orderList;

    public Customer() {
        payment=new Payment();
        noOfDays=0;
        roomBill=0;
        orderList=new FoodOrderCatalog();
        room=new Room();
    }

     public double getRoomBill() {
        return roomBill;
    }

    public void setRoomBill(double roomBill) {
        this.roomBill = roomBill;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public FoodOrderCatalog getOrderList() {
        return orderList;
    }

    public void setOrderList(FoodOrderCatalog orderList) {
        this.orderList = orderList;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
       

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
    
}
