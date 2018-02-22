package org.raman.algorithim.datastructure;

import java.util.HashSet;
import java.util.Set;

public class StringComparator {

	private String strA;
	private String strB;
	
	public StringComparator(String strA, String strB) {
		this.strA = strA;
		this.strB = strB;		
	}

	private Set<Character> populateSet(String str) {
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));			
		}
		return s;
	}

	public Set<Character> getCommonChars() {
		Set<Character> a = populateSet(strA);
		Set<Character> b = populateSet(strB);
		a.retainAll(b); //retainAll= insertion
		return a;
	}

	public Set<Character> getUniqueChars() {
		Set<Character> a = populateSet(strA);
		Set<Character> b = populateSet(strB);
		Set<Character> a1 = populateSet(strA);
		a.removeAll(b);
		b.removeAll(a1);		
		a.addAll(b); //addAll = union
		return a;
	}

}
