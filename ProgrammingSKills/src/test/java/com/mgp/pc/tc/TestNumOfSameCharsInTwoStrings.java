package com.mgp.pc.tc;

import com.mgp.aoip.ISP.pracstring.lc.NumOfSameCharsInTwoStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNumOfSameCharsInTwoStrings {

    NumOfSameCharsInTwoStrings noc; //= new NumOfSameCharsInTwoStrings();
    @Before
    public void setup() throws Exception {
        noc = new NumOfSameCharsInTwoStrings();

    }
@Test
    public void testNumOfSameChars(){
        String s1= "aAZzBcDE";
        String s2 = "AAAAAAAAAAAAAA";

        Assert.assertEquals(noc.compareTwoStrings(s1, s2), 14);
    }

    @Test
    public void testNumOfSameCharsValidatescases(){
        String s1= "aABBBBBB";
        String s2 = "AAAAAAAAAAAAAAB";

        Assert.assertEquals(noc.compareTwoStrings(s1, s2), 20);
    }

    @Test
    public void testNumOfSameCharsNoMatch(){
        String s1= "a";
        String s2 = "AAAAAAAAAAAAAA";

        Assert.assertEquals(noc.compareTwoStrings(s1, s2), 0);
    }

}
