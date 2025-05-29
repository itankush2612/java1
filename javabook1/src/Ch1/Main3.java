package Ch1;


class Uses {
	public double rate1 = 1234;
	private String type = "Confidential";
	protected int id = 123;
	String oper = "A";

	public String getType() {
		return type;
	}

}

public class Main3 extends Uses {
	public static void main(String[] args) {
		Uses uses = new Uses();
		Main main = new Main();
		System.out.println(uses.rate1);// Public
		System.out.println(uses.id);// Protected
		System.out.println(uses.oper);// Default
		System.out.println(uses.getType());

	}

}
