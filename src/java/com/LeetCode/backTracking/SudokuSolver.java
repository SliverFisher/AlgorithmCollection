package com.LeetCode.backTracking;

public class SudokuSolver {
    private final char[] checkChars = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private boolean[][] used = new boolean[9][];
    private int count = 0;

    public static void main(String[] args) {
        char[][] chars = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},};
        new SudokuSolver().solveSudoku(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            used[i] = new boolean[9];
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    used[i][j] = true;
                    count++;
                }
            }
        }
        backTracking(board, 0, 0);
    }

    private void backTracking(char[][] board, int row, int column) {
        if (count == 81) {
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (count == 81)
                return;
            for (int j = 0; j < board[i].length; j++) {
                if (count == 81)
                    return;
                if (!used[i][j]) {
                    int sum = 0;
                    for (int k = 0; k < checkChars.length; k++) {
                        if (count == 81)
                            return;
                        if (check2(board, checkChars[k], i, j)) {
                            used[i][j] = true;
                            board[i][j] = checkChars[k];
                            count++;
                            backTracking(board, i, j);
                            if (count == 81)
                                return;
                            sum++;
                            used[i][j] = false;
                            board[i][j] = '.';
                            count--;
                        } else {
                            sum++;
                        }
                    }
                    if (sum == 9) {
                        return;
                    }
                }

            }
        }
    }

    private boolean check2(char[][] board, char c, int row, int column) {
        char[] temp1 = new char[]{board[row][0], board[row][1], board[row][2], board[row][3], board[row][4], board[row][5], board[row][6], board[row][7], board[row][8]};
        if (!checkOneArray(temp1, c))
            return false;
        char[] temp2 = new char[]{board[0][column], board[1][column], board[2][column], board[3][column], board[4][column], board[5][column], board[6][column], board[7][column], board[8][column]};
        if (!checkOneArray(temp2, c))
            return false;
        char[] temp;
        if (row < 3) {
            if (column < 3) {
                temp = new char[]{board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2]};
            } else if (column < 6) {
                temp = new char[]{board[0][3], board[0][4], board[0][5], board[1][3], board[1][4], board[1][5], board[2][3], board[2][4], board[2][5]};
            } else {
                temp = new char[]{board[0][6], board[0][7], board[0][8], board[1][6], board[1][7], board[1][8], board[2][6], board[2][7], board[2][8]};
            }

        } else if (row < 6) {
            if (column < 3) {
                temp = new char[]{board[3][0], board[3][1], board[3][2], board[4][0], board[4][1], board[4][2], board[5][0], board[5][1], board[5][2]};
            } else if (column < 6) {
                temp = new char[]{board[3][3], board[3][4], board[3][5], board[4][3], board[4][4], board[4][5], board[5][3], board[5][4], board[5][5]};
            } else {
                temp = new char[]{board[3][6], board[3][7], board[3][8], board[4][6], board[4][7], board[4][8], board[5][6], board[5][7], board[5][8]};
            }
        } else {
            if (column < 3) {
                temp = new char[]{board[6][0], board[6][1], board[6][2], board[7][0], board[7][1], board[7][2], board[8][0], board[8][1], board[8][2]};
            } else if (column < 6) {
                temp = new char[]{board[6][3], board[6][4], board[6][5], board[7][3], board[7][4], board[7][5], board[8][3], board[8][4], board[8][5]};
            } else {
                temp = new char[]{board[6][6], board[6][7], board[6][8], board[7][6], board[7][7], board[7][8], board[8][6], board[8][7], board[8][8]};
            }
        }
        if (!checkOneArray(temp, c))
            return false;

        return true;
    }

    private boolean checkOneArray(char[] chars, char c) {
        boolean result = true;
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                result = false;
                break;
            }
            int num = chars[i] == '.' ? 0 : (chars[i] - '0');
            sum = sum + num;
        }
        sum = sum + (c - '0');
        if (sum > 45)
            result = false;
        return result;
    }

}
