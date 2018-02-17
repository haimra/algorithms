package org.raman.algorithim.datastructure;

import java.util.Stack;

/**
 *  <p> Queue is an abstract data type or collection in which the entities in the collection are kept in order.
 *  Operations on the collection are:</p>
 *  <b>Enqueue</b> - the addition of entities to the rear terminal position.<br>
 *  <b>Dequeue</b> - Removal of entities from the front terminal position.<br>
 *  <p>This makes the queue a First-In-First-Out (FIFO) data structure.</p>
 *  <p>
 *   Using Java Stack as Queue.
 *   Stack is a Fast-In-First-Out (LIFO) data structure. So in order to create a
 *   FIFO data structure we will use two Stacks.
 *   When adding we will first pop all objects from one stack s2 and
 *   push them to a second one s1.When done we will add the new object on top.
 *   Then we will pop back all the objects back to s2.
 *   This way we will keep the original order of the Queue.
 * </p>
 * @param <E>
 */
public class StacksAsQueue<E> {

	private Stack<E> s1 = new Stack<>();
	private Stack<E> s2 = new Stack<>();

	public void add(E item) {
		while (!s2.isEmpty()) {
			s1.add(s2.pop());
		}
		s1.add(item);

		while (!s1.isEmpty()) {
			s2.add(s1.pop());
		}
	}

	/**
	 * In case of empty Queue we throw EmptyQueueException.
	 * With is unchecked exception.
	 * We perter unchecked exception here as because the
	 * user of the Queue can prevent the exception if he will use
	 * the isEmpty() method before pooling from the queue.
	 * @return
     */
	public E pool() {
		if(s2.isEmpty()){
			throw new EmptyQueueException();
		}
		return s2.pop();
	}

	public boolean isEmpty() {
		return size() >= 0;
	}

	public int size() {
		return s2.size();
	}

	public static class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			super("Can not pool from empty queue, make sure to use isEmpty() before pooling from Queue");
		}
	}

}
