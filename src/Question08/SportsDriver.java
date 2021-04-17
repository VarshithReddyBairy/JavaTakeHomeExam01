/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class SportsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Please enter the number of overs played ");
        int overs = scan.nextInt();
        CricketFormat cricket = new CricketFormat(overs);
        System.out.println(cricket.toString());
    }
    
}
