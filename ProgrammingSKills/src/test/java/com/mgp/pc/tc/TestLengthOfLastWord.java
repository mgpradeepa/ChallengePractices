package com.mgp.pc.tc;

import com.mgp.aoip.ISP.pracstring.lc.LengthOfLastWord;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLengthOfLastWord {
    LengthOfLastWord lol;

    @Before public void setup(){
        lol = new LengthOfLastWord();
    }

    @Test public void testForSingleChar() {
        String inp = "l";
        Assert.assertEquals(1, lol.lolw(inp));
    }

    @Test public void testForSingleCharacterWithLeadingSpaces() {
        String inp = "l         ";
        Assert.assertEquals(1, lol.lolw(inp));
    }
    @Test public void testForNoSpace() {
        String inp = "LoveYouPapa";
        Assert.assertEquals(11, lol.lolw(inp));
    }
}
