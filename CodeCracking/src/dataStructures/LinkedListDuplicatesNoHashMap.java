package dataStructures;
import dataStructures.SLLNode;


public class LinkedListDuplicatesNoHashMap {
	
	public static void main(String[] args) {
		// Test method
		SLLNode head = new SLLNode(4, null);
		head.appendtoTail(3);
		head.appendtoTail(1);
		head.appendtoTail(7);
		head.appendtoTail(6);
		head.appendtoTail(1);
		head.appendtoTail(5);
		head.appendtoTail(8);
		head.appendtoTail(9);
		head.appendtoTail(1);
		
//		while (head != null) {
//			System.out.print(head.getElement());
//			head = head.getNext();
//		}
		
		System.out.print(RemoveDups(head));
		
		while (head.getNext() != null) {
			System.out.print(head.getElement());
			head = head.getNext();
		}
	}

	// Implemented without buffer
	// Uses runner technique instead
	public static boolean RemoveDups(SLLNode n) {
		if (n == null)
			return false;
		
		SLLNode current = n;
		
		while (current.getNext() != null) {
			
			SLLNode runner = current;
			
			while (runner.getNext() != null) {
				
				if (runner.getNext().getElement() == current.getElement())
					runner.setNext(runner.getNext().getNext());
				
				else
					runner = runner.getNext();
			}
			
			current = current.getNext();
		}
		
		return true;
	}
}
