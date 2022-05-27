package day16;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Scanner;

/*
	id와 tel(전화번호)로 구성되는 Student클래스를 만들고, 이름을 key로 하고 Student객체를 값으로 하는 해쉬맵을 작성해보세요.
	이름을 검색하면 id와 전화번호 출력되고, exit 입력하면 프로그램 종료. 
*/
class Students {
	
	private int id = (int)(Math.random()*100);
	private long tel = (long) (Math.random()*100000000);
	String getTel() {
		String a =Long.toString(tel);
		return "010"+a;
	}
	String getId() {
		String b = Integer.toString(id);
		return b;
	}
	@Override
	public String toString() {
		 return "ID>>"+getId()+", Tel>>"+getTel();
	}
	
	
	
	
}
public class Test05Ex {
	public static void main(String[] args) {
		
		HashMap<String, Students> hm = new HashMap<String, Students>();
		Scanner sc = new Scanner(System.in);
		String name ="";
		while(true) {
			if(!name.equals("exit")) {
			System.out.println("학생등록>>");
			hm.put(name =sc.nextLine(), new Students());
			}
			if(!name.equals("exit")) {
			System.out.println("학생찾기 이름입력>>");
			System.out.println(hm.get(sc.nextLine()).toString());
			}else {
				System.out.println("종료");
				break;
			}
		}
		
		
		sc.close();
	}

	
	
}
