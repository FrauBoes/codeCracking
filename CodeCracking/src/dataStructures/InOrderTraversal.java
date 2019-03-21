package dataStructures;

import dataStructures.TreeNode;
import java.util.ArrayList;
import java.util.List;
import dataStructures.BinaryTree;


public class InOrderTraversal {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(1);
		tree.getRoot().setRight(new TreeNode(2));
		tree.getRoot().getRight().setLeft(new TreeNode(3));
		
		
		List<Integer> list = inorderTraversal(tree.getRoot());
		
		for (int i : list)
			System.out.print(i + " ");
	}
	
	
	public static List<Integer> inorderTraversal(TreeNode root) {
	        
	        List<Integer> list = new ArrayList<Integer>();
	        
	        inorderTraversalUtil(root, list);
	    
	        return list;
	    }
	    
    public static void inorderTraversalUtil(TreeNode root, List<Integer> list) {
        if (root == null) {
            // Don't do anything if root is null
        }
        
        // Otherwise recurse traversal left - root - right
        else {
            inorderTraversalUtil(root.getLeft(), list);
            list.add(root.getData());
            inorderTraversalUtil(root.getRight(), list);
        }
    }
}

