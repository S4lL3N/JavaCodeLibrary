import java.util.Scanner;
/**
 * Name: Shae Allen
 * Date: 10/22/2019
 * Project: Project 5 Connect Four game
 * Getting Started - This program will demonstrate the input/process/output paradigm. This program is a connect four
 *                   game. The game alternates between a yellow and a red player, prompting the play to choose which
 *                   column to drop the game disk/coin. The games uses a while loop to keep the game running until
 *                   either player wins, or the board is full or the user chooses to end the game. The program uses a
 *                   try/catch construct to check for proper input. It also uses a series of nested for loops to
 *                   initialize the game board, display the game board, drop disks/coins or load the 2d array, and
 *                   parse the 2d array to check for winner/tie.

 */
public class ConnectFour {
    /**
     * Description: This is the entry point for all Java console applications.
     * @param args - args is not used in this application.
     */
    public static void main(String[] args) {

        //local variables
        boolean done = false;
        boolean gameOver = false;
        final int ROW_LENGTH = 7;
        final int COL_HEIGHT = 6;
        char[][] gameBoard;
        gameBoard = new char[COL_HEIGHT][ROW_LENGTH];
        int counter = 0;
        String currentPlayer;
        int userChoice;
        int column;
        char player;

        //input object
        Scanner cin = new Scanner(System.in);

        //input string
        String input;


        //--------------------------------------------------------------------------------------------------------------
        //calls the initializeBoard method
        initializeBoard(gameBoard);

        while (done == false) {
            counter += 1;
            //_________PROCESS______________________________________
            if (counter % 2 == 0) {
                currentPlayer = "Red";
                player = 'R';
            }//end if statement
            else {
                currentPlayer = "Yellow";
                player = 'Y';
            }//end else statement
            //__________INPUT_______________________________________
            //prompt user for which column they want to drop the disk/coin.
            System.out.print("\n"+ currentPlayer + " player, Enter column number (1 - 7) to drop coin: ");
            input = cin.nextLine();
            //_________PROCESS AND OUTPUT___________________________________
            //exits the game
            if (input.equalsIgnoreCase("d")){
                break;
            }//end if statement

            //checks for proper input...
            try {
                userChoice = Integer.parseInt(input);
                if (userChoice > 7 || userChoice < 1) {
                    System.out.print("\n\t***Invalid Choice***");
                    System.out.print("\n Please enter a choice in range.\n\n");
                    counter -= 1;
                    continue;
                }
            } catch (Exception e) {   //NumberFormatException err
                System.out.print("\n\t***Invalid integer***");
                System.out.print("\n Please enter a valid integer.\n\n");
                counter -= 1;
                continue;
            }//end try/catch construct


            column = userChoice - 1;
            //calls the dropCoin method
            dropCoin(gameBoard, column, player);
            //calls the displayBoard method
            displayBoard(gameBoard);

            System.out.println();

            //isWinner(gameBoard,gameOver);
            //System.out.println("\t\tfrom while loop gameOver == " + gameOver + "\n");

            //calls the iswinner method and if it returns true the while loop breaks.
            if (isWinner(gameBoard,gameOver) == true){
                done = true;
            }//end if statement

            //calls the isfull method and if it returns true the while loop breaks.
            if(isFull(gameBoard,gameOver)== true){
                done = true;
            }//end if statement
        }//end while loop
    }//end main


//--------------------METHODS-------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method initializes the game board.
     * parameters = char[][] gameBoard
     * @param args - args is not used in this application.
     */

    public static void initializeBoard(char[][] gameBoard) {
        //_________PROCESS AND OUTPUT___________________________________
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = ' ';
            }
        }//end for loop
    }//end initializeBoard method

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * this method takes the 2d array, the user choose column, and the player
     * and drops the disk/coin or loads the 2d array.
     * parameters = char[][] gameBoard, int column, char player
     * @param args - args is not used in this application.
     */
    private static void dropCoin(char[][] gameBoard, int column, char player) {
        //_________PROCESS AND OUTPUT___________________________________
        for (int i = gameBoard.length - 1; i >= 0; i--) {
            if (gameBoard[i][column] == ' ') {
                gameBoard[i][column] = player;
                break;
            }//end if statement
        }// end for loop
    }//end dropCoin method

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method displays the game board/ 2d array.
     * parameters = char[][] gameBoard
     * @param args - args is not used in this application.
     */
    private static void displayBoard(char[][] gameBoard) {
        //_________PROCESS AND OUTPUT___________________________________
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print('|');
            for (int j = 0; j < gameBoard[0].length; j++) {
                System.out.print(gameBoard[i][j] + "|");
            }//end nested for loop
            System.out.println();
        }//end for loop
    }//end displayBoard method

