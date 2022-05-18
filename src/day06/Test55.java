package day06;

import java.util.Scanner;

public class Test55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 /* Up & Down 게임 
        0 ~ 99 사이의 임의의 수를 받아 (사용자로부터) 숨기고, 그수를 맞추는 게임. 
        임의의 수보다 낮게 입력하면 "Up" 출력, 
        높게 입력하면 "Down" 출력하면서 범위 좁혀가며 수를 맞춘다. 
        게임을 반복하기 위해 y/n묻고, n 입력시 프로그램 종료. 
        콘솔예시) 
        숫자가 정해졌습니다. 맞춰보세요! 
        0 ~ 99 
        1 >>  55   (사용자 입력) 
        "Up"
        55 ~ 99 
        2 >>  70
        "Up"
        70 ~ 99 
        3 >>  85
        "Down"
        70 ~ 85 
        4 >>  80
        "Down"
        70 ~ 80
        5 >>  75
        "Up"
        75 ~ 80
        6 >>  77
        맞았습니다. 
        다시 하시겠습니까?(y/n) >>  y  
        숫자가 정해졌습니다. 맞춰보세요! 
        0 ~ 99 
        1 >>  30    
        "Up"
        30 ~ 99 
        2 >>  45
        맞았습니다. 
        다시 하시겠습니까?(y/n) >>  n 
        게임 종료!!  
     */
		// 문자열 비교는 .equals()를 사용해야한다.
		String str[]= {"y","n"};
		boolean play=true;				//	도중에 false가 되더라도 끝까지 실행 후 종료
		while(play) {													// 	게임 무한반복
			System.out.println("up&down게임 숫자(Random 0~99)");		
			int I = (int)(Math.random()*100);							//  게임시작 랜덤값결정
			while(true) {												//	정답일때까지 무한반복
				int n;
				n = Integer.parseInt(sc.nextLine());
				if(n>=0 && n<100){										// 0~99 아니면 재반복
					if(n==I) {
						System.out.println("정답");
						break;											//	맞추면 게임 break;
					}else if(n<I) {
						System.out.println("up");
					}else {
						System.out.println("down");
					}//if
				}else {
					System.out.println("잘못된 숫자");
				}//if
			}//while
			System.out.println("다시 ? (y/n)");							//	메인로비 탈출or리트
			String exit1;
			while(true) {												//	결정할때까지 입력 무한반복
				String exit = sc.nextLine();
				if(str[0].equalsIgnoreCase(exit) || str[1].equalsIgnoreCase(exit)) {		// y n 아니면 무한반복
					exit1=exit;											//	IgnoreCase 대소문자 무시
					break;
				}else {
					System.out.println("잘못된 입력");
				}
			}//while
			if(exit1.equals(str[1])) {
				System.out.println("종료");
				break;
			}//if
			System.out.println("다시 시작");
		}//while

		sc.close();
	}

}
