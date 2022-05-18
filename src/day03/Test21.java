package day03;

public class Test21 {

	public static void main(String[] args) {
		
		//	대입연산자 : 대입해야 변수안의 값이 변경된다.

//		int a = 10;
//		System.out.println(a+10);
//		System.out.println(a);
//		System.out.println();
		
		
		int i = 5, j = 5;									//		i	j
		System.out.println(i++);							// 5	6	5
		System.out.println(++j);							// 6	6	6
		System.out.println("i = " + i + ", j = " + j); 		
		
		// 문제 1. 출력결과를 먼저 주석적기 실행후 확인
		int k = 10;				
		System.out.println(k++);		//	10
		System.out.println(++k);		//	12
							++k;		//	
		System.out.println(++k);		//	14
		System.out.println(k++);		//	14
		System.out.println(k);			//	15
		
		//문제2 r의 결과를 주석으로 적어보세요.
		int a = 10;
		int b = 10;
		int r = ++a + ++b;			// 	22
		r = ++a + b++;				// 	23
		r = ++a + a;				//	26
		r = ++a + a++;				//	28
		r = ++a + ++a;				//	33
		System.out.println(r);		//	33
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
