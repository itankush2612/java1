package chp11;


class Emp {
	String name;
	int id;
	double sal;

	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("Ashish", 1020, 2500000);
		System.out.println(emp.getClass().getFields());
		System.out.println(emp.getClass().getMethods());
		System.out.println(emp.getClass().getConstructors());
	}
}
