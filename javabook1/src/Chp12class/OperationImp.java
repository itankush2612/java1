package Chp12class;
//collection
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationImp implements Operations {
	List<EmpPojo> db =new ArrayList<EmpPojo>();

	@Override
	public void insertData(List<EmpPojo> empPojos) {
		db.addAll(empPojos);
		System.out.println("Data inserted");
	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				iterator.remove();
				System.out.println("Data Deleted");
			}

		}
	}

	@Override
	public void updateData(int id, String name) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				empPojo.setName(name);
				System.out.println("Data updated");
			}

		}
	}

	@Override
	public void searchData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				System.out.println("Data found");
				System.out.println(empPojo);
			}

		}
	}

	@Override
	public void showData() {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
		}

	}

}
