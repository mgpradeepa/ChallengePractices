package com.mgp.gfg.prac;

import java.util.Scanner;

/**
 * Created by mgpradeepa on 20/10/18.
 */
public class GFGOccurances {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testcases = Integer.parseInt(scan.nextLine());
        for (int i =0; i < testcases; i++ ){
            String inp = scan.nextLine();
            System.out.println(checkOccurances(inp));
        }

    }

    private static int checkOccurances(String inp) {

        String findStr = "gfg";
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = inp.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        return count >0 ? count : -1;
    }



}
