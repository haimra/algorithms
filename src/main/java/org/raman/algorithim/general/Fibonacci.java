package org.raman.algorithim.general;

/**
 * 
 * fib(0) = 0 fib(1) = 1 fib(n) = fn(n-1)+f(n-2) 0,1,1,2,3,5,8,13...
 */
public class Fibonacci {

	public int recursiveFib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return recursiveFib(n - 1) + recursiveFib(n - 2);
	}

	public int iterativeFib(int n) {
		if (n == 0)
			return 0;
		int fn = 0, fnMin1 = 1, i = 0;
		while (i < n) {
			fn = fnMin1 + fn;
			fnMin1 = fn - fnMin1;
			i++;
		}
		return fn;
	}
}
