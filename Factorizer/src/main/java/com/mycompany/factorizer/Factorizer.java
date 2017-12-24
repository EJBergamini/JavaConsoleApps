/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorizer;

import java.util.Scanner;

/**
 *
 * @author EJB Laptop
 */
public class Factorizer {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int userNumber = 0;
        int numOfFactors = 0;
        int i; //int i is the standard counter.
        int counter = 1; //int counter is for counting the factors.
        int sum = 0;
        
        while (userNumber <= 0) {
            System.out.println("This program will factor a number and give you some information about it.");
            System.out.println("Please enter a whole number:");
            userNumber = inputReader.nextInt();
        }
        
        System.out.println("");
        System.out.println("You have selected: " + userNumber);      
        System.out.println("The factors of " + userNumber + " are: "); //start point for printing the factors.
        
        for (i = 1; i <= userNumber; i++) { //this counts down the user input in iterations of i.            
            while (userNumber % i == 0) {   //this only runs code on iterations of i that divide evenly into user imput (factors).
                numOfFactors++;             //this adds a counter to the number of factors of the user number.
                System.out.println(i);      //this prints i as a factor of user number each time one is found.
                sum = sum + i;              //this sums the factors as we go along.
                i++;
            }
        }
        
        if (sum - userNumber == userNumber) {
            System.out.println("Your number is a PeRfEcT number.");
        }
        
        if (numOfFactors == 2) {
            System.out.println("Your number is also a prime number.");
        }
                       
        System.out.println("This is the sum of all factors of your number: " + sum); //this prints out the sum of the factors.
        System.out.println("The total possible factors of your number is: " + numOfFactors);
        
    }
    
}
