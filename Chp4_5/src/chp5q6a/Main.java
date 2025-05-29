package chp5q6a;


class P {

	void show() {
		System.out.println("Parent Class A");
	}
}

class Q extends P {
	@Override
	void show() {
		super.show();
		System.out.println("Chlid class B");
	}

	void show1() {
		System.out.println("Parent  Class B");
	}
}

class R extends P {
	@Override
	void show() {
		super.show();
		System.out.println("Child Class C");
	}
}

public class Main {
	public static void main(String[] args) {
		Q q = new Q();
		q.show();
		R r = new R();
		r.show();
	}
}
