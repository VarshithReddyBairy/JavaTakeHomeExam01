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
public class TataDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TataGroup tcs = new Tcs("Mumbai","Rajesh Gopinathan","Surya kant");
        TataGroup tata = new TataMotors("Guenter Karl Butschek", "Mayank Pareek");
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Solution for Question 4");
        System.out.println("INFORMATION RELATED TO TCS");
        System.out.println("========================================");
        System.out.println(tcs);
        System.out.println("INFORMATION RELATED TO TATA MOTORS");
        System.out.println("========================================");
        System.out.println(tata);
    }
    
}
