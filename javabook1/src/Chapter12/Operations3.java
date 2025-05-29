package Chapter12;


//vector


import java.util.Vector;

public interface Operations3 {
    void insertData(Vector<Emp> emp);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();

	

	
}
