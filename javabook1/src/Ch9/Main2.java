package Ch9;
class Name {
	String fname;
	String lname;

	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}

}

class Address {
	String bldgname;
	String Wing;
	int flatno;

	public Address(String bldgname, String wing, int flatno) {
		super();
		this.bldgname = bldgname;
		Wing = wing;
		this.flatno = flatno;
	}

	@Override
	public String toString() {
		return "Address [bldgname=" + bldgname + ", Wing=" + Wing + ", flatno=" + flatno + "]";
	}
}

class Sal {
	double sal;

	public Sal(double sal) {
		super();
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "sal [sal=" + sal + "]";
	}
}

class Emp {
	Name name;
	Address address;
	Sal sal;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + ", sal=" + sal + "]";
	}

	public Emp(Name name, Address address, Sal sal) {
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
}

public class Main2 {

	public static void main(String[] args) {
//		Name name = new Name("Shravan","Gupta");
//		Address address = new Address("Om Kalyani", "A", 112);
//		Sal sal = new Sal(12500);
//		Emp emp =new Emp(name, address, sal);
		
		Emp emp = new Emp(new Name("Shravan", "Gupta"), new Address("Om Kalyani", "A", 112), new Sal(12500));
		System.out.println(emp);
	}
}
