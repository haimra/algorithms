package org.raman.algorithim.graphs.common;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	private Node<Integer> root;

	public void insert(Integer value) {
		root = insertIntegrnal(root, value);
	}

	private Node<Integer> insertIntegrnal(Node<Integer> node, Integer value) {
		if (node == null) {
			return new Node<Integer>(value);
		}

		if (node.getData() >= value) {
			Node<Integer> leftChild = insertIntegrnal(node.getLeftChild(),
					value);
			node.setLeftChild(leftChild);
			return node;
		} else {
			Node<Integer> rightChild = insertIntegrnal(node.getRightChild(),
					value);
			node.setRightChild(rightChild);
			return node;
		}
	}

	public Node<Integer> search(Integer value) {
		return searchInternal(root, value);
	}

	private Node<Integer> searchInternal(Node<Integer> node, Integer value) {
		if (node == null) {
			return null;
		}

		if (node.getData().equals(value)) {
			return node;
		}
		
		if (node.getData() >= value) {
			return searchInternal(node.getLeftChild(), value);
		} else {
			return searchInternal(node.getRightChild(), value);
		}

	}

	public List<Integer> inOrder() {
		List<Integer> inOrder = new ArrayList<>();
		inOrderInternal(root, inOrder);
		return inOrder;
	}

	public void drowTree(){
		
	}

	public void inOrderInternal(Node<Integer> node, List<Integer> inOrder) {
		if (node != null) {
			inOrderInternal(node.getLeftChild(), inOrder);
			inOrder.add(node.getData());
			inOrderInternal(node.getRightChild(), inOrder);
		}
	}
}
