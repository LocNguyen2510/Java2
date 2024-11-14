package Linked_List_QLiSinhVien;

public class Test {
	public static void main(String[] args) {
		StudentMS ms = new StudentMS();
		Student s1 = new Student("ms01", "Nguyen Dinh Loc", 24, 3.21f);
		Student s2 = new Student("ms02", "Nguyen Minh Loc", 21, 3.1f);
		Student s3 = new Student("ms03", "Nguyen Quang Minh", 25, 2.21f);
		Student s4 = new Student("ms04", "Nguyen Hung Thong", 27, 3.6f);
		ms.addStudent(s1);
		ms.addStudent(s2);
		ms.addStudent(s3);
		ms.addStudent(s4);
		ms.printList();
		Student s5 = new Student("ms04", "Nguyen Hung Thong", 27, 3.6f);
		System.out.println(ms.findStudent(s5));
		Student s6 = new Student("ms02", "Nguyen Dong Gia", 22, 1.6f);
		ms.updateStudent(s6);
		System.out.println("Sau khi cập nhật: ms02 ");
		ms.printList();
	}
}
