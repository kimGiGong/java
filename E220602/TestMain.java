package E220602;

import java.util.Scanner;

public class TestMain {
	Friend[] fplus (Friend[] a) {
		Friend[] plus = new Friend[a.length+1];
		for (int i=0;i<a.length;i++) {
			plus[i]=a[i];
		}
		return plus; 
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		TestMain test = new TestMain();
		Friend[] friends = new Friend[0];
		String in;
		while(true) {
			System.out.println("이름>>");
			String name=sc.nextLine();
			System.out.println("전화번호>>");
			String tel=sc.nextLine();
			System.out.println("생일>>");
			String birth=sc.nextLine();
			friends=test.fplus(friends);
			friends[friends.length-1]= new Friend(name, tel, birth);
			System.out.println("추가입력? (y/n)");
			in=sc.nextLine();
			if(in.toUpperCase().equals("N")) {
				break;
			}else if(in.toUpperCase().equals("Y")) {
				continue;
			}
		}
		
		while(true) {
			System.out.print("검색할 전화번호 뒷자리(단, 종료를 원하시면 x를 입력하시오) : ");
			String lastNum4= sc.nextLine();
			int lastNum=-1;
			if(lastNum4.toUpperCase().equals("X")) {
				System.out.println("프로그램 종료");
				break;
			}
			for(int i=0; i<friends.length;i++) {
				String lastNumStr =friends[i].getphon().substring(friends[i].getphon().length()-4);
				if(lastNumStr.equals(lastNum4)) {
					lastNum=i;
					break;
				}
			}
			if(lastNum!=-1) {
				System.out.println(friends[lastNum].toString()); 
			}else {
			System.out.println("해당 전화번호의 친구는 없습니다");
			}
		}
		sc.close();
	}
}
