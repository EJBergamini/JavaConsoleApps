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

public class UserInterface {
    
    public void takeInformation(){
        
    Scanner readInput = new Scanner(System.in);
    
    UserIO userInterface = new UserIO_Interface_Rules();
    
    Calculator calculator = new Calculator();
        
        int userInputChoice;
        double userInputOperand1;
        double userInputOperand2;
        
        System.out.println("Welcome to calculator.");
        System.out.println("");
        System.out.println("What operator would you like to use?");
        System.out.println("Select: 1 - for addition, 2 - for subtraction, 3 - for multiplication, 4 - for division.");
        System.out.println("");
        System.out.println("To exit the calculator press 5.");
        System.out.println("");
        System.out.println("Enter the operator here:");
        userInputChoice = readInput.nextInt();
        
        //honestly, the best way to do the below is in seperate methods called within the switch statement for each operation.
        switch (userInputChoice) {
            case 1:
                double num1 = userInterface.readDouble("Please enter the first number:");
                double num2 = userInterface.readDouble("Please enter the second number:");
                double result1 = calculator.addition(num1, num2);
                userInterface.print("The result is: "+ result1);
                userInterface.print("");
                userInterface.print("-------------------------------------------------");
                takeInformation();
            case 2:
                double num3 = userInterface.readDouble("Please enter the first number:");
                double num4 = userInterface.readDouble("Please enter the second number:");
                double result2 = calculator.subtraction(num3, num4);
                userInterface.print("The result is: "+ result2);
                userInterface.print("");
                userInterface.print("-------------------------------------------------");
                takeInformation();
            case 3:
                double num5 = userInterface.readDouble("Please enter the first number:");
                double num6 = userInterface.readDouble("Please enter the second number:");
                double result3 = calculator.multiplication(num5, num6);
                userInterface.print("The result is: "+ result3);
                userInterface.print("");
                userInterface.print("-------------------------------------------------");
                takeInformation();
            case 4:
                double num7 = userInterface.readDouble("Please enter the first number:");
                double num8 = userInterface.readDouble("Please enter the second number:");
                double result4 = calculator.division(num7, num8);
                userInterface.print("The result is: "+ result4);
                userInterface.print("");
                userInterface.print("-------------------------------------------------");
                takeInformation();
            case 5:
                System.out.println("Thank you for using the calculator.");
                System.exit(0);
        }
    }
    
}
        
    

