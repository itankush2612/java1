package Chp12class;
// collection

import java.util.List;

public interface Operations {
	void insertData(List<EmpPojo> empPojos);

	void deleteData(int id);

	void updateData(int id, String name);

	void searchData(int id);

	void showData();
}
