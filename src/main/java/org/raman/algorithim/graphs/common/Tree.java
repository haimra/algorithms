package org.raman.algorithim.graphs.common;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {
	private Node<T> root;
	Queue<Node<T>> queue;

	public Tree(Node<T> root) {
		super();
		this.root = root;
	}

	
	public Node<T> getRoot() {
		return root;
	}


	public void setRoot(Node<T> root) {
		this.root = root;
	}


	public Node<T> searchBsf(T data) {
		queue = new LinkedList<>();
		queue.add(root);
		return searchInternalBsf(data);
	}

	private Node<T> searchInternalBsf(T data) {
		while (!queue.isEmpty()) {
			Node<T> node = queue.poll();
			if (node.getData().equals(data)) {
				return node;
			}
			Node<T> leftChild = node.getLeftChild();
			if (null != leftChild)
				queue.add(leftChild);
			Node<T> rightChild = node.getRightChild();
			if (null != rightChild)
				queue.add(rightChild);
		}
		return null;
	}

	public int diameter(){
		if(null==root) return 0;
		return diameterInternal(root);
		
	}
	
	private int diameterInternal(Node<T> node){
		int diamLeft = diameterInternal(node.getLeftChild());
		int diamRight = diameterInternal(node.getRightChild());
		return Math.max(diamLeft, diamRight)+1;
	}
	/**
	 * Display depth first tree traversal string In pre-order
	 * 
	 * @return
	 */
	public String dfString() {
		queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		treeToDf(sb, root);
		return sb.toString();
	}

	/**
	 * Display breadth-first tree traversal string
	 * 
	 * @return
	 */
	public String bfString() {
		queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		queue.add(root);
		treeToBf(sb);
		return sb.toString();
	}

	private void treeToBf(StringBuilder sb) {
		while (!queue.isEmpty()) {
			Node<T> node = queue.remove();
			if (null != node) {
				sb.append(node.toString());
				queue.add(node.getLeftChild());
				queue.add(node.getRightChild());
			}
		}
	}

	private void treeToDf(StringBuilder sb, Node<T> node) {
		if (null != node) {
			sb.append(node.toString());
			treeToDf(sb, node.getLeftChild());
			treeToDf(sb, node.getRightChild());
		}
	}

	public boolean isSymmetric() {
		if(null==root) return true;
		return isSymmetricInternal(root.getLeftChild(),root.getRightChild());
	}

	private boolean isSymmetricInternal(Node<T> leftChild, Node<T> rightChild) {
		if((leftChild==rightChild)&&leftChild==null) return true;
		
		if(leftChild != null && rightChild!=null){
			if(leftChild.getData().equals(rightChild.getData())){
			return (
					isSymmetricInternal(leftChild.getLeftChild(),rightChild.getRightChild())
					&&
					isSymmetricInternal(leftChild.getRightChild(),rightChild.getLeftChild())
					);
			}
		}
		return false;
	}
}
