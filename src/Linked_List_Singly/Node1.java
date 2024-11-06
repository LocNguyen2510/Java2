package Linked_List_Singly;

public class Node1<T> {
	private T data;
	private Node1<T> next;

	public Node1() {

	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node1<T> getNext() {
		return next;
	}

	public void setNext(Node1<T> next) {
		this.next = next;
	}

	public Node1(T data, Node1<T> next) {
		this.data = data;
		this.next = next;
	}
}
