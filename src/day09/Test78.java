package day09;

public class Test78 {
	
	//	인스턴스 변수
	double d;
	
	Test78(){
		d=Math.random();
		System.out.println("기본생성자호출");
	}
	Test78(double a){
		System.out.println("매개변수 있는 생성자호출");
		d=a;
	}
	
	
	public static void main(String[] args) {
		
		Test78 test =new Test78();
		System.out.println(test.d);
		Test78 test2 =new Test78(78);
		System.out.println(test2.d);
		
		

	}

}
