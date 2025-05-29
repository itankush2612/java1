package Ch12;



import java.util.HashSet;


public class Main4 {
	public static void main(String[] args) {
		Emp emp=new Emp(10, "Shravan", 1000000);
		Emp emp1=new  Emp(10, "Kaif", 1000000);
		Emp emp2=new Emp(12, "Ashish", 300000);
		Emp emp3=new Emp(13, "Tanmay", 150000);
		
		HashSet<Emp> hashSet=new HashSet<Emp>();
		hashSet.add(emp);
		hashSet.add(emp1);
		hashSet.add(emp2);
		hashSet.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(hashSet);
		imp.showData();
		System.out.println("---------------------------------");
	    imp.updateData(13, "Sahil");
	    imp.showData();
	    System.out.println("--------------------------------");
	    imp.deleteData(12);
	    imp.showData();
	    System.out.println("----------------------------------------");
	    imp.searchData(10);
	    
	}
	

}

