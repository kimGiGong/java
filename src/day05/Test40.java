package day05;

public class Test40 {

	public static void main(String[] args) {
		
		//	중첩 for문
		for( int i = 0 ; i < 10 ; i++ ) {
			for( int j = 0 ; j < 10 ; j++ ) {
				System.out.println(i + " " +j );
			}
		}
//			i = 0 를 실행하면 j= 0~2 까지 돌고 i=1이 실행되면 
//			j= 0~2 까지 다시돌아 배열과 같이된다 
		
		System.out.println("==========================================");
		// 자주 안씀
		int a = 0;
		while (a < 5) {
			int b = 0;
			while (b < 5) {
			System.out.println( a + " " + b);
			b++;
			}
			a++;
		}
		System.out.println("==========================================");
		
		// while 문은 이걸 자주씀
		while (true) {
			while (true) {
			System.out.println( a );
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
