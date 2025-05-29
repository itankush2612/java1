package chp5q6b;



class M {

	void show() {
		System.out.println("Parent Class A");
	}
}

class N extends M {
	@Override
	void show() {
		super.show();
		System.out.println("Chlid class B");
	}

	void show1() {
		System.out.println("Parent  Class B");
	}
}

class O extends N {
    @Override
    void show() {
        super.show1();  // Calls B's show()
        System.out.println("Child Class C");
    }
}


public class Multilevel {
	public static void main(String[] args) {
		N n = new N();
		n.show();
		O o = new O();
		o.show();
	}
}
