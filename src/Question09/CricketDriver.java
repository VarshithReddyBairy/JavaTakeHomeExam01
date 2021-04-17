/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author S542263
 */
public class CricketDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Solution for Question 9");
        Batsman batsman = new Batsman("Varshith",120,12000);
        Bowler bowler = new Bowler("Bhuvaneshwar Kumar",100,115);
        System.out.println("Varshith Reddy Bairy");
        System.out.println(batsman.batsManInfo());
        System.out.println(bowler.bowlerInfo());
    }
    
}
