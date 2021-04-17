/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class CricketDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Solution for Question 7");
        System.out.println("Please Enter the Format of Cricket");
        String cricket = scan.next();
        if(cricket.toUpperCase().equals(Cricket.ODI.toString())){
            System.out.println("The number of overs played in "+cricket.toUpperCase()+"are " + Cricket.ODI.getOvers());
        }
        else  if(cricket.toUpperCase().equals(Cricket.T20.toString())){
            System.out.println("The number of overs played in "+cricket.toUpperCase()+" are " + Cricket.T20.getOvers());
        }
        else{
            
            System.out.println("The number of overs played in "+cricket.toUpperCase()+" are " + Cricket.TEST.getOvers());
        }
    }
    
}
