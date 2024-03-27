package com.mgp.pc.tc;

import com.mgp.aoip.ISP.pracstring.lc.GoatLatinGibberish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGoatLatinGibberish {
    GoatLatinGibberish glb ;
    @Before public void setUp() {
        glb = new GoatLatinGibberish();

    }

    @Test
    public void testGoatLatinGibberish() {
        String actual = "I speak Goat Latin";
        String expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
        assertEquals(expected, glb.toGoatLatin(actual));
    }

    @Test public void testGoatLatingGibberishAnotherinstance(){
        String actual = "I want to kissi kiss my darling";
        String expected  = "Imaa antwmaaa otmaaaa issikmaaaaa isskmaaaaaa ymmaaaaaaa arlingdmaaaaaaaa";
        assertEquals(expected, glb.toGoatLatin(actual));
    }
}
