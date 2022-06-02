package E220602;

public class Customer1 {
	Customer1(String name, String phone, String address) {
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
	String name,phone,address;
	
	String print() {
		return name+"	"+phone+"	"+address;
	}

}
