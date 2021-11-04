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

	public Node<T> getNode(int index){
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

	public static void main(String[] args) {

	}

}
