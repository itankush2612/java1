package Ch9; //Static Inner Class

import Ch9.Outer.Inner;


class Outer2 {
	
	private static int a = 10;

	static class Inner {
		static void innerMeth() {
			System.out.println(a);
		}
	}
}

public class Main4 {
	public static void main(String[] args) {
	//	Outer1 outer = new Outer1();
	// Outer.Inner inner = new Outer.Inner();
		Outer2.Inner.innerMeth();
		Inner.innerMeth();
	}
}
