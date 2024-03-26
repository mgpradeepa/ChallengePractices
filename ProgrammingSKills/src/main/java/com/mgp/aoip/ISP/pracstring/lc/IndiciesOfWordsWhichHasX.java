package com.mgp.aoip.ISP.pracstring.lc;

import java.util.ArrayList;
import java.util.List;

public class IndiciesOfWordsWhichHasX {
    public static void main(String[] args) {
        IndiciesOfWordsWhichHasX incObj = new IndiciesOfWordsWhichHasX();
        String[] words = {"leet","code"};
        char x = 'e';

        incObj.getIndicies(words, x).forEach(System.out::println);

    }

    public List<Integer> getIndicies(String[] words, char x) {

        List<Integer> result = new ArrayList<>(words.length);

        for(int i = 0 ; i < words.length; i++) {
            int count = 0;
            for(int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) == x) {
                    count++;
                }
            }
            if(count > 0) {
                result.add(i);
            }
        }
        return result;

    }


}
