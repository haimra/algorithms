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

	public String reverseMirror(String str){

		if(str==null)
			return null;
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0;i<str.length()/2;i++){
			int leftIndex = str.length() - 1 - i;
			char tmp = sb.charAt(leftIndex);
			sb.setCharAt(leftIndex,str.charAt(i));
			sb.setCharAt(i,tmp);
		}
		return sb.toString();
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

	public String reverseRecursive(String str) {
		if (str == null)
			return null;
		if (str.length() == 0)
			return "";
		if (str.length() == 1)
			return str;

		return reverseRecursive(str.substring(1, str.length()))
				+ str.charAt(0);
	}
}
