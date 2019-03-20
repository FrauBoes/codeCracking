package advanced;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import advanced.ListNode;


public class SortLinkedLists {
	public static void main(String[] args) {
		
		// Make list of linked lists
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			
			int rand_int = rand.nextInt(10);
			
			ListNode node = new ListNode(rand_int);
			
			list.add(node);

			for (int j = rand_int+1; j < 100; j += rand_int) {
				node.next = new ListNode(j);
				node = node.next;
				rand_int = rand.nextInt(10);
			}
		}
		
		// Print to check list
		for (ListNode node : list) {
			while (node != null) {
				ListNode temp = node;
				System.out.print(temp.val + " ");
				node = node.next;
			}
			System.out.println();
		}
		
		// Print to check result
		LinkedList<Integer> res = sortLinkedLists(list);
		
		while (res.peek() != null)
			System.out.print(res.poll() + " ");
		
		System.out.println("Finished!");
	}
	
	
	public static LinkedList<Integer> sortLinkedLists(ArrayList<ListNode> lists) {
		
		if (lists.isEmpty()) return null;
		
		LinkedList<Integer> res = new LinkedList<Integer>();
		
		// Add priority queue (implemented as heap) with compare method for ListNodes
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>() {
			@Override
			public int compare(ListNode n1, ListNode n2) {
				if (n1.val < n2.val)
					return -1;
				else if (n1.val > n2.val)
					return 1;
				else
					return 0;
			}
		});
		
		for (ListNode node : lists) {
			if (node != null)
				q.add(node);
		}
		
		ListNode temp = new ListNode(0);
		
		while (! q.isEmpty()) {
			temp = q.poll();
			res.add(temp.val);
			
			if (temp.next != null)
				q.add(temp.next);
		}
		
		return res;
	}
}
