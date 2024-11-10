package Linked_List_Singly_Review_Knowledge;

public class Linked_List<T> {
	private Node<T> head;

	public Linked_List() {
		this.head = null;
	}

//duyệt từng phần tử
	public void traverse() {
//		gán tmp lên giá trị đầu head (tmp[0])
		Node<T> tmp = head;
//		vòng lặp nếu tmp khác null (vẫn sẽ chạy cho đến khi không còn giá trị)
		while (tmp != null) {
//			in ra dữ liệu với getdata
			System.out.println(tmp.getData());
//			next giá trị tiếp theo để thực hiện tiếp vòng lặp while tmp[0] -> tmp[1]
			tmp = tmp.getNext();
		}
	}

	public void addFirstList(T item) {

	}
}
