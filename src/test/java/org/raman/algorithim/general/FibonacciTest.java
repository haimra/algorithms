package org.raman.algorithim.general;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

	@Test
	public void testRecursiveFib() {
		System.out.println("Test Recursive");
		Fibonacci fib = new Fibonacci();
		/*assertEquals(0,fib.recursiveFib(0));
		assertEquals(1,fib.recursiveFib(1));
		assertEquals(1,fib.recursiveFib(2));
		assertEquals(2,fib.recursiveFib(3));
		assertEquals(3,fib.recursiveFib(4));*/
		assertEquals(12586269025L,fib.recursiveFib(50));
		System.out.println("\nDone");
	}

	@Test
	public void testIterativeFib() {
		System.out.println("Test Iterative");
		Fibonacci fib = new Fibonacci();
		/*assertEquals(0,fib.iterativeFib(0));
		assertEquals(1,fib.iterativeFib(1));
		assertEquals(1,fib.iterativeFib(2));
		assertEquals(2,fib.iterativeFib(3));
		assertEquals(3,fib.iterativeFib(4));*/
		assertEquals(12586269025L,fib.iterativeFib(50));
		System.out.println("\nDone");
	}

	@Test
	public void testOptimizedFib() {
		System.out.println("Test Optimized");
		Fibonacci fib = new Fibonacci();
		/*assertEquals(0,fib.optimizedFib(0));
		assertEquals(1,fib.optimizedFib(1));
		assertEquals(1,fib.optimizedFib(2));
		assertEquals(2,fib.optimizedFib(3));
		assertEquals(3,fib.optimizedFib(4));*/
		assertEquals(12586269025L,fib.optimizedFib(50));
		System.out.println("\nDone");
	}
}
