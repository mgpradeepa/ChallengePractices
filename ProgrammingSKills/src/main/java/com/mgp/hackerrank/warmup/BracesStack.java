package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BracesStack {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        int l = s.length();
        Stack<Character> stack = new Stack<>();
        String fR = "NO";


        for (int i = 0; i < l; i++) {
            char br = s.charAt(i);
            if (br == '{' || br == '[' || br == '(') {
                stack.push(br);
            } else {
                if (br == '}' || br == ']' || br == ')') {
                    char cu = s.charAt(i);

                    char pushed = stack.pop();
                    if (cu == '}' && pushed != '{'){ fR = "NO";  break;}
                    else if (cu == ']' && pushed != '[') { fR = "NO";  break;}
                    else if (cu == ')' && pushed != '(') { fR = "NO";  break;}

                    else fR = "YES";

                }


            }

        }
        if(stack.size() > 0 ) fR = "NO";


        return fR;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            System.out.println(result);
        }


        scanner.close();
    }

}
