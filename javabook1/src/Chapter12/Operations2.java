package Chapter12;

import java.util.TreeSet;


public interface Operations2 {
    void insertData(TreeSet<Emp> emp);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();
}
