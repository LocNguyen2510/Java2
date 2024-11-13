package Linked_List_QLiSinhVien;

import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private int age;
	private float gpa;

	public Student() {

	}

	public Student(String id, String name, int age, float gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gpa, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Float.floatToIntBits(gpa) == Float.floatToIntBits(other.gpa)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

}
