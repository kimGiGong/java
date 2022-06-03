 package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test04Ex {
	
	private HashMap<String, Double> hm = new HashMap<String, Double>();
	Scanner sc = new Scanner(System.in);
	
	public void inputStudents (String s, double d) {
		if(!hm.containsKey(s)) {
		hm.put(s, d);
		System.out.println("등록완료>>"+s);
		}else {
			System.out.println("이미등록된 학생");
		}
	}
	public void replaceStudents (String s, double d) {
		if(hm.containsKey(s)) {
		hm.put(s, d);
		System.out.println("수정완료>>"+s);
		}else {
			System.out.println("그런학생 없습니다");
		}
	}
	public void removeStudents (String s) {
		if(hm.containsKey(s)) {
			hm.remove(s);
			System.out.println("삭제완료"+s);
		}else {
			System.out.println("그런학생 없습니다");
		}
	}
	public double avg () {
		
		Object arr [] =hm.keySet().toArray();
		double sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum += hm.get(arr[i]);
		}
		return sum/hm.size();
	}
	private void printAvg() {
		Collection<Double> col = hm.values();	//	map에서 값들만 뽑아줌
		Iterator<Double> it = col.iterator();
		double sum =0;
		while(it.hasNext()) {
			sum+= it.next();		// 값하나씩 꺼내서 sum에 누적 하기
		}
		double avg = (double)sum/hm.size();
		System.out.println("평균점수>> "+avg);
	}
	public void run(){
		while(true) {
			System.out.println("** 자바 성적 관리 프로그램 **\r\n1. 전체 조회 \r\n2. 등록\r\n3. 수정\r\n4. 삭제\r\n5. 전체 평균\r\n6. 프로그램 종료");
			System.out.println("선택하시오");
			String sel = sc.nextLine();
			if(sel.equals("1")) {
				System.out.println("전체조회");
				System.out.println(hm);
			}else if (sel.equals("2")) {
				System.out.println("등록학생이름과 점수 입력");
				inputStudents(sc.next(), sc.nextDouble());
			}else if (sel.equals("3")) {
				System.out.println("수정학생이름 점수 입력");
				replaceStudents(sc.next(), sc.nextDouble());
			}else if (sel.equals("4")) {
				System.out.println("삭제학생이름 입력");
				removeStudents(sc.nextLine());
			}else if (sel.equals("5")) {
				System.out.println("전체평균>>"+avg());
			}else if (sel.equals("6")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력");
				continue;
			}
		}
		sc.close();
		
	}
	
	
	
	public static void main(String[] args) {
		// HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요. 
		// 아래 프로그램 메뉴에서 각 번호로 서비스 선택하고, 6번을 입력받으면 프로그램 종료. 
		/*
		 	** 자바 성적 관리 프로그램 **
			1. 전체 조회 
			2. 등록
			3. 수정
			4. 삭제
			5. 전체 평균
			6. 프로그램 종료
		*/
		
		Test04Ex prg = new Test04Ex();
		
		prg.run();
		
	}
}