/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author User
 */


import java.util.Scanner;

/**
 *
 * @author User
 */
public class Javaapplication15 {

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        //Taking three numbers as input
        System.out.println("enter first number: ");
        int N1 = in.nextInt();        
        
        System.out.println("enter second number: ");
        int N2 = in.nextInt();
        
        System.out.println("enter third number: ");
        int N3 = in.nextInt();
        
        //Finding the greatest number
        int greatest = N1;
        if (N2 > greatest) {
            greatest = N2;
        }
        if (N3 > greatest) {
            greatest = N3;
        }
        
        //Printing the greatest number
        System.out.println("The greatest number is: " + greatest);
        
        in.close();
        
    }
}
