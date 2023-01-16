package String;

public class ChessBoard {
    public static void main(String[] args) {
        /*
        You are trying to create a chessboard representation using the alphabetical
        uppercase letters O and X. The O represents the lighter spaces while the X
        represents the darker spaces.

OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
OXOXOXOX
XOXOXOXO
         */


        String[][] chessboard = new String[8][8];

        //add code below this line

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                if ((i % 2 == 0) && (j % 2 == 0)) {
                    chessboard[i][j] = "O";
                }
                else if ((i % 2 == 1) && (j % 2 == 1)) {
                    chessboard[i][j] = "O";
                }
                else if ((i % 2 == 0) && (j % 2 == 1)) {
                    chessboard[i][j] = "X";
                }
                else if ((i % 2 == 1) && (j % 2 == 0)) {
                    chessboard[i][j] = "X";
                }
            }
        }

        for (int row = 0; row < chessboard.length; row++) {
            for (int col = 0; col < chessboard[0].length; col++) {
                if (col == chessboard[0].length - 1) {
                    System.out.println(chessboard[row][col]);
                }
                else {
                    System.out.print(chessboard[row][col]);
                }
            }
        }


    }
}
