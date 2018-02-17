package org.raman.algorithim.datastructure;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

/**
 *
 */
public class SetUsingArrayTest {

    @Test
    public void testAdd() throws Exception {
        SetUsingArray<String> set = new SetUsingArray<>();
        set.add("a");
        set.add("b");
        set.add("a");

        assertThat("Unexpected array size",set.size(),is(2));

    }
}