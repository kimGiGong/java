package day04;

import java.util.Scanner;

public class Test38 {

	public static void main(String[] args) {
		//	for문으로 풀어보세요.
		
		//	문제1. 10~30까지 출력
		for (int i=10;i<=30;i++) {
			System.out.println(i);
		}
		//	문제2. 0~100까지 10단위출력
		for(int i=0 ; i<=100 ; i+=10) {
			System.out.println(i);
		}
		//	문제3. 1~ 20 까지 짝수만 출력
		for(int i=0; i<=20; i+=2) {
			System.out.println(i);
		}
		//	문제4. 1~100까지 홀수의 총합 출력
		int sum = 0;
		for(int i=0;i<=100 ; i++ ) {
			if((i%2) == 1) {
			sum += i;
			}
		}
		System.out.println(sum);
		//	문제5. 정수 1개를 입력받고, 1부터 입력받은 수까지의 합을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 정수 : ");
		int i = Integer.parseInt(sc.nextLine());
		int j = i;
		int total = 0;
		for(i=1;i<=j ; i++ ) {
			total += i;
			}
		System.out.println(total);
		
		// 문제
		
//		0을 입력할 떄까지 입력받고, 입력받은 총합을 마지막에 출력하세요.
		
		int tot = 0;
		for(;;) {
			System.out.println("점수입력 : ");
			int num =Integer.parseInt(sc.nextLine());
			if (num==0) {
				break;
			}
			tot+= num;
			
			
		}
		System.out.println("총합 : "+ tot);
		
		sc.close();
		
	}

}
