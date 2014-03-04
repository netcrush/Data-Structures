package linear_structures;

public class StaticQueue {
	private int[] array;
	private int numberOfElements;
	private int first;
	private int last;
	
	public StaticQueue(int kapacity) {
		array = new int[kapacity];
		numberOfElements = 0;
		first = -1;
		last = -1;
	}
	
	private boolean isEmpty() {
		return (numberOfElements == 0);
	}
	
	private boolean isFull() {
		return (numberOfElements == array.length);
	}
	
	public boolean enqueue(int data) {
		if (isFull()) return false;
		array[last = (++last % array.length)] = data;
		numberOfElements++;
		return true;
	}
}
