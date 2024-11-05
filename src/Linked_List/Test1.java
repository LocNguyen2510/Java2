package Linked_List;

public class Test1 {
	public static void main(String[] args) {
		Person1 p1 = new Person1("Nguyen Dinh Sourt ", "Da Nang");
		Person1 p2 = new Person1("Nguyen Dinh Minh ", "Quang Binh");
		Person1 p3 = new Person1("Nguyen Dinh Phuc", "Hoi An");
		Person1 p4 = new Person1("Nguyen Dinh Vu", "Quy Nhon");
		Node<Person1> node1 = new Node<>();
		node1.setData(p1);
		Node<Person1> node2 = new Node<>();
		node2.setData(p2);
		Node<Person1> node3 = new Node<>();
		node3.setData(p3);
		Node<Person1> node4 = new Node<>();
		node4.setData(p4);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		Node<Person1> head = node1;
		while (true) {
			System.out.println(head.getData());
			head = head.getNext();
			if (head == null) {
				break;
			}
		}
	}
}
