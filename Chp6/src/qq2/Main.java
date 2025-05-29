package qq2;



import Implementor.Emp;
import Implementor.Manager;

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.calSal(12000));
		Manager mgr = new Manager();
		System.out.println(mgr.calSal(18000, 250));

	}
}

