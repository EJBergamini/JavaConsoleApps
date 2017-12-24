/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author EJB Laptop
 */


public class UserIO_Interface_Rules implements UserIO {
    
    Scanner readInput = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
        return;
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt); //system.out here instead?
        double input = readInput.nextDouble();
        return input;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        print(prompt + " " + min + " and " + max + "."); //system.out here instead?
        double input = readInput.nextDouble();
        if ((input > min) && (input < max)) {
            return input;
            }
        while (input < min && input > max) {
            print(prompt + " " + min + " and " + max + ".");
            input = readInput.nextDouble();
        } return input;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        float input = readInput.nextFloat();
        return input;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        print(prompt + " " + min + " and " + max + "."); //system.out here instead?
        float input = readInput.nextFloat();
        if ((input > min) && (input < max)) {
            return input;
            }
        while (input < min && input > max) {
            print(prompt + " " + min + " and " + max + ".");
            input = readInput.nextFloat();
        } return input;
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        int input = readInput.nextInt();
        return input;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        print(prompt + " " + min + " and " + max + "."); //system.out here instead?
        int input = readInput.nextInt();
        if ((input > min) && (input < max)) {
            return input;
            }
        while (input < min && input > max) {
            print(prompt + " " + min + " and " + max + ".");
            input = readInput.nextInt();
        } return input;
    }

    @Override
    public long readLong(String prompt){
        print(prompt);
        long input = readInput.nextLong();
        return input;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        print(prompt + " " + min + " and " + max + "."); //system.out here instead?
        long input = readInput.nextLong();
        if ((input > min) && (input < max)) {
            return input;
            }
        while (input < min && input > max) {
            print(prompt + " " + min + " and " + max + ".");
            input = readInput.nextLong();
        } return input;
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        String input = readInput.nextLine();
        return input;
    } 
}


// extra methods that can be used...

/* public double readDouble(String prompt){    



    



    double num=0;



    while(validInput==false){



      print(prompt);



      String doubleString = sc.nextLine();



      try{



          num = Double.parseDouble(doubleString);



          validInput=true;



          



        }



      catch(NumberFormatException e){



          print("Please enter a valid number");



        }



      }



      return num; 



  } */

/* while (true) {
            System.out.print("> ");
            input = readInput.nextDouble();
            
            if ((input >= min) && (input <= max)) {
                break;
            }
            System.out.println("Invalid input.");
        }
        return input;

this is how to use a true condition test statement */