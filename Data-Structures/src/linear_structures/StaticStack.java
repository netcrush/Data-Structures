package linear_structures;

import java.util.EmptyStackException;

public class StaticStack {
	private int[] array;
	private int top;
	
	public StaticStack(int kapacity) {
		array = new int[kapacity];
		top = -1;
	}
	
	private boolean isEmpty() {
		return (top == -1);
	}
	
	private boolean isFull() {
		return (top == array.length-1);
	}
	
	public boolean push(int data) {
		if (isFull()) return false;
		array[++top] = data;
		return true;
	}
	
	public int pop() throws EmptyStackException {
		if (isEmpty()) throw new EmptyStackException();
		return array[top--];
	}
	
	public int peek() throws EmptyStackException {
		if (isEmpty()) throw new EmptyStackException();
		return array[top];
	}
}
