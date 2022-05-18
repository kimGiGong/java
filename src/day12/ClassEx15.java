package day12;
//	아래 추상 클래스 Calculator를 상속받은 MyCalc 클래스를 구현하세

abstract class Calculator{
	public abstract int add(int a, int b);				// 두 정수의 합을 리턴
	public abstract int substract(int a, int b);		// 두 정수의 차를 리턴	
	public abstract double average(int []a);		// 배열에 저장된 정수의 평균값을 리턴
}
class MyCalc extends Calculator {

	@Override
	public int add(int a, int b) {			// 오버라이딩시 부모보다 접근지정자 제한을 낮출수 없다
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int [] a) {
		double b = 0;
		for (int i = 0 ; i<a.length ; i++) {
			b += a[i];
		}
		return b/a.length;
	}
	
}

public class ClassEx15 {
	public static void main(String[] args) {
		MyCalc c = new MyCalc();
		int[] d = {50,50,5048,852,856,853,8411};
		
		
		System.out.println(c.add(1, 5));
		System.out.println(c.substract(1, 5));
		System.out.println(c.average(d));		// 넣는건 참조변수명만 넣으면 된다.		
		System.out.println(c.average(new int[] {5,8,6}));		// 1회성 배열로도 가능
	}

}
