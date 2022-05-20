package day14;		//	예외 처리

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassEx34 {

	public static void main(String[] args) {
		
		int a;
		String str;
		
		try {
			a = 10;
			str = "hello";
			//	제어문, 메소드 호출, 객체 생성
		}catch(Exception e) {
			
		}
		
		
		//ArrayIndexOutOfBoundsException
		try {
		System.out.println(args[0]);
		}catch(Exception e) {
			System.out.println("인수 없이 실행하셨습니다");
			System.out.println(e);
		}
		
		int number = 100;
		int result = 0;
		for(int i = 0 ; i<10 ;i++) {
			try {
				result = number / (int)(Math.random()*10);	// 0으로 나눌수없다
				System.out.println(result);
				
			}catch(ArithmeticException e) {
				System.out.println("0발생!!!!!");
			}	
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력하세");
		int sum = 0;
		int num = 0;	//	try안에 선언하면 try안에서만 사용가능해짐. 밖에서 사용불가
		for(int i=0 ; i<3 ;i++) {
			System.out.print(">>");
			try {
			num = sc.nextInt();	//	InputMismatchException
			}catch(InputMismatchException e) {
				System.out.println("정수가 아니다");
				sc.nextLine();		// nextInt() 로 입력받았는데 문제가 있어서
				//	입력받는 버퍼를 비워줘야한다.
				i--;			//	반복문 회차 다시
				continue;		//	아래출력 스킵용 회차 파기
			}
			System.out.println(num);
			sum += num;
		}
		System.out.println("총합 "+sum);
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}

}
