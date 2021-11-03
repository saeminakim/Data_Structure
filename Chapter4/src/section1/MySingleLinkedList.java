package section1;

public class MySingleLinkedList<T> {
	
	public Node<T> head; // 첫번째 노드의 주소
	public int size;
	
	public MySingleLinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(T item) {
		Node<T> newNode = new Node<T>(item);		
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void addAfter(Node<T> before, T item) {
		Node<T> temp = new Node<T>(item);
		temp.next = before.next;
		before.next = temp;
		size++;
	}
	
	public T removeFirst() {
		if(head == null)
			return null;
		
		T tmp = head.data;
		head = head.next;
		size--;
		
		return tmp;
	}
	
	public T removeAfter(Node<T> before) {
		if(before.next == null)
			return null;
		
		T tmp = before.next.data;
		before.next = before.next.next;
		size--;
		
		return tmp;
	}
	
	public void add(int index, T item) {  // insert
		
	}
	
	public void remove(int index) {  // delete
		
	}
	
	public T get(int index) {
		return null;
	}
	
	public int indexOf(T item) {  // search
		
		return 0;
	}
	
	public static void main(String[] args) {

	}

}
