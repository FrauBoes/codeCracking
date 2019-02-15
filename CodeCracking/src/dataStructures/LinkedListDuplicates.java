package dataStructures;
import dataStructures.SLLNode;
import java.util.HashMap;


public class LinkedListDuplicates {
	
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
		
		while (head != null) {
			System.out.print(head.getElement());
			head = head.getNext();
		}
	}

	
	// Implemented with a hash map that stores any values that have already occurred
	public static boolean RemoveDups(SLLNode n) {
		
		HashMap <Integer, Boolean> map  = new HashMap<Integer, Boolean>();
		
		SLLNode previous = null;
		
		while (n != null) {
			if (map.containsKey(n.getElement())) {
				previous.setNext(n.getNext());
		
			} else {
				map.put((Integer) n.getElement(), true);
				previous = n;
			}
			
			n = n.getNext();
		}		
		
		return true;
	}
}
