package day09;

public class Test73 {
	
//	메소드 오버로딩 : 같은 이름의 메소드의 로딩을 여러개함 *********(매우중요)
	
	//	되는것
	// 	매개 변수의 갯수 차이
	int getSum(int a, int b) {
		return a + b;
	}
	int getSum(int a, int b, int c) {
		return a + b + c;
	}
	
	//	타입의 차이
	int getMul(int a, int b) {
		return a * b;
	}
	int getMul(int a, double d) {
		return a * (int)d;
	}
	double getTest(double a, int b) {
		return a * b;
	}
	double getTest(int a, double b) {
		return a * b;
	}
	
////// 안되는것	/////////////////////////////////////
/*	매개변수 갯수와 타입이 동일 : 리턴타입은 오버로딩 조건에 포함안됨.
	int getSub(int a, int b) {
		return a-b;
	}
	double getSub(int a, int b) {
		return (double)a-b;
	}
	

	매개변수 이름은 상관없이 타입이나 갯수가 달라야함
	int getDiv(int a, int b) {
		return a/b;
	}
	int getDiv(int c, int d) {
		return c/d;
	}
	
*/	
	public static void main(String[] args) {
		
		Test73 test = new Test73();
		System.out.println(test.getSum(10, 20));
		
	}

}
