package com.greatlearning.model;

import java.util.Vector;

public class BinarySearchTree {
	Node root = null;
	Vector<Node> btreeNodes = new Vector<Node>();

	// creating new Node
	public void insert(double value) {
		Node newNode = new Node(value);
		if (root == null)
			root = newNode;
		else
			insertNode(root, newNode);

	}

	// inserting node into binary search tree
	public void insertNode(Node root, Node newNode) {
		if (newNode.data <= root.data) {
			if (root.left == null)
				root.left = newNode;
			else
				insertNode(root.left, newNode);
		} else if (newNode.data > root.data) {
			if (root.right == null)
				root.right = newNode;
			else
				insertNode(root.right, newNode);
		}

	}

	// in order traversal to get the ordered Nodes

	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			btreeNodes.add(root);
			inorder(root.right);
		}
	}

	public Vector<Node> getNodes() {
		inorder(root);
		return btreeNodes;
	}

}
