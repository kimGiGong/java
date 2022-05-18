package day11;
/*
final class SuperClass{
}
class SubClass extends SuperClass {
}
class Test extends Math{
}
*/
class SuperClass{
	void add() {System.out.println("AAAA");}
}
class SubClass extends SuperClass {	//	add()
	void add() {
		System.out.println("BBBB");
		System.out.println("BBBB");
	}
}


class Test {
	
	//	명시적으로 초기화를 한 경우 그대로 사용
	final static int x = 10;		// 클래스 상수
	final int y = 20;				// 인스턴스 상수
	
//		명시적 초기화를 하지 않고 생성자에서 값대입 하는 것은 가능
//		-> 해당 객체 안에서는 객체 생성시 던져준 값을 x에 넣고 상수로 값변경없이
//		고정값으로 사용하고 싶은데
//		그 값이 객체마다 조금 달라져야하는 경우
	
	final int z;
	Test(int a){
		this.z = a;
	}
	
}
	
public class ClassEx03 {

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.add();
		
		System.out.println(Test.x);
//		Test.x = 100;		값변경 불가능
//		Test t = new Test();
//		t.y = 200;			값변경 불가능
		Test z = new Test(50);
		System.out.println(z.z);
	}

}
