package q2;

class Student{
	int id;
	String name;
	
	void displayInfo() {
		
		System.out.println(id);
		System.out.println(name);
	}
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
}




public class Main1 {
public static void main(String[] args) {
	Student student =new Student(1, "bob");
	student.displayInfo();
	
}

}
