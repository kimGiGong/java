package E220602;

public class Person {
	Person(String id,String name){
		this.id=id;
		this.name=name;
	}
	private String id, name ;
	String getid() {
		return this.id;
	}
	public String getname() {
		return this.name;
	}
	public void setid(String id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String print() {
		return "(ID)"+id+"	(이름)"+name;
	}
	public static void main(String[] args) {
		
		
	}

}
