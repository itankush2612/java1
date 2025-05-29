package Ch12;


import java.util.LinkedList;
import java.util.List;

public interface Operation1 {
    void insertData(LinkedList<Emp> emp);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();
}
