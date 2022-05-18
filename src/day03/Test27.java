package day03;
import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			* 연산자 문제 *
//			문제 1. 정수 두개를 입력받고 , 몫과 나머지를 출력하세요.
			System.out.println("정수2개입력 : ");
			int a = Integer.parseInt(sc.nextLine());
			int b = Integer.parseInt(sc.nextLine());
//			System.out.println("몫 : "+a/b +" , 나머지"+a%b);
			
			//예외처리
			if (b!= 0) {
				System.out.println("몫 : "+a/b +" , 나머지"+a%b);
			}else {
				System.out.println("0으로 나눌수없음");
			}
//			문제 2. 일(day)수 입력받고, 몇개월 몇일인지 출력해보세요.
//				단, 한달은 30일로 고정.
			System.out.println("날 수 :");
			int d = Integer.parseInt(sc.nextLine());
			System.out.println(d/30 +"개월"+(d%30)+"일");
			
//			문제 3. 점수 3개를 입력받고, 총점과 평균을 구하여 출력해보세요.
			System.out.println("총점 평균점 구하기\n점수입력 : ");
			double A = Double.parseDouble(sc.nextLine());
			double B = Double.parseDouble(sc.nextLine());
			double C = Double.parseDouble(sc.nextLine());
			System.out.println("총점 : "+(A+B+C) +"평균 :"+((A+B+C)/3));	
			
//		 	* if문 문제 *
//			문제 4. 숫자하나를 입력받고, "음수"인지 "양수"인지 "0"인지 출력해보세요.
			System.out.println("음수양수 판독기 \n정수 :");
			int qwe = Integer.parseInt(sc.nextLine());
			if (0==qwe) {
				System.out.println(qwe+"이다.");
			}else if (-1>=qwe) {
				System.out.println(qwe+"음수이다.");
			}else {
				System.out.println(qwe+"양수이다.");
			}
			
//			문제 5. 1 ~ 99 사이 숫자를 입력받고, "짝수" 인지 "홀수"인지 출력해보세요.
			System.out.println("1~99 짝홀?:");
			int	asd = Integer.parseInt(sc.nextLine());
			if (0>asd || 99<asd) {
				System.out.println(asd+"비정상적인수.");
			}else if (asd%2==1) {
				System.out.println(asd+"홀수이다.");
			}else {
				System.out.println(asd+"짝수이다.");
			}
			//예외처리
			if (1<=asd && 99>=asd) {
				if (asd%2==1) {
					System.out.println(asd+"홀수이다.");
				}else {
					System.out.println(asd+"짝수이다.");
				}
			}else {
				System.out.println(asd+"비정상적인수.");
			}
			
//			문제 6. 정수 3개를 입력받고, 3개의 숫자 중 가장 큰 수를 출력하세요.
			System.out.println("가장큰 정수는?\n정수1입력 : ");
			int qw = Integer.parseInt(sc.nextLine());
			System.out.println("정수2입력 : ");
			int as = Integer.parseInt(sc.nextLine());
			System.out.println("정수3입력 : ");
			int zx = Integer.parseInt(sc.nextLine());
			if (qw>as && qw>zx) {
				System.out.println(qw+"가장크다");
			}else if (as>qw && as>zx) {
				System.out.println(as+"가장크다");
			}else {
				System.out.println(zx+"가장크다");
			}	
			
			
//			문제 7. 2차원 평면에서 직사각형은
//					왼쪽 상단 모서리와 오른쪽 하단 모서리 두점으로 표현한다.
//					(100, 100) 과 (200, 200) 의 두점으로 이루어진 사각형이 있을때,
//					정수 x, y값을 입력받고 점(x,y)가 이 직사각형안에
//					있는지 판단하는 프로그램을 작성하세요.
			System.out.println("100,100~200,200 IN or OUT");
			System.out.println("x입력 : ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.println("y입력 : ");
			int y = Integer.parseInt(sc.nextLine());
			if ((x>100 && y>100) && (x<200 && y<200)) {
				System.out.println("("+x+","+y+")내부");
			}else {
				System.out.println("("+x+","+y+")외부");
			}
		
		sc.close();
	}

}
