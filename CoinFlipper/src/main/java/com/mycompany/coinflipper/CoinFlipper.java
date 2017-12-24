/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coinflipper;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author EJB Laptop
 */
public class CoinFlipper {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Need a coin tossed for you?");
        System.out.println("Enter Y to flip a coin, N to exit:");      
        String choice = userInput.next();
        
        if (choice.contentEquals("y") || choice.contentEquals("Y")) {
            boolean result = randomizer.nextBoolean();
            System.out.println("The coin landed on: " + result + ".");
        }   else if (choice.contentEquals("n") || choice.contentEquals("n") || choice.isEmpty())
            System.out.println("Thank you for using the coin flipper.");
            System.exit(0);
    }
    
}
