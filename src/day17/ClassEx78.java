package day17;

class ThreadEx extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100 ;i++) {
			System.out.println("run~~~");
		}
	}
}







public class ClassEx78 {
	public static void main(String[] args) {

		ThreadEx th = new ThreadEx();
		
		th.start();	//	멀티 스레드
//		th.run();	//	스레드 만들어서 두개로 돌린게 아니라 main혼자
		//	일반 메서드 호출처럼 일한것. -> 싱글 스레드
		
		for(int i=0 ; i<100 ;i++) {
			System.out.println("main......");
		}
		
		
		
		
		
		
		
		
	}
}
