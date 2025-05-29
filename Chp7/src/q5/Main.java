package q5;



class Emp {
	void show() {
		System.out.println("Shravan");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Emp emp2 = new Emp();
		emp.show();
		emp2.show();
		emp2 = null;
		System.gc();
		emp2.show();// Cannot Display As Object is deleted 

	}
}

