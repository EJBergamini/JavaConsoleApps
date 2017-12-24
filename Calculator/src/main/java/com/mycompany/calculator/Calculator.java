/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;



/**
 *
 * @author EJB Laptop
 */
public class Calculator {
    private double operator1;
    private double operator2;
    private double result;

    
    public double addition(double operator1, double operator2) {
        result = operator1 + operator2;
        return result;      
    }
    
    public double subtraction(double operator1, double operator2) {
        result = operator1 - operator2;
        return result;
    }
    
    public double multiplication(double operator1, double operator2) {
        result = operator1 * operator2;
        return result;
    }
    
    public double division(double operator1, double operator2) {
        result = operator1 / operator2;
        return result;
    }
    
}


