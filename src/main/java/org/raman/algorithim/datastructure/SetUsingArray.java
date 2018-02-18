package org.raman.algorithim.datastructure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Set is an abstract data type that can store certain values, without any particular order, and no repeated values.
 * This is a naive implantation of a set using backing array;
 */
public class SetUsingArray<T> {
    private T[] array;
    private int headIndex = 0;
    private int initialCapacity = 10;

    public SetUsingArray() {
        this.array = (T[]) new Object[initialCapacity];
    }

    public int size() {
        return headIndex;
    }

    public boolean isEmpty() {
        return headIndex == 0;
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, headIndex);
    }

    public <T1> T1[] toArray(T1[] a) {
        if (a.length < headIndex) {
            // Make a new array of a's runtime type, but my contents:
            return (T1[]) Arrays.copyOf(array, headIndex, a.getClass());
        }
        System.arraycopy(array, 0, a, 0, headIndex);
        if (a.length > headIndex) {
            a[headIndex] = null;
        }
        return a;
    }

    public boolean contains(Object t) {
        for (int i = 0; i < headIndex + 1; i++) {
            if (t.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean add(T t) {
        if (!contains(t)) {
            array[headIndex] = t;
            headIndex++;
            return true;
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < headIndex; i++) {
            array[i] = null;
        }
        headIndex = 0;
    }

    /*
    * @return <tt>true</tt> if this set contained the specified element
    */
    public boolean remove(Object t) {
        for (int i = 0; i < headIndex + 1; i++) {
            if (t.equals(array[i])) {
                removeEmptyCell(i);
                return true;
            }
        }
        return false;
    }

    private void removeEmptyCell(int i) {
        while (i < headIndex) {
            array[i] = array[i + 1];
            i++;
        }
        headIndex--;
    }

}
