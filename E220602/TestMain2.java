package E220602;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Customer1> hashmap = new HashMap<String, Customer1>();
		
		while(true) {
			System.out.println("이름>>");
			String name = sc.nextLine();
			System.out.println("전화번호>>");
			String phone = sc.nextLine();
			System.out.println("주소>>");
			String address = sc.nextLine();
			System.out.println("추가입력?(y/n)>>");
			hashmap.put(name,new Customer1(name, phone, address));
			String stop = sc.nextLine();
			if(stop.toUpperCase().equals("N")) {
				break;
			}
		}
		Iterator<String> key = hashmap.keySet().iterator();
		while(key.hasNext()) {
			String k=key.next();
			System.out.println(hashmap.get(k).print());
		}
		
		sc.close();
		
		
		
	}
}
