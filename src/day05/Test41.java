package day05;

import java.util.Scanner;

public class Test41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제1. 구구단 2단 출력
			// 출력형태
			// 2 * 1 = 2
			// 2 * 2 = 4
			// 2 * 3 = 6
			// ..............
		
		for (int j=1 ; j<10 ; j++ ) {
			 int i = 2;
			System.out.println(i +"*"+ j +"="+ i*j );
		}
		// 문제2. 구구단의 단수를 입력받아 해당 단을 출력
		System.out.println("단수 입력 : ");
		int n = Integer.parseInt(sc.nextLine());
		for (int j=1 ; j<10 ; j++ ) {
			System.out.println(n +"*"+ j +"="+ n*j );
		}
		
		
		// 문제3. 구구단 전체 출력(세로단) (2단~9단)
		//		*** 1단 ***
		//		1 * 1 = 1
		//		*** 2단 ***
		//		2 * 1 = 2
		//		*** 3단 ***
		//		3 * 1 = 3		
		//		*** 4단 ***
		//		4 * 1 = 4
		for(int i=2 ; i<10 ; i++ ) {
			for (int j=1 ; j<10 ; j++ ) {
				System.out.println(i +"*"+ j +"="+ i*j );
				}
		}
		// 문제3-1. 구구단 격자형태로 출력 (1단 ~ 9단)
		/*
				*** 1단 ***		*** 2단 ***		*** 3단 ***
				1 * 1 = 1		........		......
				*** 1단 ***		*** 2단 ***		*** 3단 ***
				........		........		......
				*** 1단 ***		*** 2단 ***		*** 3단 ***
				........		........		......
		 */
		for(int i=1 ; i<7 ; i+=3 ) {
			System.out.println("***" +i+ "단***\t***" +(i+1)+ "단***\t***" +(i+2)+ "단***");
			for (int j=1 ; j<10 ; j++ ) {
					System.out.print(i +"*"+ j +"="+ i*j+"\t\t");
					System.out.print((1+i) +"*"+ j +"="+ (1+i)*j+"\t\t");
					System.out.println((i+2) +"*"+ j +"="+ (i+2)*j );
				}
		}
		// 문제4. 별찍기 : 아래 형태가 출력되도록 코드를 작성해보세요.
		/*
		*
		**
		***
		****
		*****
		*/
		for( int i=0 ; i<5 ; i++ ) {
			for( int j=0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		sc.close();

	}
}
