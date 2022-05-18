package day04;
import java.util.Scanner;

public class Test34 {
	public static void main(String[] args) {
		//	while 무한반복
		//	숫자 0을 입력받을 때까지 계속 정수를 입력받아 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");

		while(true) {
			
			int num = Integer.parseInt(sc.nextLine());
			System.out.println(num);
			if(num==0) {
				System.out.println("종료!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
