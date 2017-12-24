/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guessmemore;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author EJB Laptop
 */
public class GuessMeMore {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int correctAnswer = random.nextInt(100)-100;
        int userGuess;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please select a whole number between -100 and 100.");
        userGuess = inputReader.nextInt();
        
        while(userGuess != correctAnswer) {
            if (userGuess > correctAnswer) {
                System.out.println("You're too high, try again!");
                userGuess = inputReader.nextInt();
            }   else if (userGuess < correctAnswer) {
                System.out.println("You're too low, try again!");
                userGuess = inputReader.nextInt();
            }
        }
               
        if (userGuess == correctAnswer){
            System.out.println("Great job, you selected " + userGuess + " which is the correct answer.");
        }   
        
    }
    
}
