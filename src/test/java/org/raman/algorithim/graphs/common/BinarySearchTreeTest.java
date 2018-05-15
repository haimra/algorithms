package org.raman.algorithim.graphs.common;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void testInsertEmptyTree() {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(3);
		tree.insert(2);
		tree.insert(5);
		tree.insert(7);
		tree.insert(8);		
		Assert.assertArrayEquals(new Integer[] {2,3,5,5,7,8 }, tree.inOrder().toArray());
		Assert.assertTrue(8==tree.search(8).getData());
		Assert.assertTrue(2==tree.search(2).getData());
		Assert.assertTrue(3==tree.search(3).getData());
		Assert.assertTrue(null==tree.search(0));
	}

}
