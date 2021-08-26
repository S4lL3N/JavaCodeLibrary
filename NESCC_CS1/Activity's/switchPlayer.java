import java.util.Scanner;

public class switchPlayer {
	public static void main(String[] args) {

		boolean done = false;
		int counter =0;
		String currentPlayer;
		//local variables
		final int ROW_LENGTH = 7;
		final int COL_HEIGHT = 6;
		char [][] gameBoard;
		gameBoard = new char[COL_HEIGHT][ROW_LENGTH];
		int userChoice;
		int column;
		char player;

		//input object
		Scanner cin = new Scanner(System.in);

		//input string
		String input;


		//--------------------------------------------------------------------------------------------------------------
		itializeBoard(gameBoard);

		while(!done){
			counter += 1;

			if(counter > 42){
				break;
			}
			if (counter % 2 == 0){
				currentPlayer = "Red";
				player = 'R';
			}else{
				currentPlayer = "Yellow";
				player = 'Y';
			}
			System.out.print(currentPlayer + " player, Enter column number (1 - 7) to drop coin: ");
			input = cin.nextLine();

			try {
				userChoice = Integer.parseInt(input);
			} catch (Exception e) {   //NumberFormatException err
				System.out.print("\n\t***Invalid integer***");
				System.out.print("\n Please enter a valid integer.\n\n");
				continue;
			}//end try/catch construct


			column = userChoice - 1;

			dropCoin(gameBoard,column,player);

			displayBoard(gameBoard);


		}//end while loop


	}//end main



//todo----------------METHODS-------------------------------------------------------------------------------------------


	public static void itializeBoard(char[][] gameBoard){
		for(int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[0].length; j++) {
				gameBoard[i][j] = ' ';
			}
		}//end for loop
	}//end itializeBoard method

	//----------------------------------------------------------------------------------------------------------------------
	private static void dropCoin(char[][] gameBoard, int column, char player) {
		for(int i = gameBoard.length - 1; i >= 0; i--){
			if(gameBoard[i][column] == ' '){
				gameBoard[i][column] = player;
				break;
			}//end if statement
		}// end for loop
	}//end dropCoin method

	//----------------------------------------------------------------------------------------------------------------------
	private static void displayBoard(char[][] gameBoard) {
		for(int i = 0; i < gameBoard.length; i++){
			System.out.print('|');
			for(int j = 0; j < gameBoard[0].length; j++){
				System.out.print(gameBoard[i][j] + "|");
			}//end nested for loop
			System.out.println();
		}//end for loop
	}//end displayBoard method

//----------------------------------------------------------------------------------------------------------------------
}//end class