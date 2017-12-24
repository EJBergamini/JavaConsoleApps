/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.birthstones;

import java.util.Scanner;

/**
 *
 * @author EJB Laptop
 */
public class BirthStones {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please give your birth month: (e.g.: January = 1)");
        int userInput = inputReader.nextInt();
        String month = "";
        String stone = "";
        
        if (userInput == 1) {
            month = "January";
            stone = "Garnet";
        }   
        else if (userInput == 2) {
            month = "February";
            stone = "Ametheyst";
        }
        else if (userInput == 3) {
            month = "March";
            stone = "Aquamarine";
        }
        else if (userInput == 4) {
            month = "April";
            stone = "Diamond";
        }
        else if (userInput == 5) {
            month = "May";
            stone = "Emerald";
        }
        else if (userInput == 6) {
            month = "June";
            stone = "Pearl";
        }
        else if (userInput == 7) {
            month = "July";
            stone = "Ruby";
        }
        else if (userInput == 8) {
            month = "August";
            stone = "Peridot";
        }
        else if (userInput == 9) {
            month = "September";
            stone = "Sapphire";
        }
        else if (userInput == 10) {
            month = "October";
            stone = "Opal";
        }
        else if (userInput == 11) {
            month = "November";
            stone = "Topaz";
        }
        else if (userInput == 12) {
            month = "December";
            stone = "Turqoise";
        }
        else System.out.println("You have not selected an actual month. Please type a number between 1-12.");        
        System.out.println("You have selected " + userInput + "; thus, your corresponding");
        System.out.println("birth month is " + month + " and your birthstone is " + stone + ".");  
    }
    
}
