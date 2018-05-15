package org.raman.algorithim.graphs.common;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	private Node<Integer> root;

	public void insert(Integer value) {
		root = insertInternal(root, value);
	}

	private Node<Integer> insertInternal(Node<Integer> node, Integer value) {
		if (node == null) {
			return new Node<Integer>(value);
		}

		if (node.getData() >= value) {
			Node<Integer> leftChild = insertInternal(node.getLeftChild(),
					value);
			node.setLeftChild(leftChild);
			return node;
		} else {
			Node<Integer> rightChild = insertInternal(node.getRightChild(),
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

	boolean checkBST(Node root) {
		int[] tree = readDfs(root) ;
		for (int i=0;i<tree.length-1;i++){
			if(tree[i]<tree[i+1]) return false;
		}
		return true;
	}

	int[] readDfs(Node root) {
		List tree = new ArrayList();
		readDfsInternal(root, tree);
		int[] intTree = new int[tree.size()];
		for(int i=0;i<intTree.length;i++){
			intTree[i] = (int) tree.get(i);
		}
		return intTree;
	}
	void readDfsInternal(Node node,List tree) {
			if(node==null) return;//empty tree
			if(node.getLeftChild()!=null) tree.add(node.getLeftChild().getData());
			if(node.getRightChild()!=null) tree.add(node.getRightChild().getData());
			readDfsInternal(node.getLeftChild(),tree);
			readDfsInternal(node.getRightChild(),tree);
		}

/*	public boolean isBFS(Node<Integer> root) {
		return  testBFS(root,Integer.MIN_VALUE,Integer.MAX_VALUE)
	}



	boolean testBFS(Node<Integer>  root,int minKey, int maxKey) {
		if(root==null) return true;//empty tree
		if(root.getLeftChild()==null && root.getRightChild()==null) return true;//1 node tree

		if(root.getLeftChild()!=null && root.getLeftChild().getData()>=root.getData()) return false;
		if(root.getRightChild()!=null && root.getRightChild().getData()<=root.getData()) return false;
		return testBFS(root.getLeftChild()) && testBFS(root.getRightChild());
	}*/

}
