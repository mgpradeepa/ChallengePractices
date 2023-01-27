package com.mgp.hackerrank.warmup;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int matrixSize = sc.nextInt();
        char [] [] ttt = new char [matrixSize][matrixSize];

        System.out.println("Player 1 Enter the character you want to paly with");
        char player1 = sc.next().charAt(0);

        System.out.println("Player 2 Enter the character you want to paly with");
        char player2 = sc.next().charAt(0);

        System.out.println("Player 1 " + player1 + "  Player 2 " + player2);

        for(int i = 0 ; i < matrixSize; i++ ) {
            for(int j =0 ; j< matrixSize; j++){
                ttt[i][j] = '$';

            }
        }

        // lets start playing
        

        for(int i =0; i < matrixSize; i++) {
            for(int j = 0 ; j < matrixSize; j++) {

                System.out.print( ttt[i][j] );
            }
            System.out.println();
        }


    }
}
