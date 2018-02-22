package org.raman.algorithim.general;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

	@Test
	public void testRecorsiveFib() {
		Fibonacci fib = new Fibonacci();
		assertEquals(0,fib.recursiveFib(0));
		assertEquals(1,fib.recursiveFib(1));
		assertEquals(1,fib.recursiveFib(2));
		assertEquals(2,fib.recursiveFib(3));
		assertEquals(3,fib.recursiveFib(4));
		assertEquals(5,fib.recursiveFib(5));
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
