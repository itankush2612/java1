package Ch1;

class Emp {
	String name;
	int id;
	double sal;
	String address;

	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
	}

	 Emp() {
		
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.display();
		System.out.println(emp);
	}
}