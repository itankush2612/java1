package q1;


interface Policy {
	String policy1();

	String policy2();

	String policy3();

}

abstract class Comp {

	abstract double Sal(double sal);

	void Test() {
		System.out.println("Non Abstract Method ");
	}

}

class Emp extends Comp implements Policy {

	@Override
	public String policy1() {
		return "policy1";
	}

	@Override
	public String policy2() {
		return "policy2";
	}

	@Override
	public String policy3() {
		return "policy3";
	}

	@Override
	double Sal(double sal) {
		return sal;
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.policy1());
		System.out.println(emp.policy2());
		System.out.println(emp.policy3());
		System.out.println(emp.Sal(12500));

	}
}

