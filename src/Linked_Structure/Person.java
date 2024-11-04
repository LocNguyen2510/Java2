package Linked_Structure;

public class Person {
	private String name;
	private String address;
	private Person next;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getNext() {
		return next;
	}

	public void setNext(Person next) {
		this.next = next;
	}

}
