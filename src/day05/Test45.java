package day05;

import java.util.Scanner;

public class Test45 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x[];			//배열명 선언
		x= new int[5];		//배열 크기 배정
		x[0]=10;			//데이터 저장
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		
		// 문제1-1. int형 방 5개 배열을 만들고 10,20,30,40,50 을 저장하고, 출력. 
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	    // 문제1-2. 위 배열을 이용하여, 인덱스번호 1번과 3번안에 있는 데이터를 
	    //         더한 값을 출력해보세요.
		System.out.println(x[1] + x[3]);
		
	    // 문제1-3. 인덱스번호를 사용자로부터 입력받고, 
	    //         해당 인덱스의 데이터를 출력해보세요.
		System.out.println("번호 입력 : ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(x[n]);
		
	    // 문제1-4. 배열안의 모든 요소의 총 합을 출력해보세요.
		int tot = 0;
		for (int i=0 ; i<x.length ; i++) {
			tot += x[i];
		}
		System.out.println("총합 : "+tot);
		
	    // 문제1-5. 배열안에 있는 값(데이터)중 하나를 입력하면, 
	    //         그 값이 저장된 인덱스 번호를 출력해보세요. 
		System.out.println("데이터 입력 : ");
		int data = Integer.parseInt(sc.nextLine());
		for(int i=0; i<x.length ; i++) {
			if(x[i]==data) {
				System.out.println(i+"번 데이터");
				break;
			}
		}
	    // 문제1-6. 인덱스 번호 2번과 4번의 값을 교환해보세요.
		int y = x[4];
		x[4] = x[2];
		x[2] = y;
		System.out.println(x[2]+" "+x[4]);
		
		// 문제1-7. (심화) 내림차순(큰->작은)으로 정렬해보세요.
		
		int nn[]; 							// 이거 주소만 복사한거라 값이 x와 nn 같이 바뀜 ㅡㅡ;
		nn = new int [5];
		for (int i=0;i<x.length ; i++) {
			nn[i]=x[i];
		}
		for (int i=0;i<x.length ; i++) {
			int min= nn[0];
			int max = nn[0];
			for (int k=0; k<x.length;k++) {
				if(min>x[k]) {
					min=x[k];
				}
					
			}
			for (int j=0; j<nn.length;j++) {
				if(max<nn[j]){
					max=nn[j];
				}
				
			}
			x[i]=max;
			System.out.println(x[i]);
		}
		
		//////////// 	정답 	////////////////////////////////////////////////////////
		
		int [] arr = {10,20,50,40,30};
		//			  0  1  2  3  4
		// 버블 정렬
		
		for(int i = 0; i<arr.length-1 ; i++) {			// length-1 은 배열갯수 마지막은 교환 불가라서
			for(int j=i+1 ; j<arr.length ; j++){
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i]= arr[j];
					arr[j]= tmp;
				}
			}
		}
		//출력해서 확인
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 선택정렬
	
		for (int i=0; i<arr.length ; i++) {
			int max = i;	//	큰수의 인덱스 번호를 담아둘 변수
			for(int j= i; j<arr.length ; j++) {
				if(arr[max]<arr[j]) {
					max=j;
				}
			}
			int tmp = arr[i];
			arr[i]= arr[max];
			arr[max]= tmp;
		}
		//출력해서 확인
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
