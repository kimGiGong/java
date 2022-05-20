package day14;			//	내부에서 처리했지만 추가 오류 토스

public class ClassEx40 {
	static void method1 () throws Exception {
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 예외처리 했따구");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main에서도 잡기");
		}
	}

}
