package org.raman.algorithim.general;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Base10toBinTest {

	private Base10toBin convertor = new Base10toBin();
	@Test
	public void testToBinRecorsive() {
		
		assertEquals("1000", convertor.toBinRecursive(8));
		assertEquals("101", convertor.toBinRecursive(5));
		assertEquals("1", convertor.toBinRecursive(1));
		assertEquals("0", convertor.toBinRecursive(0));
		
	}

}
