package day03;
import java.util.Scanner;

public class Test23 {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력받고 => Scanner 사용해서 입력받기
		//			어떤 값을 입력하던지 그 값에 맞는 결과가 출력되도록......
		
		//	* 산술연산자 문제 *
		
		// 문제1. 숫자 2개를 입력받고, 사칙연산(4개) 결과를 출력해보세요. 
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	    // 문제2. 초단위로 정수를 입력받고,
		//         계산된 "??분??초" 형태로 출력해보세요.
		long seconds =  sc.nextLong();
		System.out.println(seconds/60);
		System.out.println(seconds%60);
    	// 문제3. 초단위로 정수를 입력받고, "??시간??분??초" 형태로 출력해보세요. 
		long seconds2 =  sc.nextLong();
		System.out.println(seconds2/3600);
		System.out.println((seconds2%3600)/60);
		System.out.println(seconds2%3600%60);
	    /* 문제4. 최소 화폐 매수 구하기
	                금액을 입력받으면, 최소한의 화폐매수를 구해주는 프로그램 
	          콘솔예시)
	          금액입력 :   67800   <- 사용자가 입력 
	          5만원 : 1장
	          1만원 : 1장
	          5천원 : 1장
	          1천원 : 2장
	          5백원 : 1개
	          1백원 : 3개
	    */
		long money =sc.nextLong();
		long[] asd = {0,1,2,3,4,5};

		asd[0]= money%500;
		asd[1]= (money%1000)/500;
		asd[2]=	(money%5000)/1000;
		asd[3]=	(money%10000)/5000;
		asd[4]=	(money%50000)/10000;
		asd[5]=	money/50000;
		
		System.out.println(asd[5]);
		System.out.println(asd[4]);
		System.out.println(asd[3]);
		System.out.println(asd[2]);
		System.out.println(asd[1]);
		System.out.println(asd[0]);
		
		sc.close();
	}
	
}
