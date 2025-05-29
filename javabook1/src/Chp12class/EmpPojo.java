package Chp12class;

//collection

public class EmpPojo {
	private int id;
	private String name;
	private String addrrss;

	public EmpPojo(int id, String name, String addrrss) {
		super();
		this.id = id;
		this.name = name;
		this.addrrss = addrrss;
	}

	@Override
	public String toString() {
		return "EmpPoja [id=" + id + ", name=" + name + ", addrrss=" + addrrss + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrrss() {
		return addrrss;
	}

	public void setAddrrss(String addrrss) {
		this.addrrss = addrrss;
	}

	public static void main(String[] args) {

	}
}
