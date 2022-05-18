package day04;
import java.util.Scanner;

public class Test30 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 >>");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(num);
		
		switch(num) {
			case 1:
				System.out.println("1을 입력했다.");
			//	break;
			case 2:
				System.out.println("2을 입력했다.");
				break;
			case 3:
				System.out.println("3을 입력했다.");
				break;
			default :
				System.out.println("1 2 3 이 아닌 수를 입력했다.");
			//	break;
			
		}
		
		System.out.println("프로그램 종료!!");
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
