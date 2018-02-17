package org.raman.algorithim.datastructure;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

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

    public boolean contains(T t) {
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

    /*
    * @return <tt>true</tt> if this set contained the specified element
    */
    public boolean remove(T t) {
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
