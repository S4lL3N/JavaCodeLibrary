package edu.northeaststate.sallen14;
import java.util.Scanner;
/**
 * Name: Shae Allen
 * Date: 09/7/2019
 * Project: Flagpole height
 * Getting Started - This program will demonstrate the input/process/output paradigm.
 *                   This program calculates the height of a flagpole. The user will be
 *                   prompted to enter their height along with the distance and angle to
 *                   the flagpole.The program will convert their height and distance from
 *                   meters to feet and the angle from degrees to radians.
 *
 *                  formulas:   tan = opp/adj
 *                              feet = meters * 3.2808399
 *                              radian = degree * pi/180
 *                              total height = height1 + height2
 *
 *
 *
 */

public class Flagpoleheight {
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */

    public static void main(String[] args) {

        //-- Declare and define all local variables --
        //local constants
        final double METERS_TO_FEET_CONVERSION_CONSTANT = 3.2808399;

        //input object
        Scanner cin = new Scanner(System.in);

        //input string
        String input = "";

        //local variables
        double userHeight = 0d;
        double userHeightInFeet = 0d;
        double distanceToFlagepole = 0d;
        double distanceToFlagpoleInFeet = 0d;
        double degrees = 0d;
        double angleInRadians = 0d;
        double partitialFlagpoleHeight = 0d;
        double totalFlagpoleHeight = 0d;
        double totalFlagpoleHeightInFeet = 0d;



        //--------------------------------------------------------------------------------------------------------------
        //--------------- Input Section ---------------
        //prompt user
        System.out.print("\nEnter your height in meters:");
        //get user input
        input = cin.nextLine();

        //---------------Process Section --------------
        //process input
        userHeight =Double.parseDouble(input); //convert string to double
        //conversion to feet
        userHeightInFeet = userHeight * METERS_TO_FEET_CONVERSION_CONSTANT;

        //--------------- Output Section --------------
        //output results
        System.out.println("You are " + userHeightInFeet + " feet tall.\n");



        //--------------------------------------------------------------------------------------------------------------
        //--------------- Input Section 2 ---------------
        //prompt user
        System.out.print("Enter the distance to the flagpole in meters:");
        //get user input
        input = cin.nextLine();

        //---------------Process Section 2 --------------
        //process input
        distanceToFlagepole = Double.parseDouble(input);//convert string to double
        //conversion to feet
        distanceToFlagpoleInFeet = distanceToFlagepole * METERS_TO_FEET_CONVERSION_CONSTANT;

        //--------------- Output Section 2 --------------
        //output results
        System.out.println("You are " + distanceToFlagpoleInFeet + " feet from the flagpole.\n");



        //--------------------------------------------------------------------------------------------------------------
        //--------------- Input Section 3 ---------------
        //prompt user
        System.out.print("Enter the angle (in degrees) of the elevation from where the user is standing:");
        //get user input
        input = cin.nextLine();
        //---------------Process Section 3 --------------
        //process input
        degrees = Double.parseDouble(input);

        //conversion to radians
        angleInRadians = Math.toRadians(degrees);

        //--------------- Output Section 3 --------------
        //output results
        System.out.println("The angle in radians is: " + angleInRadians + "\n");

        //--------------------------------------------------------------------------------------------------------------
        //--------------- Input Section 4 ---------------


        //---------------Process Section 4 --------------
        //process input
        partitialFlagpoleHeight = (Math.tan(angleInRadians)) * distanceToFlagepole;
        totalFlagpoleHeight = partitialFlagpoleHeight + userHeight;
        totalFlagpoleHeightInFeet = totalFlagpoleHeight * METERS_TO_FEET_CONVERSION_CONSTANT;

        //--------------- Output Section 4 --------------
        //output results
        System.out.println("The height of the flagpole is: " + totalFlagpoleHeight + " Meters, or " + totalFlagpoleHeightInFeet + " Feet.");

        //--------------------------------------------------------------------------------------------------------------
        // closing scanner
        //System.out.println("\n closing scanner...");
        cin.close();
        //System.out.println("Scanner closed");


    } //end main method
} //end class