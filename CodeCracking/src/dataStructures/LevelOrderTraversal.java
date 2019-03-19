package dataStructures;

import java.util.*;
import dataStructures.TreeNode;


public class LevelOrderTraversal {

	public static void levelOrder(TreeNode root) {
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    TreeNode current = root;
	    q.add(current);
	
	    while (! q.isEmpty()) {
	        current = q.remove();
	        System.out.print(current.getData() + " ");
	
	            if (current.getLeft() != null)
	                q.add(current.getLeft());
	
	            if (current.getRight() != null)
	                q.add(current.getRight());
	        }
	}
	
	public static void main(String[] args) {
		// Build test tree
	    TreeNode root = new TreeNode(1);
	    root.setRight(new TreeNode(2));
	    root.getRight().setRight(new TreeNode(5));
	    root.getRight().getRight().setRight(new TreeNode(6));
	    root.getRight().getRight().setLeft(new TreeNode(3));
	    root.getRight().getRight().getLeft().setRight(new TreeNode(4));
		
	    levelOrder(root);
	}	
}