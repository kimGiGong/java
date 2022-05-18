package day08;
/*
		리턴타입 메소드명(타입 파라미터, ...){
		실행코드들...
		return;
		}
	
*/
class Hello	{
	
	//	입력X, 리턴X
	void printHello() {
		System.out.println("hello method");
		System.out.println("hello method");
	}
	
	// 	입력O, 리턴X
	void helloName(String name) {
		System.out.println(name+ "님 안녕하세요.");
	}
	
	//	입력X, 리턴O
	int getTen() {
		return 10;
	}
	
	// 	입력O, 리턴O
	int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
}




public class Test65 {

	public static void main(String[] args) {
		
		Hello h = new Hello();
		h.printHello();
		h.helloName("피카츄");
		int result = h.getTen();
		System.out.println(result);
		int result1 = h.sum(10,20);
		System.out.println(result1);
		
		
		
		
		
		
		
		
		
	}

}
