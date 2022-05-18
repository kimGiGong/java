package day06;

public class Test53 {

	public static void main(String[] args) {
		
		//	랜덤 : 난수 : 임의의 수 : 0 ~ 1 사이 실수의 값으로 돌려줌.
		System.out.println(Math.random());
		
		// 0~9 사이 랜덤값
		System.out.print((int)(Math.random()*10));
		System.out.println();
		
		// 1~10 사이 랜덤값
		System.out.print((int)(Math.random()*10)+1);
		System.out.println();
		
		// 1~5 사이 랜덤값
		System.out.print((int)(Math.random()*5));
		System.out.println();
		
		for(int i=0;i<100; i++) {
		// 12~17 사이 랜덤값
		System.out.print((int)(Math.random()*5)+12);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
