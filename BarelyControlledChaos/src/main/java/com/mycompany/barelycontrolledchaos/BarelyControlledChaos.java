/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barelycontrolledchaos;

import java.util.Random;

/**
 *
 * @author EJB Laptop
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
             
        String color = colorRandom();
        String animal = animalRandom();
        String colorAgain = colorRandom();
        int weight = numberRandom(5, 200);
            // with a range between 5 - 200 
        int distance = numberRandom(10, 20);
            // with a range between 10 - 20 
        int number = numberRandom(10000, 20000);
            // with a range between 10000 - 20000 
        int time = numberRandom(2, 6);
            // with a range between 2 - 6            
    
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal 
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over " 
            + number + " " + colorAgain + " poppies for nearly " 
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, " 
            + "let me tell you!");
    } 
    
    public static String colorRandom(){
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        Random randomizer = new Random();
        int random = randomizer.nextInt(colors.length);
        return colors[random];
    }
    
    public static String animalRandom() {
        String[] animals = {"Cow", "Sheep", "Dog", "Cat", "Emu", "Pig", "Shark"};
        Random randomizer = new Random();
        int random = randomizer.nextInt(animals.length);
        return animals[random];
    }
    
    public static int numberRandom(int x, int y) {        
        Random randomizer = new Random();
        return randomizer.nextInt(x)+y;
    }
    
}
