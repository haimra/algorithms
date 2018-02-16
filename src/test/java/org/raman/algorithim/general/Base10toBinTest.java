package org.raman.algorithim.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class Base10toBinTest {

	private Base10toBin convertor = new Base10toBin();
	@Test
	public void testToBinRecorsive() {
		
		assertEquals("1000", convertor.toBinRecorsive(8));
		assertEquals("101", convertor.toBinRecorsive(5));
		assertEquals("1", convertor.toBinRecorsive(1));
		assertEquals("0", convertor.toBinRecorsive(0));
		
	}

}
