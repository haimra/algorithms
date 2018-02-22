package org.raman.algorithim.general;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Question:
 * Write a method where given an unsorted array of integers of size N and an integer K, it finds the K largest
 * integers in the array in an optimal way. 
 * The method can print or return the numbers in any data structure and in any order.ex. 
 * 
 * [5, 8, 4, 9, 9, -1], k = 3
 * return [9, 8, 9]
 *
 * The idea of the solution:
 *
 * We will use the Heap Data Structure to accive this goal
 * *
 */
public class KLargestElements {
	private Integer[] uarray;
	
	
	public void setUarray(Integer[] uarray) {
		this.uarray = uarray;
	}

	/**
	 * Space complexity  
	 * We will need only extra 2*k memory
	 * O(n+2k) 
	 * Execution Complexity:
	 * Assuming that n is very big and k is relatively small. 
	 * Average: O(n)+O(k) 
	 * Worse case:When array is sorted descending 
	 * 
	 * @param k
	 * @return
	 */
	public Integer[] getKlargestSaveSpace(int k){
		//order k largest from max to min
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,new IntegerAccendingComparator());
		//order k largest from min to max
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(k,new IntegerDecendingComparator());
		
		maxHeap.add(uarray[0]);//O(1)
		minHeap.add(uarray[0]);//O(1)
		for (int i = 1; i < uarray.length; i++) {//n times 
			Integer next = uarray[i];
			if(maxHeap.peek()<=next && next>=minHeap.peek()){//O(1)
				if(maxHeap.size()>=k){
					//make sure the heap is not larger then k
					maxHeap.remove(minHeap.poll());//O(k)+O(k)
				}
				maxHeap.add(next);//O(k)
				minHeap.add(next);//O(k)				
			}
		}		
		return maxHeap.toArray(new Integer[0]);		
	}
	
	/**
	 * Space complexity  
	 * We will need only extra n memory to create the heap 
	 * (unless we change it to in-place creation based on the source array)  
	 * O(2n) 
	 * Execution Complexity
	 * Assuming that n is very big and k is relatively small. 
	 * Average: O(n)+O(k*log(n)) = O(n)	
	 * @param k
	 * @return
	 */
	public Integer[] getKlargest(int k){
		
		Integer[] results = new Integer[k];
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,new IntegerAccendingComparator());		
		for (int i = 1; i < uarray.length; i++) {//building a heap from an array O(n); 
			Integer next = uarray[i];
				maxHeap.add(next);
		}		
		
		for(int j=k ;j>=1;j--){ 
			results[k-j]= maxHeap.poll();//O(1) to find and O(h) to heapfiy 
		}
		
		return results;		
	}
	private static class IntegerDecendingComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1-o2;
		}
		
	}
	
	private static class IntegerAccendingComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
		
	}
}
