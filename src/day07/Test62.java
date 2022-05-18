package day07;
	
class TvEx {
	// 클래스 기본형 변수
	static boolean power = false;			// static 붙음
	// 인스턴스 기본형 변수
	int vol = 0, ch=1;
}
	
	
	
	
	
	
	
public class Test62 {

	public static void main(String[] args) {	
		
		//	지역 기본형 변수
		int a=10;
		//	지역 참조형 변수
		String str = "hello";
		//	지역 기본형 변수 : for문이 끝나면 없어짐
		for(int i=0; i<5;i++) {
			System.out.println(i);
		}
		
		// 클래스 변수 출력 : 객체 생성없이 바로 사용가능
		System.out.println(TvEx.power);
		
		
		// 인스턴스 변수 출력 : 객체 생성해야 사용가능!
		TvEx t1 = new TvEx();
		System.out.println(t1.ch);
		System.out.println(t1.vol);
		
		System.out.println("---------------------------------");
		
		TvEx tv1 = new TvEx();
		TvEx tv2 = new TvEx();
		tv1.power = true;
		tv1.ch =200;
		System.out.println(tv1.power+"  "+ tv1.ch);
		System.out.println(tv2.power+"  "+ tv2.ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
