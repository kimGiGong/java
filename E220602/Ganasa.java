package E220602;

public class Ganasa extends Person {
	
	Ganasa(String id, String name,String subject) {
		super(id, name);
		this.subject=subject;
	}

	private String subject;
	public String getsubject() {
		return subject;
	}
	public void setsubject(String subject) {
		this.subject=subject;
	}
	@Override
	public String print() {
		return super.print()+"	(과목)"+subject;
	}
	
	public static void main(String[] args) {
		

	}

}
