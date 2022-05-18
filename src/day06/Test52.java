package day06;

import java.util.Scanner;

public class Test52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// * 1차원 배열 문제 *
	      // 문제1-1. arr이라는 이름의 방 5개짜리 배열에
	      //         사용자로부터 서로다른 5개의 정수를 입력받아 저장하고 출력해보세요. 
		int []arr= new int[5];
		System.out.println("정수 입력 5개 ");
		for(int i=0 ; i<arr.length ; i++) {
			int a1 = Integer.parseInt(sc.nextLine());
			arr[i]=a1;
		}
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println();
		
	    // 문제1-2. 위에서 만들 배열 arr에 저장된 값을 오름차순으로 정렬해보세요. 
		for(int i=0 ; i<arr.length-1 ; i++) {
			int min=i;
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int tmp;
			tmp=arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
		}  
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
	    // 문제1-3. 정수 한개를 더 입력받아 저장해보세요. 
	    //         입력받은 정수는 기존 arr 배열의 마지막 데이터 다음방에 저장되어야한다. 
	    //         (즉, 배열크기가 6개가 되어야한다. 단, 배열은 방크기 변경X) 
	      int []ar = new int[arr.length+1];
	      for(int i=0;i<ar.length;i++) {
	    	  if(i==ar.length-1) {
	    		  System.out.println("미친 추가 입력 = ");
	    		  int a1 = Integer.parseInt(sc.nextLine());
	    		  ar[i]=a1;
	    	  }else{
	    	  ar[i]=arr[i];
	    	  }
	      }
	      arr=ar;
			for(int i=0 ; i<arr.length ; i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			System.out.println();
			
		/////////////////// 정 답 /////////////////////
		int [] arrr= {2,6,10,32,51};
		int [] tp= arrr;		
		arrr= new int[6];
		for(int i=0; i<tp.length;i++) {
			arr[i]=tp[i];
		}
		arr[5]=200;		// 마지막방에 입력받아 저장
			
			
			
			
	    // 문제2-1. 게임랭킹보드. 각 5개의 데이터를 저장할 수 있는 
	    //         users와 scores라는 이름의 배열이 있고, 
	    //         users배열에는 유저이름, scores 배열에는 유저의 게임점수를 입력받아 저장한다. 
	    //         단, 유저이름과 게임점수는 배열 인덱스상 서로 일치하게. (같은인덱스번호)
	      
			String[] users = new String[5];
			int[] scores = new int[5];
			System.out.println("유저이름 = ");
			for(int i=0 ; i<users.length ; i++) {
				String a1 = sc.nextLine();
				users[i]=a1;
			}
			System.out.println("점수 = ");
			for(int i=0 ; i<scores.length ; i++) {
				int a1 = Integer.parseInt(sc.nextLine());
				scores[i]=a1;
			}
			
			
	    // 문제2-2. 위 저장된 users와 scores를 아래와 같은 형태로 출력해보세요. 
	    /*
	       user_name   score
	       --------------------
	       피카츄      87
	       파이리      24
	       .....
	    */
			System.out.println("user_name\tscore");
			System.out.println("==========================");
			for(int i=0 ; i<scores.length ; i++) {
				System.out.print(users[i]+"\t\t");
				System.out.print(scores[i]);
				System.out.println();
			}
			
	    // 문제2-3. 두번째 유저의 점수와 세번째 유저의 점수가 서로 바뀌었다합니다. 
	    //         교환해주세요. 
	     int tmp;
	     tmp=scores[2];
	     scores[2]=scores[3];
	     scores[3]=tmp;
	     System.out.println(scores[1]+"\t"+scores[2]+"교환");
	     
	    // 문제2-4. 점수가 높은 순으로 출력되는 게임 랭킹 보드를 출력해주세요. 
	    /*         랭킹보드는 1위부터 5위까지 출력 
	       rank   user_name   score
	       ----------------------------
	       1      꼬북이      96
	       2      피카츄      87
	       .....
	    */
	    for(int i=0; i<scores.length-1 ; i++) {
	    	int min=i;
	    	for(int j=i+1; j<scores.length ; j++) {
	    		if(scores[min]>scores[j]) {
	    			min=j;
	    		}
	    	}
	    	int temp=scores[i];
	    	scores[i]=scores[min];
	    	scores[min]=temp;
	    	String tm=users[i];
	    	users[i]=users[min];
	    	users[min]=tm;
	    }
	    System.out.println("rank\tuser_name\tscore");
		System.out.println("==================================");
	    for(int i=0; i<scores.length ; i++) {
	    	System.out.print((i+1)+"\t\t");
	    	System.out.print(users[i]+"\t\t");
	    	System.out.print(scores[i]);
	    	System.out.println();
	    }
	    // 문제2-5. 또 한명의 유저가 게임을 끝냈습니다. 
	    //         점수와 유저이름을 입력받고, users와 scores 배열에 추가 저장.
	    //         (문제 1-3. 참고 : 배열길이 6개로) 
	    //         게임 랭킹보드를 업데이트해 5위까지 출력해주세요. 
	    
		int score[] = new int[scores.length+1];					//	임시 이용수점수+1 방크기 증가
		String user[] = new String[users.length+1];				//	임시 이용수이름+1
		for (int i=0; i<score.length;i++) {						//	임시 배열에 반복문으로 점수,이름 저장 
			if(i==score.length-1) {								//	마지막에 점수, 이름 저장
				System.out.println("추가인원 입력 점수 : ");
				score[i]=Integer.parseInt(sc.nextLine());
				
				System.out.println("추가인원 입력 이름 : ");
				user[i]=sc.nextLine();
				
			}else {												// 기존 배열(이름,점수) 저장
				score[i]=scores[i];
				user[i]=users[i];
			}
		}
		scores=score;											// 임시 점수,이름 원래로 복사
		users=user;
		
		for(int i=0; i<scores.length-1 ; i++) {					//	정렬
			int max=i;											//	max=j를 선언하기 위한 선언
			for(int j=i+1; j<scores.length ; j++) {				//	i+1 제일큰 인덱스 값 제외
				if(scores[max]<scores[j]) {						//	제일 값이 큰 인덱스 값 저장
					max=j;
				}
			}
			int z=scores[i];									//가장 큰값을 첫번째부터 저장
			scores[i]=scores[max];
			scores[max]=z;
			String x=users[i];
			users[i]=users[max];
			users[max]=x;
		}
		
		System.out.println("rank\tuser_name\tscore");
		System.out.println("==================================");
		for(int i=0; i<scores.length ; i++) {
			if(i<5) {
			System.out.print((i+1)+"\t\t");
			System.out.print(users[i]+"\t\t");
			System.out.print(scores[i]);
			System.out.println();
			}
		}
		
		
		
		
		sc.close();
		
	}

}
