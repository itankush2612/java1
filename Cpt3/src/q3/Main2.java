package q3;

class calc{
	int a =10;
	int b=20;
	int c=30;
	
	int add(int a,int b) {
		
		return a+b;
		
	}
	double add(double a, double b) {
		
		return a+b;
	}
	int add (int a,int b ,int c) {
		
		return a+b+c;
	}
	

	@Override
	public String toString() {
		return "calc =[a=" + a +" ,b="  + b + ", c=" + c + "]";
	}  
	
}



public class Main2 {
public static void main(String[] args) {
	calc c1= new calc();
	System.out.println(c1);
	
}
}
