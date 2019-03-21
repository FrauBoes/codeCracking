package dataStructures;

import dataStructures.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import dataStructures.BinaryTree;


public class InOrderTraversalIterative {
	
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
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        while (root != null || !stack.empty()) {
        
            while (root != null) {
                stack.push(root);
                root = root.getLeft();
            }
        
            root = stack.pop();
            list.add(root.getData());
            root = root.getRight();
        }

        return list;
	}
}


