package Ch12;


public class Emp4 {
	
	private int id;
	private String name;
	private double salary;
	public Emp4(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
