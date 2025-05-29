package chp5q5;

class A {
	int a = 10;

	void sum() {
		System.out.println(a);
	}
}

class B extends A {
	@Override
	void sum() {
		System.out.println(super.a);
		super.sum();
	}
}

public class Main {
	public static void main(String[] args) {
		B b = new B();
		b.sum();

	}
}
