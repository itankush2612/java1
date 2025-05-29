package Chapter12;

//vector



import java.util.Vector;



public class Main4 {
  public static void main(String[] args) {
	  Emp3 emp=new Emp3(10, "Rajan", 1000000);
		Emp3 emp1=new Emp3(11, "Tom", 250000);
		Emp3 emp2=new Emp3(12, "Jerry", 300000);
		Emp3 emp3=new Emp3(13, "Harry", 150000);
		
		Vector<Emp3> vector=new Vector<Emp3>();
		vector.add(emp);
		vector.add(emp1);
		vector.add(emp2);
		vector.add(emp3);
		
		OperationImp3 imp=new OperationImp3();
		imp.insertData(vector);
		imp.showData();
		System.out.println(".....................................");
		imp.updateData(10, "Kary");
		imp.showData();
		System.out.println("......................................");
		imp.deleteData(10);
		imp.showData();
		System.out.println("......................................");
		imp.searchData(11);
		
		
		
		
}
}
