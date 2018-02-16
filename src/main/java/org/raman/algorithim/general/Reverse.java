package org.raman.algorithim.general;

import java.util.Stack;

public class Reverse {

	public String reverseIterativeStack(String str) {
		if (str == null)
			return null;
		String reverse = "";
		Stack<Character> stack = new Stack<>();
		int i = 0;
		while ( i < str.length()) {
			stack.push(str.charAt(i));
			i++;
		}
		while (!stack.isEmpty()) {
			reverse += stack.pop();
		}

		return reverse;
	}

	public String reverseIterativeFor(String str) {
		if (str == null)
			return null;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	public String reverseRecorsive(String str) {
		if (str == null)
			return null;
		if (str.length() == 0)
			return "";
		if (str.length() == 1)
			return str;

		return reverseRecorsive(str.substring(1, str.length()))
				+ str.charAt(0);
	}
}
