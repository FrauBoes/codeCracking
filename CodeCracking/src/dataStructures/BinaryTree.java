package dataStructures;

import dataStructures.TreeNode;

public class BinaryTree {
	private TreeNode root;
	
	public BinaryTree(int key) {
		root = new TreeNode(key);
	}
	
	public BinaryTree() {
		root = null;
	}
	
	public TreeNode getRoot() {
		return this.root;
	}
	
	public void setRoot(TreeNode n) {
		this.root = n;
	}
}
