package day16;

import java.util.Scanner;
import java.util.Vector;

/*
	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
	벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
	실행예시:
		정수>> 10 6 22 6 88 77 -1
		가장 큰 수는 88
*/

public class Test01Ex {
	
	public static void main(String[] args) {
		Vector<Integer> vi = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int a=0;
		while (true) {
			System.out.print("정수입력>>");
			a=sc.nextInt();
			
			if(a>=-1){
				if(-1==a) {
					int max=0;
					System.out.print("정수 >>");
					if(vi.size()==0) {
						System.out.println("하나도 없다.");		//  바로 -1 입력시 정수 없음
						break;
					}
					for(int i=0; i<vi.size();i++) {
						int j=vi.get(i);
						System.out.print(j+" ");
						if(vi.get(max)<vi.get(i)) {
							max=i;
						}
					}
					System.out.println();
					System.out.print("가장큰수는");
					System.out.print(vi.get(max));
					System.out.println();
					break;
				}
				vi.add(a);
			}else {
				System.out.println("\n우중한 입력");
				continue;
			}
			
		}
		sc.close();
	}
}