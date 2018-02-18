package org.raman.algorithim.general;

import org.junit.Test;

public class KLargestElementsTest {

	@Test
	public void testGetKlargest() {
		KLargestElements kLargestElements = new KLargestElements();
		kLargestElements.setUarray(new Integer[]{5,8,4,9,9,-1,7});
		System.out.print(kLargestElements.getKlargestSaveSpace(3));
		
		kLargestElements.setUarray(new Integer[]{1, 23, 12, 9, 30, 2, 50});
		kLargestElements.getKlargestSaveSpace(3);
	}

	@Test
	public void testGetKlargest2() {
		KLargestElements kLargestElements = new KLargestElements();
		kLargestElements.setUarray(new Integer[]{5,8,4,9,9,-1,7});
		System.out.print(kLargestElements.getKlargest(3));
		
		kLargestElements.setUarray(new Integer[]{1, 23, 12, 9, 30, 2, 50});
		kLargestElements.getKlargest(3);
	}
	
}
