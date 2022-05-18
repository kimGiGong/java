package day12;

//추상클래스
abstract class SuperClass {
//	추상 메소드
	abstract void add();	//	선언부, 헤드
	/*
	void add(){
		구현부, 바디
	}
	*/
//	 일반 멤버들도 같이 포함 가능
	int a =10;
	void aaaa() {
		//.........
	}
}
class SubClass extends SuperClass{

	@Override
	void add() {

		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
		
	}
	
}


public class ClassEx14 {

	public static void main(String[] args) {
		
//		SuperClass s = new SuperClass();
		
		SubClass sub = new SubClass();
		sub.add();
	}

}
