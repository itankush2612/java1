package chp5q6c;



class A {
	int a = 10;

	void show() {
		System.out.println(a);
	}
}

class B extends A {
	@Override
	void show() {
		System.out.println(a);
		// super.show();
	}
}

public class Simple {
	public static void main(String[] args) {
		B b = new B();
		b.show();
	}
}
