package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Get input value for temperature type
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");

        //Initialization of conversions/user temp
        String temp = scanner.next();
        int tempValue = 0;
        int celsConv;
        int fahConv;

        //Conditional for getting accurate temp value
        System.out.print("Please enter your temperature in ");
        if(temp.toLowerCase(Locale.ROOT).contentEquals("f")) {
            System.out.print("Celsius: ");
            tempValue = scanner.nextInt();
        } else if(temp.toLowerCase(Locale.ROOT).contentEquals("c")) {
            System.out.print("Fahrenheit: ");
            tempValue = scanner.nextInt();
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        //Conversion output
        fahConv = (tempValue * 9 / 5) + 32; // Conversion for fahrenheit
        celsConv = (tempValue - 32) * 5 / 9; // Conversion for celsius
        System.out.print("The temperature in ");
        String close = (temp.contentEquals("f")) ? "Fahrenheit is " + fahConv + "." : "Celsius is " + celsConv + ".";
        System.out.print(close);
    }
}
