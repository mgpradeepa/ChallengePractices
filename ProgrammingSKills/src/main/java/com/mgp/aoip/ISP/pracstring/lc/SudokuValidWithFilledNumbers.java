package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidWithFilledNumbers {
    public static void main(String[] args) {
        char[][] c =
                {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};

        System.out.println("Finally -> " + isSudokuValid(c));

    }

    private static boolean isSudokuValid(char[][] board) {
        for(int i = 0 ; i < 9; i++) {
            for(int j = 0 ; j < 9;j++){
                if( !isValid(board, i , j)) {
                    return false;
                }
            }
        }
        return  true;

    }
    private static boolean isValid(char[][] board, int row, int col) {
        return notInRow(board, row) && notInCol(board, col) && cluster3Valid(board, row - row % 3, col - col % 3);
    }


    private static boolean cluster3Valid (char[][]board, int startRow, int startCol) {
        Set<Character> set = new HashSet<>();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                char cur = board[row + startRow][col + startCol];
                if (set.contains(cur)) {
                    return false;
                }
                if (cur != '.') {
                    set.add(cur);
                }
            }
        }
        return true;
    }

    private static boolean notInRow(char[][] board , int row) {
        Set<Character> set = new HashSet<>();

        for(int i = 0 ; i < 9; i++) {
            if(set.contains(board[row][i])) {
                return false;
            }
            else{
                char c = board[row][i] ;
                if(c != '.'){
                    set.add(c);
                }
            }
        }
        return true;
    }

    private static boolean notInCol(char[][] board , int col) {
        Set<Character> set = new HashSet<>();

        for(int i = 0 ; i < 9; i++) {
            if(set.contains(board[i][col])) {
                return false;
            }
            else{
                char c = board[i][col] ;
                if(c != '.'){
                    set.add(c);
                }
            }
        }
        return true;
    }

}
