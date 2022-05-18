package day12;

class Super{
	void add() {
		System.out.println("Super");
	}
}
class Sub extends Super {	// add()
	//	오버라이딩!!!!!!!		부모의 add 무시됨
	@Override
	void add() {
		System.out.println("Sub");
		System.out.println("Sub");
		System.out.println("Sub");
		super.add();	//	부모가 가진 add 호출해서 사용가능 (Super클래스 아님X super)
	}
	
	void func() {
		super.add();	//	부모 add 실행	(Super클래스 아님X super)
		add();			//	내가 오버라이딩한거 실행
	}
	
	
	
}
	



public class ClassEx07 {

	public static void main(String[] args) {
		
		// 부모 객체 생성
		Super sup = new Super();
		sup.add();
		
										//	오버라이딩은 다형성의 한 종류
			
		// 자식 객체 생성
		Sub s = new Sub();
		s.add();
		
		System.out.println("------------------------------");
		
		Super su = new Super(); 
	      Sub b = null; 
	      b = (Sub)sup;
		
	}

}
