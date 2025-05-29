package Ch12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public interface Operations1 {
    void insertData(HashSet<Emp> emp);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();
}
