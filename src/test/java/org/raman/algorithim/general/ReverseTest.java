package org.raman.algorithim.general;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

	private Reverse reverse = new Reverse();
	@Test
	public void testReverseIterativeStack() {
		assertEquals("Failed while testing simple word","miah", reverse.reverseIterativeStack("haim"));
		assertEquals("Failed while testing Empty word","", reverse.reverseIterativeStack(""));
		assertEquals("Failed while testing Null  word",null, reverse.reverseIterativeStack(null));		
	}

	@Test
	public void testReverseIterativeFor() {
		assertEquals("Failed while testing simple word","miah", reverse.reverseIterativeFor("haim"));
		assertEquals("Failed while testing Empty word","", reverse.reverseIterativeFor(""));
		assertEquals("Failed while testing Null  word",null, reverse.reverseIterativeFor(null));
	}

	@Test
	public void testReverseRecorsive() {
		assertEquals("Failed while testing simple word","miah", reverse.reverseRecorsive("haim"));
		assertEquals("Failed while testing Empty word","", reverse.reverseRecorsive(""));
		assertEquals("Failed while testing Null  word",null, reverse.reverseRecorsive(null));
	}

}
