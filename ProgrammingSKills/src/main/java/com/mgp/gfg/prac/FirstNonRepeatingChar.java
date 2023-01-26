package com.mgp.gfg.prac;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingChar {
    public static final int MAX_CHARS = 256;
    public static void main ( String args[] ){


        String input  = "geeksforgeeks";
        String output = firstNonRepeatingChars(input);
        System.out.println(output);
    }


    private static String firstNonRepeatingChars(String input){
        // inDLL to have pointer to a x node to validate presnece
        StringBuilder sb = new StringBuilder();

        List<Character> inDLL = new ArrayList<>() ;

        // array to have repeated yes or not

        boolean [] repeated = new boolean[MAX_CHARS];

        // process the input

        for (int i = 0; i < input.length(); i++ ) {
            char x = input.charAt(i);
            // process if not present
            if(!repeated[x]) {
                if(!(inDLL.contains(x))){
                    inDLL.add(x);


                }
                else {
                    inDLL.remove((Character)x);
                    repeated[x] = true;

                }
            }
        }

        //print the non repeating charaters
        if(inDLL.size() != 0) {


            for(Character c : inDLL) {
                sb.append(c);
            }

        }


        return sb.toString();



    }
}
