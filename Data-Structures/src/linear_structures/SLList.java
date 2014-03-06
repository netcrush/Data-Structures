package linear_structures;

public class SLList {
	SLListNode head;

	public SLList() {
		head = null;
	}
	
	@Override
	public String toString() {
		SLListNode temp = head;
		String sList = "";
		while (temp != null) {
			sList += temp.data + ", ";
			temp = temp.next;
		}
		return sList;
	}



	private boolean isEmpty() {
		return (head == null);
	}
	
	public boolean addFirst(int data) {
		head = new SLListNode(data, head);
		return true;
	}
	
	public boolean addLast(int data) {
		SLListNode temp = head;
		
		if (isEmpty()) return addFirst(data);
		
		while (temp.next != null) temp = temp.next;
		temp.next = new SLListNode(data, null);
		return true;
	}
	
	public int removeFirst() throws Exception {
		if (isEmpty()) throw new Exception ("List is empty!");
		SLListNode removed = head;
		head = head.next;
		//removed.next = null;
		return removed.data;
	}
	
	public int removeLast() throws Exception {
		if (isEmpty()) throw new Exception("List is empty!");
		
		SLListNode removed;
		if (head.next == null) {
			return removeFirst();
			
			// 2nd option
			//removed = head;
			//head = null;
			//return removed.data;
		}
		
		SLListNode temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		removed = temp.next;
		temp.next = null;
		return removed.data;
	}
	
/*	public static void main(String[] args) {
		SLList list = new SLList();
		System.out.println(list.addFirst(10));
		System.out.println(list.addFirst(20));
		System.out.println(list.addLast(30));
		System.out.println(list);
		try {
			System.out.println(list.removeFirst());
			System.out.println(list.removeLast());
			System.out.println(list.removeFirst());
			System.out.println(list.removeFirst());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
	}*/
}
