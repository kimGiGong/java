package day16;

import java.util.HashMap;
import java.util.Scanner;

/*
	HashMap<String, StudentClass> 을 이용하여 다시 작성해보세요. 
	해쉬맵에서 키는 학생 이름으로 한다.
*/
public class Test09Ex {
	
	Scanner sc = new Scanner(System.in);
	
	StudentClass s1 = new StudentClass("호크아이","모바일","1",4.1);
	StudentClass s2 = new StudentClass("데드풀","안드로이드","2",3.9);
	StudentClass s3 = new StudentClass("헐크","웹개발","3",3.5);
	StudentClass s4 = new StudentClass("아이언맨","빅데이터","4",4.25);
	
	HashMap<String,StudentClass> hm = new HashMap<String, StudentClass>();
	
	void put() {
		hm.put("호크아이",s1);
		hm.put("데드풀",s2);
		hm.put("헐크",s3);
		hm.put("아이언맨",s4);
	}
	void print () {
		
		String[] key = hm.keySet().toArray(new String [hm.keySet().size()]);
		for(int i=0 ;i<hm.size();i++) {
			System.out.println("------------------------");
			System.out.println("이름 : "+hm.get(key[i].toString()).name); 
			System.out.println("학과 : "+hm.get(key[i].toString()).department); 
			System.out.println("학번 : "+hm.get(key[i].toString()).stuNum); 
			System.out.println("평균학점 : "+hm.get(key[i].toString()).result); 
		}
		System.out.println("-------------------------");
	}
	
	
	
	
	void run() {
		put();
		print();
		String name ="";
		while(true) {
			System.out.println("학생이름>>");
			name = sc.nextLine();
			if(!name.equals("그만")) {
				double avg;
				if(hm.containsKey(name)) {
					avg = hm.get(name).result;
					System.out.println("학점 평균"+avg);
				}
			}else {
				System.out.println("종료");
				break;
			}
		}
		sc.close();
		System.out.println("프로그램종료!");
		System.out.println("저장순서가 보장되지않음");
	}
	
	public static void main(String[] args) {
		Test09Ex ex = new Test09Ex();
		ex.run();
	}
}