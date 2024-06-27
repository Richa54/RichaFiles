package ConstructorPackage;

public class Address {
  String State;
  String City;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String state, String city) {
	super();
	State = state;
	City = city;
}
@Override
public String toString() {
	return "Address [State=" + State + ", City=" + City + "]";
}
  
  
}
