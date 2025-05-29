package Chp12class;

//Vector

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;



public class Main1 {
	public static void main(String[] args) {

		Emp1Pojo empPojo = new Emp1Pojo(1, "shravan", "Dahisar");
		Emp1Pojo empPojo1 = new Emp1Pojo(2, "sahil", "borivali");
		Emp1Pojo empPojo2 = new Emp1Pojo(3, "ashish", "bhyander");
		Emp1Pojo empPojo3 = new Emp1Pojo(4, "gaurav", "malad");
		Emp1Pojo empPojo4 = new Emp1Pojo(5, "kaif", "kandivali");

		List<Emp1Pojo> empPojos = new Vector<Emp1Pojo>();
		empPojos.add(empPojo);
		empPojos.add(empPojo1);
		empPojos.add(empPojo2);
		empPojos.add(empPojo3);
		empPojos.add(empPojo4);
		
		OperationsImp imp = new OperationsImp();
		imp.updateData(1, "Shravan");
		imp.showData();

		
		
		
	}
}