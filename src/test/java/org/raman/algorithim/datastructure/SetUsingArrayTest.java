package org.raman.algorithim.datastructure;

import org.junit.Test;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class SetUsingArrayTest {

    @Test
    public void testAdd() throws Exception {
        SetUsingArray<String> set = new SetUsingArray<>();
        assertThat(set.isEmpty(), is(true));
        set.add("a");
        set.add("b");
        set.add("a");
        set.add("b");
        assertThat("Unexpected Set size", set.size(), is(2));
        assertThat(set.contains("a"), is(true));
        assertThat(set.contains("b"), is(true));
    }

    @Test
    public void testIsEmpty() throws Exception {
        SetUsingArray<String> set = new SetUsingArray<>();
        assertThat("Set should be empty", set.isEmpty(), is(true));
        set.add("a");
        assertThat("Set should not be empty", set.isEmpty(), is(false));
        set.add("b");
        assertThat("Set should not be empty", set.isEmpty(), is(false));
        assertThat("Unexpected Set size", set.size(), is(2));
        set.remove("a");
        assertThat("Set should not be empty", set.isEmpty(), is(false));
        set.remove("b");
        assertThat("Set should be empty", set.isEmpty(), is(true));
    }

    @Test
    public void testRemove() throws Exception {
        SetUsingArray<String> set = createSetWithThreeItems();
        set.add("d");
        assertThat("Unexpected Set size", set.size(), is(4));
        assertThat(set.contains("c"), is(true));
        set.remove("c");
        assertThat("Unexpected Set size", set.size(), is(3));
        assertThat(set.contains("c"), is(false));
    }

    @Test
    public void testRemoveNoneExisting() throws Exception {
        SetUsingArray<String> set = createSetWithThreeItems();
        assertThat("Unexpected Set size", set.size(), is(3));
        set.remove("d");
        assertThat("Unexpected Set size", set.size(), is(3));
        assertThat(set.contains("a"), is(true));
    }

    @Test
    public void testClear() throws Exception {
        SetUsingArray<String> set = createSetWithThreeItems();
        assertThat("Unexpected Set size", set.size(), is(3));
        set.clear();
        assertThat("Unexpected Set size", set.size(), is(0));
        set.add("d");
        set.add("e");
        set.add("f");
        assertThat("Unexpected Set size", set.size(), is(3));
    }

    @Test
    public void testToArray() throws Exception {
        SetUsingArray<String> set = createSetWithThreeItems();
        final String[] items = set.toArray(new String[set.size()]);
        assertThat("Unexpected Set size", items.length, is(3));
        assertThat("Unexpected element", items[0], is("a"));
        assertThat("Unexpected element", items[1], is("b"));
        assertThat("Unexpected element", items[2], is("c"));
        Stream.of(items).forEach(i-> System.out.println(i));
    }
    private SetUsingArray<String> createSetWithThreeItems() {
        SetUsingArray<String> set = new SetUsingArray<>();
        set.add("a");
        set.add("b");
        set.add("c");
        return set;
    }
}