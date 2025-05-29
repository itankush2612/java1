package chp4;

class Emp2 {
	String name;
	int id;

	public Emp2(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Emp2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Emp2 emp2 = new Emp2();				
		Emp2 emp3 = new Emp2();
		emp2=null;
		System.out.println(emp2);
		System.out.println(emp3);
		System.gc();
		System.out.println(emp3);

	}
}