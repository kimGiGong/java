package E220602;

public class Staff extends Person{

	Staff(String id, String name,String department) {
		super(id, name);
		this.department=department;
	}

	private String department;
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	@Override
	public String print() {
		return super.print()+"	(부서)"+department;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
