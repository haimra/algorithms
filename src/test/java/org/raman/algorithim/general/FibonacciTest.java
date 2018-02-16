package org.raman.algorithim.general;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testRecorsiveFib() {
		Fibonacci fib = new Fibonacci();
		assertEquals(0,fib.recorsiveFib(0));
		assertEquals(1,fib.recorsiveFib(1));
		assertEquals(1,fib.recorsiveFib(2));
		assertEquals(2,fib.recorsiveFib(3));
		assertEquals(3,fib.recorsiveFib(4));
		assertEquals(5,fib.recorsiveFib(5));
	}

	@Test
	public void testiterativeFib() {
		Fibonacci fib = new Fibonacci();
		assertEquals(0,fib.iterativeFib(0));
		assertEquals(1,fib.iterativeFib(1));
		assertEquals(1,fib.iterativeFib(2));
		assertEquals(2,fib.iterativeFib(3));
		assertEquals(3,fib.iterativeFib(4));
		assertEquals(5,fib.iterativeFib(5));
	}
}
