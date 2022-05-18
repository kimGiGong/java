package day08;
/*
 		클래스 기본형 변수 : 클래스명.변수명 : static 키워드 붙음. 메소드 밖
 		클래스 참조형 변수 		
 		
 		인스턴스 기본형 변수 : new로 객체생성한 후 객체명.변수명 : 메소드밖 
 		인스턴스 참조형 변수	
 		
 		지역 기본형 변수 : 변수명 : 메소드안에서 만들어짐, 메소드 끝나면 종료}
 		지역 참조형 변수		자동초기화X
 		
 */
class TvTest {
	boolean power = false;
	int ch=1, vol =0;
}

public class Test64 {
	
	//	 static 붙은건 프로그램 시작시 "한번만" 로딩된다
	static int a;		//	클래스 기본형 Test64.a	: 자동초기화 0	 
	static String s;	//	클래스 참조형 Test64.s	: 자동초기화 null	 
	static TvTest tv ;	//	클래스 참조형 Test64.tv	: 자동초기화 null	 
	static Test64 t =new Test64();		//	클래스 참조형 Test64.t	: 자동초기화 null	 
	
	//
	int x=10; 							//	인스턴스 기본형				자동초기화 0	
	TvTest t1 = new TvTest();							//	인스턴스 참조형				자동초기화 null
	
	//	내 클래스 안에 내 타입으로 인스턴스 객체 생성하며 선언하면 안된다.!!!
	//	메모리 무한 로딩에 빠져버림
	//	Test64 test64 = new Test64();		//	인스턴스 참조형				자동초기화 null
	Test64 test64;			// 선언까지만 가능
	
	
	public static void main(String[] args) {
		
		//	클래스 변수
		System.out.println(Test64.s);
		Test64 test = new Test64();
		System.out.println(test.x);
		
		Test64.a = 100;
		System.out.println(Test64.a);
		Test64.s = "Hello";
		System.out.println(Test64.s);
		
		Test64.tv = new TvTest();			// 	tv는 * TvTest * 타입이므로 기본형과 다르게 ***
											// 	new 객체생성 하는방법 밖에 없다.
		System.out.println(Test64.tv);		//	참조형 주소
		System.out.println(Test64.tv.power);						
		System.out.println(Test64.tv.ch);						
		System.out.println(Test64.tv.vol);					
		
		//	 Test64.t = new Test64();		미리 객체생성 함
		System.out.println(Test64.t);		//	참조 주소
		
		System.out.println();
		System.out.println();

		
		
		
		//	인스턴스 변수
		Test64 test1 = new Test64();														 
		test1.x = 200;
		System.out.println(test1.x);
		
		Test64 test2 = new Test64();
//		test2.t1 = new TvTest();			//	객체생성과정에서 타입확인	// 미리 객체 생성해둠
		System.out.println(test2.t1.ch);
		
		Test64 test3 = new Test64();			// test64 변수를 쓰고 싶어 객체생성		//	클래스 호출
		test3.test64 = new Test64();			// test64에 값대입 new~					//	클래스 안에 변수(참조)타입 호출
		System.out.println(test3.x);													//	참조 주소의 변수 사용
		
		
		
		
		
		
	}

}
