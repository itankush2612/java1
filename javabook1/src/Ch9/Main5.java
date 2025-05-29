package Ch9;//Local Inner Class

class Outer1 {
	void outerMeth() {
		class Inner {
			void innerMeth() {
				System.out.println("Local Inner Class");
			}

		}
		Inner inner = new Inner();
		inner.innerMeth();
	}
}

public class Main5 {
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.outerMeth();
	}
}
