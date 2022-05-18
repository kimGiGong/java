package day12;

class AClass{	//	x
	int x;
}
class BClass extends AClass {	// x, y
	int y;
}



public class ClassEx08 {
	public static void main(String[] args) {
		
		// 기존 객체 생성하던 방식
		AClass a =new AClass();
//		BClass b =new BClass();
		
		// 다형성 : 조상의 참조변수로 자식의 실 "객체"를 담아주는것.	*********** 중요 ************
//		AClass c = new BClass();		
//		BClass b = new AClass();	(X) 부모"객체"가 자식변수에 들어갈 수는 없다.	객체는 못들어감		
		
		System.out.println(a.x);
//		System.out.println(a.y);
		BClass bbbb= (BClass)a;
		System.out.println(bbbb.x);
		System.out.println(bbbb.y);
		
		int aa = 10;		// 정수 10
		double d = 10.14;	// 정수 10 실수부 .14
//		aa = (int)d;
//		d= a ;
		
		
		
		
		
		
		
		

	}

}
