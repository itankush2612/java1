package q5;

class College {
	public String name = "Shravan";
	static int clgcode;

	static void Enter(int clgcode) {
		if (clgcode == 2051) {
			System.out.println("Allow Student");
		} else {
			System.out.println("Dont Allow");
		}
	}

	void display(int clgcode) {
		String course = "Bms";
		//this.clgcode=clgcode;
		System.out.println(name);
		System.out.println(clgcode);
		System.out.println(course);
	}
}

public class Main4{
	public static void main(String[] args) {
		College college = new College();
		College.Enter(2052);
		college.display(2051);

	}
}
