package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Nation{
	Nation(String contry, String capital){
		this.contry=contry;
		this.capital = capital;
	}
	private String contry, capital;
	public String getContry() {
		return contry;
	}
	public String getCapital() {
		return capital;
	}
	public void setContry(String contry) {
		this.contry=contry;
	}
	public void setCapital(String capital) {
		this.capital= capital ;
	}
	
}
class CapitalGame{
	Nation [] nations = {
			new Nation("한국", "서울"),new Nation("호주", "시드니"),new Nation("이탈리아", "로마"),
			new Nation("그리스", "아테네")
	};
	Scanner sc= new Scanner(System.in);
	ArrayList<Nation> nation = new ArrayList<Nation>(Arrays.asList(nations));
	
	// 배열을 리스트에 넣는 메소드 Arrays.asList(배열)
	
	
	
	void add(String contry, String capital) {
		int exist=0;
		for (int i =0; i<nation.size() ;i++) {
			if(nation.get(i).getContry().equals(contry)) {
				System.out.println("이미 있는 나라");
				exist=1;
				break;
			}else if(nation.get(i).getCapital().equals(capital)) {
				System.out.println("이미 있는 수도");
				exist=1;
				break;
			}
		}
		if(exist==0) {
		nation.add(new Nation(contry, capital));
		}
	}
	
	void quiz() {
		ArrayList<Nation> copy = new ArrayList<Nation>(Arrays.asList(nation.toArray(new Nation[nation.size()])));
		while(true) {
			if(copy.size()>0) {
				Nation contry = copy.get((int)(Math.random()*copy.size()));
				System.out.println(contry.getContry()+"의 수도는?");
				String capitals = sc.nextLine();
				if(capitals.equals("그만")) {
					break;
				}else if(capitals.equals(contry.getCapital())) {
					System.out.println("정답");
					copy.remove(copy.indexOf(contry));
				}else {
					System.out.println("아닙니다!!");
				}
			}else {
				copy= new ArrayList<Nation>(Arrays.asList(nation.toArray(new Nation[nation.size()])));;
			}
		}
	}
	
	
	
	void run () {
		while(true) {
			System.out.println("** 수도 맞추기 게임을 시작합니다 **");
			System.out.println("입력:1, 퀴즈:2, 종료:3 >>");
			int select=0;
			try {
				select= sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.print("숫자입력");
				select = sc.nextInt();
			}
			if(select==1) {
				System.out.println(nation.size()+"개의 나라와 수도가 있다.");
				while(true) {
					System.out.println(nation.size()+1+"번째 나라와 수도 입력(나라,수도)>>");
					String inputnation = sc.nextLine();
					String input []= inputnation.split(",");
					if(input[0].equals("그만")||input[1].equals("그만")) {
						System.out.println("입력종료");
						break;
					}else {
						add(input[0],input[1]);
					}
				}
				continue;
			}else if (select==2) {
				quiz();
				continue;	
			}else if (select==3) {
				sc.close();
				System.out.println("종료");
				break;
			}else {
				System.out.println("없는숫자");
				continue;
			}
		}
		
		
		
	}
	
	
	
	
}
/*
	나라와 수도 맞추기 게임을 만들어
	 보세요. (코드 하나도 없는 문제)
 	1) 나라이름(country)과 수도(capital)로 구성된 Nation클래스를 작성하고,
		ArrayList<Nation> 컬렉션을 이용하여 아래 실행 예시와 같이 작동되도록 프로그램을 작성하세요.
	실행예시:
		** 수도 맞추기 게임을 시작합니다 **
		입력:1, 퀴즈:2, 종료:3 >> 1 (사용자가 입력)
		현재 8개의 나라와 수도가 입력되어 있습니다.
		나라와 수도 입력9>> 한국 서울
		나라와 수도 입력10>> 그리스 아테네
		그리스는 이미 있습니다!!
		나라와 수도 입력10>> 호주 시드니
		나라와 수도 입력11>> 이탈리아 로마
		나라와 수도 입력12>> 그만
		입력:1, 퀴즈:2, 종료:3 >> 2
		호수의 수도는? 시드니
		정답!!
		독일의 수도는? 하얼빈
		아닙니다!!
		멕시코의 수도는? 하얼빈
		아닙니다!!
		이탈리아의 수도는? 로마
		정답!!
		한국의 수도는? 서울
		정답!!
		영국의 수도는? 그만
		입력:1, 퀴즈:2, 종료:3 >> 3
		게임을 종료합니다.
*/
public class Test11Ex {
	public static void main(String[] args) {
		
		CapitalGame game = new CapitalGame();
		game.run();
		
	}
}