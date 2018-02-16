package org.raman.algorithim.graphs.common;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TreeTest {

	private static final String TREE_STR = "[1][2][3][4][5][6][7]";

	@Test
	@Ignore
	public void testSearchBsf() {
		Node<Integer> b = new Node<>(1);
		Node<Integer> b_1 = new Node<>(2);
		Node<Integer> b_2 = new Node<>(3);
		Node<Integer> b_1_1 = new Node<>(4);
		Node<Integer> b_1_2 = new Node<>(5);
		Node<Integer> b_2_1 = new Node<>(6);
		Node<Integer> b_2_1_1 = new Node<>(7);

		b.setLeftChild(b_1);
		b.setRightChild(b_2);
		b_1.setLeftChild(b_1_1);
		b_1.setRightChild(b_1_2);
		b_2.setLeftChild(b_2_1);
		b_2_1.setLeftChild(b_2_1_1);
		Tree<Integer> t = new Tree<>(b);
		assertEquals(b, t.searchBsf(1));
		assertEquals(b_2_1_1, t.searchBsf(7));
		assertEquals(b_1_1, t.searchBsf(4));
		assertEquals(null, t.searchBsf(8));
	}

	@Test
	@Ignore
	public void testDaimeter() {
		// daimeter vi the root
		Node<Integer> a = new Node<>(1);
		Node<Integer> a_1 = new Node<>(2);
		Node<Integer> a_2 = new Node<>(5);
		Node<Integer> a_1_1 = new Node<>(3);
		Node<Integer> a_1_2 = new Node<>(4);
		Node<Integer> a_2_1 = new Node<>(6);
		Node<Integer> a_2_1_1 = new Node<>(7);

		a.setLeftChild(a_1);
		a.setRightChild(a_2);
		a_1.setLeftChild(a_1_1);
		a_1.setRightChild(a_1_2);

		a_2.setLeftChild(a_2_1);
		a_2_1.setRightChild(a_2_1_1);

		Tree<Integer> t = new Tree<>(a);
		assertEquals("Unexpected daimeter", 6, t.diameter());
		// daimeter vi a2
		Node<Integer> a_2_2 = new Node<>(8);
		a_2.setRightChild(a_2_2);
		Node<Integer> a_2_2_2 = new Node<>(9);
		a_2_2.setRightChild(a_2_2_2);
		Node<Integer> a_2_2_2_2 = new Node<>(10);
		a_2_2_2.setRightChild(a_2_2_2_2);
		Node<Integer> a_2_2_2_2_2 = new Node<>(11);
		a_2_2_2_2.setRightChild(a_2_2_2_2_2);
		assertEquals("Unexpected daimeter", 7, t.diameter());
		Tree<Integer> t1 = new Tree<>(new Node<>(1));
		assertEquals("Unexpected daimeter", 1, t1.diameter());

	}

	@Test
	@Ignore
	public void testDfString() {
		Node<Integer> a = new Node<>(1);
		Node<Integer> a_1 = new Node<>(2);
		Node<Integer> a_2 = new Node<>(5);
		Node<Integer> a_1_1 = new Node<>(3);
		Node<Integer> a_1_2 = new Node<>(4);
		Node<Integer> a_2_1 = new Node<>(6);
		Node<Integer> a_2_1_1 = new Node<>(7);

		a.setLeftChild(a_1);
		a.setRightChild(a_2);
		a_1.setLeftChild(a_1_1);
		a_1.setRightChild(a_1_2);

		a_2.setLeftChild(a_2_1);
		a_2_1.setRightChild(a_2_1_1);

		Tree<Integer> t = new Tree<>(a);
		assertEquals(TREE_STR, t.dfString());
	}

	@Test
	@Ignore
	public void testBfString() {
		Node<Integer> b = new Node<>(1);
		Node<Integer> b_1 = new Node<>(2);
		Node<Integer> b_2 = new Node<>(3);
		Node<Integer> b_1_1 = new Node<>(4);
		Node<Integer> b_1_2 = new Node<>(5);
		Node<Integer> b_2_1 = new Node<>(6);
		Node<Integer> b_2_1_1 = new Node<>(7);

		b.setLeftChild(b_1);
		b.setRightChild(b_2);
		b_1.setLeftChild(b_1_1);
		b_1.setRightChild(b_1_2);
		b_2.setLeftChild(b_2_1);
		b_2_1.setLeftChild(b_2_1_1);
		Tree<Integer> t = new Tree<>(b);
		assertEquals(TREE_STR, t.bfString());
	}

	@Test
	public void testIsSymetric() {
		Tree<Integer> t1 = new Tree<>(null);
		assertTrue("Tree is expectd to be symetic",t1.isSymetric());
		
		t1.setRoot(new Node<Integer>(1));
		assertTrue("Tree is expectd to be symetic",t1.isSymetric());
		
		
		Node<Integer> b = new Node<>(1);
		Node<Integer> b_1 = new Node<>(2);
		Node<Integer> b_2 = new Node<>(2);
		Node<Integer> b_1_1 = new Node<>(4);
		Node<Integer> b_1_2 = new Node<>(5);
		Node<Integer> b_2_1 = new Node<>(5);
		Node<Integer> b_2_2 = new Node<>(4);

		b.setLeftChild(b_1);
		b.setRightChild(b_2);
		b_1.setLeftChild(b_1_1);
		b_1.setRightChild(b_1_2);
		b_2.setLeftChild(b_2_1);
		b_2.setRightChild(b_2_2);

		Tree<Integer> t = new Tree<>(b);
		assertTrue("Tree is expectd to be symetic",t.isSymetric());
		
		b_2_2.setData(5);
		assertTrue("Tree is expectd to be asymetic",!t.isSymetric());
		b_2.setLeftChild(null);
		assertTrue("Tree is expectd to be asymetic",!t.isSymetric());
		System.out.print(t.dfString());
		
	}

}
