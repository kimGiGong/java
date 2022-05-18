package day04;
import java.util.Scanner;

public class Test32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		문제1. 정수를 입력받아 3~ 5 는 "봄" , 6~8은 " 여름",
//				9~ 11은 "가을" , 12~2는 "겨울"을 출력하세요.
		
		System.out.println("몇월?입력>>");
		int w = Integer.parseInt(sc.nextLine());
		switch(w) {
		case 1 : case 2 : case 12 : 
			System.out.println("겨울");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("봄");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름");
			break;
		case 9 : case 10 : case 11 : 
			System.out.println("가을");
			break;
		default : System.out.println("잘못입력");
		}
		
//		문제2. 점수를 입력받고, 90~100은 "수", 80~ 89는 "우",
//				70~79는 "미", 60~69 "양", 그이하는 "가"를 출력하세요
		System.out.println("점수입력");
		int score = Integer.parseInt(sc.nextLine());
		switch (score/10) {
			case 10 : case 9 :
				System.out.println("수");
				break;
			case 8 : 
				System.out.println("우");
				break;
			case 7 :
				System.out.println("미");
				break;
			case 6 : 
				System.out.println("양");
				break;
			case 5 : 
			case 4 : 
			case 3 : 
			case 2 : 
			case 1 : 
			case 0 : 
				System.out.println("가");
				break;
			default : 
				System.out.println("잘못입력");
		}
		
//		문제3.  덧셈 +, 뺄셈 -, 곱셈 *, 나눗셈 / 중 원하는 기호를 선택해
//				a,b의 연산 결과값을 출력해보세요.
		int a = 10, b = 3;
		System.out.println("a는10 b는3 기호 +-*/");
		String c = sc.nextLine();
		switch ( c ) {
			case "+" :
				System.out.println(a+b);
				break;
			case "-" : 
				System.out.println(a-b);
				break;
			case "*" : 
				System.out.println(a*b);
				break;
			case "/" : 
				System.out.println((double)a/b);
				break;
			default :
				System.out.println("잘못입력");
		}
		sc.close();
		
	}

}
