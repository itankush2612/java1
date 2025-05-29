package q3;


import java.util.Objects;

class Emp {
	int a = 10;

	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return a == other.a;
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Emp emp2 = new Emp();
		System.out.println(emp.equals(emp2));// returns False before overriding

	}
}
