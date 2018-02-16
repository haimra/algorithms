package org.raman.algorithim.graphs.common;

public class Node<T> {
	private T data;
	private Node<T> parent;
	private Node<T> leftChild;
	private Node<T> rightChild;

	public Node(T i) {
		setData(i);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Node<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return String.format("[%s]", data.toString());
	}
}
