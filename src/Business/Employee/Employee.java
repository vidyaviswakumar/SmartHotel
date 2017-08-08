/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;

/**
 *
 * @author vidya
 */
public class Employee extends Person{
    
   private int id;
   private static int counter=111111;
   private long ssn;

    public Employee() {        
        counter++;
        id=counter;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

      
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getName();
    }
    
}
