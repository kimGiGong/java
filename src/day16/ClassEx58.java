package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassEx58 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(5);
		list1.add(3);
		list1.add(4);
		list1.add(0);
		list1.add(1);
		list1.add(2);
		
		System.out.println(list1.contains(10));
		
		List sub = list1.subList(1, 4);	//	index 1 from to 4 
		System.out.println(sub);		//	index 1~3번까지 출력
		
		ArrayList list2 = new ArrayList(sub);	// List 짤라서 집어넣기
		System.out.println("list 1 : "+list1);
		System.out.println("list 2 : "+list2);
		
		Collections.sort(list1);	//	오름차순 정렬	.sort
		System.out.println("list 1 : "+list1);
		
		// list1 이 list2에 있는 모든 요소를 가지고 있나?
		System.out.println(list1.containsAll(list2));		// 전부 All
		list2.add(100);
		list2.add(200);
		System.out.println(list1.contains(list2));
		
		//	 요소 수정 : set(int idx, 값)
		list2.set(3, 500);		
		System.out.println(list2);
		
	}
}
