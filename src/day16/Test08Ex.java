package day16;

import java.util.ArrayList;
import java.util.Scanner;

class StudentClass{
	StudentClass(String a,String b, String c, double d) {
		this.name=a;
		this.department = b;
		this.stuNum = c;
		this.result = d;
	}
	String name;
	String department;
	String stuNum;
	double result;
	
	@Override
	public String toString() {
		String re = Double.toString(result);
		return "이름:"+name+"\r\n학과:"+department+"\r\n학번:"+stuNum+"\r\n학점평균:"+re;
	}
}
	


/*
	하나의 학생 정보를 나타내는 StudentClass에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다. 
	학생마다 StudentClass 객체를 생성하고 4명의 학생정보를 ArrayList<StudentClass> 컬렉션에 저장한 후에,
	ArrayList<StudentClass>의 모든 학생(4명) 정보를 출력하고 
	학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하세요.
	실행예시:
		학생이름, 학과, 학번, 학점평균 입력하세요.
		>> 호크아이,모바일,1,4.1
		>> 데드풀,안드로이드,2,3.9
		>> 헐크,웹개발,3,3.5
		>> 아이언맨,빅데이터,4,4.25
		---------------------------
		이름:호크아이
		학과:모바일
		학번:1
		학점평균:4.1
		---------------------------
		이름:데드풀
		학과:안드로이드
		학번:2
		학점평균:3.9
		---------------------------
		이름:헐크
		학과:웹개발
		학번:3
		학점평균:3.5
		---------------------------
		이름:아이언맨
		학과:빅데이터
		학번:4
		학점평균:4.25
		---------------------------
		학생 이름 >> 아이언맨 
		아이언맨, 빅데이터, 4, 4.25
		학생 이름 >> 데드풀
		데드풀, 안드로이드, 2, 3.9
		학생 이름 >> 그만 
		프로그램 종료!
		
		
*/


public class Test08Ex {
	ArrayList<StudentClass> al = new ArrayList<StudentClass>();
	Scanner sc = new Scanner(System.in);
	
	StudentClass s1 = new StudentClass("호크아이","모바일","1",4.1);
	StudentClass s2 = new StudentClass("데드풀","안드로이드","2",3.9);
	StudentClass s3 = new StudentClass("헐크","웹개발","3",3.5);
	StudentClass s4 = new StudentClass("아이언맨","빅데이터","4",4.25);
	
	void add() {
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
	}
	
	void print () {
		for(int i=0 ;i<al.size();i++) {
			System.out.println("------------------------");
			System.out.println(al.get(i).toString()); 
		}
		System.out.println("-------------------------");
	}
	
	
	
	
	void run() {
		add();
		print();
		String name ="";
		while(true) {
			System.out.println("학생이름>>");
			name = sc.nextLine();
			if(!name.equals("그만")) {
				int i=0;
				double avg;
				while(true) {
					if(al.get(i).name.equals(name)) {
						avg = al.get(i).result;
						break;
					}else {
						i++;
					}
				}
				System.out.println("학점 평균"+avg);
			}else {
				System.out.println("종료");
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		
		Test08Ex ex = new Test08Ex();
		ex.run();
		System.out.println("프로그램 종료!");
	}
}