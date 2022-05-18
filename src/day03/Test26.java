package day03;
import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		
		int a = 20;
		if (a > 10) {
			System.out.println("a는 10보다 크다.");
		}
		// 	a-10 하고 10이랑 비교
		// 	연산자 우선순위에 따라 산술연산 먼저 계산됨.
		if(a - 10 > 10) {
			System.out.println("안녕하세요");
		}
		
		/*
		// 1번 구조
		int score = 70;
		//	문제. score 변수에 들어있는 점수가 60점이상이면 "합격" 출력
		//			아니면 "불합격" 출력
		if (score>=60) {
			System.out.println("합격");
		}
		if (score<60) {
			System.out.println("불합격");
		}
		// 2번 구조
		if (score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("프로그램 종료" + a);
		*/
		
		// 	문제 : 점수하나를 입력받고,
		//		90점 이상하면 "수", 80점 이상이면 "우"
		//		70점 이상이면 "미", 그 이하는 "재시험" 출력.
		
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.nextLine());
		
		if(score >= 90 && score <= 100) {
			System.out.println("수");
		}else if(score >= 80 && score < 90) {
			System.out.println("우");
		}else if(score >= 70 && score < 80) {
			System.out.println("미");
		}else {
			System.out.println("재시험");
		}
		
		sc.close();
		
		
		
		
		
		
	}

}
