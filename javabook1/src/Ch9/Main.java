package Ch9;
interface A {
	void A();
}

abstract class B {
	abstract void B();
}

class C {
	void C() {

	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A() {

			@Override
			public void A() {
				System.out.println("Anonymous Inner Class : Interface");
			}

		};
 B b = new B() {
	 @Override
	void B() {
		System.out.println("Anonymous Inner Class: Abstract");
		C  c = new C () {
			@Override
			void C() {
			System.out.println("Anonymous Inner Class: Default ");
			}
		};
	}
 };
	}
}
