package com.LeetCode.backTracking;

public class WordSearch {
    private boolean result = false;
    private boolean[][] used;

    public static void main(String[] args) {
        char[][] chars = new char[][]{{'a', 'b', 'c', 'e'}, {'s', 'f', 'c', 's'}, {'a', 'd', 'e', 'e'}};
        System.out.println(new WordSearch().exist(chars, "abcced"));
        char[][] chars2 = new char[][]{{'a', 'b'}, {'c', 'd'}};
        System.out.println(new WordSearch().exist(chars2, "abcd"));
    }

    public boolean exist(char[][] board, String word) {
        used = new boolean[board.length][];
        for (int i = 0; i < board.length; i++) {
            used[i] = new boolean[board[i].length];
        }
        track(word, board, 0, 0, 0);
        return result;
    }

    private void track(String word, char[][] chars, int row, int column, int count) {
        if (count == word.length()) {
            result = true;
            return;
        }
        for (int i = row - 1; i < chars.length; i++) {
            if(result)
                break;
            if (i < 0) continue;
            if (count != 0 && i > row + 1)
                break;
            for (int j = column - 1; j < chars[i].length; j++) {
                if(result)
                    break;
                if (j < 0)
                    continue;
                if (count != 0) {
                    if (j > column + 1)
                        break;
                    else if (((Math.pow(i - row, 2) + Math.pow(j - column, 2)) > 1)) continue;
                }
                if (!used[i][j]) {
                    if (chars[i][j] == word.charAt(count)) {
                        used[i][j] = true;
                        count++;
                        track(word, chars, i, j, count);
                        used[i][j] = false;
                        count--;
                    }
                }
            }
        }
    }
}
