package com.mgp.aoip.ISP.pracstring.lc;

import java.util.Scanner;

public class GoatLatinGibberish {

    public static void main(String[] args) {
        GoatLatinGibberish goatLatinGibberish = new GoatLatinGibberish();
        System.out.println("Enter a sentence for which you want a Goat Latin back");
        String s = new Scanner(System.in).nextLine();
        System.out.println(goatLatinGibberish.toGoatLatin(s));
    }

    public String toGoatLatin(String sentence) {
        // gt each word by split with space
        // for each word
        //if the first char is vowel then jusg append the word with ma
        //AND number of a depending on the word index in the sentence
        // if the first letter is consonant then the  new string will be from 2nd index to the end the append the first char to the end and ma

        StringBuilder result = new StringBuilder();
        String[] eachWord = sentence.split(" ");
        for(int i = 0 ; i < eachWord.length; i++) {
            String interim = eachWord[i];
            if(isVowel(interim)) {
                result.append(interim).append("ma").append(geta(i+1)).append(" ");
            }else {
                result.append(ripConsonant(interim)).append("ma").append(geta(i+1)).append(" ");
            }

        }

        return result.toString().trim();


    }

    public boolean isVowel(String s) {
        boolean vowel = false;
        switch(s.charAt(0)) {
            case 'a', 'A', 'e','E','o','O','i','I','u','U' : vowel =  true; break;
            default: vowel = false;
        }
        return vowel;
    }

    public String geta(int i ){
        StringBuilder sb = new StringBuilder();
        for(int k = 0 ; k < i; k++) {
            sb.append("a");
        }
        return sb.toString();
    }

    public String ripConsonant(String in ) {
        char fist = in.charAt(0);
        String res = in.substring(1, in.length());
        return res+String.valueOf(fist);
    }
}
