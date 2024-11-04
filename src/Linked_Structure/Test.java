package Linked_Structure;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("Nguyen Dinh Loc ", "Da Nang");
		Person p2 = new Person("Nguyen Dinh Minh ", "Quang Binh");
		Person p3 = new Person("Nguyen Dinh Phuc", "Hoi An");
		Person p4 = new Person("Nguyen Dinh Vu", "Quy Nhon");
		p1.setNext(p2);
		p2.setNext(p3);
		p3.setNext(p4);
		Person cur = p1;
		while (true) {
			System.out.println(cur);
			cur = cur.getNext();
			if (cur == null) {
				break;
			}
			;
		}
	}
}
