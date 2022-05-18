package day07;

class Tv {				// 	사용자 정의 데이터 타입
	boolean power = false;
	int vol = 0, ch=1;
}


public class Test61 {
	// 	변수
	//	메소드
	//	메인 메소드 
	public static void main(String[] args) {

		//	Test61 test = new Test61();
		String s = new String();
		
		
		
		
		
		
		
		
		Tv t = new Tv();
		System.out.println(t.power);
		System.out.println(t.vol);
		System.out.println(t.ch);
		
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.ch =10;
		t2.ch =20;
		
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		System.out.println(t3.ch);
		
		// 같은 타입끼리 대입가능
		int a= 10;
		int b= 20;
		a = b; 
		b = a;
		
		//	가능 (같은타입)
		t1=t2;
		t3=t2;
		
		//	불가능 (다른타입)
		//t1 = t2.ch;
		
		t1.ch=t2.ch;
		t1.vol=t2.vol;
		
		a= t1.ch;
		t1.vol = b;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
