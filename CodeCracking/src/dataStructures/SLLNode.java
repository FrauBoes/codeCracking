package dataStructures;

public class SLLNode {
	private Object element;
	private SLLNode next;
	
	SLLNode(Object e, SLLNode n) {
		element = e;
		next = n;
	}
	
	void setElement(Object newElem) {
		element = newElem;
	}
	
	void setNext(SLLNode n) {
		next = n;
	}
	
	Object getElement() {
		return this.element;
	}
	
	SLLNode getNext() {
		return this.next;
	}
	
	public void appendtoTail(Object e) {
		SLLNode end = new SLLNode(e, null);
		SLLNode n = this;
		
		while (n.next != null)
			n = n.next;
		n.next = end;
	}
}

