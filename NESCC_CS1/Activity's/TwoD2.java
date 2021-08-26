public class TwoD2 {

    public static void main(String[] args) {
        char[][] boardGame = {
                {' ', ' ', ' ', 'Y', ' ', ' ', 'Y'},
                {'Y', ' ', ' ', ' ', ' ', ' ', ' '},
                {'Y', 'Y', 'Y', 'R', 'R', 'R', 'Y'},
                {'Y', ' ', ' ', ' ', ' ', ' ', ' '},
                {'Y', ' ', ' ', ' ', ' ', ' ', 'Y'},
                {'R', ' ', 'R', 'R', 'R', 'R', ' '}
        };

        printArray(boardGame);
        char[] tempArray = new char[6];
        for(int i = 0; i < boardGame.length; i++){
            tempArray[i] = boardGame[i][0];
        }
        System.out.println(checkRow(tempArray));


        System.out.println(checkRow(boardGame[0]));
    }

    private static boolean checkRow(char[] values){
        boolean winner = false;
        int counter = 1;
        char temp = values[0];

        for(int i = 1; i < values.length; i++){
            char temp2 = values[i];
            if(temp2 != ' ') {
                if (temp == temp2) {
                    counter++;
                    if (counter >= 4) {
                        winner = true;
                        break;
                    }
                } else {
                    counter = 1;
                    temp = values[i];
                }
            }else{
                counter = 1;
            }
        }

        return winner;
    }

    private static void printArray(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
