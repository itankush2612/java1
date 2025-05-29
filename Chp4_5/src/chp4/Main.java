package chp4;

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
	String h1;
	String h2;

	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}

	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
}

class Emp {
	String name;
	int id;
	Address address;
	Hobbies hobbies;

	public Emp(String name, int id, Address address, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;//Composition 
		this.hobbies = hobbies;//Aggregation 
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", address=" + address + ", hobbies=" + hobbies + "]";
	}

}

public class Main {
	public static void main(String[] args) {
		Address address = new Address("Dahisar", " Mumbai");
		Hobbies hobbies = new Hobbies("Reading", "Games");
		Emp emp = new Emp("Shravan", 112, address, hobbies);
		System.out.println(emp);
		System.out.println(emp.address);
	}
}

