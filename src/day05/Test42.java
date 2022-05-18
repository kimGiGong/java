package day05;

public class Test42 {

	public static void main(String[] args) {
		
		//	배열 선언
		int[] score;		//같은 데이터 타입만 저장가능
		
		//	배열 방크기 할당	
		score = new int[3];	// 방 3개짜리 만들기
		
		
		// 	선언 + 할당
//		int [] score = new int[3];
		
		score[0]= 10;
		score[1]= 20;
		score[2]= 30;
		
		
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		
		//int a = score; 		// 잘못된
		int a = score[0];
		int tot = 0;
		for(int i=0; i<3 ;i++) {
			tot += score[i];
		}
		System.out.println(tot);
		
		System.out.println(score.length);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
