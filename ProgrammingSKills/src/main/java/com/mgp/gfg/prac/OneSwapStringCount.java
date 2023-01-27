package com.mgp.gfg.prac;


public class OneSwapStringCount {
    public static void main(String... args) {
        String S = "geek";
        long result = countStrings(S);
        System.out.println(result);
    }

    private static long countStrings(String S) {
        // think such that the count of length possible is n(n-1)/2 if all are distinct.
        // if there are repateds that many will be deducted from the count and justify by 1 such that the character is still counted

        int count[] = new int[26];
        int n = S.length();
        long ans = sonn(n);

        for(int i = 0 ; i < n; i++) {
            count[S.charAt(i)-'a']++;
        }

        boolean temp  = false;
        for(int i = 0 ; i < 26; i++) {
            if(count[i] > 1) {
                temp = true;
                ans = ans - sonn(count[i]);

            }

        }
        if(temp) {
            ans = ans +1;
        }

        return ans ;
    }
    private static long sonn(long n){
        return n * (n-1)/ 2;

    }
}
