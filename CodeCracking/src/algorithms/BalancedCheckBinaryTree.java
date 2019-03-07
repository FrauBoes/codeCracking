package algorithms;
import dataStructures.BinaryTree;
import dataStructures.TreeNode;


public class BalancedCheckBinaryTree {
	public static void main(String[] args) {
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
		root.getRight().getRight().setLeft(new TreeNode(8));
		root.getRight().getRight().setRight(new TreeNode(9));
		root.getRight().getRight().getRight().setRight(new TreeNode(10));
		root.getRight().getRight().getRight().setLeft(new TreeNode(11));

		// Get result
		System.out.println(isBalanced(root));
	}
	
	public static boolean isBalanced(TreeNode n) {
		if (n == null) 
			return true;
		
		if (checkHeight(n) == -1)
			return false;
		return true;		
	}
	
	public static int checkHeight(TreeNode n) {
		if (n == null)
			return 0;
		
		int leftHeight = checkHeight(n.getLeft());
		if (leftHeight == -1)
			return -1;
		
		int rightHeight = checkHeight(n.getRight());
		if (rightHeight == -1)
			return -1;
		
		int heightDiff = Math.abs(leftHeight - rightHeight);
		if (heightDiff > 1)
			return -1;
		else
			return Math.max(leftHeight, rightHeight) + 1;		
	}
}
