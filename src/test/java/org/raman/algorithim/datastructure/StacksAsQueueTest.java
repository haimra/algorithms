package org.raman.algorithim.datastructure;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StacksAsQueueTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Test
    public void testQueue() {

        StacksAsQueue<String> queue = new StacksAsQueue<>();

        assertTrue("Queue should be empty", queue.isEmpty());

        queue.add("a");
        queue.add("b");
        queue.add("c");

        assertEquals("Unexpected item from head of the queue", "a", queue.pool());
        assertEquals("Unexpected item from head of the queue", "b", queue.pool());
        assertEquals("Unexpected item from head of the queue", "c", queue.pool());
        assertTrue("Queue should be empty", queue.isEmpty());

    }

    @Test
    public void testQueueWithPool() {
        StacksAsQueue<String> queue = new StacksAsQueue<>();

        queue.add("x");
        queue.add("a");
        queue.pool();
        queue.add("b");
        queue.add("c");

        assertEquals("Unexpected item from head of the queue", "a", queue.pool());
        assertEquals("Unexpected item from head of the queue", "b", queue.pool());
        assertEquals("Unexpected item from head of the queue", "c", queue.pool());
        assertTrue("Queue should be empty", queue.isEmpty());
    }

    @Test
    public void testPoolEmpty(){
        StacksAsQueue<String> queue = new StacksAsQueue<>();
        exception.expect(StacksAsQueue.EmptyQueueException.class);
        queue.pool();
    }


}
