package q7;




import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

class Emp {
	int a;
	int b;
	int c;

	public void Check() {

	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Method method[] = emp.getClass().getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}
		Field field[] = emp.getClass().getFields();
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i]);

		}
		System.out.println();
	}
}

