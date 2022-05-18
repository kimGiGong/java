package day12;

// 인터페이스 !!! (class 로 만들지 않는다)
interface Test {
	public static final int NUM = 1;	//	상수
	public abstract void add();			//	추상메소드
	
//	int x = 100;			//	상수 : public static final 생략
//	void sub ();			//	추상 메소드 : public abstract 생략
}

interface Test2 {
	void func();
}

class Hello {
	int xxx= 10;
}


//	인터페이스를 구현한 클!래!스!
class Inter extends Hello implements Test,Test2 {	// 상속과 구현 둘다 쌉가능
//	NUM, @add() , @func , || xxx
	@Override
	public void add() {
		System.out.println("impl!!!");
	}

	@Override
	public void func() {
		System.out.println("func func");		
	}
	
}





public class ClassEx16 {

	public static void main(String[] args) {
		
//		구현한 클래스로 객체 생성
		Inter i = new Inter();
		i.add();
		i.func();
		
		// 다형성 : 인터페이스가 부모격
		Test t = new Inter();
		t.add();
		Test2 tt = new Inter();
		tt.func();
		Hello h = new Inter();
		h.xxx = 200;
	}

}
