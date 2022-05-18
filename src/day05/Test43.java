package day05;

public class Test43 {

	public static void main(String[] args) {
		
		int [] num = new int[10]; 
		for(int i=0 ; i<10 ; i++) {
			num[i]=100;
			//System.out.println(num[i]);
		}
		for(int n : num) {
			System.out.println(n);
		}
		
		
		
		// 초기화
		String[] subject = {"java","jsp","spring"};
		for( int i =0; i< subject.length ; i++) {
			System.out.println(subject[i]);
		}
		System.out.println("========================================");
		//  업그레이드 for문 (forEach)문
		for(String s : subject) {	//자동으로 배열의 갯수만큼 반복
			System.out.println(s);
		}
		
		
		
		
		
	}

}
