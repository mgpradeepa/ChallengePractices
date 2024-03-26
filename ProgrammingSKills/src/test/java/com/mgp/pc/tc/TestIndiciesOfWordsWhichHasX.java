package com.mgp.pc.tc;

import com.mgp.aoip.ISP.pracstring.lc.IndiciesOfWordsWhichHasX;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestIndiciesOfWordsWhichHasX {

    IndiciesOfWordsWhichHasX  iwx = null;

    List<Integer> resultActual;

    @Before
    public void setup() throws Exception{
        iwx = new IndiciesOfWordsWhichHasX();

    }

    @Test
    public void testIndiciesOfWordsWhichHasX(){
        String[] words = {"leet","code"};
        char x = 'e';
        Integer[] resultExpected = {0,1};

        resultActual = iwx.getIndicies(words, x);
        resultActual.forEach(System.out::println);
       eval(resultActual, resultExpected);


    }

    @Test public void testIndiciesOfWordsWhichhasInFewX(){
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        Integer[] resultExpected = {0,2};
        resultActual = iwx.getIndicies(words, x);
        eval(resultActual, resultExpected);
    }

    @Test public void testIndiciesOfWordsWhichhasNoX(){
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'z';
        Integer[] resultExpected = {};
        resultActual = iwx.getIndicies(words, x);
        eval(resultActual, resultExpected);
    }

    private void eval(List<Integer> actual, Integer[] expected) {
        Assert.assertArrayEquals(actual.toArray(), expected);
    }
}
