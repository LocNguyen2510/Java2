package Linked_List_QLiSinhVien;

public class Linked_List<T> {
	private Node<T> head;

	public Linked_List() {
		this.head = null;
	}

//Thêm node vào đầu danh sách
	public void addFirst(T item) {
//		Node<T> newNode = new Node<>(item, this.head); cách 1
//		cách2
		Node<T> newNode = new Node<>();
		newNode.setData(item);
		newNode.setNext(this.head);
		this.head = newNode;
	}

//	Thêm node vào cuối danh sách
	public void addLast(T item) {
		if (head == null) {
			addFirst(item);
		} else {
			Node<T> newNode = new Node<>(item, null);
			Node<T> tmp = head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(newNode);
		}
	}

	public void insertAfter(T key, T toInsert) {

		Node<T> tmp = head;

		while (tmp != null && tmp.getData().equals(key)) {
			tmp = tmp.getNext();
		}
		if (tmp != null) {
//			cách 1
			Node<T> newNode = new Node<>();
			newNode.setData(toInsert);
			newNode.setNext(tmp.getNext());
//			cách 2
//			Node<T> newNode = new Node<>(toInsert, tmp.getNext());
			tmp.setNext(newNode);
		}
	}

	public void print() {
		Node<T> tmp = head;
		while (tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
	}

	public boolean remove(T key) {
		if (head == null)
			return false;

		if (head.getData().equals(key)) {
			this.head = head.getNext();
			return true;
		}
		Node<T> prep = null;
		Node<T> cur = head;
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
		Node<T> tmp = head;
		while (tmp != null) {
			count++;
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
		return count;
	}

}