//----------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method calls the check row method then checks the columns for consecutive
     * occurrences of disks/coins to determine is there is a winner.
     * parameters = char[][] gameBoard, boolean gameOver
     * @param args - args is not used in this application.
     */
    private static boolean isWinner(char[][] gameBoard, boolean gameOver) {
        //_________PROCESS AND OUTPUT___________________________________
        //calls the checkRow method
        gameOver = checkRow(gameBoard, gameOver);

        //this method check columns for winner
        //local variables
        int redColCounter = 0;
        int yellowColCounter =0;
        char [] tempArray = new char[6];

        // will parse the column
        for(int j = 0; j < gameBoard[0].length; j++) {
            for (int i = 0; i < gameBoard.length; i++) {
                //variables
                char redChar = 'R';
                char yellowChar = 'Y';
                tempArray[i] = (gameBoard[i][j]);
                //System.out.println(tempArray[i]);
                if (tempArray[i] != ' ') {
                    if (redChar == tempArray[i]) {
                        redColCounter++;
                        if (redColCounter >= 4) {
                            gameOver = true;
                            System.out.println("\n Red player wins!!!\n\n");
                            break;
                        }//end if statement
                    }
                    else {
                        redColCounter = 0;
                    }//end else statement
                    if (yellowChar == tempArray[i]) {
                        yellowColCounter++;
                        if (yellowColCounter >= 4) {
                            gameOver = true;
                            System.out.println("\n Yellow player wins!!!\n\n");
                            break;
                        }//end if statement
                    }//end if statement
                    else {
                        yellowColCounter = 0;
                    }//end else statement
                }//end if statement
                else {
                    yellowColCounter = 0;
                    redColCounter = 0;
                }//end else statement
            }//end for loop
        }
        //System.out.println("\t\tgameOver from iswinner == " + gameOver);
        return gameOver;
    }//end isWinner method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method check rows for consecutive occurrences of disks/coins to
     * determine if there is a winner.
     * parameters = char[][] gameBoard, boolean gameOver
     * @param args - args is not used in this application.
     */
    private static boolean checkRow(char[][] gameBoard, boolean gameOver) {
        //_________PROCESS AND OUTPUT___________________________________
        //this method checks rows for winner
        //local variables
        int redCounter = 0;
        int yellowCounter = 0;
        //nested for loop to parse the array
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                char redChar = 'R';
                char yellowChar = 'Y';
                char tempChar = gameBoard[row][col];
                //System.out.print("row = " + (row + 1) + ", column = " + (col + 1) + ", temp variable: " + tempChar + "\n");
                if(tempChar != ' ') {
                    if (redChar == tempChar) {
                        redCounter++;
                        //System.out.print("\tRed counter: " + redCounter + "\n");
                        if (redCounter >= 4) {
                            gameOver = true;
                            System.out.println("\n Red player wins!!!\n\n");
                            break;
                        }//end if statement
                    }//end if statement
                    else{
                        redCounter = 0;
                    }//end else statement
                    if (yellowChar == tempChar) {
                        yellowCounter++;
                        //System.out.print("\tYellow counter: " + yellowCounter + "\n");
                        if (yellowCounter >= 4) {
                            gameOver = true;
                            System.out.println("\n Yellow player wins!!!\n\n");
                            break;
                        }//end if statement
                    }//end if statement
                    else{
                        yellowCounter = 0;
                    }//end else statement
                }//end if statement
                else {
                    redCounter = 0;
                    yellowCounter =0;
                }//end else statement
            }//end nested for loop
        }//end for loop
        return gameOver;
    }//end checkRow method

    //------------------------------------------------------------------------------------------------------------------
    /**
     * Description: This is the entry point for all Java console applications.
     * This method checks to see if the game board / 2d array is full.
     * parameters = char[][] gameBoard, boolean gameOver
     * @param args - args is not used in this application.
     */

    private static boolean isFull(char[][] gameBoard, boolean gameOver){
        //_________PROCESS AND OUTPUT___________________________________
        //this method checks it the array is full
        //local variables
        char [] tempArray = new char[6];
        int counter = 0;
        //nested for loop to parse the array
        for(int j = 0; j < gameBoard[0].length; j++) {
            for (int i = 0; i < gameBoard.length; i++) {
                //variables
                char redChar = 'R';
                char yellowChar = 'Y';
                tempArray[i] = (gameBoard[i][j]);
                if (tempArray[i] == redChar || tempArray[i] == yellowChar){
                    counter++;
                    //System.out.println(counter);
                }//end if statement
                if (counter >= 42){
                    System.out.print("Tie Game!!!\n\n");
                    gameOver = true;
                }//end if statement

            }//end nested for loop
        }//end for loop
        return gameOver;
    }//end isFull method

}//end class
