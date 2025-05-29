package Chapter12;


import java.util.TreeSet;


public class Main3 {
	public static void main(String[] args) {
		Emp2 emp=new Emp2(10, "Rajan", 1000000);
		Emp2 emp1=new  Emp2(10, "Rajan", 1000000);
		Emp2 emp2=new Emp2(12, "Jerry", 300000);
		Emp2 emp3=new Emp2(13, "Harry", 150000);
		
		TreeSet<Emp2> treeSet=new TreeSet<Emp2>();
		treeSet.add(emp);
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		
		OperationsImp1 imp=new OperationsImp1();
		imp.insertData(treeSet);
		imp.showData();
		System.out.println("---------------------------------");
	    imp.updateData(13, "Kary");
	    imp.showData();
	    System.out.println("--------------------------------");
	    imp.deleteData(12);
	    imp.showData();
	    System.out.println("----------------------------------------");
	    imp.searchData(10);
	    
	}
	

}
