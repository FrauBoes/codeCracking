package algorithms;

import java.util.LinkedList;
import java.util.Queue;
import dataStructures.BinaryTree;
import dataStructures.TreeNode;


public class BFS {

	public static void main (String[] args) {
		// Set up binary tree
		BinaryTree tree = new BinaryTree(1);
		
		// Populate nodes
		TreeNode root = tree.getRoot();
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(3));
		root.getLeft().setLeft(new TreeNode(4));
		root.getLeft().setRight(new TreeNode(5));
		root.getRight().setLeft(new TreeNode(6));
		root.getRight().setRight(new TreeNode(7));

		// Get result
		System.out.println(bfs(root, 9));
	}
	
	public static TreeNode bfs(TreeNode root, int x) {
		
		// Use 	queue to store nodes with same depth
		Queue<TreeNode> q = new LinkedList<TreeNode> ();
		
		// Return null if tree is empty
		if (root == null)
			return null;
		
		// Check if root contains searches value
		else if (root.getData() == x)
			return root;
		
		q.add(root);
		
		// Check nodes until queue is empty
		// Queue is populated until leaf nodes are met
		while (q.peek() != null) {
			
			TreeNode current = q.remove();
	
			if (current.getLeft() != null) {
				if (current.getLeft().getData() == x)
					return current.getLeft();
				else 
					q.add(current.getLeft());
			}
			if (current.getRight() != null) {
				if (current.getRight().getData() == x)
					return current.getRight();
				else 
					q.add(current.getRight());
			}
		}
		
		// Return null if value not found
		return null;
	}
	
	
}
