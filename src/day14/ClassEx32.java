package day14;		//	익명 클래스
	
interface MyInter {
	void func ();
}

public class ClassEx32 {

	public static void main(String[] args) {
		
		
		//	MyInter 인터페이스 규격에 맞는
		//	구현 익명 클래스 만들어서 객체 생성하고, 메소드 호출!! 까지 (단발성)
		new MyInter () {
			@Override
			public void func() {
				System.out.println("MyInter의 func 구현부~~~");
				
			}
		}.func();

	}

}
