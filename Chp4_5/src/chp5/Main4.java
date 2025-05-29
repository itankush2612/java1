package chp5;


class Emp {

	void display(int a) {
		System.out.println(a);
	}

	void display(String a) {
		System.out.println(a);
	}

	void display(int a, int b) {
		System.out.println("Sum:" + (a + b));
	}

	void display(String a, String b) {
		System.out.println("Name :" + (a + b));
	}
}

class Emp2 extends Emp {
	@Override
	void display(int a, int b) {
		System.out.println("Subtraction:" + (a - b));

	}
}

public class Main4 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Emp2 emp2 = new Emp2();
		emp.display(10);
		emp.display("Shravan");
		emp.display(10, 20);
		emp.display("Shravan", " Gupta");
		emp2.display(20);
		emp2.display(20, 10);
	}
}
