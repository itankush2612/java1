package chp5;



class A {
	final int a = 10;

	final void math() {
		System.out.println(a);
	}
}

final class B  extends A{
//void math() {

//}//Cannot override the math method because it is marked as Final 
}

 //class C extends B{    "B Cannot be extend cause it is marked as final" 
	 
 //}
public class Main {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
	}
}
