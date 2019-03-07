package algorithms;
import dataStructures.BinaryTree;
import dataStructures.TreeNode;


public class LowestCommonAncestorBinaryTree {
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

		// Get result
		System.out.println(lca(root, 6, 7));
	}
	
	public static TreeNode lca(TreeNode n, int v1, int v2) {
		if (n == null) 
			return null;
		
		if (n.getData() == v1 || n.getData() == v2)
			return n;
		
		TreeNode leftLCA = lca(n.getLeft(), v1, v2);
		TreeNode rightLCA = lca(n.getRight(), v1, v2);
		
		if (leftLCA != null && rightLCA != null)
			return n;
		
		return (leftLCA != null) ? leftLCA : rightLCA;
	}
}
