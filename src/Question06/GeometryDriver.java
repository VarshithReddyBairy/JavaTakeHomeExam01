/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class GeometryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Solution for Question 6");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 sides of the triangle");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();
        System.out.println("Please enter any color");
        String color = scan.next();
        System.out.println("Please enter whether the triangle is filled or not");
        boolean filled = scan.nextBoolean();
        Triangle triangle = new Triangle(side1,side2,side3,color,filled);
        System.out.println(triangle.toString());
    }
    
}
