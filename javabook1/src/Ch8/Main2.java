package Ch8;// Exception propogation

class test {
	void m() {
		int a = 10 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Propogated");
		}

	}
}

public class Main2 {
	public static void main(String[] args) {
		test test = new test();
		test.p();
		System.out.println("Continued code");
	}
}