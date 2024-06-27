package ConstructorPackage;

public class Person {
	String name;
	int id;
	Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	

}
