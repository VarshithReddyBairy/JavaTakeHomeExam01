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
public class TCSDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Varshith Reddy Bairy");
         System.out.println("Solution for Question 7");
        System.out.println("Please enter your experience at TCS");
        int exp = scan.nextInt();
        if(exp < 4){
            System.out.println("You are at "+TCS.ENTRY.toString()+" level and your hike is "+TCS.ENTRY.getHike()+"%");
        }
        else  if(exp >= 4 && exp < 8){
            System.out.println("You are at "+TCS.MEDIUM.toString()+" level and your hike is "+TCS.MEDIUM.getHike()+"%");
        }
        else
        {
            System.out.println("You are at "+TCS.ADVANCE.toString()+" level and your hike is "+TCS.ADVANCE.getHike()+"%");
        }
        
    }
    
}
