package day16;

import java.util.HashMap;
import java.util.Scanner;

public class Test03Ex {
	public static void main(String[] args) {		// 영어주면 한글 나옴
	
		// 영한 사전 만들기 : HashMap을 이용하여 10개의 단어를 영어,한글의 쌍으로 저장하고 
		// 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료!
		
		HashMap<String,String> hm = new HashMap<String,String>();
		Scanner sc = new Scanner(System.in);
		hm.put("apple", "사과");
		hm.put("hello", "안녕");
		hm.put("hi", "하이");
		String word = "";
		while(true) {
			
			System.out.println("한글로 번역할 영어입력");
			if(word.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			word =  sc.nextLine();
			if (hm.containsKey(word)) {
				String trword = hm.get(word);
				System.out.println(word+"한글로"+trword );
			}else{
				System.out.println("단어없음");
				continue;
			}
		}
		
	}
}