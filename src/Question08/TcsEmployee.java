/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

/**
 *
 * @author S542263
 */
public class TcsEmployee extends Tcs{

    public TcsEmployee(String location) {
        super(location);
    }

    @Override
    public int getNumberOfEmployees(){
        int employees = 0;
        if(super.getLocation().equalsIgnoreCase("hyderabad")){
            employees =  25000;
        }
        if(super.getLocation().equalsIgnoreCase("bangalore")){
            employees =  30000;
        }
        if(super.getLocation().equalsIgnoreCase("mumbai")){
            employees =  40000;
        }
        if(super.getLocation().equalsIgnoreCase("chennai")){
            employees =  20000;
        }
        if(super.getLocation().equalsIgnoreCase("Ahmedabad")){
            employees =  15000;
        }
        return employees;
    }

    @Override
    public String toString() {
        return "The number of employees in "+super.getLocation()+" is "+getNumberOfEmployees();
    }

    
    
    
}
