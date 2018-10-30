package com.mgp.gfg.prac;

import java.util.Scanner;

/**
 * Created by mgpradeepa on 20/10/18.
 */
public class SahilLovesScore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testcases = scan.nextInt();

        String op;
        for(int i=0; i < testcases; i++) {
            int totalCol1 = scan.nextInt();
            int totalCol2 = scan.nextInt();
            int [] col1 = new int[totalCol1];
            int sumCol1 = 0;
            for (int j = 0; j < totalCol1 ; j++) {
                col1[i] = scan.nextInt();
                sumCol1 += col1[i];
            }
            int [] col2 = new int[totalCol2];
            int sumCol2=0;
            for (int j = 0; j < totalCol2 ; j++) {
                col2[i] = scan.nextInt();
                sumCol2 += col2[i];
            }
             op = sumCol1> sumCol2 ?"C!" : "C2";
            System.out.println(op);
        }


    }
}
