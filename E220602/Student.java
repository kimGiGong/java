package E220602;

public class Student extends Person{
	Student(String id, String name,String ban) {
		super(id, name);
		this.ban=ban;
	}
	private String ban;
	public String banget(){
		return this.ban;
	}
	public void banset(String ban){
		this.ban=ban;
	}
	@Override
	public String print() {
		return super.print()+"	(반)"+ban;
	}	
	public static void main(String[] args) {

	}

}
