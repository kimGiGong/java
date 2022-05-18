package day07;								//	패키지 명

// #1. 클래스 정의
class Person{			// 클래스는 변수와 메소드만 갖고 있음
	//	속성 (변수)
	String name = "홍길동";
	int age = 10;
	//	기능 (메소드)
	void breathe() {
		System.out.println("숨쉬기");
	}
	void sleep() {
		System.out.println("잔잔다다~");
	}
}




public class Test60 {						// main 메소드는 하나만 public 은 main 메소드에만	

	public static void main(String[] args) {	
		
		//	#2.	객체 생성
		Person p = new Person();
		p.name = "피카츄";
		p.age = 100;
		System.out.println(p);
		System.out.println(p.name);
		System.out.println(p.age);
		p.breathe();				//기능 실행
		p.sleep();
		
		
		Person p2 = new Person();
		System.out.println(p);
		System.out.println(p2.name);
		System.out.println(p2.age);
		p2.breathe();
		p2.sleep();
		
		
		
		
		
		
		
	}

}
