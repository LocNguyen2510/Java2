package Linked_List_Singly_Review_Knowledge;

public class Test {
	public static void main(String[] args) {

		Linked_List<String> lls = new Linked_List<>();
		lls.addFirstList("Nguyen Dinh Loc");
		lls.addFirstList("Tran Dinh Long");
		lls.addFirstList("Nguyen Minh Loc");
		lls.traverse();
		System.out.println("\nSau khi add last: ");
		lls.addLastList("Trinh Dinh Quang");
		lls.traverse();
		System.out.println("Sau khi xóa");
		lls.removeList("Nguyen Minh Loc");
		lls.traverse();
	}
}
