package Linked_List_Singly;

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
}
