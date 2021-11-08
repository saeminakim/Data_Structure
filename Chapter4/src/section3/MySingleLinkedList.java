package section3;

public class MySingleLinkedList<T> {

	private Node<T> head; // 첫번째 노드의 주소
	private int size;

	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	
	// inner class : 보통은 private으로 사용
	// 외부에서는 Node 클래스에 대해서 알 수 없게 하는게 목적
	private static class Node<T> {
		public T data;
		public Node<T> next;
		
		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

	private void addFirst(T item) {
		Node<T> newNode = new Node<T>(item);		
		newNode.next = head;
		head = newNode;
		size++;
	}

	private void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;
		before.next = temp;
		size++;
	}

	private T removeFirst() {
		if(head == null)
			return null;

		T tmp = head.data;
		head = head.next;
		size--;

		return tmp;
	}

	private T removeAfter(Node<T> before) {
		if(before.next == null)
			return null;

		T tmp = before.next.data;
		before.next = before.next.next;
		size--;

		return tmp;
	}

	public int indexOf(T item) {
		Node<T> p = head;
		int index = 0;
		while(p != null) {
			if(p.data.equals(item))
				return index;
			p = p.next;
			index++;
		}

		return -1;
	}

	private Node<T> getNode(int index){
		if(index < 0 || index >= size)
			return null;
		Node<T> p = head;
		for(int i = 0; i < index; i++) 
			p = p.next;
		return p;			
	}

	public T get(int index) {
		if(index < 0 || index >= size)
			return null;

		//		Node<T> p = head;
		//		for(int i = 0; i < index; i++) 
		//			p = p.next;
		//		return p.data;	

		return getNode(index).data;
	}

	public void add(int index, T item) {  // insert
		if(index < 0 || index > size)
			return;
		
		if(index == 0)
			addFirst(item);
		else {
			Node<T> q = getNode(index-1);
			addAfter(q, item);
		}
	}

	public T remove(int index) {  // delete
		if(index < 0 || index >= size)
			return null;
		if(index == 0)
			return removeFirst();
		Node<T> prev = getNode(index-1);
		return removeAfter(prev);
	}
	
	public T remove(T item) {
		Node<T> p = head, q = null;
		while(p != null && p.data.equals(item)) {
			q = p;
			p = p.next;
		}
		
		if(p == null)
			return null;
		
		if(q == null)
			return removeFirst();
		else
			return removeAfter(q);
	}
	
	public int size() {
		return size;
	}

	public static void main(String[] args) {

		MySingleLinkedList<String> list = new MySingleLinkedList<>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Saturday");  // M, S, F
		list.add(2, "Tuesday");  // M, S, T, F
		
		String str = list.get(2);  // str = "Tuesday"
		list.remove(2);    // M, S, F
		int pos = list.indexOf("Friday");  // pos = 2
	}

}
