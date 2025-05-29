package Ch8;///User Defined

class Lowbalance extends Exception {
	public Lowbalance() {
		super("LowBalance");
	}
}

class Balance {
	double amt = 2000;

	void checkBal(double amt) throws Exception {
		if (amt > this.amt) {
			double a = amt - this.amt;
			System.out.println(a);
		} else {
			throw new Lowbalance();
		}
	}

}

public class Main4 {
	public static void main(String[] args) {
		try {
			Balance balance = new Balance();
			balance.checkBal(5000);
		} catch (Exception e) {
			System.out.println("Maintain Minimum Balance :" + e);
		}
	}
}
