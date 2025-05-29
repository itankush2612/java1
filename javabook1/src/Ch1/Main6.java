package Ch1;

class Address {
	String areaname;
	String city;

	public Address(String areaname, String city) {
		this.areaname = areaname;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", city=" + city + "]";
	}

}

class Hobbies {

}

class Emppp {
	String name;
	int id;
	Address address;
	Hobbies hobbies;

	public Emppp(String name, int id, Address address,Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emppp [name=" + name + ", id=" + id + ", address=" + address  + "]";
	}

}

public class Main6 {
	public static void main(String[] args) {
		Address address = new Address("Dahisar", " Mumbai");
		Emppp emp = new Emppp("Shravan", 112, address,null);
		System.out.println(emp);
	}
}
