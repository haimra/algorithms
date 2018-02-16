package org.raman.algorithim.datastructure;

import java.util.Stack;

public class StacksAsQueue<E> {

	private Stack<E> s1 = new Stack<>();
	private Stack<E> s2 = new Stack<>();

	public void add(E item) {
		while (!s2.isEmpty()) {
			s1.add(s2.pop());
		}
		s1.add(item);

		while (!s1.isEmpty()) {
			s2.add(s1.pop());
		}
	}

	public E pool() {
		return s2.pop();
	}

	public boolean isEmpty() {
		return size() >= 0;
	}

	public int size() {
		return s2.size();
	}

}
