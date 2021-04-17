/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class TcsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Solution for Question 8");
        System.out.println("Please enter the loaction from below to get the count of employees");
        System.out.println("1.Hyderabad");
        System.out.println("2.Bangalore");
        System.out.println("3.Chennai");
        System.out.println("4.Mumbai");
        System.out.println("5.Ahmedabad");
        Scanner scan = new Scanner(System.in);
        String location = scan.next();
        TcsEmployee empCount = new TcsEmployee(location);
        System.out.println(empCount.toString());
    }
    
}
