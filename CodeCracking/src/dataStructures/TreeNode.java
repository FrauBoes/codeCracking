package dataStructures;

public class TreeNode {
	private int data;
	private TreeNode left, right;
	
	public TreeNode(int item) {
		data = item;
		left = null;
		right = null;
	}
	
	// Getters
	public int getData() {
		return data;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	// Setters
	public void setData(int data) {
		this.data = data;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public String toString() {
		return "Data: " + data + ", left child: " + left.getData() + ", right child: " + right.getData();
	}
	
}
