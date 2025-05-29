package Chp12class;

// Vector

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class OperationsImp implements Operation {
	List<EmpPojo> db = new Vector<EmpPojo>();

	@Override
	public void insertData(List<EmpPojo> empPojos) {
		db.addAll(empPojos);
		System.out.println("Data Inserted");
	}

	@Override
	public void deleteData(int id) {
		Enumeration<EmpPojo> enumeration = (Enumeration<EmpPojo>) db.iterator();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();

		}
	}

	@Override
	public void updateData(int id, String name) {
		Enumeration<EmpPojo> enumeration = (Enumeration<EmpPojo>) db.iterator();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			if (empPojo.getId() == id) {
				empPojo.setName(name);
				System.out.println("Data Updated");
			}
		}
	}

	@Override
	public void searchData(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showData() {
		Enumeration<EmpPojo> enumeration = (Enumeration<EmpPojo>) db.iterator();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			System.out.println(empPojo);
		}
	}
}
