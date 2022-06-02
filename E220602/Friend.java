package E220602;


public class Friend {
	
	Friend(String name, String phone,String birthday){
		this.name=name;
		this.phone=phone;
		this.birthday = birthday;
	}
	public String getphon(){
		return phone;
	}
	private String name,phone,birthday;
	
	@Override
	public String toString() {
		return "이 름 : "+name+"\n핸드폰 : "+phone+"\n생 일 : "+birthday;
	}
	
}