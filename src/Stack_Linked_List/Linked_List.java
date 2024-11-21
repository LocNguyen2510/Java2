package Stack_Linked_List;

public class Linked_List<T> {
	private Node1<T> head;

	public Linked_List() {
		this.head = null;
	}

	public void traverse() {
		Node1<T> tmp = head;
		while (tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
	}

//Thêm node vào đầu danh sách
	public void addFirst(T item) {
//		Node<T> newNode = new Node<>(item, this.head); cách 1
//		cách2
		Node1<T> newNode = new Node1<>();
		newNode.setData(item);
		newNode.setNext(this.head);
		this.head = newNode;
	}

//	Thêm node vào cuối danh sách
	public void addLast(T item) {
		if (head == null) {
			addFirst(item);
		} else {
			Node1<T> newNode = new Node1<>(item, null);
			Node1<T> tmp = head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(newNode);
		}
	}

	public void insertAfter(T key, T toInsert) {

		Node1<T> tmp = head;

		while (tmp != null && tmp.getData().equals(key)) {
			tmp = tmp.getNext();
		}
		if (tmp != null) {
//			cách 1
//			Node1<T> newNode1 = new Node1<>();
//			newNode.setData(toInsert);
//			newNode.setNext(tmp.getNext());
//			cách 2
			Node1<T> newNode = new Node1<>(toInsert, tmp.getNext());
			tmp.setNext(newNode);
		}
	}

	public boolean remove(T key) {
		if (head == null)
			return false;

		if (head.getData().equals(key)) {
			this.head = head.getNext();
			return true;
		}
		Node1<T> prep = null;
		Node1<T> cur = head;
		while (cur != null && !cur.getData().equals(key)) {
			prep = cur;
			cur = cur.getNext();
		}
		if (cur == null)
			return false;
		prep.setNext(cur.getNext());
		return true;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		int count = 0;
		Node1<T> tmp = head;
		while (tmp != null) {
			count++;
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
		return count;
	}

}
