package com.mgp.hackerrank.ProgrammingSKills.tesco;

import com.mgp.hackerrank.ISP.tesco.*;
import junit.framework.TestCase;

public class PartialSubStringMatchTest extends TestCase {
	PartialSubStringMatch pssm;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		pssm = new PartialSubStringMatch();

	}

	public void testPSSMobjectCreation() throws Exception {
		System.out.println("object created");
		assertTrue(pssm != null);
	}

	public void testPSSM_Method_getSubString() throws Exception {
		System.out.println("Object method tested");
		String op = pssm.getSubStringMatch("My name is Fran", "rim");
		System.out.println(op + ": is the value");
		assertEquals("me is Fr", op);// ("", op);
	}

	public void testPSSM_Method_getSubString_Wrong() throws Exception {
		System.out.println("Proving wrong");
		assertNotSame("France", pssm.getSubStringMatch("My name is France", "rim"));

	}

	public void testPSSM_Method_getSubString_Mistake() throws Exception {
		System.out.println("Mistake wrong");
		assertNotSame("klov", pssm.getSubStringMatch("High enklov  god ", "klg"));
	}

}
