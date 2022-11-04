package com.mgp.aoip.ISP.pracstring.lc;

public class ReverseVowelsInAGivenString {

    public static void main(String[] args) {
//        String s = "hello WOrld";
        String s = "AEIOU";
        System.out.println(reverseVowels(s) + " is the reverseVowel of " + s);
    }

    private static String reverseVowels(String s) {
        //: Approach:
        // two pointers i and j ; i from start and j from end
        // if not vowel continue
        //if vowel swap

        char[] sc = s.toCharArray();
        int j = s.length()-1, i = 0;

        while ( i < j) {
            if(isVowel(sc[i])) {
                i++;
                continue;
            }
            if(isVowel(sc[j])) {
                j--;
                continue;
            }
            // swap
            char temp = sc[i];
            sc[i] = sc[j];
            sc[j] = temp;

            i++;
            j--;

        }

        return String.copyValueOf(sc);




    }
    private static boolean isVowel(char c) {
        boolean vow;
        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                vow = true;
                break;

            default: vow = false;

        }
        return !vow;

    }
}
