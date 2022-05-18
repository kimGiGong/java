package day10;

import java.util.Scanner;

/*
	n명이 참가하는 끝말잇기 게임을 만들어보자. 
	처음단어는 "자동차"이다. 
	몇명(n)이 참가하는지 입력받고, n명의 참가자들은 순서대로 자신의 단어를 입력하면된다. 
	끝말잇기에서 틀리면 게임오버 -> 진사람 이름 출력하고 프로그램 종료. 
	WordGameApp 클래스와 각 선수를 나타내는 Player 클래스로 구성하세요. 
	WordGameApp : 게임을 전체적으로 진행하는 run() 메서드, 
				run()에서 플레이어 수만큼 Player 객체 배열 생성 
	Player : 플레이어 이름 저장, 단어 입력받는 getWordFromUser()메서드, 
			끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 
	# 힌트 
		* 문자열 첫번째 문자 알아내는 방법 
			String word = "자동차"; 
			char ch = word.charAt(0); 
		* 문자열의 길이 알아내는 방법 
			word.length(); --> 3 
*/
class Player {
	//캡슐화
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name= name;}
	
	private String word ;
	public String getWord() {return word;}
	public void setWord(String word) {this.word= word;}
	
	void getWordFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name+">>");
		this.word=sc.nextLine();
		
	}
	boolean checkSuccess(String word){	//	맞았는지 체크 : 방금 입력단어, 이전단어
		boolean check = false;
		int lastIdx = word.length()-1;
		char lastChar = word.charAt(lastIdx);
		char firstChar = this.word.charAt(0);
		// 두개비교
		if (lastChar == firstChar) {
			check=true;
		}
		return check;
	}
	
}
class WordGameApp {
	
	
	//	게임을 전체적으로 진행시킬 메소드
	void run() {
		Player [] pl=null;	// 	플레이어들을 객체로 저장시켜놓을 배열변수
		System.out.println("끝말잇기 게임시작");
		// 참가인원 셋팅
		Scanner sc = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원 >>");
		int n = Integer.parseInt(sc.nextLine());
		pl= new Player[n];	//	참가인원 방크기
		for (int i=0;i<pl.length;i++) {
			//	Player 객체생성해
			pl[i]=new Player();
			//	 참가자 이름입력받고, 이름저장 
			System.out.println("이름>>");
			pl[i].setName(sc.nextLine());
		}
		//	시작단어
		String lastWord = "자동차";
		System.out.println("시작단어는 "+lastWord+"입니다.");
		int idx =0; 	// while 안에서 인덱스 번호처럼 사용할 변수
		while (true) {
			//	단어 입력 받고
			pl[idx].getWordFromUser();
			//	맞았는지 검사->맞으면 계속 -> 틀리면 누가 졌는지 출력하고 종료
			boolean result = pl[idx].checkSuccess(lastWord);
			if(!result) {
				System.out.println("게임오버!!"+pl[idx].getName()+"님이 졌다.");
				sc.close();
				break;
			}
			
			lastWord = pl[idx].getWord();	// 다음 회차를 위해 lastword를 입력받은 단어로 변경
			idx++;
			idx %= pl.length;
		}
		
	}
	
	// sc.close(); 안됨
	
}
public class Test93 {
	public static void main(String[] args) {
		// main 작성 완료!! 
		WordGameApp game = new WordGameApp(); 
		game.run(); 
	}
}
