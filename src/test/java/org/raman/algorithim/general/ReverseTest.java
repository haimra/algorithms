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
		assertEquals("Failed while testing simple word","miah", reverse.reverseRecursive("haim"));
		assertEquals("Failed while testing Empty word","", reverse.reverseRecursive(""));
		assertEquals("Failed while testing Null  word",null, reverse.reverseRecursive(null));
	}

	@Test
	public void testReverseMirror() {
		assertEquals("Failed while testing simple word","miah", reverse.reverseMirror("haim"));
		assertEquals("Failed while testing simple word","namar", reverse.reverseMirror("raman"));
		assertEquals("Failed while testing Empty word","", reverse.reverseMirror(""));
		assertEquals("Failed while testing Null  word",null, reverse.reverseMirror(null));
	}


}
