package day04;

public class Test37 { 

	public static void main(String[] args) { 
		// 지역변수
		//	5번 반복
		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.println("hello");
		}
	
		
		// 0 ~ 10 까지 출력
		for(int i=0; i<=10 ; i++) {  // 초기식 i 는 for문 안에서만 동작하기에 중복되어도 사용가능
			System.out.println(i);
		}
		// 	#1. for문 안에서 만들어진 i 변수는 밖에서 사용불가
		//	#2.	밖에서도 사용하려면 밖에서 선언
		int i=0;
		//	#3. 초기값 생략 : 밖에서 먼저 만들어놓은 변수라면
		//				for문안에 초기식 생략가능, 이때, 반드시 세미콜론은 작성
		for(i=0;i<10;i++) {
			System.out.println("haha");
		}
		System.out.println(i);
		
		//	#4. 무한반복
//		for( ; ; ) {
//			
//		}
//		while(true) {
//			
//		}
		
		
		// break, continue
		for (int a =0; a< 10 ; a++) {
			if(a==5) {
				//break; 	//강제종료 -> 반복문 종료
				continue;	// 다음 반복으로 건너뛰기
							// 아래 출력 안하고, 증감식으로 넘어감
			}
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
	}

	
}
