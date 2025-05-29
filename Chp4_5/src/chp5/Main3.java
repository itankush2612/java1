package chp5;


class Rbi {
	float getRateOfInstrest() {
		return 0.0f;
	}
}

class Sbi extends Rbi {
	@Override
	float getRateOfInstrest() {
		return 8.4f;
	}
}

class ICICI extends Rbi {
	@Override
	float getRateOfInstrest() {
		return 8.5f;
	}
}

class Kotak extends Rbi {
	@Override
	float getRateOfInstrest() {
		return 8.3f;
	}
}

public class Main3 {
	public static void main(String[] args) {
		Rbi rbi;
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInstrest());
		rbi = new Sbi();
		System.out.println(rbi.getRateOfInstrest());
		rbi = new Kotak();
		System.out.println(rbi.getRateOfInstrest());
	}
}

