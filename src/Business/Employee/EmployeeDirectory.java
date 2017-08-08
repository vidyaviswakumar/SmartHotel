/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author vidya
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        employeeDirectory=new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(ArrayList<Employee> employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public Employee addEmployee(String employeeName,long ssn,long phoneNo, String address ){
        Employee employee=new Employee();//set person properties
        employee.setName(employeeName);
        employee.setAddress(address);
        employee.setPhoneNo(String.valueOf(phoneNo));
        employee.setSsn(ssn);
        employeeDirectory.add(employee);
        return employee;
    }
    
    
}
