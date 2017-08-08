/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;

    public CustomerDirectory() {
        customerDirectory=new ArrayList<>();
    }
  
    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer addCustomer(Customer customer){
        customerDirectory.add(customer);
        return customer;
    }
    
}
