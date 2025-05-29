package Chp12class;

// Vector

import java.util.List;

public interface Operation {
	void insertData(List<EmpPojo> empPojos);

	void deleteData(int id);

	void updateData(int id, String name);

	void searchData(int id);

	void showData();
}
