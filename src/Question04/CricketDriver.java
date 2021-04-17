/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question04;

/**
 *
 * @author S542263
 */
public class CricketDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cricket batsman = new Batsman(100,"Right Hand","Sachin","Tendulkar",400);
       Cricket bowler = new Bowler(400,"Left Arm Medium Pace","Zaheer","Khan",450);
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Players Information");
        System.out.println("===============================================");
        System.out.println("BATSMAN INFORMATION");
        System.out.println("-----------------------------------------------");
        System.out.println(batsman.playerInfo());
        System.out.println("BOWLER INFORMATION");
        System.out.println("-----------------------------------------------");
        System.out.println(bowler.playerInfo());
    }
    
}
