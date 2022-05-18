package day05;

public class Test44 {

	public static void main(String[] args) {
		
		//	레퍼런스 치환
		int [] arr = {1,2,3,4,5}; 
		int [] myArr = arr;
		for( int i = 0 ; i< myArr.length ; i++) {
			System.out.println(myArr[i]);
		}
		arr=null;	// arr이 들고있던 실제 데이터 저장된 주소가 날라가버림
//		System.out.println(arr[0]);
		System.out.println(myArr[0]); // 주소를 arr에서 공유함
		
		
		
		
		
		// new 를 쓰면 heep 메모리 사용 int등등은 stack 메모리 사용 
		
		//	예제. 최대값, 최소값 구하기
		int [] score = {79,59,36,98,25};
		int max = score[0];
		int min = score[0];
		for(int i =0 ; i< score.length;i++) {
			if(max< score[i]) {
				max= score[i];
			}
			if(min> score[i]) {
				min= score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최솟값 : "+min);
		
		
		
	}

}
