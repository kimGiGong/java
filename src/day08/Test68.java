package day08;

//	인자 전달 방식
class Circle {
	int radius = 30;
}

public class Test68 {
	// 강의의 편의를 위한 static (다른의도없음)
	static void plus(int num) {
		num = num +1;
	}
						// **Circle 타입**
	static void biggerPizza(Circle pizza) {
		pizza.radius++;
	}
	static void increase(int[] a) {
		for(int i=0; i<a.length; i++) {
			a[i]++;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		// 	#1. 기본형
		int num =10;
		System.out.println(num);
		plus(num);
		System.out.println(num);
		
		// 	#2. 참조형 (객체)	주소를 복사하기 때문에 값의 변경이 가능
		Circle pizza = new Circle();
		System.out.println("pizza : " + pizza.radius);
		biggerPizza(pizza);
		System.out.println("pizza : " + pizza.radius);
		
		//	#3. 배열
		int [] arr = {1,2,3,4,5};
		for(int a : arr) System.out.println(a);
		System.out.println("--------------------");
		increase(arr);
		for(int a : arr) System.out.println(a);
		
		
		
		
		
		
		
	}

}
