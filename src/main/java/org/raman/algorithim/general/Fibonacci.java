package org.raman.algorithim.general;

/**
 * fib(0) = 0 fib(1) = 1 fib(n) = fn(n-1)+f(n-2) 0,1,1,2,3,5,8,13...
 */
public class Fibonacci {

    /**
     * Complexity  O(2^n)
     * Using recursive solution is a very slow
     * @param n
     * @return
     */
    public long recursiveFib(int n) {
        System.out.print('.');
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    /**
      * Iterative solution is is match faster then recursive one
     *  making the recursive solution irrelevant even for small numbers
     *
     * @param n
     * @return
     */
    public long iterativeFib(int n) {
        if (n == 0)
            return 0;
        long fn = 0, fnMin1 = 1, i = 0;
        while (i < n) {
            System.out.print('.');
            fn = fnMin1 + fn;
            fnMin1 = fn - fnMin1;
            i++;
        }
        return fn;
    }

/**
 * The following recursive optimization will can be as good the iterative one
 */
 public long optimizedFib(int n) {
        long[] cache = new long[n];
        return recursiveFib(n, cache);
    }

    private long recursiveFib(int n, long[] cache) {
        System.out.print('.');
        if (n == 0)
            return 0;
        if (n == 1) {
            cache[1] = 1;
            return 1;
        }
        cache[n - 1] = cache[n - 1] != 0 ? cache[n - 1] : recursiveFib(n - 1,cache);
        cache[n - 2] = cache[n - 2] != 0 ? cache[n - 2] : recursiveFib(n - 2,cache);
        return cache[n - 1] + cache[n - 2];
    }
}
