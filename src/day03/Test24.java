package day03;

public class Test24 {

	public static void main(String[] args) {
		
		// 	비교연산자 : < <= > >= == !==
		int a = 10;
		int b = 5;
		int c = a+b;
		boolean result = a != b;
		System.out.println(result);
		
		//	논리연산자 :
		// a && b :	and : a,b 둘다 참이어야 참
		// a || b :	or  : a,b 둘중 하나라도 참 이면 참
		
//		result = a > b || b > 0; 	true
//		result = a > b || b < 0; 	true
//		result = a < b || b < 0; 	false
		
//		result = a > b && b > 0; 	true
		result = a >= 10 || a > b && a < 0; 	// and 우선 
		System.out.println(result);		
		
		//	삼항연산자 	
		// 	ture/false의 결과식 ? 참일때 결과값 : 거짓일때 결과값
		// a = 10, b= 5;
		
		// 둘중에 큰값 돌려주는 공식
		System.out.println(a > b ? a : b );
		int res = a > b ? a : b;
		System.out.println(res);
		
		char resCh = a > b ? 'O' : 'X';
		System.out.println(resCh);
		
		
		
	}

}
