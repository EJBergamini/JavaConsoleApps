/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doggenetics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
     
/**
 * @author EJB Laptop
 */

public class DogGenetics {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        Random random = new Random();
        
        int dogGenePercent = 0;
        int startingPercent = 100;
        String dogName = "";
        ArrayList<String> dogTypes = new ArrayList<String>(Arrays.asList("Corgi", "Daschund", "Blood Hound", "Doberman", "Retriever", "Jindo", "Husky", "Poodle", "Boxer", "Terrier", "Lab", "Bulldog"));
        int dogType;
        String userInput = "";
        
        while (dogName.isEmpty() || userInput.contentEquals("n") || userInput.contentEquals("N") || userInput.contentEquals("no") || userInput.contentEquals("NO")) {
            System.out.println("What is your dog's name?");
            dogName = inputReader.next();
            System.out.println("You've entered: " + dogName + ", are you certain this is right? (enter Y for yes or N for no).");
            userInput = inputReader.next();
        }   if (userInput.contentEquals("Y") || userInput.contentEquals("y") || userInput.contentEquals("yes") || userInput.contentEquals("YES")) {
                System.out.println("Well then, I have this 'highly reliable' report on " + dogName + "'s prestigious background right here.");
            }
            
        System.out.println("------------------------------------------------------");
        System.out.println("Begin:");
        
        while (startingPercent > 0) {          
            dogType = random.nextInt(dogTypes.size());
            dogGenePercent = random.nextInt(startingPercent)+1;
            startingPercent = startingPercent - dogGenePercent;
            System.out.println(dogName + " is " + dogGenePercent + " percent" + " " + dogTypes.get(dogType) + ".");
            dogTypes.remove(dogType);
        }
               
        System.out.println("");  
        System.out.println("Wow, that's QUITE the dog!");
        
    }
        
}

