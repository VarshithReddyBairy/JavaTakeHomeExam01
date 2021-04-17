/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatakehomeexam01;

import java.util.*;

/**
 *
 * @author S542263
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Program for Question 2 ");
        Scanner scan = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.print("Enter list1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
        System.out.print("Enter list2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = scan.nextInt();
            }
        }

        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] == m2[i][j]) {
                    result = true;
                } else {
                    result = false;
                }
                if (result == false) {
                    break;
                }
            }
            if (result == false) {
                break;
            }
        }
        return result;
    }

}
