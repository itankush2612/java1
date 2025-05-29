package q6;



public class Main {
	String name;
	int id;
	double sal;
	String address;

	public Main(String name, int id, double sal, String address) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Main [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Main main = new Main("Shravan", 111, 1500000, "Dahisar");
		System.out.println(main);
	}
}

