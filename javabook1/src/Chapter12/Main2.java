package Chapter12;



import java.util.Stack;



public class Main2 {
	public static void main(String[] args) {
		Emp1 emp=new Emp1(10, "Rajan", 1000000);
		Emp1 emp1=new Emp1(11, "Tom", 250000);
		Emp1 emp2=new Emp1(12, "Jerry", 300000);
		Emp1 emp3=new Emp1(13, "Harry", 150000);
		
		Stack<Emp1> stack=new Stack<Emp1>();
		stack.add(emp);
		stack.add(emp1);
		stack.add(emp2);
		stack.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.push(stack);
		imp.showData();
		
		imp.pop();
		imp.showData();

		
		System.out.println("--------------------------------");
		imp.peek();
		
		
	    
	}
	

}
