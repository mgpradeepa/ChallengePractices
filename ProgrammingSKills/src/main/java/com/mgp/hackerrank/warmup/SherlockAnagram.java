package com.mgp.hackerrank.warmup;

import java.awt.peer.SystemTrayPeer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAnagram {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int pairOfAnagrams = sherlockAndAnagram(s);
        System.out.println(pairOfAnagrams);
    }

    private static int sherlockAndAnagram(String s){
        Map<String, Integer> map = new HashMap<>();
        int pairs =0;
        for(int i = 0 ; i < s.length(); i++ ) {
            for(int j = i; j < s.length();j++) {
                char[] c = s.substring(i,j+1).toCharArray();
                Arrays.sort(c);
                String sc = new String(c);

                if(map.containsKey(sc)) {
                    map.put(sc , map.get(sc) +1 ) ;
                }
                else {
                    map.put(sc, 1);
                }

            }
        }

        for(String k : map.keySet()) {
            int v = map.get(k) ;
            pairs += (v *(v-1))/2;
        }
        return pairs;
    }
}
