package Ch8;//Finallly Block

public class Main3 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("Finallly Block ");
		}
		System.out.println("Code Outside the Exception ");
	}
}
