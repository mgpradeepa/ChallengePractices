package com.mgp.gfg.prac;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SortZOTDutchNationalFlagAlgo {
   public static void main(String[] args) {
        System.out.println("Hello world!");
        // 0,1,2
        int [] ar = {0,2,1,2,0};
        sortArray(ar);
        int[] ah = {1,2,0,0,1,2,1,2};
        sortArrayDNF(ah);
    
    }
  private static void sortArray(int[] a) {
        // using simple method to calculate the number of 0s and 1s and 2s. rearrange the same array
        int c1 = 0, c0 = 0, c2 = 0;
        for(int i = 0 ; i < a.length-1;i++ ){
            if(a[i] == 0)c0++;
            else if(a[i] == 1) c1++;
            else if(a[i] == 2) c2++;

        }
        for(int i = 0 ; i < c0; i++) a[i] = 0;

        for(int i = c0 ; i < c0+c1; i++)a[i] = 1;
        for(int i = c0+c1; i < a.length-1; i++) a[i] = 2;
        
        for(int i = 0 ; i < a.length -1; i++ ) {
            System.out.println(a[i]);
        }
    }
//using Dutch national flag algo
    
    private static void sortArrayDNF(int[] a) {
        // 0 to low-1 ; low to mid -1; mmid to high -1
    
        int low = 0 , mid = 0 , high = a.length -1;
        while(mid<=high) {
            if(a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid ] = temp;

                low++;
                mid++;
            }else if(a[mid] ==1){
              mid++;  
            } else {
                // swap mid with high
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;

                high --;
            }
            
        }
        System.out.println("AHA");
                for(int i = 0 ; i < a.length -1; i++ ) {
            System.out.println(a[i]);
        }
        

  
}
