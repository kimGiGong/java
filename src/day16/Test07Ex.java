package day16;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/*
	Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하세요.
	강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
	실행 예시 :
		강수량 입력 (0 입력시 종료)>>	5
		5
		현재 평균 5
		강수량 입력 (0 입력시 종료)>>	80
		5 80
		현재 평균 42
		강수량 입력 (0 입력시 종료)>>	53
		5 80 53
		현재 평균 46
		강수량 입력 (0 입력시 종료)>>	22
		5 80 53 22
		현재 평균 40
		강수량 입력 (0 입력시 종료)>>	0
		프로그램 종료!
*/
public class Test07Ex {
	private static String printVector(Vector<Integer> v) {
		Iterator<Integer> it = v.iterator();
		String sum = "";
		while(it.hasNext()) {
			int a =it.next();
			System.out.println();
			sum += a+" ";
		}
		return sum ;
	}
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int tot=0;
		int water = -1;
		while(true) {
			System.out.println("강수량 입력 (0 입력시 종료)>>");
			water = Integer.parseInt(sc.next().trim());
			if(water!=0) {
				v.add(water);
				System.out.println(printVector(v));
				tot+=water;
				System.out.println("강수량 평균"+tot/v.size());
			}else {
				System.out.println("프로그램 종료!");
				break;
			}
		}
			
		sc.close();
		
	}

	private static void iterator() {
		// TODO Auto-generated method stub
		
	}
}