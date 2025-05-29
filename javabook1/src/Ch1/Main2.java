package Ch1;


class Q2 {
	static int a = 10;
	static int b = 20;
	int c = 20;
	int d = 30;

	static void display() {
		System.out.println(a);
		System.out.println(b);
	}

	void display1() {
		System.out.println(c);
		System.out.println(d);
	}
}

public class Main2 {

	public static void main(String[] args) {
		Q2 q2 = new Q2();
		q2.display1();
		Q2.display();
	}
}