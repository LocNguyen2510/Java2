package Linked_List;

public class Person1 {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public Person1(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", address=" + address + "]";
	}

}
