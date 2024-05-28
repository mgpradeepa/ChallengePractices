package com.mgp.pc.tc;

import com.mgp.aoip.ISP.pracstring.lc.RemoveDuplicatesAtmostTwiceInPlaceArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRemoveDuplicatesAtmostTwiceInPlaceArray {

    RemoveDuplicatesAtmostTwiceInPlaceArray rd ;

    @Before  public void setup(){
        rd = new RemoveDuplicatesAtmostTwiceInPlaceArray();
    }
    @Test public void testFor2DupNumbers() {
        int [] num = {1,1,2,2};
        Assert.assertEquals(4, rd.removeDuplicates(num));
    }

    @Test public void testFor3DupNumbersWithAllOtherMorethan4() {
        int [] num = {1,1,2,2,2,3,3,3,3,4,4};
        Assert.assertEquals(8, rd.removeDuplicates(num));
    }
 }
