package com.mgp.pc.tc;

import com.mgp.aoip.ISP.pracstring.lc.SimpleGoalParser;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoalParserTest {

    @Test
    public void testSingleG() {
        SimpleGoalParser parser = new SimpleGoalParser();
        assertEquals("G", parser.goalParser("G"));
    }

    @Test
    public void testParenthesisAl() {
        SimpleGoalParser parser = new SimpleGoalParser();
        assertEquals("al", parser.goalParser("(al)"));
    }

    @Test
    public void testMixedInput1() {
        SimpleGoalParser parser = new SimpleGoalParser();
        assertEquals("Goo", parser.goalParser("G()()"));
    }

    @Test
    public void testMixedInput2() {
        SimpleGoalParser parser = new SimpleGoalParser();
        assertEquals("alGaloG", parser.goalParser("(al)G(al)()G"));
    }
}
