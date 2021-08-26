public class TwoDArrays {

    public static void main(String[] args){

        char[][] gameBoard;
        gameBoard = new char[6][7];

        char[] test = {'Y','Y','Y','R','R','R','R'};

        //System.out.println(gameBoard.length); //height
        //System.out.println(gameBoard[0].length); //width

        for(int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = ' ';
            }
        }

        int col = 3;
        dropCoin(gameBoard, col, 'Y');

        //System.out.println(gameBoard[0].length - 1);
        printGameBoard(gameBoard);

        clearScreen();

        dropCoin(gameBoard, col, 'R');

        System.out.println();
        printGameBoard(gameBoard);
        clearScreen();
    }//end main

    private static void dropCoin(char[][] gameBoard, int col, char player) {
        for(int i = gameBoard.length - 1; i >= 0; i--){
            if(gameBoard[i][col] == ' '){
                gameBoard[i][col] = player;
                break;
            }
        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        for(int i = 0; i < gameBoard.length; i++){
            System.out.print('|');
            for(int j = 0; j < gameBoard[0].length; j++){
                System.out.print(gameBoard[i][j] + "|");
            }
            System.out.println();
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}//end class