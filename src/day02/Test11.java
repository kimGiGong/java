package day02;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 >> ");
		String name = sc.nextLine();
		System.out.println("이름은 "+ name + "입니다.");
		
		System.out.println("나이>>");
//		String age = sc.nextLine();
		
		int numage = Integer.parseInt(sc.nextLine());
		
		System.out.println("당신의 나이는"+numage+"살 입니다.");
		
		System.out.println("당신의 내년 나이는"+(numage+1)+"살입니다.");
		/*
			String -> int 변환
			int 변수명 = Intager.parseInt(String타입변수or"값");
			String -> double 변환
			double 변수명 = Double.parseDouble(String타입변수or"값");
			String -> float 변환
			float 변수명 = Float.parseFloat(String타입변수or"값");
			String -> boolean 변환
			boolean 변수명 = Boolean.parseBoolean(String타입변수or"값");
						
			int -> String 변환
			String 변수 = Integer.toString(int타입변수);
		*/
		sc.close();
		
	}
}
