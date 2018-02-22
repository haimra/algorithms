package org.raman.algorithim.datastructure;

import org.junit.Test;

public class StringComparatorTest {

	String strA = "hello";
	String strB = "elbow";
	@Test
	public void testGetCommonChars() {
		System.out.println("Common "+ new StringComparator(strA, strB).getCommonChars());
	}

	@Test
	public void testGetUniqChars() {
		System.out.println("uniqe "+ new StringComparator(strA, strB).getUniqueChars());
	}

}
