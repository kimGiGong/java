package day03;
import java.util.Scanner;

public class Test23_1 {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력받고 => Scanner 사용해서 입력받기
		//			어떤 값을 입력하던지 그 값에 맞는 결과가 출력되도록......
		
		//	* 산술연산자 문제 *
		
		// 문제1. 숫자 2개를 입력받고, 사칙연산(4개) 결과를 출력해보세요. 
		System.out.println("숫자1입력 : ");
		double num1 = Double.parseDouble(sc.nextLine());
		System.out.println("숫자2입력 : ");
		double num2 = Double.parseDouble(sc.nextLine());
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
	    // 문제2. 초단위로 정수를 입력받고,
		//         계산된 "??분??초" 형태로 출력해보세요.
		System.out.println("초단위로 정수 입력 : ");
		int seconds = Integer.parseInt(sc.nextLine());
		System.out.println((seconds/60)+ "분"+ (seconds%60)+"초");

    	// 문제3. 초단위로 정수를 입력받고, "??시간??분??초" 형태로 출력해보세요. 
		
		int seconds2 = Integer.parseInt(sc.nextLine());
		System.out.println((seconds2/3600)+ "시간" + ((seconds2%3600)/60)+ "분"+ (seconds%60)+"초");
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
		System.out.print("금액입력 : ");
		int money = Integer.parseInt(sc.nextLine());
		long[] asd = {0,1,2,3,4,5};

		asd[0]= money%500;
		asd[1]= (money%1000)/500;
		asd[2]=	(money%5000)/1000;
		asd[3]=	(money%10000)/5000;
		asd[4]=	(money%50000)/10000;
		asd[5]=	money/50000;
		
		System.out.println("5만원 : " +asd[5]+"장");
		System.out.println("1만원 : " +asd[4]+"장");
		System.out.println("5천원 : " +asd[3]+"장");
		System.out.println("1천원 : " +asd[2]+"장");
		System.out.println("500원 : " +asd[1]+"개");
		System.out.println("100원 : " +asd[0]+"개");
		
		sc.close();
		
		
	}
	
}
