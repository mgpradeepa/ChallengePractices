package com.mgp.gdg.prac;
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class FindLeadersInArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int []ar={16,17,4,3,5,2};
        int size =ar.length;
        calcLeaders(ar,size);
        
    }
    private static void calcLeaders(int[]ar,int n){
        int max =ar[n-1];
        System.out.println(max);
        for (int i=n-2; i>=0; i--) {
            if(max < ar[i]){
                max=ar[i];
                System.out.println(max);
                
                    }
        }
    }
}