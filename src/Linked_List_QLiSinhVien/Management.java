package Linked_List_QLiSinhVien;

import java.util.LinkedList;

public class Management {
	private LinkedList<Student> list;

	public Management() {
		this.list = new LinkedList<Student>();
	}

	public void addStudent(Student st) {
		this.list.addLast(st);
	}

	public void printList() {

	}
}
