package day10;

import java.util.Scanner;

/*
	하루 할일을 표현하는 클래스 Day는 다음과 같다. (그대로 사용하기) 
	한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요. 
	MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수, 메서드를 작성하고
	실행 예시처럼 입력,보기,끝내기 등의 3개의 기능을 작성하세요. 
	-> 생성자, input(), show(), finish() 
	콘솔 실행예시 : 
		이번달 스케쥴 관리 프로그램. 
		할일(입력:1, 보기:2, 끝내기:3) >>   1  (사용자 입력) 
		날짜(1 ~ 31)?   1 
		할일?   자바공부 
		
		할일(입력:1, 보기:2, 끝내기:3) >>   2 
		날짜(1 ~ 31)?   1 
		1일의 할 일은 자바공부입니다.
		
		할일(입력:1, 보기:2, 끝내기:3) >>   3 
		프로그램 종료 
*/
class Day {			// 주어진 클래스(고정) 
	private String work; 
	
	public void setWork(String work) { this.work = work; }
	
	public String getWork() { return work; }
	
	public void show() {
		if(work == null) { System.out.println("없습니다."); }
		else {System.out.println(work + "입니다.");}
	}
}
class MonthSchedule {
	private Day [] days; 
	private Scanner sc;		//메소드 들에서 같이 사용하기 위해 인스턴스로 만듬
	private int dayN;
	
	
	MonthSchedule (int dayN){
		sc = new Scanner(System.in);
		this.dayN = dayN;
		days = new Day[dayN];	//방크기 만들기 (빈방)
		for(int i=0; i<days.length;i++) {	// 방마다 객체 생성
			days[i]=new Day();
		}
	}
	
	void input() {				// 입력
		System.out.println("날짜(1~31)");
		int day = Integer.parseInt(sc.nextLine());
		if(day<0 || day>dayN) {
			System.out.println("날짜 잘못입력");
			input();
		}
		// input(); // 다시 input() 을 할것인지
		// return; // 으로 빠져나오는방법 2가지
		System.out.println((day)+"일의 할 일은 ");
		day--;		//	입력받은날짜-1
		days[day].show();
		
		
		System.out.println("할일 ?");
		String work = sc.nextLine();
		days[day].setWork(work);		// 달력 해당 날짜에 할일 저장
	}
	
	void show() {				//	보기
		System.out.println("날짜(1~31)");
		int day = Integer.parseInt(sc.nextLine());
		if(day<0 || day>dayN) {
			System.out.println("날짜 잘못입력");
			show();
		}
		System.out.println((day)+"일의 할 일은 ");
		day--;
		days[day].show();
	}
	
	void finish() {				//	끝내기
		sc.close();
		System.out.println("종료");
	}
	
	// 달력프로그램 전체 진행시키는 메소드
	void run() {
		System.out.println("스케줄관리");
		
		while(true) {
			System.out.println("할일(입력 1, 보기 2, 끝내기 3,)>>");
			int menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1: input(); break;			//	break; 은 switch 문에서 빠져나오는것
			case 2: show(); break;
			case 3: finish(); return;	// run() 메소드 강제종료!!
			default : System.out.println("메뉴번호 잘못입력 다시입력하세요");
			}
		}
	}
	
}
public class Test94 {
	public static void main(String[] args) {

		// main은 작성 완료! 주석해제하고 실행만 
		
		MonthSchedule may = new MonthSchedule(31); // 5월달 스케쥴 생성 
		may.run();  
		
	}
}
