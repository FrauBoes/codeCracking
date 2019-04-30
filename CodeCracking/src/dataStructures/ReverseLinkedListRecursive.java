package dataStructures;

public class ReverseLinkedListRecursive {

	public static void main(String[] args) {
		// Test method
		SLLNode head = new SLLNode(1, null);
		head.appendtoTail(2);
		head.appendtoTail(3);
		head.appendtoTail(4);
		head.appendtoTail(5);
		head.appendtoTail(6);
		head.appendtoTail(7);
		head.appendtoTail(8);

		// Print original list
		SLLNode current = head;
		System.out.print("Original list: ");

		while (current.getNext() != null) {
			System.out.print(current.getElement());
			current = current.getNext();
		}
		System.out.print(current.getElement());
		System.out.println();

		// Get head of reversed list
		reverseRecursive(head);		

		System.out.print("Reversed list: ");

		while (current.getNext() != null) {
			System.out.print(current.getElement());
			current = current.getNext();
		}
		System.out.print(current.getElement());

	}
	
	private static void reverseRecursive(SLLNode curr) {
		
		SLLNode head = curr;
		
		if (curr == null) return;
		
		SLLNode first = head;
		SLLNode rest = head.getNext();
		
		if (rest == null) return;
		
		reverseRecursive(rest);
		
		first.getNext().setNext(first);
		first.setNext(null);
	}
}
