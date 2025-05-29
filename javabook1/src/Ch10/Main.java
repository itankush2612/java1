package Ch10;

public class Main {

	public static void main(String[] args) {
		String s1 = "Shravan";
		String s2 = "Gupta";
		String s3 = "    Shravan   Gupta        ";
		int a = 10;
		System.out.println(s1.length());// Q2
		System.out.println(s1.compareTo(s2));// Q2
		System.out.println(s1.concat(" " + s2));// Q3
		System.out.println(s3.trim());// Q4
		System.out.println(s3.trim().replace("a", "i"));// Q5
		String s4 = String.valueOf(a);// Q6
		System.out.println(s4);// Q6
		System.out.println();
	}

}

