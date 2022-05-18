package day04;
import java.util.Scanner;

public class Test35 {

	public static void main(String[] args) {
		
//		문제1. 0~10 까지 출력해보세요.
		int a = 0;
		while (a<11) {
			System.out.println(a);
			a++;
		}
		
//		문제2. 1~15 까지 출력해보세요.
		int b = 0;
		while (b<16) {
			System.out.println(b);
			b++;
		}
		
//		문제3. 0 ~ 100까지 10단위로 출력해보세요. 0 10 20 30...100
		int c = 0;
		while (c<11) {
			System.out.println(c*10);
			c+=10;
		}
		
//		문제4. 1 ~ 20 까지 홀수만 출력해보세요.
		int d = 0;
		while (((d*2)+1)<21) {
			System.out.println((d*2)+1);
			d++;
		}
		
//		문제4. 1 ~ 10 까지의 총합을 출력해보세요.
		int f = 0;
		int ft = 0;
		while (f<=10) {
			ft+=f;
			f++;
		}
		System.out.println(ft);
		
//		문제5. 1 ~ 50까지 짝수의 합을 출력해보세요.
		int g = 0;
		int gt = 0;
		while (g<=50) {
			if(g%2 == 0) {
			gt+=g;
			}
			g++;
		}
		System.out.println(gt);
		
//		문제6. 주문 프로그램
//				1단계 : 아래 메뉴를 출력하고, 번호로 주문을 받는다.
//					주문종료를 선택할 때까지 계속 주문을 받는다.	
//					주문받은 모든 메뉴의 총금액 출력한 후 종료
//				2 단계 : int money = 20000; (내돈).
//					주문시, 내 돈에서 주문한 금액 차감, 돈이 부족하면 주문 못하게,
//					주문 종료시 주문한 총 금액과 내돈의 잔액까지 출력
//			****더조은 카페 메뉴****
//				1. 아메리카노		:	2500원
//				2. 카페라떼			:	3000원
//				3. 카푸치노			: 	3500원
//				4. 카라멜마끼아또	:	4000원
//				5. 샌드위치			:	6000원
//				6. 주문 종료
		Scanner sc= new Scanner(System.in);

		int moneyall = 0;
		System.out.println("상품선택:");
		while(true) {
			int menu = Integer.parseInt(sc.nextLine());
			if(0>=menu||menu>=7) {
				System.out.println("우중한조작");
				continue;
			}
			if(menu == 6) {
				System.out.println("선택종료");
				System.out.println(moneyall+"원");
				System.out.println("잔액 : "+(20000-moneyall)+"원");
				break;
			}
			if(menu<=4) {
				System.out.println(menu+"선택 "+(2000+menu*500)+"원");
				moneyall += (2000+menu*500);
					if(moneyall>20000) {
					moneyall -= (2000+menu*500);
					System.out.println("잔액초과");
					System.out.println("선택종료");
					System.out.println(moneyall+"원");
					System.out.println("잔액 : "+(20000-moneyall)+"원");
					break;
					}
			}else if(menu==5){
				System.out.println(menu+"선택 6000원");
				moneyall += 6000;
					if(moneyall>20000) {
					moneyall -= (6000);
					System.out.println("잔액초과");
					System.out.println("선택종료");
					System.out.println(moneyall+"원");
					System.out.println("잔액 : "+(20000-moneyall)+"원");
					break;
					}
					
				}
		}
		/////////////////////////////////////////////////////////////////////////
		int total1 = 0;
		int money1 = 20000;
		int num = Integer.parseInt(sc.nextLine());
		if (num==1) {
			if(money1 < 2500 ) {
				System.out.println("잔액부족.. 종료를 선택");
			}else {
				total1 += 2500;
				money1 -= 2500;
			}
		}
		if (num==2) {
			if(money1 < 3000 ) {
				System.out.println("잔액부족.. 종료를 선택");
			}else {
				total1 += 3000;
				money1 -= 3000;
			}
		}
		if (num==3) {
			if(money1 < 3500 ) {
				System.out.println("잔액부족.. 종료를 선택");
			}else {
				total1 += 3500;
				money1 -= 3500;
			}
		}
		if (num==4) {
			if(money1 < 4000 ) {
				System.out.println("잔액부족.. 종료를 선택");
			}else {
				total1 += 4000;
				money1 -= 4000;
			}
		}
		if (num==5) {
			if(money1 < 6000 ) {
				System.out.println("잔액부족.. 종료를 선택");
			}else {
				total1 += 6000;
				money1 -= 6000;
			}
		}
		
		
		
		
		
		
		////////////////////////////////////////////////////////////////////////////
		// 1단계
		int[] price = {2500,3000,3500,4000,6000};
		int total = 0;
		System.out.println("상품선택:");
		while(true) {
			int menu = Integer.parseInt(sc.nextLine());
			if(0>=menu||menu>=7) {
				System.out.println("우중한조작");
				continue;
			}
			if(menu == 6) {
				System.out.println("선택종료");
				System.out.println(total+"원");
				break;
			}
			System.out.println(menu+"선택"+price[menu-1]+"원");
			total += price[menu-1];
		}
		
		
		
		// 2단계
		System.out.println("상품선택:");
		int mytotal = 0;
		int money = 20000;
		while(true) {
			int mymenu = Integer.parseInt(sc.nextLine());
			if(0>=mymenu||mymenu>=7) {
				System.out.println("우중한조작");
				continue;
			}
			if(mymenu == 6) {
				System.out.println("선택종료");
				System.out.println(mytotal+"원");
				System.out.println("잔액 : "+(20000-mytotal)+"원");
				break;
			}
			System.out.println(mymenu+"선택"+price[mymenu-1]+"원");
			mytotal += price[mymenu-1];
			if(mytotal>20000) {
				System.out.println("한도초과");
				mytotal -= price[mymenu-1];
			}
		}
		
		sc.close();
	}


}
