package com.mgp.aoip.ISP.pracstring.lc;

public class SingleRansomeNote {

    private static boolean canConstruct(String ransomeNote, String magazine) {
        int[] alpha = new int[26]; // alpha array to store the number of magazine characters

        for(int i = 0 ; i < magazine.length(); i++) {
            alpha[magazine.charAt(i) - 'a']++; // adding magazine chars to alpha array
        }

        for (int i = 0 ; i < ransomeNote.length(); i++ ) {
            if(--alpha[ransomeNote.charAt(i) -'a'] < 0) { // checking the number of chars in magazine is sufficient to create ro make ransomeNote
                return false;
            }
        }

        return true;
    }

    public static void main (String... args) {

        String magazine = "baa";
        String ransomeNote = "aab";
        System.out.println(canConstruct(ransomeNote, magazine));
    }
}
