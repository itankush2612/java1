package q4;

class Emp{
	String name;
	double salary;
	int id;
	
	public Emp(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
		
		
		
	}
	
	
	
	
	
	;
	


public class Main3 {
	public static void main(String[] args) {
		Emp emp= new Emp("tom", 20000, 21);
		System.out.println(emp);
		
	}

}
