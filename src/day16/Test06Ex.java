package day16;

import java.util.HashMap;
import java.util.Scanner;

/*
	"그만"이 입력될 때까지 나라이름과 인구를 입력받아 저장하고, 
	다시 나라이름을 입력받아 인구를 출력하는 프로그램을 작성하세요. 아래 해쉬맵을 이용하세요.
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	실행예시 :
		나라 이름과 인구를 입력하세요.(예: Korea 5000)
		나라 이름, 인구 >>  Korea 5000
		나라 이름, 인구 >>  USA 1000000
		나라 이름, 인구 >>  Swiss 2000
		나라 이름, 인구 >>  France 3000
		나라 이름, 인구 >>  그만
		인구 검색 >> France
		France의 인구는 3000
		인구 검색 >> 스위스
		스위스 나라는 없습니다.
		인구 검색 >> 그만
		이 좁아터진 세상은 멸망했습니다.
*/
public class Test06Ex {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >>");
			String stop=sc.next();	//	.split 을 통해 " " 으로 분할하여 배열로 받기도 가능
			if(!stop.equals("그만")) {
				long population = sc.nextInt();
			nations.put(stop, (int) population);
			//	Integer popul = nations.get(stop); 	//	map의 get(키값) 은 해당 키밸류가 없으면 null 리턴
			//	null값을 받기위해 클래스 Integer로 받는다.
			}else {
				break;
			}	
		}
		while(true) {
			System.out.print("인구 검색 >>");
			String stop=sc.next();;
			if(!stop.equals("그만")) {
				if(nations.containsKey(stop)) {
					System.out.println(stop+"의 나라"+nations.get(stop)+"만"); 
				}else {
					continue;
				}
			}else {
				System.out.println("이 좁아터진 세상은 멸망했습니다.");
				break;
			}
		}
		
		
		sc.close();
	}
}