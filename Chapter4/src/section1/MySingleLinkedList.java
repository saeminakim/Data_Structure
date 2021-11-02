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
