package day12;

class AClass2 { 	// x ,add()
	int x;
	void add() {
		System.out.println("AAA");
	}
}
class BClass2 extends AClass2{ // x, y, add() , @add(), func(),
	int y;
	void add() {	// 오버라이딩
		System.out.println("BBB");
	}
	void func() {
		System.out.println("subsub");
	}
}

public class ClassEx09 {

	public static void main(String[] args) {
		/*
		AClass2 a = new AClass2(); 		// 기본 객체 생성
		AClass2 b = new BClass2();		// 다형성 객체 생성
		
		a.add();
		System.out.println("---------");
		b.add();
		// a 	[x,		add("AAA")] 
		// a2 	[x,y,	 @add("BBB"),	func()]
//				 A(O)B(x)    A@B(@B)	 B(x)		이 실행가능하다.
		
		AClass2 aa = null;
		BClass2 bb = new BClass2();
		aa= (AClass2)bb;	//	AClass2 c = new BClass2();
		aa.add();
		System.out.println(aa.x);
		
		AClass2 aaa = new AClass2();
		BClass2 bbb = null;
		bbb = (BClass2)aaa;		// 컴파일은 되지만 실행할때 에러!! (Runtime 에러)
		// BClass2 bbb = new AClass2();		부모객체는 자식변수가 담을 수 없다.!!!
		*/
		AClass2 aaaa = null;
		BClass2 bbbb = new BClass2();
		BClass2 bbbb2 = null;
		
		aaaa = (AClass2)bbbb;		//	다형 upcasting : 형변환 "생략가능"
		
		// 참조형의 형변환
		// bbbb2가 실제 들고있는 개체가 BClass2의 객체면 true
		//	-> aaaa 들고있는 실제 객체가 BClass2의 객체라면 형변환해라~~
		if(aaaa instanceof BClass2) {		 // 검사하고 형변환
			System.out.println("형변환");
			bbbb2 = (BClass2)aaaa;			//	다형성 downcasting : 형변환 "필수"
		}
		System.out.println("End");
//		aaaa.add();
//		bbbb.add();
//		bbbb2.add();
		
		AClass2 aaaaa = new BClass2();
		Object obj = new BClass();
		
		Object obj2 = new AClass();
		
		
		
	}

}
