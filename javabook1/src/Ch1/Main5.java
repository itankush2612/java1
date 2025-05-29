package Ch1;


class Empp{
	void sal(double income, double incen) {
		System.out.println(income + incen);
	}
}

class Mgr extends Empp {
	@Override
	void sal(double income, double incen) {
		System.out.println(income + (2 * incen));
	}
}

public class Main5 {
	public static void main(String[] args) {
		Empp emp = new Empp();
		emp.sal(120000, 200);
		Mgr m1 = new Mgr();
		m1.sal(150000, 300);
	}
}
