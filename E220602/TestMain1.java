package E220602;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain1 {
	
	public static void main(String[] args) {
		ArrayList<Customer1> alist = new ArrayList<Customer1>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("이름>>");
			String name = sc.nextLine();
			System.out.println("전화번호>>");
			String phone = sc.nextLine();
			System.out.println("주소>>");
			String address = sc.nextLine();
			System.out.println("추가입력?(y/n)>>");
			alist.add(new Customer1(name, phone, address));
			String stop = sc.nextLine();
			if(stop.toUpperCase().equals("N")) {
				break;
			}
		}
		for(int i=0 ; i<alist.size(); i++) {
			System.out.println(alist.get(i).print()); 
		}
		
		
		
		
		
	}
}
