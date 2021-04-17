/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhilash Ramavaram
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arry1[][] = new int[3][3];
        int arry2[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list1: ");

        for (int i = 0; i < arry1.length; i++) {
            for (int j = 0; j < arry1.length; j++) {
                arry1[i][j] = sc.nextInt();
               
            }
           
        }

        System.out.println("Enter list1: ");
        for (int i = 0; i < arry2.length; i++) {
            for (int j = 0; j < arry2.length; j++) {
                arry2[i][j] = sc.nextInt();
                
            }
           
        }
        if(equals(arry1, arry2))
        {                                                                                                                                                           
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {

        boolean flag = true;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    flag = false;
                }

            }
        }

        return flag;
    }

}

//51 22 25 6 1 4 24 54 6

