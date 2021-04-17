/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatakehomeexam01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class Question01 {

    public static void main(String args[]) {
        System.out.println("Varshith Reddy Bairy");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
            list.add(myArray[i]);
        }
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer number : list) {
            if (!newList.contains(number)) {
                newList.add(number);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer number : newList) {
            System.out.print(number + " ");
        }
    }

}
