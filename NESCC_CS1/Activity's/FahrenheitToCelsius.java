package edu.northeaststate.dlblair;

import java.util.Scanner;

/**
 * Name: James T. Kirk
 * Date: 08/12/2019
 * Project: Class example 2
 * Getting Started - This program will demonstrate the input/process/output paradigm.
 *                   This program converts fahrenheit to celsius. The user will be
 *                   prompted to enter a temperature in fahrenheit and the program
 *                   will make the conversion and output the celsius equivalent to
 *                   the standard output (console window).
 *
 *                   Formula:
 *                   C = (F - 32) * (5 / 9)
 *
 *                   Notes:
 *                   1. Create a conversion constant for 5/9
 *                   2. Create a constant for fahrenheit constant 32
 *
 * Test Data:
 *      fahrenheit input:
 *      celsius output:
 *
 *      fahrenheit input:
 *      celsius output:
 *
 */
public class FahrenheitToCelsius {

    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public static void main(String[] args) {

        //-- Declare and define all local variables --
        //local constants
        final double F_TO_C_CONVERSION_CONSTANT = (5.0 / 9.0); // careful of integer division
        final int FREEZING_POINT_OF_FAHRENHEIT = 32;
        //input object
        Scanner cin = new Scanner(System.in);
        //input string
        String input = "";
        double fahrenheit = 0d;
        double celsius = 0d;
        //---------------------------------------------

        //--------------- Input Section ---------------
        //prompt user
        System.out.println("This program will convert a Fahrenheit temperature to Celsius.");
        System.out.print("Please enter a Fahrenheit temperature: ");

        //get user input (assume it is clean input)
        input = cin.nextLine();

        //---------------Process Section --------------
        //process input
        fahrenheit = Double.parseDouble(input); //convert string to double
        //make conversion to celsius
        celsius = (fahrenheit - FREEZING_POINT_OF_FAHRENHEIT) * F_TO_C_CONVERSION_CONSTANT;
        //---------------------------------------------

        //--------------- Output Section --------------
        //output results
        System.out.println("\nThe Celsius temperature is: " + celsius + "\n"); //note the newline characters
        System.out.println("Thanks, and goodbye");
        //---------------------------------------------

    } //end main method

} //end class
