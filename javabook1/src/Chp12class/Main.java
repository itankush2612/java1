package Chp12class;

// collection

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		EmpPojo empPojo = new EmpPojo(1, "shravan", "Dahisar");
		EmpPojo empPojo1 = new EmpPojo(2, "sahil", "borivali");
		EmpPojo empPojo2 = new EmpPojo(3, "ashish", "bhyander");
		EmpPojo empPojo3 = new EmpPojo(4, "gaurav", "malad");
		EmpPojo empPojo4 = new EmpPojo(5, "kaif", "kandivali");

		List<EmpPojo> empPojos = new ArrayList<EmpPojo>();
		empPojos.add(empPojo);
		empPojos.add(empPojo1);
		empPojos.add(empPojo2);
		empPojos.add(empPojo3);
		empPojos.add(empPojo4);

		OperationImp imp = new OperationImp();
		imp.insertData(empPojos);
		imp.showData();
		System.out.println("--------------------------------");
		imp.updateData(13, "Ben");
		imp.showData();
		System.out.println("--------------------------------");
		imp.deleteData(12);
		imp.showData();
		System.out.println("----------------------------------------");
		imp.searchData(10);

	}
}
