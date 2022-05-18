package day08;

class Test {		// 메모리가 누가 먼저 할당되는냐가 중요*
	
	//	int y=20;
	//	static int x= y;	// y가 아직 만들어지기 전에 x를 만들고 있다.
	//	y가 뭔가요??? 불가능!!
	
	int y = x;					//	메모리 로딩순서 
	static int x =100;			//	클래스 -> static -> main -> new
	
}

public class Test63 {
	
	static int a = 100;
	int i = 20;
	
	

	public static void main(String[] args) {
		
		//	클래스 변수 	클래스명.변수명
		System.out.println(Test.x);
		//	인스턴스 변수	객체생성(클래스명 객체명)(메모리 할당)	객체명.변수명
		Test t = new Test();
		System.out.println(t.y);
		
		System.out.println(Test63.a);
		
		Test63 test = new Test63();
		System.out.println(test.i);
	
		//	1회용으로 변수 출력만 하고 말것이다.
		System.out.println(new Test63().i);
		int abc = new Test63().i;
		
	}

}
