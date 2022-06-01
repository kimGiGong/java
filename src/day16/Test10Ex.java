package day16;

import java.util.HashMap;
import java.util.Scanner;

/*
	이름과 학점(4.5만점)을 5개 입력받아 해쉬맵에 저장하고, 장학생 선발 기준을 입력받아 장학생 명단을 출력하세요.
	실해예시:
		자바장학금관리시스템입니다.
		이름과 학점 >> 호크아이 3.1
		이름과 학점 >> 블랙위도우 3.6
		이름과 학점 >> 토르 2.9
		이름과 학점 >> 데드풀 3.7
		이름과 학점 >> 아이언맨 4.3					//	insert
		장학생 선발 학점 기준 입력 >> 3.2			//	select
		장학생 명단 : 블랙위도우 데드풀 아이언맨
*/
class Scholarship{
	Scholarship( String a){
		System.out.println(a+"관리시스템입니다.");
	}
	HashMap<String, Double> hm = new HashMap<String, Double>();
	Scanner sc = new Scanner(System.in);
	void input() {
	}
	void insert() {
		int i=0;
		while(i<5) {
		System.out.print("이름과 학점>>");
		hm.put(sc.next(), sc.nextDouble()); sc.nextLine();
		i++;
		}
	}
	void select() {
		System.out.print("장학생 선발 학점 기준 입력>>");
		double result = sc.nextDouble();
		String [] key = hm.keySet().toArray(new String[hm.keySet().size()]);
		System.out.print("장학생 명단 : ");
		for(int i =0; i<hm.size();i++) {
			if(hm.get(key[i])>result) {
				System.out.print(key[i]+" ");
			}
		}
		sc.close();
	}
}
public class Test10Ex {
	public static void main(String[] args) {
		Scholarship sship = new Scholarship("자바장학금");
		sship.insert();
		sship.select();

	}
}