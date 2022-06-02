package day16;

import java.util.ArrayList;
import java.util.Scanner;

import day12.classEx06;

public class ClassEx57 {
	public static void main(String[] args) {
		
		//	영문 이름 4개를 입력받아 ArrayList에 저장하고 모두 출력한 후
		//	제일 긴 이름을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		
		for (int i=0; i<4 ; i++) {
			System.out.println("이름입력>>");
			al.add(sc.nextLine());
		}
		int j = 0;
		String s = null;
		for (int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
			if(j<al.get(i).length()) {
				j=al.get(i).length();
				s = al.get(i);
			}
		}
		System.out.println(s);
		
		
		
		
		//////////////////////////////////////
		
		ArrayList<String> list = new ArrayList<String>();

		// 	영문이름 4개
		for (int i=0; i<4 ; i++) {
			System.out.println("이름입력>>");
			list.add(sc.nextLine());
		}
		// 모두 출력한 후
		for (int i=0; i<list.size() ; i++) {
			String str = list.get(i);
			list.add(s);
		}
		//	제일 긴 이름을 출력하세요.
		int longestIdx = 0;
		for (int i=0; i<list.size() ; i++) {
			if(list.get(longestIdx).length()<list.get(i).length()) {
				longestIdx = i;
			}
		}
		System.out.println("가장 긴 이름은 : "+list.get(longestIdx));
		
		
		
		
		
		
	}
}
