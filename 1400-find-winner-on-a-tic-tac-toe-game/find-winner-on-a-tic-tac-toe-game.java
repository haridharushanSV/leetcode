import java.util.Arrays;

class Solution {
    public String tictactoe(int[][] m) {
        char[][] board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }

        for (int i = 0; i < m.length; i++) {
            int row = m[i][0];
            int col = m[i][1];
            board[row][col] = (i % 2 == 0) ? 'X' : 'O'; 
        }
        return haveWon(board);
    }

    public static String haveWon(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                return "A"; 
            }
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                return "B"; 
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == 'X' && board[1][j] == 'X' && board[2][j] == 'X') {
                return "A"; 
            }
            if (board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] == 'O') {
                return "B"; 
            }
        }
        if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
                (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
            return "A"; 
        }

        if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
                (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
            return "B"; 
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return "Pending"; 
                }
            }
        }
        return "Draw"; 
    }
}