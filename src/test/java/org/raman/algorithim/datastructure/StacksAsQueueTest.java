package org.raman.algorithim.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class StacksAsQueueTest {

	@Test
	public void testQueue() {
		
		StacksAsQueue<String> queue = new StacksAsQueue<>();
		
		assertTrue("Queue should be empty", queue.isEmpty());
		
		queue.add("a");
		queue.add("b");
		queue.add("c");
		
		assertEquals("Unexpected item from head of the queue", "a",queue.pool());
		assertEquals("Unexpected item from head of the queue", "b",queue.pool());
		assertEquals("Unexpected item from head of the queue", "c",queue.pool());
		assertTrue("Queue should be empty", queue.isEmpty());
		
		
	}

}
