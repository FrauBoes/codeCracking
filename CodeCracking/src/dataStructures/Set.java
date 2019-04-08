package dataStructures;

public class Set {

	private int CAPACITY = 10;
	int size;
	
	int[] elements = new int[CAPACITY];
	
	Set() {
		size = 0;
	}
		
	public boolean isEmpty() {
		return size == 0;
	}

	public void add(int i) {
		if (!contains(i)) {
			
			if (size == CAPACITY-1) {
				CAPACITY += CAPACITY;
				int[] newElements = new int[CAPACITY];
				
				for (int j = 0; j < size; j++) 
					newElements[j] = elements[j];

				elements = newElements;
			}
			
			elements[size] = i;
			size++;
		}	
	}

	public boolean contains(int e) {
		return getIndex(e) != -1;
	}

	public void remove(int e) {
		int i = getIndex(e);
		
		if (i == -1)
			return;
		
		else {
			elements[i] = elements[size-1];
			elements[size-1] = 0;
			size--;
		}
	}
	
	public int getIndex(int e) {
		for (int i = 0; i < size; i++)
			if (elements[i] == e)
				return i;
		
		return -1;
	}
}








