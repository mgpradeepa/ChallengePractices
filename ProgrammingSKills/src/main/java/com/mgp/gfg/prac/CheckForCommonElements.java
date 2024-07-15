package com.mgp.gfg.prac;

import java.util.Map;
import java.util.HashMap;
public class CheckForCommonElements
{
    public static void main(String[] args) {
         char[] a1 = {'a','b','c','x'};
         char[]a2 = {'x','y','z'};
        //return true if one of the element is common in the given arrays
         System.out.println("BruteForce-> " + checkBrute(a1, a2));
         System.out.println("Using Hashmethod -> " + checkHashStyle(a1, a2));
         
    }

    
    //BruteForce technique
    private static boolean checkBrute(char[]a1, char[] a2) {
        for(int i = 0 ; i < a1.length; i++) {
            for(int j = 0 ; j < a2.length ; j++) {
                if(a1[i] == a2[j]) 
                return true;
            }
        }
        return false;
    }
    
        //HashTable technique
        private static boolean checkHashStyle(char[]a1, char[]a2) {
            int a1L = a1.length;
            int a2L = a2.length;
            int gothru = 0 ;
            int litup = 0;
            if(a1L < a2L  ){
                gothru = a2L;
                litup = a1L;
            }
            else {
                gothru = a1L;
                litup = a2L;
            }
            Map<Character, Boolean> lookup = new HashMap<>();
            for(int i = 0 ; i < gothru; i++) {
                lookup.put(a1[i], true);
            }
            for(int j = 0 ; j < litup; j++) {
                if(lookup.get(a2[j]) != null  && lookup.get(a2[j])) {
                    return true;
                }
            }
                
                return false;
            
        }
    
        
        
}
