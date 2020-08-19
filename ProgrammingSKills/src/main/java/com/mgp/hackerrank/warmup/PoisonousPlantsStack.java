package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PoisonousPlantsStack {
    /***
     * Not implemented fully as it invokes another set of algos and not in my list
     * @param p
     * @return
     */
    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
        Stack <Integer> stack = new Stack<>();
        int days = 0;
        for (int value : p) {
            if (stack.empty()) {
                stack.push(value);
            } else {
                int curPeek = stack.peek();
                System.out.println(" Value --> " + value + " <- peek " +  curPeek );
                if (value < curPeek) {
                    stack.push(value);

                } else {
                    days = 1;
                }
            }
        }
        stack.forEach(System.out::println);
        while(!stack.isEmpty()){
            int pop = stack.pop();
            System.out.println("popped " + pop);
            if(pop > stack.peek()){
                days +=1;
            }else{
                break;
            }
        }

        return days;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int result = poisonousPlants(p);
        System.out.println(result);

        scanner.close();
    }
}
