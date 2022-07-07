package com.mgp.aoip.ISP.pracstring.lc;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidWithFilledNumbersNWana {
    public static void main(String[] args) {
        char[][] c =
                {{'8','3','.','.','7','.','.','.','.'},
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
        boolean isValid = true;

        // use two hashset ROW , COLUMN
        //iterate outer for 0 to 9
        // having row fixed go through each column and store into the row_set
        // having column fixed go through each row and store into the column_set
        // ignore empty
        // if any duplication found, break the flow and declare invalid
        // clear the rowset and columnset after every iteration

        Set<Character> rowSet = new HashSet<>();
        Set<Character> colSet = new HashSet<>();
        Set<Character> cluster3 = new HashSet<>();





        for(int i = 0 ; i < 9 ; i++) {
            for(int j = 0 ; j < 9 ; j++) {
                if (board[i][j] != '.') {
                    System.out.println("row -> " + board[i][j]);
                    if( !rowSet.add(board[i][j]) ) {
                        isValid = false;
                        break;
                    }
                }
            }rowSet.clear();

        }
        if(!isValid) {
            return false;
        }
        for(int i = 0 ; i < 9 ; i++) {
            for(int j = 0 ; j < 9 ; j++) {
                if (board[j][i] != '.') {
                    System.out.println("row -> " + board[j][i]);
                    if( !colSet.add(board[j][i]) ) {
                        isValid = false;
                        break;
                    }
                }
            }colSet.clear();

        }
        for(int i = 0 ; i < 9;i++) {
            for(int j = 0; j < 9; j++) {
               return  cluster3Valid(board,i-i%3,j-j%3);
            }
        }


//        for(int i = 0; i < 9; i++) {
//            for(int j = 0 ; j < 9; j++) {
//                // outer 0 - 9
//
//                if (board[i][j] != '.') {
//                    System.out.println("row -> " + board[i][j]);
//                    if( !rowSet.add(board[i][j]) ) {
//                        System.out.println("row -> " + board[i][j]);
//                        isValid = false;
//                        break;
//                    }
//                }
//                // column
//                for( int k = 0 ; k < 9 ; k++) {
//                    if ( board[j][k] != '.' ){
//                        System.out.println("col -> " + board[j][k]);
//                        if( !colSet.add(board[j][k]) ) {
////                            System.out.println("col -> " + board[j][k]);
//                            isValid = false;
//                            break;
//                        }
//                    }
//                }
//                colSet.clear();
//
//
//
//
//            }
//            rowSet.clear();
//        }
//
//
        return isValid;

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
}
