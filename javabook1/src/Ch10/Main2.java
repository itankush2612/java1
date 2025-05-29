package Ch10;


public class Main2 {
	public static void main(String[] args) {
		int a = 10;
		Integer integer = new Integer(a);
		System.out.println(integer);
		Integer b = a;
		System.out.println(b);
		int c = b.intValue();
		System.out.println(c);
		int c1 = b;
		System.out.println(c1);

	}

}
