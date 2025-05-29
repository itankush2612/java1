package Ch8;// Multi Catch

public class Main5 {

	public static void main(String[] args) {
		try {
			int i[] = new int[5];
			i[5] = 30 / 0;
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("HELLOOOOOOOOOO!!!!!!!!");
	}
}
