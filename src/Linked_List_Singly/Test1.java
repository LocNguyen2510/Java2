package Linked_List_Singly;

public class Test1 {
	public static void main(String[] args) {
		Linked_List<String> ll = new Linked_List<>();
		ll.addFirst("Nguyen Dinh Loc");
		ll.addFirst("Nguyen Dinh Minh");
		ll.addFirst("Nguyen Dinh Sang");
//		ll.traverse();
		System.out.println("Sau khi add");
		ll.addLast("Nguyen Minh Manh");
		ll.traverse();
	}
}
