package edu.northeaststate.sallen14;
import java.util.Random;
import java.util.Scanner;
/**
 * Name: Shae Allen
 * Date: 09/17/2019
 * Project: Rock Paper Scissors Game
 * Getting Started - This program will demonstrate the input/process/output paradigm.
 *                   The program is a rock paper scissors game. The user will be
 *                   prompted to choose either rock, paper, or scissors. The program
 *                   will generate a random number between 1 and 3 then assign that as a
 *                   either rock paper scissors as the computer's choice. The program will
 *                   keep score if user chooses to play multiple games. The program uses
 *                   try/catch construct to check for proper input. The program uses if/else
 *                   constructs for the algorithm to find winner of the game.
 *
 *                  formulas/rules :   both guesses the same => tie•
 *                                     rock breaks scissors => rock wins
 *                                     paper wraps rock => paper wins
 *                                     scissors cut paper => scissor wins
 *
 */

public class RockPaperScissors {
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */

    public static void main(String[] args) {

        //local variables
        int continueRunning = 1;
        Random random = new Random();
        int userChoice = 0;
        int computerScore = 0;
        int userScore =0;

        //input strings
        String input = "";
        String userChoiceString= "";
        String computerChoice= "";

        //input objects
        Scanner rerun = new Scanner(System.in);
        Scanner cin = new Scanner(System.in);

        //while loop to keep playing game
        while(continueRunning != 0){

            //----------------------------------------------------------------------------------------------------------
            //--------------- Input Section ---------------
            System.out.print("\n    *******************************************************");
            System.out.print("\n    **************                           **************");
            System.out.print("\n    <<<<<<<<<<<<<<  Rock - Paper - Scissors  >>>>>>>>>>>>>>");
            System.out.print("\n    **************                           **************");
            System.out.print("\n    *******************************************************");

            //prompt user
            System.out.print("\n\n    The computer has its guess ready! ");
            System.out.print("\n    Enter your guess: Rock(1), Paper(2), Scissors(3):");

            //get user input
            input = cin.nextLine();

            //---------------Process Section --------------
            //process input
            //check for proper input
            try {
                userChoice = Integer.parseInt(input); //convert input string to an integer
                //check if input is out of bounds exit program
                if (userChoice > 3 || userChoice < 1) {
                    System.out.print("\n    ***Not a valid guess, goodbye***\n");
                    System.exit(1);
                }
            } catch (Exception e) {
                System.out.print("\n    ***Not a valid answer, goodbye***\n");
                System.exit(1);
            }//end try/catch

            userChoiceString = Integer.toString(userChoice); //convert integer to a string
            computerChoice = Integer.toString(random.nextInt(3) + 1); //generate a random number and convert to string

            //conditionals and assigning user/computer choice to either to rock, paper, or scissors.
            if (userChoiceString.equals("1")) {
                userChoiceString = "Rock";
            }
            else if (userChoiceString.equals("2")) {
                userChoiceString = "Paper";
            }
            else if (userChoiceString.equals("3")) {
                userChoiceString = "Scissors";
            }
             if (computerChoice.equals("1")) {
                computerChoice = "Rock";
            }
            else if (computerChoice.equals("2")) {
                computerChoice = "Paper";
            }
            else if (computerChoice.equals("3")) {
                computerChoice = "Scissors";
            }

            //--------------- Output Section --------------
            //output the computer choice and the user choice
            System.out.println("\n    Computer choose: " + computerChoice);
            System.out.println("    You choose: " + userChoiceString);

            //output results
            //conditionals to calculate who won and tally the score
            if (userChoiceString.equals(computerChoice)) {
                System.out.print("\n    ----> Tie!\n");
                computerScore += 0;
                userScore += 0;
            } else if (userChoiceString.equals("Rock") && computerChoice.equals("Scissors")) {
                System.out.print("\n    ----> You Win!");
                userScore += 1;
            } else if (userChoiceString.equals("Rock") && computerChoice.equals("Paper")) {
                System.out.print("\n    ----> Computer Wins!");
                computerScore += 1;
            } else if (userChoiceString.equals("Paper") && computerChoice.equals("Rock")) {
                System.out.print("\n    ----> You Win!");
                userScore += 1;
            } else if (userChoiceString.equals("Paper") && computerChoice.equals("Scissors")) {
                System.out.print("\n    ----> Computer Wins!");
                computerScore += 1;
            } else if (userChoiceString.equals("Scissors") && computerChoice.equals("Rock")) {
                System.out.print("\n    ----> Computer Wins!");
                computerScore += 1;
            } else if (userChoiceString.equals("Scissors") && computerChoice.equals("Paper")) {
                System.out.print("\n    ----> You Win!");
                userScore += 1;
            }
            //output the score
            System.out.println("\n\n    Current score: Computer:" + computerScore + " Player:" + userScore);


            //--------------- Input and Output Section ---------------
            //ask user to play again, check for proper input, if no break while loop
            try {
                System.out.print("\n\n    Would you like play again? Yes(1), No(2):");
                continueRunning = rerun.nextInt();

                //conditionals for replay or quit
                if (continueRunning > 2 || continueRunning < 1) {
                    System.out.print("\n    ***Not a valid response, goodbye***\n");
                    System.exit(1);
                }
                if (continueRunning == 2) {
                    cin.close();
                    rerun.close();
                    //System.out.println("closing scanners");
                    System.exit(1);
                }
            }catch (Exception e){
                System.out.print("\n    ***Not a valid response, goodbye***\n");
                System.exit(1);
            }//end try/catch
        }//end while loop
    }//end main
}//end class
