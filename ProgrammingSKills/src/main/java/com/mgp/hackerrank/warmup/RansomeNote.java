package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class RansomeNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> mapMagazine =  new HashMap<>();
        if(magazine.length < note.length) {
            System.out.println("NO");
            return;
        }
        for(String mag : magazine) {
            mapMagazine.merge(mag, 1, Integer::sum);
        }
        String op = "NO";
        Boolean f = Boolean.FALSE;
        for( String noty : note) {
            if(mapMagazine.containsKey(noty) && (mapMagazine.get(noty) >= 1)) {
                mapMagazine.replace(noty, mapMagazine.get(noty), mapMagazine.get(noty) -1);
                f = Boolean.TRUE;
            }else {
                f = Boolean.FALSE;
                break;
            }
        }

        System.out.println(f == Boolean.FALSE ? "NO" : "YES");
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
