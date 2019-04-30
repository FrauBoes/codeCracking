package dataStructures;


public class BinaryTreeToLinkedList {

	public static void main(String[] args) {
		// Make test binary tree
		BinaryTree tree = new BinaryTree(0);
		tree.getRoot().setRight(new TreeNode(7));
		tree.getRoot().getRight().setLeft(new TreeNode(1));
		tree.getRoot().getRight().setRight(new TreeNode(6));
		tree.getRoot().setLeft(new TreeNode(5));
		tree.getRoot().getLeft().setLeft(new TreeNode(9));
		tree.getRoot().getLeft().setRight(new TreeNode(3));
		
		// Flatten binary to to linked list
		SLLNode head = flatten(tree.getRoot());
		
		// Print linked list
		while (head != null) {
			System.out.println(head.getElement());
			head = head.getNext();
		}
	}
	
	public static SLLNode flatten(TreeNode root) {
		SLLNode head = new SLLNode(null, null);
		
		preorder(root, head);
		
		return head;
	}
	
	public static void preorder(TreeNode current, SLLNode head) {
		if (current == null) return;
		else {
			head.appendtoTail(current.getData());
			preorder(current.getLeft(), head);
			preorder(current.getRight(), head);
		}
	}
}
