/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

import java.util.Scanner;

import java.util.Random;


/**
 *
 * @author EJB Laptop
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        Random randomizer = new Random();
        
        int roundsToPlay = 0; //min 1 max 10
        int tieGame = 0;
        int userWinGame = 0;
        int compWinGame = 0;
        int userPlay = 0;
        int compPlay = 0;
        String playAgain = "";
        String winner = "";
        
        System.out.println("");
        System.out.println("");
        System.out.println("    ~~ Rock Paper Scissors Game ~~");
        System.out.println("");
        System.out.println("Please select how many times to play,");
        System.out.println("you can play up to 10 times:");
        roundsToPlay = inputReader.nextInt();
        
        while (roundsToPlay > 10 || roundsToPlay <= 0) {
            System.out.println("");
            System.out.println("Invalid entry, you must select between 1-10 games,");
            System.out.println("Please select again:");
            roundsToPlay = inputReader.nextInt();
        }
        
        System.out.println("");
        System.out.println("Excellent, you have selected " + roundsToPlay + " games,");
        System.out.println("let's get this party started!");
        System.out.println("");

        for (int i = 0; i <= roundsToPlay; i--) {
            
            System.out.println("Please select Rock (1), Paper (2), or Scissors (3):");
            userPlay = inputReader.nextInt();
            compPlay = randomizer.nextInt(3)+1;
            roundsToPlay--;
            
            System.out.println("");
            
            if (userPlay == 1) {
                if (compPlay == 1) {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("You have tied.");
                    tieGame ++;
                }   else if (compPlay == 2) {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("The computer has won.");
                    compWinGame ++;
                }   else {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("You have won.");
                    userWinGame ++;
                }
            }
            
            if (userPlay == 2) {
                if (compPlay == 2) {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("You have tied.");
                    tieGame ++;
                }   else if (compPlay == 1) {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("You have won.");
                    userWinGame ++;                  
                }   else {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("The computer has won.");
                    compWinGame ++;
                }
            }
            
            if (userPlay == 3) {
                if (compPlay == 3) {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("You have tied.");
                    tieGame ++;
                }   else if (compPlay == 1) {                   
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("The computer has won.");
                    compWinGame ++;
                }   else {
                    System.out.println("You have selected " + userPlay + " the computer selected " + compPlay);
                    System.out.println("");
                    System.out.println("You have won.");
                    userWinGame ++;                   
                }
            }
            
            System.out.println("");
            System.out.println("You have " + roundsToPlay + " rounds remaining.");

            if (roundsToPlay == 0) {
                System.out.println("");
                System.out.println("Game over --");
                System.out.println("");
                if (userWinGame <= tieGame && compWinGame <= tieGame) {
                    winner = "Tie!";        
                }   else if (compWinGame > userWinGame && compWinGame > tieGame) {
                        winner = "Computer";           
                }   else {
                        winner = "Player";       
                }
                System.out.println("The winner is: " + winner);
                System.out.println("");
                System.out.println("Would you like to play again? (enter Y for yes or N for no).");
                playAgain = inputReader.next();
                
                if (playAgain.equalsIgnoreCase("y")) {
                    System.out.println("Since you've decided to play again please enter the number of games:");
                    roundsToPlay = inputReader.nextInt();
                }   else if (playAgain.equalsIgnoreCase("n")) {
                    System.exit(0);
                }
            }
        }
        
    }
    
}