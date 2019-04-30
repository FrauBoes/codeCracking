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

		while (current != null) {
			System.out.print(current.getElement());
			current = current.getNext();
		}

		System.out.println();

		// Get head of reversed list
		current = reverse(head);		

		System.out.print("Reversed list: ");

		while (current != null) {
			System.out.print(current.getElement());
			current = current.getNext();
		}
	}
	
	private static SLLNode reverse(SLLNode head) {
		
		SLLNode curr = head;
		SLLNode prev = null;
		SLLNode next;
		
		// Use pointers to reverse links of nodes from head to tail
		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}

		// Return prev, which is the new head
		return prev;
		
	}
}
