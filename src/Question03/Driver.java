/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542263
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Solution for Question 3");
        ArrayList<Object> myList = new ArrayList<>();
        Loan loan = new Loan(1000,"US Bank");
        myList.add(loan);
        Date date = new Date();
        myList.add(date);
        String string = "This is a program to demonstrate ArrayList";
        myList.add(string);
        Circle circle = new Circle(10);
        myList.add(circle);
        
        for(Object object : myList){
            System.out.println(object.toString());
        }
    }
    
}
